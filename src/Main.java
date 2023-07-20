import java.util.Scanner;

class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println("Enter the base : ");
        int base = scanner.nextInt();
        String output = findDecimalToAnyBase(number, base);
        System.out.println("Output : " + output);
    }

    private static String findDecimalToAnyBase(int number, int base) {
        if (number == 0){
            return "0";
        }
        String result = "";
        while (number > 0){
            int remainder = number % base;
            result += remainder;
            number /= base;
        }
        String output = "";
        for(int i = result.length()-1; i >= 0; i--){
            output += result.charAt(i);
        }
        return output;
    }
}