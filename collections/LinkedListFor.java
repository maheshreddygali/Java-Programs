import java.util.*;
class LinkedListFor
{
public static void main(String[] args)
{
LinkedList<String> llist = new LinkedList<String>();
llist.add("Gali");
llist.add("Soma");
llist.add("Naga");
llist.add("Maheswar");
llist.add("Reddy");
System.out.println(llist);

for(String str : llist)
System.out.println(str);

for(int i=0;i<=llist.size()-1;i++)
System.out.println(llist.get(i));
}
}
