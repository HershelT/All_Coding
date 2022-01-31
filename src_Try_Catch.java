import java.sql.SQLOutput;

public class Try_Catch {
    public static void main(String[] args) {
        try {
            int[] myNums = {1, 2, 3};
            System.out.println(myNums[4]);
            System.out.println("Hello");
        } catch (Exception error) {
            System.out.println("Sorry! You have failed to put the correct variable!!");
        }

        System.out.println("Have a Nice Day!!!");
    }



}