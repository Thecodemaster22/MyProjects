class testLoan{
 public static void main(String[] Args){
   loan LoanOne = new loan(2000, 6, 2);
   loan LoanTw0 = new loan(1200.00 , 5 , 9 );
   loan LoanThree = new loan(3000.00 , 6.5 ,6);
    System.out.println("The amount borrowed is:" + LoanOne.borrowedAmount());
   LoanOne.getsimple();
   LoanOne.getcompound(5);
   LoanOne.getMonthlyInstallmentCompound(5);
   LoanOne.getMonthlyInstallmentSimple();


 }


}