import java.util.Random;//importing the random class

class QuestionFour {
   public static void main(String[] args) {
   
   Random num = new Random();
   int[][] array = new int [4][4];//creates a 4 by 4 array(2D)
   
   for (int i = 0; i < array.length; i++) {
   ////loops through 4 rows and generates random numbers 4 times in each row
      for(int a = 0; a < array.length; a++){
         array[i][a] = num.nextInt(0,10);
         }
      }
   
   for (int x = 0; x < array.length; x++) {
   //sum of each row is then calculated using the loop below
      int sum = 0;
      for(int y = 0; y < array.length; y++) {
         sum = sum + array[y][x];
         }
      System.out.println("The column sum for Column " + (x+1) + " is" + ": " + sum);//displays the result
      }
   }
}
