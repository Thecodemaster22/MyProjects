import java.io.*;
import java.util.*;
class checkBraces{
 public static void main(String[] Args) throws IOException{
   String fileName = "Athlete.java";
    
   testJavaFile(fileName);//calls the method.
 
 }
 private static void testJavaFile(String fileName) throws IOException{
  File myFile = new File(fileName);
  Scanner input = new Scanner(myFile);
 
  
  String line = "";
  int set = 13;//given ammont of braces is initialised and is used to calculate the how many braces are missing.
  int sum = 0;
  int sum2 = 0;
  while(input.hasNext()){
   line = input.next();//.next itterates through each word not line.
   
   if(line.contains("{")){//checks for open braces
     sum++;//sum iterates by 1 if true
   }
   
   if(line.contains("}")){//checks for closed braces
     sum2++;//sum2 iterates by 1 if true
   }

 }
 input.close();
 System.out.println("There are " + sum + " number of open curly brackets");
 System.out.println("There are " + sum2 + " number of close curly brackets");
 System.out.println("There are " + ((set-sum) + (set-sum2)) + " braces missing");//checks what is missing.
}
}