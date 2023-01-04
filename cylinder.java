class cylinder{
 
  private double raduis;
  private double height;
  
  //constructor
  public cylinder(double cylinderRaduis, double cylinderHeight){
   if(cylinderRaduis < 0) {
    System.out.println("Invalid raduis!");
   
   }else {
     raduis = cylinderRaduis;
       
   }
   if(cylinderHeight < 0) {
    System.out.println("Invalid height!");
   
   }else {
     height = cylinderHeight ;
       
   }
  }
  //getters
  public double getRaduis(){
    return raduis;
  }
  public double getHeight(){
    return height;
  }
 
  //setters
  public double setRaduis(double r){
    raduis = r;
    return r;
  }
  public double setHeight(double h){
    height = h;
    return h;
  }
  
  
  //volume, surface area and base area calculations
  public double getVolume(){
    return Math.PI*(raduis*raduis)*height;
  
  }
  public double getSurfaceArea(){
    return (2*Math.PI*raduis*height) + (2*Math.PI*raduis*raduis);
  
  }
  public double getBaseArea(){
    return Math.PI*raduis*raduis;
  }
  
  
  public String toString(){
    String output = "->Raduis is : " + raduis + " ->Height is: " + height;
    return output;
  }

  



}