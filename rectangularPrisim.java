class rectangularPrisim{
  private double length;
  private double width;
  private double height1;
  //constructor
  public rectangularPrisim(double rectangularPrisimLength, double rectangularPrisimWidth, double rectangularPrisimHeight1){
    if(rectangularPrisimLength < 0) {
      System.out.println("Invalid Length!");
   
    }else {
      length = rectangularPrisimLength;
       
    }
    if(rectangularPrisimWidth < 0) {
      System.out.println("Invalid Width!");
   
    }else {
       width = rectangularPrisimWidth;
       
    }
    if(rectangularPrisimHeight1 < 0){
      System.out.println("Invalid Height!");
   
    }else {
       height1 = rectangularPrisimHeight1;

    }
  }
  //getters
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public double getHeight1(){
    return height1;
  }
 
  //setters
  public double setLength(double l){
    l = length;
    return l;
  }
  public double setWidth(double w){
    w = width;
    return w;
  }
  public double setHeight1(double h1){
    h1 = height1;
    return h1;
  }
  
  //volume, surface area and base area calculations
  public double getVolume(){
   return width * length * height1;
  }
  public double getSurfaceArea(){
   return 2 * (width * length + height1 * length + height1 * width);
  }
  public double getBaseArea(){
   return length * width;
  }
  //toString method
  public String toString(){
   String output = "->Length is: " + length + "->Width is: " + width + "->Height is: " + height1;
   return output;
  }
 
 
}
