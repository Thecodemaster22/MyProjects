import java.util.Scanner;
class TestRectangle{

 public static void main(String[] Args){
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a length: ");
  double length = input.nextDouble();
  System.out.print("Enter a breath: ");
  double breath = input.nextDouble();
  
  
  rectangle numbers = new rectangle(length, breath);
  System.out.println("The perimeter is: " + numbers.perimeter());
  System.out.println("The area is: " + numbers.area());

  
 
 
 }







}