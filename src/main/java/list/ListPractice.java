package list;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {
        ListPractice listPractice = new ListPractice();
        listPractice.insertValues();
    }

    public void insertValues(){
        List list = new ArrayList();
        list.add("four");

        List values = new ArrayList();
        values.add("one");

        values.add("two");
        values.add(null);
        values.add("three");
        values.add(0, "zero");
        values.addAll(list);


        for (Object value: values){
            System.out.println(value);
        }

         System.out.println("Value at index 0: "+values.get(0));
         System.out.println("Index of three: "+values.indexOf("three"));
         System.out.println("List contains four: "+values.contains("four"));
         System.out.println("List contains null: "+values.contains(null));

         values.remove(3);
         values.remove("one");
        System.out.println("After removing values");
        for (Object value: values){
            System.out.println(value);
        }

        values.clear();
        System.out.println("After removing all values");
        for (Object value: values){
            System.out.println(value);
        }

        //remove values which are not in both lists
        list.add(1);
        list.add(2);
        values.add(1);
        values.add(3);
        values.retainAll(list);
        for (Object num: values){
            System.out.println(num);
        }

        list.add(2);
        list.add(2);
        Set set = new HashSet<>();
        set.addAll(list);

        for (Object number: set){
            System.out.println(number);
        }

        List numbers = new ArrayList();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        Collections.sort(numbers);
        for (Object n : numbers){
            System.out.println(n);
        }




    }


}
