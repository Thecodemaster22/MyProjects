import java.util.Random;//importing the random class

class QuestionOne {
   public static void main(String[] args) {
   
   Random num = new Random();
   int[] array = new int [100];//giving the array a length of 100
   int under200 = 0;
   int multiplesOf50 = 0;
   int x = 200;
   int y = 100;
   int z = 1;
   
   for (int i = 0; i < array.length; i++) {
   //iterates through numbers from 100 to 300
      array[i] = num.nextInt(99,301);
      }
      
   for(int i = 0; i < array.length; i++){
   //checks for numbers under 200
      if(array[i] < 200){
         under200++;
   //checks if there are numbers with a multiple of 50
      } if( array[i] % 50 == 0){
         multiplesOf50++;
         }
      }
         
   for (int a = 0; a < array.length; a++) {   
   //checks and displays the 3 largest numbers from the array  
      if(array[a] >= z && array[a] < y){
         z = array[a];
      }else if(array[a] > y && array[a] < x){
         z = y;
         y = array[a];
      }else if(array[a] > x){
         z = y;
         y = x;
         x = array[a];  
         }
      System.out.println(array[a]);
      }
      //displays the solutions to the console
      System.out.println(under200 + " numbers are under 200");
      System.out.println(multiplesOf50 + " numbers are multiples of 50");
      System.out.println("Biggest 3 nums in array are: " + x + ", " + y + ", " + z);
      
   }
}
