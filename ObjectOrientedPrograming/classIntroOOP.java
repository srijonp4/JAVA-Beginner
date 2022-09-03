public class classIntroOOP {
    public static void main(String[] args) {
     Car porshe = new Car();
     Car BMW = new Car();
     porshe.setModel("dick");
    System.out.println("moedl is "+ porshe.getmodel());
      
    }
}

class Car {

private int doors ;
private int wheels ;
private String model ;
private String Engine ;
private String color ;

public void setModel(String model){
    this.model = model; 
} 
public String getmodel(){
    return this.model;
}   
} 