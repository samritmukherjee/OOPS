// Q2. Parameterized Constructor:
// Create a class Rectangle with fields length and width. Write a parameterized constructor
// to initialize both fields when an object is created. Add a method area() that returns
// length * width. Create two rectangle objects with different dimensions and print their areas.

class rectangle
{
    int length;
    int width;

    rectangle(int leng, int w)
    {
        length = leng;
        width = w;
    }

    int area()
    {
        return length * width;
    }

    public static void main(String args[])
    {
        rectangle r1 = new rectangle(2,7);
        rectangle r2 = new rectangle(8,12);

        System.out.println("Area of Rect1:" + r1.area());
        System.out.println("Area of Rect2:" + r2.area());
    }
}