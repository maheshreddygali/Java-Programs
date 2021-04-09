import java.util.*;
class Ex21
{
 public static void main(String args[])
 {
  float sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
   {
    float a=(float)1/i;
    sum=sum+a;
   }
  System.out.println(sum);
 }
}
