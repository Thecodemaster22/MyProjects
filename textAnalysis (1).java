import java.io.*;
import java.util.*;

class textAnalysis{
 public static void main(String[] Args){
  String Name = "textProcessing.txt";
  //calls each method.
  getLines(Name);
  getWords(Name);
  getAverageWordLength(Name);

  
 
 
 
 }
 //methods for lines,words and average length of words.
 private static void getLines(String FileName){
  int count = 0;
  String line = "";
   try{
      File textFile = new File(FileName);
      Scanner reader = new Scanner(textFile);
   
      
      while(reader.hasNext()){
        line = reader.nextLine();//next line method helps to check for new line
        count++;//increments count by 1 every time a new line is passed.
    
     }   
       reader.close();
   
   }catch(IOException e){
     System.out.println("Something went Wrong:(");
     System.out.println(e);
   
   }
    System.out.println("There are " + count + " lines of text in the file");

        
   
   
 }
 private static void getWords(String FileName){
  int count = 0;
  String line = " ";
   try{
      File textFile = new File(FileName);
      Scanner reader = new Scanner(textFile);
   
      
      while(reader.hasNext()){
        line = reader.next();//.next goes through each word.
        
         String[] words = line.split(" ");//created an array which stores the words.
         count += words.length;//sumed count with what ever the length of the stored words where.
        
    
     }  
       
       
       reader.close();
   
   }catch(IOException e){
     System.out.println("Something went Wrong:(");
     System.out.println(e);
   
   }
   System.out.println("There are " + count + " words in the file.");

 }
 
 private static void getAverageWordLength(String FileName){
  double count = 0;
  double count2 = 0;
  String line = " ";
   try{
      File textFile = new File(FileName);
      Scanner reader = new Scanner(textFile);
   
      
      while(reader.hasNext()){
        line = reader.next();
        
         String[] lengthOfWords = line.split("");//counts how many letters are there in the text.
         count += lengthOfWords.length;
         
         String[] words2 = line .split(" ");//counts how many words.
         count2 += words2.length;
         
        
    
     }  
       
       
       reader.close();
   
   }catch(IOException e){
     System.out.println("Something went Wrong:(");
     System.out.println(e);
   
   }
   System.out.println("The average number length of words is " + count/count2);//calculates the average
 
 }




}