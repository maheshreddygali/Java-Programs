import java.util.*;
class Ex27
{
 public static void main (String args[])
 {
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  for(int i=1;i<=n/2;i++)
   {
    if(n%i==0)
     sum=sum+i;
   }
  if(sum==n)
   System.out.println("The entered number is a PERFECT number");
  else
      System.out.println("The entered number is a NOT PERFECT number");
 }
}
