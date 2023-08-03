import java.util.HashSet;

public class Program61 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        
        HashSet<Cat> cats = new HashSet<>();

        cats.add(new Cat("Дымок", "серый", "сибирский", 4.567));
        cats.add(new Cat("Пушок", "черный", "бомбей", 4.123));
        cats.add(new Cat("Луна", "белая", "сиамская", 4.234));


        System.out.println();
        System.out.println(cats);

        Cat catSmokey = new Cat("Дымок", "серый", "сибирский", 4.567);
        Cat catMoon = new Cat("Луна", "белая", "сиамская", 4.234);
        cats.add(catSmokey);
        cats.add(catMoon);

        System.out.println();
        System.out.println(cats);

    }
}