import java.util.Scanner;//initialise scanner method
class lcm{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);//calling the scanner method.
  
    System.out.print("Enter a number: ");
    int num1 = input.nextInt();
    
    System.out.print("Enter a number: ");
    int num2 = input.nextInt();
    
    int gcd = 1;
    
    for(int i =1; i <= num1 && i <= num2; i++){//runs the loop simultaneously including both num1 and num2.
       if(num1 % i == 0 && num2 % i == 0){ // checks if i completely divides both numbers, if so its stored in variable gcd.
       //NB: Both conditions must be satisfied in order for the loop and if statement to execute.
          gcd = i;
       }
    }
    
    int lcm = (num1 * num2) / gcd;//Mathematical expression that uses the gcd to identify the lcm.
    
    
    System.out.println("The lowest common multiple of " + num1 + " and " + num2 + " is: " + lcm);

  
  }

}