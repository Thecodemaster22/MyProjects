import java.util.Random;
class testRectangularPrisim{
 public static void main(String[] Args){
  rectangularPrisim rectangular1 = new rectangularPrisim(5,7,9);//hard coded value to test
  
  //tests and displays each method each method
  System.out.println();
  
  getLargestVolume();
  getSmalestVolume();
  
  System.out.println();
  
  System.out.print(rectangular1);
  
  System.out.println();
  
  System.out.println("The Volume of the rectangular prisim is " + rectangular1.getVolume());
  System.out.println("The Surface Area of the rectangular prisim is " + rectangular1.getSurfaceArea());
  System.out.println("The Base Area of the rectangular prisim is " + rectangular1.getBaseArea());
  
  
   
 }
 //method that generates 10 random volumes and gets the max
public static void getLargestVolume(){
  Random rand = new Random();
  int[] RectangularPrisim = new int[11];
  double max = 0.00;
   for (int i = 0; i < RectangularPrisim.length; i++){
     int n = rand.nextInt(11);
     rectangularPrisim c1 = new rectangularPrisim(n,n,n);
     RectangularPrisim[i] = n;
     System.out.print(c1.getVolume() + " ");
     if (c1.getVolume() > max){
        max = c1.getVolume();
     }
   } 
   System.out.println("--->>>Max Volume is: " + max);

 
 }
 //method that generates 10 random surface areas and gets the minimum
 public static void getSmalestVolume(){
  Random rand = new Random();
  int[] RectangularPrisim = new int[11];
  double min = 10000.00;
   for (int i = 0; i < RectangularPrisim.length; i++){
     int n = rand.nextInt(11);
     rectangularPrisim c2 = new rectangularPrisim(n,n,n);
     RectangularPrisim[i] = n;
     System.out.print(c2.getSurfaceArea() + " ");
     if (c2.getSurfaceArea() < min){
        min = c2.getSurfaceArea();
     }

   } 
    System.out.println("---> Min surface area is " + min);
 }

}

