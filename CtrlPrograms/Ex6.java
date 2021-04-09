import java.util.*;
class Ex6
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any value");
  char a=sc.next().charAt(0);
  int n=a;
  if(n>=65 && n<=90)
   System.out.println("The entered value is UPPERCASE");
  else if(n>=97 && n<=122)
   System.out.println("The entered value is LOWERCASE");
  else if(n>=48 && n<=57)
   System.out.println("The entered value is DIGIT");
  else
   System.out.println("The entered value is SPECIAL CHARACTER");
 }
}
