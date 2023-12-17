package Hw_les27;

public class Pizza {

    public String name;
    String dough;
    String cheese;
    String sause;


    public Pizza(String name,String dough, String cheese, String sause) {
        this.name=name;
        this.dough = dough;//тесто
        this.cheese = cheese;
        this.sause = sause;
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSause() {
        return sause;
    }


    //подготовка
    public void prepare(){
        System.out.println("preparing ingredients for pizza"+getName());
    }
    //выпечка
    public void back() {
        System.out.println("Backing pizza" + getName());
    }

    //упаковка
    public void pack() {
        System.out.println("Packing pizza" + getName());
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "name= " + name +
                ", dough= " + dough +
                ", cheese= " + cheese +
                ", sause= " + sause;
    }
}

