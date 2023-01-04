class AllperfectSquares{
     public static void main(String[] args){
        for (int i = 0; i <= 1000; i++) { //Since 0 is considered a perfect square, we include 0 in a loop ranging till 1000.
        int number = i;
            int sqrt = (int) Math.sqrt(number); //casted to integer so that there are no errors when getting a perfect square number.
            if (sqrt * sqrt == number) { //NB: If rooted number times the rooted number is strictly equal to i which is number is this case, its regarded as a perfect square.
                System.out.println(number+ " = "+sqrt+" * "+sqrt);
            } 
        }
    }
}
