package Lesson_6_JavaClass;

public class MyClass {
    public static void main(String[] args) {
        Square square1= new Square(0,5, 10);
        square1.getSquare();
        square1.getPerimeter();
        square1.displayPosition();
        square1.resize();
        Triangle triangle1=new Triangle(4, 0, 1,1,9);
        if (triangle1.isTriangleReal()) {
            triangle1.getSquare();
            triangle1.getPerimeter();
            triangle1.displayPosition();
            triangle1.resize();
        }
        else{
            System.out.println("Triangle is not real");
            return;
        }
    }
}
