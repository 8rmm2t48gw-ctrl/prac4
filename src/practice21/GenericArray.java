package practice21;

public class GenericArray<T> {
    private T[] elements;

    public GenericArray(T[] elements){
        this.elements=elements;
    }

    public T get(int index){
        return elements[index];
    }

    public void printAll(){
        for(T element:elements){
            System.out.println(element);
        }
    }
}
