package Hw_les27;

public class Salami extends Pizza{
    String salami;
    String oliven;


    public Salami(String name, String dough, String cheese, String sause, String salami, String oliven) {
        super(name, dough, cheese, sause);
        this.salami=salami;
        this.oliven=oliven;
    }
    public String getSalami(){return salami;}
    public String getOliven(){return oliven;}
    //подготовка метод
    public void prepare(){
        System.out.println("preparing ingredients for pizza "+getName()+": "+getSalami()+" "+getOliven()+" "+getDough()+" "+getCheese()+" "+getSause());
    }
    public void back(){
        System.out.println("Backing pizza"+getName());
    }
    //упаковка
    public void pack(){
        System.out.println("Packing pizza"+getName());
    }
    public String toString() {
        return "PizzaMargarita " +super.toString()+ "salami= " + getSalami()+getOliven();
    }
}

