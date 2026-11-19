package practice20;

public class Task2 {
    public static void main(String[] args){
        GenericTriple<String,Integer,Double> data=new GenericTriple<>("Иван",20,4.5);

        System.out.println("первое значение: "+data.getFirst());
        System.out.println("второе значение: "+data.getSecond());
        System.out.println("третье значение: "+data.getThird());
        data.printClassNames();
    }
}
