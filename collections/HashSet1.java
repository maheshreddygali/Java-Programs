//program to perform set methods
import java.util.*;
class HashSet1
{
public static void main(String[] args)
{
Set<String> set1 = new HashSet<String>();
set1.add("Gali");
set1.add("Soma");
set1.add("Naga");
set1.add("Maheswar");
set1.add("Reddy");
System.out.println(set1);

set1.add("Gali");
System.out.println(set1);

set1.remove("Reddy");
System.out.println(set1);
System.out.println("");

set1.add("Reddy");
System.out.println("");

Iterator itr=set1.iterator();
while(itr.hasNext()){
System.out.println("Using iterator method : "+itr.next());
}
System.out.println("");
for(String str : set1 )
System.out.println("Using for loop : "+str);
System.out.println("");

System.out.println("The size of the set is : "+set1.size());

}
}
