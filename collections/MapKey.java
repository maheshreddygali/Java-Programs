import java.util.*;
class MapKey
{
public static void main(String[] args)
{
Map<Integer, String> map = new HashMap();
map.put(1,"Gali");
map.put(2,"Soma");
map.put(3,"Naga");
map.put(4,"Maheswar");
map.put(5,"Reddy");
System.out.println("initial map key value pair : "+map);
//map.replaceAll((key,value) -> value.toUpperCase());
map.replaceAll((key, value) -> value.toUpperCase());
System.out.println("copy set"+map.entrySet());
System.out.println("Keys : "+map.keySet());
System.out.println("Values : "+map.values());
map.clear();
System.out.println("After clear the keys and values : "+map);
}
}
