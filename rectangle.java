class rectangle{
 private double length;
 private double breath;
 
 public rectangle(double initLength, double initBreath){
  if (initLength <= 0 || initBreath <= 0){
     System.out.println("Invalid length/breath");
  
  }else{
     length = initLength;
     breath = initBreath;
  }
 
 
 }
 public double perimeter(){
  return((length*2) + (breath*2));
 }
 public double area(){
  return length * breath;
 }


}