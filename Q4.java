import java.util.Scanner;
class Q4 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int choice =sc.nextInt();

    switch (choice) {
    case 1:
        System.out.println(num1 + num2);
        break;

    case 2:
        System.out.println(num1 - num2);
        break;

    case 3:
        System.out.println(num1 * num2);
        break;

    case 4:
        if(num2!=0) {
        System.out.println(num1 / num2); 
        }
        else {
        System.out.println("Invalid Operator");
        }
        break;


      case 5:
        System.out.println(num1 % num2);
        break;
        
    default:
        System.out.println("Invalid Operation");
    }  
  }
}
