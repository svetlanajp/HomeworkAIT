package Hw_les28;

/*
Задача 1
С использованием агрегации (HAS-A relationship) создать классы Кошелек ( Wallet ) и Деньги ( Money).
Вывести на печать несколько обьектов класса Wallet
 */
public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(new Money(45, 67));
        Money money1 = new Money(25, 3);
        Wallet wallet1 = new Wallet(money1);
        Money money2 = new Money(3, 56);
        Wallet wallet2 = new Wallet(money2);
        System.out.println(wallet);
        System.out.println(wallet1);
        System.out.println(wallet2);
    }
}
