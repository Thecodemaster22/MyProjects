import java.util.Random;
import java.util.Scanner; //import scanner class

class question4prac5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//calls the scanner class
        System.out.print("Enter string: ");
        String str = scan.nextLine(); //user input
        
        shuffle(str);
        
    }
    private static void shuffle(String s){    
        Random rand = new Random();//access the random class
        int n;
        boolean found;
        //goes through array and if true its separeates the string and mixes the value because of the random method
        int res[] = new int[s.length()];//creates an array
        for(int i = 0;i<res.length;){
            found = false;
            n = rand.nextInt(s.length());
            for(int j = 0;j<i;j++){
                if(n==res[j]){
                    found = true;
                    break;
                }
            }
            //increments the string
            if(!found){
                res[i] = n;
                i++;
            }
        }
//prints the result
        for(int i = 0;i<res.length;i++){
            System.out.print(s.charAt(res[i]));
        }
    }
}
