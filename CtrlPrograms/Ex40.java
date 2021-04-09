import java.util.*;
class Ex40
{
 public static void main(String args[])
 {
  int a[]=new int[10];
  int max=0;
  int min=9;
  int sum=0;
  float avg;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the values");
  for(int i=0;i<10;i++)
   {
    a[i]=sc.nextInt();
    sum=sum+a[i];
    if(a[i]>max)
     max=a[i];
    if(a[i]<min)
     min=a[i];
   }
  avg=(float)sum/10;
  System.out.println("The AVERAGE of entered numbers is:"+avg);
  System.out.println("The MAX number in the array is:"+max);
  System.out.println("The MIN number in the array is:"+min);
 }
}
