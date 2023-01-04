import java.util.Scanner;//calls the scanner method.
class Question1Prac5 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);//calling the scanner method
    System.out.print("Enter a name: ");
    String name1 = input.nextLine();
    System.out.print("Enter a name: ");
    String name2 = input.nextLine();
    
    //checks if the strings are equal or not and then displays a mssg to the console.
    if (equalsIgnoreCase1(name1, name2) == true){
      System.out.println(name1 + " and "+ name2 + " Are equal");
    }else if (equalsIgnoreCase1(name1, name2) == false){
      System.out.println(name1 + " and "+ name2 + " Are not equal");
    }
  
  }
  //checks to see if both strings are equal regardless of the character and then returns true or false.
  public static boolean equalsIgnoreCase1(String firstName,String secondName){
   if (firstName.equalsIgnoreCase(secondName)){
      return true;
   }
   else {
      return false;
   }
  }
  
}