import java.util.*;

public class MapInterfaceDemo {
    public static void main(String[] args) {

        Map<String,Integer> map =new HashMap<>();
        Map<String ,Integer> lmap=new LinkedHashMap<>();
        Map<String,Integer> tmap =new TreeMap<>();

        map.put("Pallav",23);
        map.put("Karya",200);
        map.put("Prem",20);
        System.out.println("HashMap:"+map);
        map.put("Manoj",54);
        System.out.println("HashMap:"+map);
        //map.remove("Karya");
        //System.out.println(map);
        System.out.println("HashMap contains Karya key?:"+map.containsKey("Karya"));
        System.out.println("HashMap contains Pallav key?:"+map.containsKey("Pallav"));
        System.out.println("KeySet of HashMap:"+map.keySet());
        System.out.println("Values set of HashMap:"+map.values());

        List l=new ArrayList(map.entrySet());
        System.out.println("HashMap to entrySet:"+l);

        lmap.put("Pallav",23);
        lmap.put("Karya",200);
        lmap.put("Prem",20);
        System.out.println("LinkedHashMap:"+lmap);

        tmap.put("Pallav",23);
        tmap.put("Karya",200);
        tmap.put("Prem",20);
        System.out.println("TreeMap:"+tmap);

        //tmap.put("Manoj",54);
        //System.out.println("TreeMap after insertion:"+tmap);
        System.out.println("HashMap from map object:"+new HashMap(map));

        SortedMap<String,Integer> sm=new TreeMap<>(map);
        System.out.println(map);
        System.out.println("TreeMap(SortedMap reference):"+sm);
        System.out.println("HeadMap:"+sm.headMap("Pallav"));
        System.out.println("TailMap:"+sm.tailMap("Manoj"));
        System.out.println("SubMap:"+sm.subMap("Pallav","Prem"));




    }
}
