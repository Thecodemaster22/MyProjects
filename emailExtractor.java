import java.io.*;
import java.util.*;
class emailExtractor{
 public static void main(String[] Args) throws IOException{
   String fileName = "emailText.txt";
    
   getEmail(fileName);//calls the method
 
 }
 private static void getEmail(String fileName) throws IOException{
  File myFile = new File(fileName);
  Scanner input = new Scanner(myFile);
  
  PrintWriter FileOutput = new PrintWriter("EmailFinder.txt");//creates a new file.
  
  String line = "";
  while(input.hasNext()){
  line = input.next();//.next itterates through each word not line.
  
   if (line.contains("@")){//each emails contains an @ in this case...so thats what we look for when looping through the file.
     FileOutput.println(line);//prints partucular info to txt file
   }
  
  
  
  
  }
  FileOutput.close();
  input.close();
  
 }



}