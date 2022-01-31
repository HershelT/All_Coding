public class FizzBuzz {
    public static void main(String[] args) 
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
