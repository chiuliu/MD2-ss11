package ra.example;

public class MyArray<E> {
    E[] array;
    public void  printArray(E[] array){ //in ra mảng
        for (E e : array){
            System.out.println(e);
        }
    }
}
