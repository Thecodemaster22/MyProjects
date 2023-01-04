import java.util.Scanner;//initialise scanner method.
class factors{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);//call the scanner method.
     System.out.print("enter a number: ");
     int num = input.nextInt();
     System.out.print("the factors of " + num + " are: ");
     
         for(int i = 1; i <= num; i++){
            if (num % i == 0 ) { //checks to see if all the numbers within the range of the input numbers are factors of the input number.
            //The factors had to seperated on a single followed by a (,),this was done by concatinatimg i and a comma within a string[look at A].
            System.out.print( i + " ");//A//
 
            }
         }

     }
}
