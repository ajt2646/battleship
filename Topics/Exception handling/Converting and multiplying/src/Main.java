import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int inputNum = 1;
        String inputString = "";

        while (inputNum != 0) {
            try {
                inputString = scanner.nextLine();
                inputNum = Integer.parseInt(inputString);
                if (inputNum != 0) {
                    System.out.println(inputNum * 10);
                }
            } catch (Exception e) {
                System.out.println(String.format("Invalid user input: %s", inputString));
            }
        }
    }
}