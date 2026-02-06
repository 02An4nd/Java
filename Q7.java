import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        int reverse = 0;
        int sum = 0;
        int count = 0;

        while (temp != 0) {
            int digit = temp % 10;

            reverse = reverse * 10 + digit;
            sum = sum + digit;
            count++;

            temp = temp / 10;
        }

        System.out.println(reverse);
        System.out.println(sum);
        System.out.println(count);
    }
}
