import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    public static void main(String[] args) {
        String[] Menu = {"Hot Dog", "Hambugar", "Slushie", "French Fries"};

        ArrayList<String> order = new ArrayList<>();
        for (String M : Menu) {
            order.add(M + " Is your food");
        }
        System.out.println(order);
    }
}
