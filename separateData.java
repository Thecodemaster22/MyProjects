import java.io.*;
import java.util.Scanner;

class separateData{
 public static void main(String[] Args) throws IOException{
  PrintWriter fileOutput = new PrintWriter("Moodley.txt");
  String name = "separateData.txt";
  nameOne(name);
  
  
 
 }
 
 private static void nameOne(String  newFile) throws IOException{
  File myfile = new File(newFile);
  Scanner input = new Scanner(myfile);
  
  String line = "";
  while(input.hasNext()){
   line = input.nextLine();
   if(line.contains("Moodley")){
    int y = sentence.indexOf("Moodley"); 
            String u = sentence.substring(y , y-1); 
            System.out.println(u);
   }
     
   
  }
  
  
 
 }







}