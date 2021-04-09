import java.util.*;
class Ex50
{
 public static void main(String args[])
 {
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  int temp=n;
  while(n!=0)
  {
    int r=n%10;
    sum=sum+(r*r*r);
    n=n/10;
   }
  if(sum==temp)
   System.out.println("Entered number is a ARMSTRONG number");
  else
   System.out.println("Entered number is a NOT ARMSTRONG number");
 }
}
