import java.util.Random;
class testPentagonalprisim{
 public static void main(String[] Args){
  pentagonalPrisim pentagon1 = new pentagonalPrisim(5,7);//hard coded values to test
  
  
  //tests and displays the method
  System.out.println();
  
  getLargestVolume();
  getSmalestVolume();
  
  System.out.println();
  
  System.out.print(pentagon1);
  
  System.out.println();
  
  System.out.println("The Volume of the Pentagonal prisim is " + pentagon1.getVolume());
  System.out.println("The Surface Area of the Pentagonal prisim is " + pentagon1.getSurfaceArea());
  System.out.println("The Base Area of the Pentagonal prisim is " + pentagon1.getBaseArea());
  
  
   
 }
 //method that generates 10 random volumes and gets the max
public static void getLargestVolume(){
  Random rand = new Random();
  int[] pentagon = new int[11];
  double max = 0.00;
   for (int i = 0; i < pentagon.length; i++){
     int n = rand.nextInt(11);
     pentagonalPrisim c1 = new pentagonalPrisim(n,n);
     pentagon[i] = n;
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
  int[] pentagon = new int[11];
  double min = 10000.00;
   for (int i = 0; i < pentagon.length; i++){
     int n = rand.nextInt(11);
     pentagonalPrisim c2 = new pentagonalPrisim(n,n);
     pentagon[i] = n;
     System.out.print(c2.getSurfaceArea() + " ");
     if (c2.getSurfaceArea() < min){
        min = c2.getSurfaceArea();
     }

   } 
    System.out.println("---> Min surface area is " + min);
 }

}
