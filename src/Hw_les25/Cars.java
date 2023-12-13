package Hw_les25;

public class Cars {
    private String model;
    private String manufacturer;
    private int year;
    private String color;
    private int maxFuel;
    public int currentFuel = 0;
    private String owner;

    public Cars(String model, String manufacturer, int year, String color, int maxFuel, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
    public int getMaxFuel() {
        return maxFuel;
    }

    public void move() {
        if (currentFuel == 0) {
            System.out.println("Not enought fuel, can't drive");
            return;
        }
        System.out.println("Tryinng...");
        System.out.println("Tryinng...");
        System.out.println("Yeah, driving!");
    }
    public void stop() {
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Yeah!");
    }
    //уметь заправляться топливом
    public void setCurrentFuel(int currentFuel) {
        if (currentFuel > maxFuel) {
            this.currentFuel = maxFuel;
            return;
        }
        this.currentFuel = currentFuel;
    }

    //уметь сообщать имя владельца
    public String getOwner() {
        return "The owner is " + owner;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", maxFuel=" + maxFuel +
                ", owner='" + owner + '\'' +
                '}';
    }
}
