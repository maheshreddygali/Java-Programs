import java.util.*;
class Primes
{
public static void main(String[] args)
{
int count=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter number to check prime or not : ");
int num = sc.nextInt();
for(int i = 2 ; i<=num/2 ; i++)
{
if(num%i==0)
{
count = count+1;
}
}

if(count==0)
System.out.println("prime");
else
System.out.println("not prime");
}
}
