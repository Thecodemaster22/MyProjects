import java.util.Scanner;//calls the scanner method.
class question3Prac5{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);//calling the scanner method.
   
   // declaring and initialising charcters to vowels.
   char a = 'a';
   char e = 'e';
   char i = 'i';
   char o = 'o';
   char u = 'u';
   
   System.out.print("Enter a string: ");
   String str = input.nextLine();
 
  // counting the ammount of times a vowel occurs in the string by initailsing the method to an integer and then summing it.
 int vowels = howMany(str,a);
 vowels += howMany(str,e);
 vowels += howMany(str,i);
 vowels += howMany(str,o);
 vowels += howMany(str,u);
 
 System.out.println(str + " has " + vowels + " vowel(s)");
    
  
  }
  //method for counting the how many times character c occurs in the string s. 
  private static int howMany(String s, char c){
  int i;
  int sum = 0;
   for(i = 0; i < s.length(); i++) {    
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){    
            if(s.charAt(i) == c ) {    
                //Increments the sum counter    
                sum++;   
            }
         }    
  
  
   }
   return sum;
 }
}
  
