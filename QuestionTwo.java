import java.util.Random;//importing the random class

class QuestionTwo {
   public static void main(String[] args) {
   
   Random num = new Random();
   int[][] array = new int [4][4];//creates 2 dimentional array(4 by 4)
   
   for (int i = 0; i < array.length; i++) {
   //creates and stores random values in up till 10 in each row
      for(int a = 0; a < array.length; a++){
         array[i][a] = num.nextInt(0,15);
         }
      }

   
   for (int i = 0; i < array.length; i++) {
   //finds the sum of eeach row and is later divided by 4 to determine the average(look at A)
      double sum = 0;
      for(int a = 0; a < array.length; a++){
         sum = array[i][a] + sum;
         }
      System.out.println("The avergage of row " + (i+1) + " is: " + sum/4);//A
      }
   }
}
