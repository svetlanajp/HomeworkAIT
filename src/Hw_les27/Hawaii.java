package Hw_les27;

public class Hawaii extends Pizza{
    String ananas;
    String chicken;

    public Hawaii(String name, String dough, String cheese, String sause, String ananas, String chicken) {
        super(name, dough, cheese, sause);
        this.ananas=ananas;
        this.chicken=chicken;
    }
    public String getAnanas(){return ananas;}
    public String getChicken(){return chicken;}
    //подготовка метод
    public void prepare(){
        System.out.println("preparing ingredients for pizza "+getName()+": "+getChicken()+" "+getAnanas()+" "+getDough()+" "+getCheese()+" "+getSause());
    }
    public void back(){
        System.out.println("Backing pizza"+getName());
    }
    //упаковка
    public void pack(){
        System.out.println("Packing pizza"+getName());
    }
    public String toString() {
        return "PizzaMargarita " +super.toString()+ "ananas= " + getChicken()+getAnanas();
    }
}
