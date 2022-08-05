//program to calculate the area of a triangle
    
    //variables
    //h=height
    //b=base
    
    //algorithm
    //start
    //get value of h and b
    //calculate parameter using using formula b*h/2
    //print area
    //stop
  
import java.util.Scanner;

public class Realtest{
  static double h;
  static double b;
  static double area;
  
  
  public static void main(String[] args) {
       geth();
       getb();
       calculateareaoftriangle();
       printarea();
  }
  
    //code to get user input of height
    public static void geth() {
      Scanner scan = new Scanner(System.in);
          //code to ask for value of l
          System.out.print("Enter the height: ");
          h = scan.nextDouble();      
    }
    
    //code to get user input of base
    public static void getb() {
      Scanner scan = new Scanner(System.in);
          //code to ask for value of b
          System.out.print("Enter the base: ");
          b = scan.nextDouble();      
    }
    
    //code to calculate area of triangle using formula b*h/2
    public static void calculateareaoftriangle() {
      area = (b*h/2);      
    }
    
    //code to print area of triangle
    public static void printarea() {
      System.out.println("The area of the triangle is"+" "+area+" "+"cm2");
      
    }
}