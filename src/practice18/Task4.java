package practice18;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите целое число: ");
        String intString=scanner.next();

        try{
            int i=Integer.parseInt(intString);
            System.out.println("результат: "+2/i);

        }catch(NumberFormatException e){
            System.out.println("ошибка: введено не целое число");

        }catch(ArithmeticException e){
            System.out.println("ошибка: деление на ноль");

        }finally{
            System.out.println("блок finally выполнен");
        }

        scanner.close();
    }
}