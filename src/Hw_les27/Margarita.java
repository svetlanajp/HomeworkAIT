package Hw_les27;

public class Margarita extends Pizza{
    String tomatoCherry;
    String garlic;
    String basil;


    public Margarita(String name, String dough, String cheese, String souse, String tomatoCherry, String garlic, String basil){
        super(name, dough,cheese,souse);
        this.tomatoCherry=tomatoCherry;
        this.garlic=garlic;
        this.basil=basil;
    }

    public String getTomatoCherry() {
        return tomatoCherry;
    }

    public String getGarlic() {
        return garlic;
    }

    public String getBasil() {
        return basil;
    }

    //подготовка метод
    public void prepare(){
        System.out.println("preparing ingredients for pizza "+getName()+": "+getTomatoCherry()+" "+getBasil()+" "+getGarlic()+" "+getDough()+" "+getCheese()+" "+getSause());

    }
    public void back(){
        System.out.println("Backing pizza"+getName());
    }
    //упаковка
    public void pack(){
        System.out.println("Packing pizza"+getName());
    }
    @Override
    public String toString() {
        return "PizzaMargarita " +super.toString()+ "tomato= " + getTomatoCherry()+getBasil()+getGarlic();
    }
}

