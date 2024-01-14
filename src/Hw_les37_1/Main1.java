package Hw_les37_1;

/*
Разобраться в коде занятия (our arraylist).
В классе Main создать несколько обьектов OurArrayList, вызвать методы, посмотреть как они работают
 */
public class Main1 {
    public static void main(String[] args) {
        OurList<String> ourList = new OurArrayList<>();
        ourList.append("Leeloo");
        ourList.append("Korben Dallas");
        ourList.append("Emanuel Zorg");
        ourList.append("Vito Kornelius");

        System.out.println("List size is " + ourList.size());
        for (int i = 0; i < ourList.size(); i++) {
            System.out.print("= " + ourList.get(i) + " = ");
        }
        System.out.println();
        ourList.set("Diva Plavalaguna", 2);
        for (int i = 0; i < ourList.size(); i++) {
            System.out.print("= " + ourList.get(i) + " = ");
        }
        System.out.println();
        ourList.append("Rubi Rhod");
        System.out.println("Now list size is " + ourList.size());
        for (int i = 0; i < ourList.size(); i++) {
            System.out.print("= " + ourList.get(i) + " = ");
        }
        System.out.println();

//        String vito=ourList.remove("Vito Kornelius");
//        System.out.println("Remove "+ourList.remove("Vito Kornelius"));
//        for (int i = 0; i < ourList.size(); i++) {
//            System.out.print("= "+ourList.get(i)+" = ");
//        }

    }
}
