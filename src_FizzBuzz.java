public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 5 ==0) {
                if (i % 3 == 0){
                    System.out.println("FizzBuzz");
                    continue;
                } else{
                    System.out.println("Buzz");
                    continue;
                }
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i++) {
            String output = "";
            int[] multiplesToCheck = {3, 5, 7, 9};
            String[] keyWords = {"Fizz", "Buzz", "Biff", "Hershel"};

            for (int j = 0; j < multiplesToCheck.length; j++) {
                if (i % multiplesToCheck[j] == 0) {
                    output += keyWords[j];
                }
            }
            if (output.equals("")) {output += i;};

            System.out.println(output);
        }
    }

}