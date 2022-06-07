package classroomFour;

public class Circle {
    double PI = 3.14;
    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return PI * (radius * radius);
    }
}
