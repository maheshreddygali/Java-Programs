import java.util.*;
class Ex17
{
 public static void main(String args[])
 {
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter n value");
  int n=sc.nextInt();
  for(int i=0;i<=n;i++)
   {
    if(i%2==0)
      sum=sum+i;
   }
  System.out.println(sum);
 }
}
