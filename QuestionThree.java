import java.util.Random;//importing the random class

class QuestionThree {
   public static void main(String[] args) {
   
   Random num = new Random();
   int[][] array = new int [4][4];//creates a 4 by 4 array(2D)
   
   for (int i = 0; i < array.length; i++) {
   //loops through 4 rows and generates random numbers 4 times in each row
      for(int a = 0; a < array.length; a++){
         array[i][a] = num.nextInt(0,15);
         }
      }
   
   for(int x = 0; x < array.length; x++) {
      int max = 0;
      int min = 15; 
      for(int y = 0; y < array.length; y++){
      //identifies the minimum and max values
         if (array[x][y] > max){
            max = array[x][y];
         } if(array[x][y] < min){
            min = array[x][y];           
            }
         }
      System.out.println("Row " + (x+1) + " : " + "Max Value " + "= " + max + " | " + "Row " + (x+1) + " : " + "Min Value " + "= " + min);//displays the result
      }
    }
  }
