package practice21;

public class Task2 {
    public static void main(String[] args){
        GenericArray<Integer> integers=new GenericArray<>(new Integer[]{1,2,3});
        GenericArray<Long> longs=new GenericArray<>(new Long[]{100L,200L,300L});
        GenericArray<String> words=new GenericArray<>(new String[]{"кот","пёс"});

        System.out.println("массив Integer:");
        integers.printAll();

        System.out.println("массив Long:");
        longs.printAll();

        System.out.println("массив String:");
        words.printAll();
    }
}
