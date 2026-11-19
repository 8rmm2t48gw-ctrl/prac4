package practice21;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void showDirectory(String path){
        File directory=new File(path);
        if(!directory.isDirectory()){
            System.out.println("ошибка: каталог не найден");
            return;
        }

        File[] files=directory.listFiles();

        if(files==null){
            System.out.println("ошибка: не удалось прочитать каталог");
            return;
        }

        ArrayList<File> list=new ArrayList<>();

        for(File file:files){
            list.add(file);
        }

        System.out.println("первые пять элементов каталога:");

        for(int i=0;i<list.size() && i<5;i++){
            System.out.println(list.get(i).getName());
        }

        if(list.isEmpty()){
            System.out.println("каталог пуст");
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите путь к каталогу: ");
        String path=scanner.nextLine();
        showDirectory(path);
        scanner.close();
    }
}
