import java.util.Random;
class testCone{
 public static void main(String[] Args){
  cone Cone1 = new cone(5,7,9);//hard coded values to test
  
  
  //tests and displays each method each method
  System.out.println();
  
  getLargestVolume();
  getSmalestVolume();
  
  System.out.println();
  
  System.out.print(Cone1);
  
  System.out.println();
  
  System.out.println("The Volume of the cone is " + Cone1.getVolume());
  System.out.println("The Surface Area of the cone is " + Cone1.getSurfaceArea());
  System.out.println("The Base Area of the cone is " + Cone1.getBaseArea());
  
  
   
 }
 //method that generates 10 random volumes and gets the max
 public static void getLargestVolume(){
  Random rand = new Random();
  int[] cylinder = new int[11];
  double max = 0.00;
   for (int i = 0; i < cylinder.length; i++){
     int n = rand.nextInt(11);
     cone c1 = new cone(n,n,n);
     cylinder[i] = n;
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
  int[] cylinder = new int[11];
  double min = 10000.00;
   for (int i = 0; i < cylinder.length; i++){
     int n = rand.nextInt(11);
     cone c2 = new cone(n,n,n);
     cylinder[i] = n;
     System.out.print(c2.getSurfaceArea() + " ");
     if (c2.getSurfaceArea() < min){
        min = c2.getSurfaceArea();
     }

   } 
    System.out.println("---> Min surface area is " + min);
 }

}
