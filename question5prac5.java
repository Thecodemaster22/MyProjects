import java.util.Scanner;//import scanner class
class question5prac5 {
 public static boolean isAnagram(String one, String two) {
   if (one.length() != two.length())//checks to see if the length of both strings are equal
       return false;
   //checks using boolean output if the charcter in string 1 is the same charcaters in string 2
   int[] counts = new int[26];
   for (int i = 0; i < one.length(); i++)
       counts[one.charAt(i) - 'a']++;
   for (int i = 0; i < two.length(); i++)
       counts[two.charAt(i) - 'a']--;
   for (int i = 0; i < counts.length; i++)
       if (counts[i] != 0)
           return false;
   return true;
 }
 
 public static void main(String[] args) {
 //inputs the strings from the user(User interface)
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the first string: ");
   String one = input.nextLine();
   System.out.print("Enter the second string: ");
   String two = input.nextLine();
   //calls the method and returns the outcome 
   System.out.println(isAnagram(one, two) ? "The two strings are anagrams." : 
       "The two strings are not anagrams.");
 }
}

