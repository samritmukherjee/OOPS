// Q1. Default Constructor:
// Create a class named Student with fields name and roll no. Write a default constructor
// that initializes name to "unknown" and roll no. to zero.
// Create an object that prints the values.

class Student
{
    String name;
    int rollNo;

    Student()
    {
        name = "unknown";
        rollNo = 0;
    }

    public static void main(String args[])
    {
        Student s = new Student();

        System.out.println("Name: " + s.name);
        System.out.println("Roll No.: " + s.rollNo);
    }
}