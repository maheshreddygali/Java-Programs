import java.util.*;
class Ex48
{
 public static void main(String args[])
 {
  int count=0,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  int i=0;
  int a[]=new int[10];
  while(n!=0)
   {
    int r=n%10;
    a[i]=r;
    n=n/10;
    i++;
    count++;
   }
  sum=a[0]+a[count-1];
  System.out.println(sum);
 }
}
