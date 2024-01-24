package Hw_les45;

import java.util.function.*;

public class Main {
    /*
    Переписать лямбда выражения из класса Main пакета our_interfaces (см.код)
    с использованием стандартных функциональных интерфейсов
     */
    public static void main(String[] args) {

        System.out.println("======BiFunction======");
        BiFunction<Integer, Integer, String> concat = (a, b) -> Integer.toString(a) + b;
        System.out.println(concat.apply(1, 3));
//        Concatable concatable = (a,b) -> Integer.toString(a) + b;
//        System.out.println(concatable.concat(1,3));

        System.out.println("======Predicate======");
        Predicate<String> check = s -> s.length() == 3;
        System.out.println(check.test("abc"));
        System.out.println(check.test("abcd"));
//        Checkable checkable = s -> s.length() == 3;
//        System.out.println(checkable.check("abc"));
//        System.out.println(checkable.check("abcd"));

        System.out.println("======Predicate1======");
        check = s -> s.length() % 2 == 0;
        System.out.println(check.test("abc"));
        System.out.println(check.test("abcd"));
//        System.out.println("checkable even");
//        checkable = s -> s.length() % 2 == 0;
//        System.out.println(checkable.check("abc"));
//        System.out.println(checkable.check("abcd"));

        System.out.println("======UnaryOperator======");
        UnaryOperator<String> upCase = s -> s.toUpperCase();
        System.out.println(upCase.apply("abcDe"));
        UnaryOperator<String> upCase1 = String::toUpperCase;
        System.out.println(upCase1.apply("abcDe"));
//        Transformable transformable = String::toUpperCase;
//        System.out.println(transformable.modify("abcDe"));

        System.out.println("======UnaryOperator2======");
        UnaryOperator<String> el1 = s -> s.length() == 4 ? "****" : s;
        System.out.println(el1.apply("ab"));
        System.out.println(el1.apply("abcd"));
//        Transformable transformable1 = s -> s.length() == 4 ? "****":s;
//        System.out.println(transformable1.modify("ab"));
//        System.out.println(transformable1.modify("abcd"));

        System.out.println("======Consumer======");
        Consumer<String> cons = s -> System.out.println("!" + s + "!");
        cons.accept("Hello");
//        Printable printable = s -> System.out.println("!" + s + "!");
//        printable.print("Hello");

        System.out.println("======Supplier======");
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
//        Producable producable = () -> "Hello World";
//        System.out.println(producable.produce());

    }
}
