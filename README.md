# Baller9

#The AccountModel is a Java program i made quickly to basically model the basic undertakings of banking software such as withdrawal, deposit, interest rates,balance and the current time the transactions took place.
The execution class for this program is below:

package account;




public class Account {

    
    public static void main(String[] args) {
       java.util.Date date = new java.util.Date();
       AccModel first = new AccModel(1122,20000,4.5,2500,3000);
       
       
       System.out.println(first.getBalance());
       System.out.println(first.getMonthlyInterest());
       System.out.println(date);
    }
    
}

