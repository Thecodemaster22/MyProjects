import java.util.Scanner;
class testSquareMatrix {//test the square matrix class
    public static void main(String[] args){
        squareMatrix mat1 = new squareMatrix(3, 3);
        System.out.println("Displayed Matrix : ");
        mat1.displaySquareMatrix();

        System.out.println("\nGreatest Row Sum : ");
        display1DArray(mat1.getGreatestSumRow());
         System.out.println("\nLeast Column Sum : ");
        display1DArray(mat1.getLeastSumColumn());
        
        squareMatrix mat2 = new squareMatrix(5, 5);
        System.out.println("\n\nDisplayed Matrix : ");
        mat2.displaySquareMatrix();

        System.out.println("\nGreatest Row Sum : ");
        display1DArray(mat2.getGreatestSumRow());
        System.out.println("\nLeast Column Sum : ");
        display1DArray(mat2.getLeastSumColumn());
        squareMatrix mat3 = new squareMatrix(2, 2);
        System.out.println("\n\nDisplayed Matrix : ");
        mat3.displaySquareMatrix();
        System.out.println("\nGreatest Row Sum : ");
        display1DArray(mat3.getGreatestSumRow());
        System.out.println("\nLeast Column Sum : ");
        display1DArray(mat3.getLeastSumColumn());
 }
    private static void display1DArray(int[] dim1Array) {
        String sArray = "{";
        for (int i = 0; i < dim1Array.length; i++) {
            if (i == (dim1Array.length - 1)) {
                sArray += dim1Array[i] + "}";
            } else {
                sArray += dim1Array[i] + ", ";
            }
        }
        System.out.println(sArray);}//print out the output
}
