public class bank {
  public static void main(String[] args) {
    BankAccount Account = new BankAccount();
    Account.getbalence();
    Account.CashDiposit(80000);
    Account.CashWithdrawl(10000);
  }  
}
class BankAccount{
    private int accountNumber ;
    private int balence;
    private String customerName;
    private String emailId ;
    private int pnoneNumber;
    public void getbalence(){
        System.out.println("your balence is "+this.balence);
    }
    public void CashDiposit(int cash){
        this.balence = cash +this.balence;
        System.out.println("you diposited "+ cash);
        System.out.println("total Balence "+ this.balence);
    }
    public void CashWithdrawl(int withdrawAmt){
        this.balence = this.balence - withdrawAmt ;
        System.out.println("you diposited "+ withdrawAmt);
        System.out.println("total Balence "+ this.balence);
    }
}