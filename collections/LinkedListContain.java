import java.util.*;
class LinkedListContain
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
System.out.println(llist.contains("Reddy"));
System.out.println(llist.peek());
System.out.println(llist.peekLast());
}
}
