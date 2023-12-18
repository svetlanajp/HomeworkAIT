package Hw_les28;

public class Money {
    protected int banknotes;
    protected int coints;

    public Money(int banknotes, int coints) {
        this.banknotes = banknotes;
        this.coints = coints;
    }

    @Override
    public String toString() {
        return "Money: " + "banknotes= " + banknotes + ", coints= " + coints;
    }
}
