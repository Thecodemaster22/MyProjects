import java.util.*;
class loan{
     //  Getting the attributes 
    private double borrowedAmount;
    private double rateInterest;
    private int term;
    
    //Getting the constructor 
    public loan(double  intborrowedAmount,double intrateInterest,int intterm){
        borrowedAmount=intborrowedAmount;
        rateInterest=intrateInterest;
        term=intterm;
    } 
    
    //  Methods of initial amount 
    public double borrowedAmount(){
    
        return borrowedAmount;
    }
    
    // Method of the interest per year
    public double rateInterest(){
        return rateInterest;
    }
    
    // Method of the term of the loan 
    public double term(){
        return term;
    }
    //Method that return total amount that paid back if simple interest.
    public double getsimple(){
      double finalAmount = borrowedAmount * ( 1 + rateInterest/100*term);
        System.out.println("The simple interest is:" + finalAmount);
        return finalAmount;   
    }
    
    // Method thst return the total amount that must be paid back if compound interest
   public double getcompound(double n){
    double i = rateInterest/100;
    
     double finalAcc = borrowedAmount*Math.pow((1 + i/n) , term*n);
     System.out.println("The compound interest is:" + finalAcc);
        return finalAcc;
    } 
    
    //Method that return the monthly instalment on the loan if simple interest
    public double getMonthlyInstallmentSimple(){
       // return borrowedAmount *(rateInterest*Math.pow(( 1+ rateInterest),term)) / (Math.pow((1+rateInterest),(term - 1)));
       double Acc = borrowedAmount * ( 1 + rateInterest/100*term) / term;

       System.out.println("The simple interest monthly is :" + Acc);
       return Acc;
    }
    
    public double getMonthlyInstallmentCompound(double n){
      double i = rateInterest/100;
      double monthlyInst = borrowedAmount*Math.pow((1 + i/n) , term*n) / term;
      System.out.println("The compound monthly installment is: " + monthlyInst);
        return monthlyInst;
    
   }   
}


