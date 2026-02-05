import java.util.Scanner;
class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          double price1 = sc.nextDouble();
          int quantity1 = sc.nextInt();
        
          double price2 = sc.nextDouble();
          int quantity2 = sc.nextInt();
          double TotalBill = (price1*quantity1) + (price2*quantity2);
        
        if(TotalBill >= 5000) {
            TotalBill = TotalBill - (0.1*TotalBill);
        }
        else if(TotalBill >= 2000) {
          TotalBill = TotalBill - (0.05*TotalBill);
        }

    TotalBill = TotalBill + (TotalBill*0.18);

    System.out.println("Final Payable Amount is : " + TotalBill);
    }
}
