package practice18;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("введите целое число: ");
        String intString=scanner.next();

        try{
            int i=Integer.parseInt(intString);
            System.out.println("результат: "+2/i);

        }catch(Exception e){
            System.out.println("поймано исключение: "+e);
        }

        scanner.close();
    }
}