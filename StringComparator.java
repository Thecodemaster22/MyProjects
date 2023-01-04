import java.util.Scanner;
import java.util.Arrays;

class StringComparator {
    // Attributes
    private String aFirstString;
    private String aSecondString;
    
    Scanner input = new Scanner(System.in);
    
    // Constructor
    public StringComparator(String initFirstString, String initSecondString) {
    
    System.out.print("Enter the first string: ");
    initFirstString = input.nextLine();
    
    System.out.print("Enter the second string: ");
    initSecondString = input.nextLine();
    
    aFirstString = initFirstString;
    aSecondString = initSecondString;
    
    }
    // Getter methods
    public String getAFirstString() {
        return aFirstString;
    }
    public String getASecondString() {
        return aSecondString;
    }
    // Method that counts vowels in a string
    public void moreVowels(String aFirstString, String aSecondString) {
    
    int countOne = 0;
    int countTwo = 0;
    
    String oneLowerCase = aFirstString.toLowerCase();
    String twoLowerCase = aSecondString.toLowerCase();
    
    for(int i = 0; i < oneLowerCase.length(); i++) {
        if(oneLowerCase.charAt(i) == 'a' || oneLowerCase.charAt(i) == 'e' ||  oneLowerCase.charAt(i) == 'i' || oneLowerCase.charAt(i) == 'o' || 
        oneLowerCase.charAt(i) == 'u') {
            countOne += 1;   
        }
    }
    for(int j = 0; j < twoLowerCase.length(); j++) {
        if(twoLowerCase.charAt(j) == 'a' || twoLowerCase.charAt(j) == 'e' ||  twoLowerCase.charAt(j) == 'i' || twoLowerCase.charAt(j) == 'o' || 
        twoLowerCase.charAt(j) == 'u') {
            countTwo += 1;   
        }
    }
    if(countOne > countTwo) {
        System.out.println(aFirstString + " has a greater number of vowels.");
    }
    else if(countOne < countTwo) {
        System.out.println(aSecondString + " has a greater number of vowels.");
    }
    else {
        System.out.println("Tie");
    }
    
    }
    // Method that shows which would appear first in the dictionary
    public void appearsFirst(String aFirstString, String aSecondString) {
    
        String oneLowerCase = aFirstString.toLowerCase();
        String twoLowerCase = aSecondString.toLowerCase();
        
        
        String newString1 = "";
        String newString2 = "";
        String newString3 = "";
        String newString4 = "";
        
        if(aFirstString.length() <= aSecondString.length()) {
            for(int i = 0; i < aFirstString.length(); i++) {
                if(oneLowerCase.charAt(i) == twoLowerCase.charAt(i)) {
                    newString1 += oneLowerCase.charAt(i);
                    newString2 += twoLowerCase.charAt(i);  
                }
        else {
                    newString3 += oneLowerCase.charAt(i);
                    newString4 += twoLowerCase.charAt(i);
                }
            }
            if(newString3.charAt(0) < newString4.charAt(0)) {
                System.out.println(aFirstString + " will appear first (before \"" + aSecondString + "\") in the dictionary.");
            }
            else {
                System.out.println(aSecondString + " will appear first (before \"" + aFirstString + "\") in the dictionary.");
            }
        }
        else {
            for(int i = 0; i < aSecondString.length(); i++) {
                if(oneLowerCase.charAt(i) == twoLowerCase.charAt(i)) {
                    newString1 += oneLowerCase.charAt(i);
                    newString2 += twoLowerCase.charAt(i);
                }
                else {
                    newString3 += oneLowerCase.charAt(i);
                    newString4 += twoLowerCase.charAt(i);
                }
            }
            if(newString3.charAt(0) < newString4.charAt(0)) {
                System.out.println(aFirstString + " will appear first (before \"" + aSecondString + "\") in the dictionary.");
            }
            else {
                System.out.println(aSecondString + " will appear first (before \"" + aFirstString + "\") in the dictionary.");
            }

        }
        
    }
    // Method that counts specified letter in string
    public void countLetter(char ch) {
    
    int countOne = 0;
    int countTwo = 0;
    
    
    
    String oneLowerCase = aFirstString.toLowerCase();
    String twoLowerCase = aSecondString.toLowerCase();
    
    for(int i = 0; i < oneLowerCase.length(); i++) {
        if(oneLowerCase.charAt(i) == ch) {
            countOne += 1;
        }
    }
    for(int j = 0; j < twoLowerCase.length(); j++) {
        if(twoLowerCase.charAt(j) == ch) {
            countTwo += 1;
        }
    }
    if(countOne > countTwo) {
        System.out.println("String with more '" + ch + "'s: " + aFirstString);
    }
    else if(countOne < countTwo) {
        System.out.println("String with more '" + ch + "'s: " + aSecondString);
    }
    else {
        System.out.println("Tie");
    }
    
    }
    
}

