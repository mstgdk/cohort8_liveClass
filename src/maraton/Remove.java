package maraton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
   //forEachRemoveExample();
   iteratorRemoveExample();
    }
    public static void forEachRemoveExample(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String item : list) {
            if (item.equals("A")) {
                list.remove(item);
            }
        }
    }
    public static void iteratorRemoveExample (){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("A")) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
