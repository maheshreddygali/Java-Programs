import java.util.*;
class Ex42
{
 public static void main(String args[])
 {
  int flag=0,count=0;
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
     for(int x=1;x<count;x++)
     {
      if(a[k]!=a[x])
       {
	flag=1;
        break;
        }
       else
	flag=0;
     }
    }
  if(flag==1)
    System.out.println("Digits are NOT SAME");
  else
    System.out.println("Digits are SAME");
 }
}
