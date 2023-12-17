package Hw_les27;

import java.util.Scanner;

public class OnLinePizzaShop {
    /*
 создать магазин/фабрику по продаже и производству пиццы. Программа должна уметь готовить следующие виды пиццы:
    Гавайи, Маргарита, Салями.
    Каждый вид пиццы должен уметь: подготавливаться( накладывать ингридиенты напр), печься и упаковываться.
    В каждом случае должно быть понятно о какой пицце идет речь
    В классе OnlinePizzaShop  не должен создаваться новый обьект пицца, а из него должен поступать  "заказ" на изготовление
    требуемого вида пиццы (обьекта) в класс PizzaChoice, который и должен выбрать нужную пиццу для изготовления

    Выбор пиццы осуществляется клиентом с клавиатуры в классе OnlinePizzaShop, при этом нужно обеспечить проверку
    правильности выбора клиента и возможность заказать еще пиццу/пиццы
    1. Классы :
       Pizza - родительский класс
       PizzaSalami, PizzaMargarita, PizzaHawaii  -  дочерние

       В этих классах должны быть минимум три метода, отражающие процесс приготовления пиццы из ТЗ
       prepare()
       bake()
       pack()
       orderPizza()

       PizzaChoice -  сюда в соответствующий метод  будет передаваться выбор клиента и в зависимости от этого выбора
        через switch возвращаться новый обьект соответствующей пиццы
        Pizza createPizza( String type)
        Последовательность действий при заказе :

        Введите название пиццы ( 1,2,3)

        Preparing pizza with mozarella cheese
        Baking Pizza Margarita
        Packing Pizza margarita
         В методе main  через сканер предложить клиенту выбрать пиццу. Затем его выбор передать  передать
         в switch, находящийся в методе choosePizza

     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1.Salami, 2.Margarita, 3.Hawaii");
        String name = myScanner.nextLine();
        PizzaChoice.choosePizza(name);

        System.out.println("Would you like to order more? Enter: yes/y or no/n");
        name = myScanner.nextLine();
        switch (name) {
            case "yes", "y": {
                System.out.println("Enter your choice: ");
                System.out.println("1.Salami, 2.Margarita, 3.Hawaii");
                name = myScanner.nextLine();
                PizzaChoice.choosePizza(name);

            }
            case "no", "n": {
                return;
            }
        }
        myScanner.close();
    }

}


