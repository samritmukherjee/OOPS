// Q3. Constructor Overloading:
// Create a class Employee with the fields name, id and salary. Write:
// A no-argument constructor that sets default values.
// A constructor that takes only name and id.
// A constructor that takes name, id, and salary.
// Demonstrate object creation using all three constructors.

class Employee
{
    String name;
    int id;
    double salary;

    Employee()
    {
        name = "unknown";
        id = 0;
        salary = 0.0;
    }

    Employee(String n, int i)
    {
        name = n;
        id = i;
        salary = 0.0;
    }

    Employee(String n, int i, double s)
    {
        name = n;
        id = i;
        salary = s;
    }

    void display()
    {
        System.out.println("Name:" + name);
        System.out.println("Id:" + id);
        System.out.println("Salary:" + salary);
    }

    public static void main(String args[])
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Samrit", 33);
        Employee e3 = new Employee("Sam", 34, 50000);

        e1.display();
        e2.display();
        e3.display();
    }
}