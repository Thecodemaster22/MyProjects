import java.util.Scanner;//initialise scanner method.
class perfectSquare{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);//calling the scanner method.
  System.out.print("Enter a number: ");
  int num = input.nextInt();
  
  double root = (int)Math.sqrt(num);//casted to integer so that there are no errors when getting a perfect square number.
  
  if(root * root == num) { // if the rooted number Multiplied by the rooted number strictly equals te original input number, then its said to be a perfect square.
     System.out.println(num + " Is a Perfect Square");
  }else
      System.out.println(num + " Is not Perfect Square");
 }
}