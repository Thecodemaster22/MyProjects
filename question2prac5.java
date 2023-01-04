

import java.util.Scanner; // Import the Scanner class
class question2prac5{
public static void displayBirthday(String idNumber){
String str = new String(idNumber);
Scanner input = new Scanner(System.in);//user input for century they where born in

int day=Integer.parseInt(str.substring(4,6));//gaining an integer from the substring

int year=Integer.parseInt(str.substring(0,2));

char z = '0';//used when year is less than 20 

String month=str.substring(2,4);

System.out.print("Where you born the 19th or 20th century(type 19 or 20): ");
String c = input.nextLine();

String monthString;//declaring month into string
//accounting for all months
switch (month) {
case "01": monthString = "January"; break;
case "02": monthString = "February"; break;
case "03": monthString = "March"; break;
case "04": monthString = "April"; break;
case "05": monthString = "May"; break;
case "06": monthString = "June"; break;
case "07": monthString = "July"; break;
case "08": monthString = "August"; break;
case "09": monthString = "September"; break;
case "10": monthString = "October"; break;
case "11": monthString = "November"; break;
case "12": monthString = "December"; break;
default: monthString = "Invalid month"; break;
}
System.out.println(monthString);

//out puts the result
 if( year >= 20) {
    System.out.println("You were born on : "+day+" "+monthString+ " " + c  +  year);
 }
 else
    System.out.println("You were born on : "+day+" "+monthString+ " " + c + z + year);
}
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in); // Create a Scanner object
System.out.println("Enter string ID number :");
String id = myObj.nextLine(); // Read user input

displayBirthday(id);//calling the method.
}
}
