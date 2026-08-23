// Q4. Copy Constructor:
// Create a class Point with fields x and y. Write:
// A parameterized constructor.
// A copy constructor Point(Point p) that creates a new object with the same values
// as an existing object.
// Show that the modification of the copied doesn't affect the original.

class Point
{
    int x, y;

    Point(int a, int b)
    {
        x = a;
        y = b;
    }

    Point(Point P)
    {
        x = P.x;
        y = P.y;
    }

    void display()
    {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }

    public static void main(String args[])
    {
        Point P1 = new Point(42,43);
        Point P2 = new Point(P1);

        System.out.println("Original Point:");
        P1.display();

        System.out.println("Point Copied:");
        P2.display();
    }
}