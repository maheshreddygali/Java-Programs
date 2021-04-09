import java.util.*;
class LinkedListRemove
{
public static void main(String[] args)
{
LinkedList<Integer> llist = new LinkedList();
llist.add(18);
llist.add(20);
llist.add(22);
llist.add(24);
llist.add(26);
System.out.println("Before removal it is empty:"+llist.isEmpty());
System.out.println(llist);
llist.remove(1);
llist.removeAll(llist);
System.out.println("After Rmoval it is empty: "+llist.isEmpty());

for(int i=0;i<=llist.size()-1;i++)
System.out.println(llist.get(i));
}
}
