package Lesson_6_JavaClass;

import java.util.Scanner;

public class Triangle extends Class_Shape implements Resize {
    boolean triangleReal;
    float side1_lenght;
    float side2_lengt;
    float side3_length;

    public Triangle(float x,
                    float y,
                    float side1_lenght, float side2_lengt, float side3_length) {
        super(x, y);
        this.side1_lenght = side1_lenght;
        this.side2_lengt = side2_lengt;
        this.side3_length = side3_length;
        //isTriangleReal();

    }

    public boolean isTriangleReal () {
        if (side1_lenght + side2_lengt >= side3_length && side1_lenght + side3_length >= side2_lengt && side2_lengt + side3_length >= side1_lenght) {
            System.out.println("Triangle is real");
            triangleReal = true;

            //this.isTriangleReal = isTriangleReal;
        } else {
            System.out.println();
            triangleReal = false;
            //this.isTriangleReal = isTriangleReal;
        }
        return triangleReal;
    }


    @Override
    public void getPerimeter() {

        if (triangleReal = true) {
            float perimeter;
            perimeter = side1_lenght + side2_lengt + side3_length;
            System.out.println("The perimeter of the triangle is " + perimeter);
        } else {
            System.out.println("It is not possible to calculate the perimeter");
        }
    }

    @Override
    public void getSquare() {
        if (triangleReal = true) {
            float p = (side1_lenght + side2_lengt + side3_length) / 2;
            float square = (float) Math.sqrt(p * (p - side1_lenght) * (p - side2_lengt) * (p - side3_length));
            System.out.println("The area of the triangle is " + square);
        } else {
            System.out.println("It is not possible to calculate the area");
        }
    }

    @Override
    void displayPosition() {
        System.out.print("The position of the triangle's lower left corner is ");
        super.displayPosition();
    }

    @Override
    public void resize() {
        int x;
        int resize;
        float new_size1, new_size2, new_size3;
        System.out.println("Press press 1 if you want to enlarge the triangle.\n Press 2 if you want to reduce the triangle");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        switch (x){
            case (1):
                System.out.println("How many times do you want to enlarge the triangle?");
                resize=scanner.nextInt();
                new_size1=side1_lenght*resize;
                new_size2=side2_lengt*resize;
                new_size3=side3_length*resize;
                System.out.println("Your new triangle has size "+ new_size1 + " x "+ new_size2+ " x "+ new_size3);
                break;

            case (2):
                System.out.println("How many times do you want to reduse the square?");
                resize=scanner.nextInt();
                new_size1=side1_lenght/resize;
                new_size2=side2_lengt/resize;
                new_size3=side3_length/resize;
                System.out.println("Your new triangle has size "+ new_size1 + " x "+ new_size2+ " x "+ new_size3);
                break;
        }
    }

     }



