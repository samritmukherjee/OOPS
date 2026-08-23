// Q5. Constructor Chaining (Using this):
// Create a class using the name Car with fields brand, model and year.
// Write multiple overloaded constructors where a constructor with fewer parameters
// call another constructor with more parameters using this(), applying default values
// for missing fields.

class Car
{
    String brand, model;
    int year;

    Car(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    Car(String brand, String model)
    {
        this(brand, model, 2025);
    }

    Car(String brand)
    {
        this(brand, "unknown");
    }

    void display()
    {
        System.out.println("Brand:" + brand);
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
    }

    public static void main(String args[])
    {
        Car c1 = new Car("Audi");
        Car c2 = new Car("BMW", "A4RL");
        Car c3 = new Car("Honda", "X5", 2025);

        c1.display();
        c2.display();
        c3.display();
    }
}