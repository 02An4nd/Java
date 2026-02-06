import java.util.Scanner;
 class Q5 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int units =sc.nextInt();
      int bill;

   if(units<=100) {
     bill = units * 2;
   }
     else if(units<=200) {
       bill = (100*2) + (units -100)*3;
     }
     else {
       bill = (100 *2) +(100 * 3) + (units-200)*5;
     }

   bill = bill +150;

     System.out.println("Total Electricity Bill = " + bill);
     
   }
 }
