package bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();

        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(4);
        listNumber.add(7);
        listNumber.add(12);

        System.out.println("Danh sách List ban đầu : "+listNumber);
        List<Integer> listNumberNew = new ArrayList<>();
        for (int i = listNumber.size()-1; i >= 0 ; i--) {
            listNumberNew.add(listNumber.get(i));
        }
        System.out.println(listNumberNew);






    }
}
