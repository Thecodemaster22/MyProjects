import java.util.Scanner;//initialise scanner method.
class Gradesymbol {

     public static void main(String[] Args){
     Scanner input = new Scanner(System.in);//calling the scanner method.
     System.out.print("Enter a mark ranging from 0 - 100: ");
     int x = input.nextInt();
     
      if (x > 100) { //if mark is more than 100, its regarded as invalid as this is the first condition checked before checking the grade of the mark.
         System.out.println("Not a valid mark!!!");
      }else if (x >= 75) {
         System.out.println("'A'");
      }else if ((x < 75) && (x >= 70)) {
         System.out.println("'B'");
      }else if ((x < 70) && (x >= 60)) {
         System.out.println("'C'");
      }else if ((x < 60) && (x >= 50)) {
         System.out.println("'D'");
      }else
         System.out.println("'F'");
    }


}