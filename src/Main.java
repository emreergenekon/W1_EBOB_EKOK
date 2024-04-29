import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Two inputs needed for calculate LCM.
        System.out.print("İlk sayıyı giriniz: ");
        int number1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int number2 = scanner.nextInt();

        int ebob = 1;
        int ekok = (number1 * number2) / ebob; // The product of the two numbers can be used to calculate LCM.

        int sayac = 2;
        while (sayac <= number1 && sayac <= number2) {
            if (number1 % sayac == 0 && number2 % sayac == 0) {
                ebob = sayac;
            }
            sayac++;
        }

        ekok = (number1 * number2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}