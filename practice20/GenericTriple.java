package practice20;

public class GenericTriple<T,V,K> {
    private T first;
    private V second;
    private K third;

    public GenericTriple(T first,V second,K third){
        this.first=first;
        this.second=second;
        this.third=third;
    }

    public T getFirst(){
        return first;
    }

    public V getSecond(){
        return second;
    }

    public K getThird(){
        return third;
    }

    public void printClassNames(){
        System.out.println("тип первой переменной: "+first.getClass().getName());
        System.out.println("тип второй переменной: "+second.getClass().getName());
        System.out.println("тип третьей переменной: "+third.getClass().getName());
    }
}
