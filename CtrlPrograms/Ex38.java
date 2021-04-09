import java.util.*;
class Ex38
{
 public static void main(String args[])
 {
  final int SECONDS_PER_HOUR=3600;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter second value");
  int s=sc.nextInt();
  int h=s/SECONDS_PER_HOUR;
  System.out.println(h);
 }
}
