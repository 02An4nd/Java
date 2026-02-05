import java.util.Scanner;
class Q3 {
  public static void main(String[] args)  {
   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    if(n>0) {
      System.out.println("Positive");
    }
    else if(n<0) {
      System.out.println("Negative");
    }
    else {
      System.out.println("Zero");
    }
     if(n%2==0) {
       System.out.println("Even");
     }
    else {
      System.out.println("Odd");
    }

    if(n%5==0 && n%7==0) {
      System.out.println("Number is Divisible by both 5 and 7 ");
    }
    else {
      System.out.println("Number is  not Divisible by both 5 and 7 ");
    }
  
  }
}
