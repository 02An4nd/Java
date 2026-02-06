import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

    if(withdraw % 100 == 0  && balance - withdraw >= 1000) {
       balance = balance - withdraw;
     System.out.println("Withdrawal Successful");
}
else {
      System.out.println("Withdrawal Failed ");
}
}
}
