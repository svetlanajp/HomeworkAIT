package Hw_les27;

public class PizzaChoice {

    public static Pizza choosePizza(String type) {

        switch (type) {

            case "1", "Salami": {
                Pizza sal = new Salami("Salami", "Dough", "Cheese", "Souse", "Salami", "Oliven");
                sal.prepare();
                sal.back();
                sal.pack();

                return new Salami("Salami", "Dough", "Cheese", "Souse", "Salami", "Oliven");
            }
            case "2", "Margarita": {
                Pizza mar = new Margarita("Margarita", "dough", "cheese", "souse", "tomato", "Garlic", "Basilik");
                mar.prepare();
                mar.back();
                mar.pack();

                return new Margarita("Margarita", "dough", "cheese", "souse", "tomato", "Garlic", "Basilik");
            }
            case "3", "Hawaii": {
                Pizza haw = new Hawaii("Hawaii", "dough", "Cheese", "souse", "ananas", "Chicken");
                haw.prepare();
                haw.back();
                haw.pack();
                return new Hawaii("Hawaii", "dough", "Cheese", "souse", "ananas", "Chicken");

            }
            default: {
                System.err.println("There is no such pizza. Make another choice.");
                return null;
            }
        }
    }
}
