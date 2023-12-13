package Hw_les25;

public class Truck extends Cars {

    private int currentWeight = 0;

    private int maxWeight;
    public Truck(String model,
                 String manufacturer,
                 int year,
                 String color,
                 int maxFuel,
                 String owner, int maxWeight) {
        super(model, manufacturer, year, color, maxFuel, owner);
        this.maxWeight=maxWeight;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public void load(int weight) {

        if (weight > getRemainingCapacity()) {
            System.out.println("This is too heavy for me! I can't continue");
            printRemainingCapacity();
            return;
        }
        currentWeight += weight;
        System.out.println("Loading " + weight + " kg...");
        System.out.println("Loaded " + weight + " kg.");
        printRemainingCapacity();
    }

    public void unload(int unloadingWeight) {

        if (unloadingWeight > getRemainingCapacity()) {
            System.out.println("Not enough cargo!");
            printRemainingCargo();
            return;
        }
        if (unloadingWeight < 0) {
            System.out.println("Can't unload negative weight");
            return;
        }
        currentWeight -= unloadingWeight;
        System.out.println("Unloading " + unloadingWeight + "kg...");
        System.out.println("Unloaded " + unloadingWeight + " kg.");
        printRemainingCargo();
    }


    private void printRemainingCargo() {
        System.out.println("Remaining cargo weight is " + currentWeight + " kg.");
    }

    private void printRemainingCapacity() {//печатает сколько остается еще груза на борту
        System.out.println("Remaining capacity " + getRemainingCapacity() + " kg");
    }

    private int getRemainingCapacity() {
        return this.getMaxWeight() - currentWeight;
    }

}
