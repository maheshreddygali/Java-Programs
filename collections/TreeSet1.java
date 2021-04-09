import java.util.*;
class TreeSet1
{
public static void main(String[] args)
{
int sum = 0;
TreeSet<String> set = new TreeSet();
set.add("Gali");
set.add("Soma");
set.add("Naga");
set.add("Maheswar");
set.add("Reddy");
System.out.println(set);

TreeSet<Integer> set1 = new TreeSet();
set1.add(1);
set1.add(2);
set1.add(3);
set1.add(4);
System.out.println(set1);
System.out.println(" ");

for(String str : set)
System.out.println(str);
System.out.println(" ");

for(int i : set1)
{
sum = sum + i;
}
System.out.println("sum is : "+sum);
}
}
