import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
class Square extends Shape {
    int result = 0;
    public Square(int x){
        width = x;
    }
    public void area(){
        result = width * width;
        System.out.println(result);
    }
}

class Circle extends Shape {
    double pi = Math.PI;
    public Circle (int y) {
        width = y;
    }
    public void area() {
        System.out.println(pi*width*width);
    }
}

class Shapes {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
	//punya wan sofiyah
}