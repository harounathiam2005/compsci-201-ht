import java.util.*;

public class Testing {
    public static void main(String[] args) {
        System.out.println("Running main in Tester class...");
        System.out.println(reverse("HI!"));
    }

    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

}