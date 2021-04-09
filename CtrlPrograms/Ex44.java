import java.util.*;
class Ex44
{
 public static void main(String args[])
 {
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  for(int i=0;i<=n;i++)
   sum=sum+i;
  if(sum>50)
    System.out.println("The sum value is more than 50");
  else
    System.out.println("The sum is:"+sum);
 }
}
