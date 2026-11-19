package practice18;

public class Exception1 {
    public void exceptionDemo(){
        System.out.println("деление целых чисел:");

        try{
            System.out.println(2/0);
        }catch(ArithmeticException e){
            System.out.println("ошибка: деление на ноль");
        }

        System.out.println("деление вещественных чисел:");
        System.out.println(2.0/0.0);
    }

    public static void main(String[] args){
        Exception1 example=new Exception1();
        example.exceptionDemo();
    }
}