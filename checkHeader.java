import java.io.*;
import java.util.*;
class checkHeader{
 public static void main(String[] Args) throws IOException{
   String fileName = "Athlete.java";
    
   getHeader(fileName);//calls the function
 
 }
 private static void getHeader(String fileName) throws IOException{
  File myFile = new File(fileName);
  Scanner input = new Scanner(myFile);
  
  PrintWriter TextOutput = new PrintWriter("headers.txt");
 
  
  String line = "";
  int sum = 0;
  while(input.hasNext()){
   line = input.nextLine();//.nextline itterates through each line.
   
   if(line.contains("public")){//if any line contains public it is known to be the header.
      TextOutput.println(line);//prints whatever line meets the condition.
   }

 }
 TextOutput.close();
 input.close();
}
}