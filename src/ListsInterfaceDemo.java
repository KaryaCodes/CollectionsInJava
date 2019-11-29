import java.util.*;

public class ListsInterfaceDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(44);
        System.out.println("ArrayList:"+list);
        System.out.println("ArrayList element at index 0:"+list.get(0));
        list.remove(2);
        list.set(1,33);
        System.out.println("ArrayList after Updateing at indiex 1: "+list);
        list.add(44);
        list.add(2);
        list.add(12);
        list.add(1);
        System.out.println("List before Sorting: "+list);
        Collections.sort(list);
        System.out.println("List After Sorting:"+list);
        System.out.println("frequency (count) occurence of '1' in ArrayList"+Collections.frequency(list,1));

        /*
        sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
        shuffle — randomly permutes the elements in a List.
        reverse — reverses the order of the elements in a List.
        rotate — rotates all the elements in a List by a specified distance.
        swap — swaps the elements at specified positions in a List.
        replaceAll — replaces all occurrences of one specified value with another.
        fill — overwrites every element in a List with the specified value.
        copy — copies the source List into the destination List.
        binarySearch — searches for an element in an ordered List using the binary search algorithm.
        indexOfSubList — returns the index of the first sublist of one List that is equal to another.
        lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.

        vectors

         */

        Vector<Integer> vector =new Vector(list);
        vector.add(22);
        System.out.println("Vector List :"+vector);

    }
}
