import java.util.*;
import java.lang.*;
class Ex22
{
 public static void main(String args[])
 {
  double sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  for(int i=0;i<=n;i++)
   {
    double a=(double)1/Math.pow(2,i);
    sum=sum+a;
   }
  System.out.println(sum);
 }
}
