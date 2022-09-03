import java.util.Scanner;

public class powerofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base Number : ");
        int base = sc.nextInt();
        int temp = base;
        System.out.println("Enter the exponent Number : ");
        int exp = sc.nextInt();

        for (int i = 1; i < exp; i++) {
        temp = temp * temp;
    }
    System.out.println("Result :" +temp);

    }
}
