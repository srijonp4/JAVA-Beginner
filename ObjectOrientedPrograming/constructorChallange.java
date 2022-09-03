

////main  class;


public class constructorChallange {
    public static void main(String[] args) {
      
      VipCustomer Srijon = new VipCustomer();
        System.out.println(Srijon.getEmailAddress());
    VipCustomer Chandan = new VipCustomer("chamdan","chamdan@1213");
    System.out.println(Chandan.getEmailAddress());
    VipCustomer Kaberi = new VipCustomer("Kaberi","kaberi@123",654566546.54);
    Kaberi.getName();
    Kaberi.getCreditLimit();
    System.out.println(Kaberi);
    



    }
}


/////constructor Class

class VipCustomer{
    public String Name;
    public String emailAddress;
    public double creditLimit;

    public VipCustomer(){
        // System.out.println("empty constructor called");
        this("Default Name","default@gmail.com" , 0);

        
    }


    public VipCustomer(String Name,String emailAddress ){
        System.out.println("Parameterized constructor1 called");
        this.Name=Name;
        this.emailAddress=emailAddress;
        this.creditLimit=500000;

    }

    public VipCustomer(String Name,String emailAddress, double creditLimit){
        System.out.println("Parameterized constructor2 called");
        this.Name=Name;
        this.emailAddress=emailAddress;
        this.creditLimit=creditLimit;

    }
    public String getEmailAddress(){

        // System.out.println(this.emailAddress);
        return emailAddress;

    }
    public void getName(){
        System.out.println(this.Name);
        
}
public void getCreditLimit(){
    System.out.println(this.creditLimit);
}
}