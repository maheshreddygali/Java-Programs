import java.util.*;
class LinkedListAll
{
public static void main(String[] args)
{
LinkedList<String> llist = new LinkedList<String>();

llist.add("Soma");
llist.add("Naga");
llist.add("Maheswar");


System.out.println("Initial values"+llist);

llist.addFirst("Gali");
llist.addLast("Reddy");
System.out.println(llist);

System.out.println("Getting first element : "+llist.getFirst());
System.out.println("Getting second element : "+llist.getLast());
Collection<String> collect = new ArrayList<String>();
collect.add("I");
collect.add("Am");
collect.add("a");
collect.add("good");
collect.add("Boy.");

llist.addAll(collect);
System.out.println(llist);
System.out.println("Getting last element : "+llist.getLast());

for(String str : llist)
System.out.println(str);

}
}
