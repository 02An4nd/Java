import java.util.Scanner;
class Q2 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  int basic = sc.nextInt();
double HRA;
double DA;
double PF = (0.12*basic);
  if(basic>=30000) {
   HRA = (0.20*basic);
   DA =  (0.15*basic);
}
else {
HRA = (0.10*basic);
DA =  (0.08*basic);
}

double NetSalary = (basic + HRA + DA) - PF ;

System.out.println("NetSalary : " +  NetSalary);
 }
}
