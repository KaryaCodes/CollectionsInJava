import java.lang.reflect.Array;
import java.util.*;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        String [] strings = {"Dog","Cat","Dog","Mouse"};
        String [] strings1 = {"Dog","Cat"};
        Set<String> hashSet = new HashSet(Arrays.asList(strings));//hashset
        hashSet.add("Zebra");
        Set<String> treeSet =new TreeSet(Arrays.asList(strings));//treeset

        Set<String> linkedHashSet =new LinkedHashSet(Arrays.asList(strings));//linkedtreeset

        System.out.println("HashSet:"+hashSet);
        System.out.println("TreeSet:"+treeSet);
        treeSet.add("Elephant");
        System.out.println("TreeSet after insertion:"+treeSet);
        System.out.println("LinkedHashSet:"+linkedHashSet);

        Set<String> hashSet1 = new HashSet(Arrays.asList(strings1));
        hashSet.removeAll(hashSet1);//removeAll,addAll,retainAll
 hashSet.retainAll(hashSet1);
        System.out.println("HashSet after deletion: "+hashSet1);
        hashSet.remove("Mouse");
        System.out.println("HashSet after Deletion: "+hashSet);


        //SortedSet
        SortedSet <String> sortedSet = new TreeSet<>(Arrays.asList(strings));
        System.out.println("SortedSet before :"+sortedSet);
        sortedSet.add("Elephant");
        System.out.println("SortedSet after"+sortedSet);
        System.out.println("SortedSet till element:"+sortedSet.headSet("Elephant"));
        System.out.println("SortedSet from element"+sortedSet.tailSet("Dog"));
        System.out.println("SortedSet subSet:"+sortedSet.subSet("Dog","Mouse"));
        for(String s:sortedSet){
            System.out.println(s);
        }

    }
}
