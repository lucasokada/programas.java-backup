import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceExample {
    public static void listMethod() { 
        List<String> list = List.of("s1", "s2", "s3");
        ListIterator<String> li = list.listIterator();
        while(li.hasNext()){
            System.out.print(li.next() + " "); //prints: s1 s2 s3
        }

        System.out.println();

        while(li.hasPrevious()){
            System.out.print(li.previous() + " "); //prints: s3 s2 s1
        }

        System.out.println();

        ListIterator<String> li1 = list.listIterator(1);
        while(li1.hasNext()){
            System.out.print(li1.next() + " "); //prints: s2 s3
        }

        System.out.println();

        ListIterator<String> li2 = list.listIterator(1);
        while(li2.hasPrevious()){
            System.out.print(li2.previous() + " "); //prints: s1
        }
    }

    public static void sort() {
        List<String> list = new ArrayList<>();
        list.add("S2");
        list.add("s3");
        list.add("s1");
        System.out.println(list); //prints: [S2, s3, s1]

        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list); //prints: [s1, S2, s3]

        //list.add(null); //causes NullPointerException
        list.sort(Comparator.naturalOrder());
        System.out.println(list); //prints: [S2, s1, s3]

        list.sort(Comparator.reverseOrder());
        System.out.println(list); //prints: [s3, s1, S2]

        list.add(null);
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(list); //prints: [null, S2, s1, s3]

        list.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println(list); //prints: [S2, s1, s3, null]
        
        Comparator<String> comparator = (s1, s2) -> s1 == null ? -1 : s1.compareTo(s2);
        list.sort(comparator);
        System.out.println(list); //prints: [null, S2, s1, s3]

    }
}
