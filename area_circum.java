import java.util.*;
public class area_circum {
public static void circumference () {
	double radius,circle_of_circ;
	Scanner sc=new Scanner(System.in);{
		System.out.println("Enter the Radius");
		radius=sc.nextDouble();
		circle_of_circ=2*3.14*radius;
		System.out.println("Area of Circumference"+circle_of_circ);
	}
  }
public static void rectangle() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length:");
	double length=sc.nextDouble();
	System.out.println("Enter the width");
	double width=sc.nextDouble();
	double area=length*width;
	System.out.println("Area of Rectangle:"+area);
}
public static void circle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius : ");
	double radius = sc.nextDouble();
	
	double areaOfCircle = 3.14 * radius * radius;
	System.out.println("Area of the circle is : " + areaOfCircle);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			circumference();  
			rectangle();
			circle();
	}

}
