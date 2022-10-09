package Lesson_6_JavaClass;

import java.util.Objects;

abstract class Class_Shape {
    private float x;
    private float y;

    public Class_Shape (){
    }

    public Class_Shape(float x,
                       float y) {
        this.x = x;
        this.y = y;
    }
    void displayPosition(){
        System.out.printf("X %f \t Y: %f\n", x, y);
    }
    abstract public void getSquare ();
    abstract public void getPerimeter ();

public void setX () {
    this.x=x;
}

    public void setY(float y) {
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class_Shape that = (Class_Shape) o;
        return Float.compare(that.x, x) == 0 && Float.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Shape position is {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
