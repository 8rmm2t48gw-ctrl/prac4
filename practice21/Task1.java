package practice21;

import java.util.ArrayList;
public class Task1 {
    public static <T> ArrayList<T> arrayToList(T[] array){
        ArrayList<T> list=new ArrayList<>();

        for(T element:array){
            list.add(element);
        }

        return list;
    }

    public static void main(String[] args){
        String[] words={"один","два","три"};
        Integer[] numbers={10,20,30};
        System.out.println("строки: "+arrayToList(words));
        System.out.println("числа: "+arrayToList(numbers));
    }
}
