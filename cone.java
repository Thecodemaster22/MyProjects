class cone{
 private double length;
 private double height;
 private double raduis;
 //constructor
 public cone(double coneLength, double coneHeight, double coneRaduis){
     if(coneLength < 0) {
      System.out.println("Invalid length!");
   
     }else {
       length = coneLength;
       
     }
     if(coneHeight < 0) {
      System.out.println("Invalid height!");
   
     }else {
       height = coneHeight;
       
     }
     if(coneRaduis < 0){
      System.out.println("Invalid raduis!");
   
     }else {
       raduis = coneRaduis;

     }
     

 
 }
  //getters
  public double getLength(){
    return length;
  }
  public double getRaduis(){
    return raduis;
  }
  public double getHeight(){
    return height;
  }
 
  //setters
  public double setLength(double l){
    l = length;
    return l;
  }
  public double setRaduis(double r){
    r = raduis;
    return r;
  }
  public double setHeight(double h){
    h = height;
    return h;
  }
  
  //volume, surface area and base area calculations
  public double getVolume(){
   return Math.PI*(raduis*raduis*height/3);
  }
  public double getSurfaceArea(){
   return Math.PI*raduis*(raduis + Math.sqrt(height*height + raduis * raduis));
  }
  public double getBaseArea(){
   return Math.PI * raduis * raduis;
  }
  
  public String toString(){
   String output = "->Raduis is: " + raduis + "->Height is: " + height + "->Length is: " + length;
   return output;
  }

  

 
 
 
}
