import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách số nguyên
        ArrayList<Integer> list = new ArrayList<>();

        // Thêm các phần tử vào danh sách
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);

        // In danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        // Sắp xếp danh sách theo thứ tự giảm dần
        Collections.sort(list, Collections.reverseOrder());

        // In danh sách sau khi sắp xếp
        System.out.println("\nDanh sách sau khi sắp xếp (giảm dần):");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}