import java.util.*;
class Ex41
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
  for(int k=0;k<count;k++)
   {
    int c=0;
    for(int x=0;x<count;x++)
     {
      if(a[k]==a[x])
       {
        c++;
       }
     }
      System.out.println(a[k]+" occured "+c+" times");
   }
 }
}
