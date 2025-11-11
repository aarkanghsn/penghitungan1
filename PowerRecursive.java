import java.util.Scanner;

public class PowerRecursive {
    // Fungsi rekursif untuk menghitung pangkat
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent % 2 == 0) {
            int half = power(base, exponent / 2);
            return half * half;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bilangan : ");
        int base = scanner.nextInt();
        System.out.print("Input Pangkat : ");
        int exponent = scanner.nextInt();
        int result = power(base, exponent);
        System.out.println("Hasil " + base + " pangkat " + exponent + " = " + result);
        scanner.close();
    }
}

