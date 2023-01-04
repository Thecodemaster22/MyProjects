import java.util.Scanner;
class TestStringComparator {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("For first pair of strings...");
    StringComparator stringOne = new StringComparator("str1", "str2");
    
    String wordOne = stringOne.getAFirstString();
    String wordTwo = stringOne.getASecondString();
    stringOne.moreVowels(wordOne, wordTwo);
    stringOne.appearsFirst(wordOne, wordTwo);
    
    System.out.print("Enter the letter you would like to count in lower case: ");
    char ch1 = input.next().charAt(0);
    stringOne.countLetter(ch1);
    
    System.out.println();
    System.out.println("For second pair of strings...");
    StringComparator stringTwo = new StringComparator("str3", "str4");
    
    String wordThree = stringTwo.getAFirstString();
    String wordFour = stringTwo.getASecondString();
    stringTwo.moreVowels(wordThree, wordFour);
    stringTwo.appearsFirst(wordThree, wordFour);
    
    System.out.print("Enter the letter you would like to count in lower case: ");
    char ch2 = input.next().charAt(0);
    stringTwo.countLetter(ch2);
    
    System.out.println();
    System.out.println("For third pair of strings...");
    StringComparator stringThree = new StringComparator("str5", "str6");
    
    String wordFive = stringThree.getAFirstString();
    String wordSix = stringThree.getASecondString();
    stringThree.moreVowels(wordFive, wordSix);
    stringThree.appearsFirst(wordFive, wordSix);
    
    System.out.print("Enter the letter you would like to count in lower case: ");
    char ch3 = input.next().charAt(0);
    stringThree.countLetter(ch3);
    
    
    }
}
