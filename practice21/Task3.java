package practice21;

public class Task3 {
    public static void main(String[] args){
        GenericArray<Integer> numbers=new GenericArray<>(new Integer[]{10,20,30});
        System.out.println("элемент с индексом 1: "+numbers.get(1));
    }
}

