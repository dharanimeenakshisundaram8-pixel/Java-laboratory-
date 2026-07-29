import java.util.Scanner;
abstract class Shape {
int d1, d2;
Shape(int d1, int d2) {
this.d1 = d1;
this.d2 = d2;
}
abstract void printArea();
}
class Rectangle extends Shape {
Rectangle(int l, int b) {
super(l, b);
}
void printArea() {
System.out.println("Rectangle Area:"+(d1 * d2));
}
}
class Triangle extends Shape {
Triangle(int base, int h) {
super(base, h);
}
void printArea() {
System.out.println("Triangle Area:"+(0.5*d1*d2));
}
}
class Circle extends Shape {
Circle(int radius) {
super(radius, 0);
}
void printArea() {
System.out.println("Circle Area:"+(3.14 * d1 * d1));
}
}
class Ex4 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter l and b of rectangle:");
int l=s.nextInt();
int b=s.nextInt();
System.out.println("Enter b and h of triangle:");
int base=s.nextInt();
int h=s.nextInt();
System.out.println("Enter radius of circle:");
int r=s.nextInt();
Shape s1=new Rectangle(l,b);
Shape s2=new Triangle(base,h);
Shape s3=new Circle(r);
s1.printArea();
s2.printArea();
s3.printArea();
}
}
