package OneHundredForteen;

public class MyArrayList<E> {
    private Object[] arr = new Object[10];
    private int size;//保存当前位置的
    public boolean add(E e){
        arr[size++] = e;
        return true;
    }

    public E get(int i){

        return (E) arr[i];
    }
}
