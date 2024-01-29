import java.text.DecimalFormat;

public class Account{

    private int coutomerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;

    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }
    public int getPinNumber(int pinNumber){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance =(savingBalance-amount);
        return savingBalance;
    }

}


public static void main(String [] args){
    
}