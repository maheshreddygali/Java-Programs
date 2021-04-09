import java.util.*;
class LinkedListInt
{
public static void main(String[] args)
{
LinkedList<Integer> llist = new LinkedList();
llist.add(18);
llist.add(20);
llist.add(22);
llist.add(24);
llist.add(26);
System.out.println(llist);

for(int str : llist)
System.out.println(str);

for(int i=0;i<=llist.size()-1;i++)
System.out.println(llist.get(i));
}
}
