class pentagonalPrisim{
 private double edgeLength;
 private double height;
 
 public pentagonalPrisim(double pentagonalPrismEdgeLength, double pentagonalPrismHeight){
    if(pentagonalPrismEdgeLength < 0) {
      System.out.println("Invalid edge length!");
   
    }else {
      edgeLength = pentagonalPrismEdgeLength;
       
    }
    if(pentagonalPrismHeight < 0) {
      System.out.println("Invalid height!");
   
    }else {
       height = pentagonalPrismHeight;
       
    }

 
 }
 //getters
 public double getedgeLength(){
    return edgeLength;
 }
 public double getHeight(){
    return height;
 }
 
 //setters
 public double setedgeLength(double el){
    el = edgeLength;
    return el;
 }
 public double setHeight(double h){
    h = height;
    return h;
 }
 
 
 //volume, surface area and base area calculations
 public double getVolume(){
  return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * edgeLength * height;
 }
 public double getSurfaceArea(){
  return 5 * edgeLength * height + 0.5 * (Math.sqrt(5*(5 + 2*Math.sqrt(5)))) * edgeLength * edgeLength;
 }
 public double getBaseArea(){
   return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * edgeLength * edgeLength;
 }
 
 public String toString(){
    String output = "->EdgeLength is : " + edgeLength + " ->Height is: " + height;
    return output;
  }

 
 
}
