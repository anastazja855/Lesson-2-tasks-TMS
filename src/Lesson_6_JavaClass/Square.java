package Lesson_6_JavaClass;

import java.util.Scanner;

public class Square extends Class_Shape implements Resize {
    float side_lenght;
public Square (float x,
               float y){
    super(x,y);
    this.side_lenght=1;
}
public Square (float x,
               float y,
               float side_lenght){
    super(x,y);
    System.out.println("Enter the length of the square's side");
    Scanner scanner=new Scanner(System.in);
    side_lenght=scanner.nextFloat();
    this.side_lenght=side_lenght;
}
@Override
    public void getSquare (){
    float area=(float) Math.pow(side_lenght, 2);
    System.out.println("The area of the square is " + area);

}
@Override
public void getPerimeter (){
    this.side_lenght=side_lenght;
    float perimeter = 4*side_lenght;
    System.out.println("The perimeter of the square is " + perimeter);
}

    @Override
    void displayPosition() {
        System.out.print("The position of the square's lower left corner is ");
        super.displayPosition();
    }

    @Override
    public void resize() {
    int x;
    int resize;
    float new_size;
        System.out.println("Press press 1 if you want to enlarge the square.\n Press 2 if you want to reduce the square");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        switch (x){
            case (1):
                System.out.println("How many times do you want to enlarge the square?");
                resize=scanner.nextInt();
                new_size=side_lenght*resize;
                System.out.println("Your new square has size "+ new_size + " x "+ new_size);
                break;

                    case (2):
                        System.out.println("How many times do you want to reduse the square?");
                        resize=scanner.nextInt();
                        new_size=side_lenght/resize;
                        System.out.println("Your new square has size "+ new_size + " x "+ new_size);
                        break;
                }
        }
    }

