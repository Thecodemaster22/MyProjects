import java.util.Random;
class testCylinder{
 public static void main(String[] Args){
  cylinder Cylinder1 = new cylinder(5,7);//hard coded value to test
  
  
  //tests and displays each method each method
  System.out.println();
  
  getLargestVolume();
  getSmalestVolume();
  
  System.out.println();
  
  System.out.print(Cylinder1);
  
  System.out.println();
  
  System.out.println("The Volume of the cylinder is " + Cylinder1.getVolume());
  System.out.println("The Surface Area of the cylinder is " + Cylinder1.getSurfaceArea());
  System.out.println("The Base Area of the cylinder is " + Cylinder1.getBaseArea());
  
  
   
 }
 //method that generates 10 random volumes and gets the max
 public static void getLargestVolume(){
  Random rand = new Random();
  int[] cylinder = new int[11];
  double max = 0.00;
   for (int i = 0; i < cylinder.length; i++){
     int n = rand.nextInt(11);
     cylinder c1 = new cylinder(n,n);
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
     cylinder c2 = new cylinder(n,n);
     cylinder[i] = n;
     System.out.print(c2.getSurfaceArea() + " ");
     if (c2.getSurfaceArea() < min){
        min = c2.getSurfaceArea();
     }

   } 
    System.out.println("---> Min surface area is " + min);
 }

}


