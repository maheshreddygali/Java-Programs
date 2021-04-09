import java.util.*;
class Ex45
{
 public static void main(String args[])
 {
  int fact=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
   {
    fact=0;
    for(int j=1;j<=n;j++)
     {
      if(i%j==0)
       fact++;
     }
    if(fact==2)
     System.out.println(i);
   }
 }
}
