package bt7;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // B1: Tạo một ArrayList chứa các số nguyên
        ArrayList<Integer> list = new ArrayList<>();

        // B2: Thêm phần tử vào list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // B3: Tạo ArrayList mới để lưu những số nguyên không chia hết cho 2
        ArrayList<Integer> newList = new ArrayList<>();

        // B4: Duyệt list và gán những số thỏa mãn điều kiện vào list mới
        for (int num : list) {
            if (num % 2 != 0) {
                newList.add(num);
            }
        }

        // In danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        // In danh sách sau khi xóa các số chẵn
        System.out.println("\nDanh sách sau khi xóa các số chẵn:");
        for (int num : newList) {
            System.out.print(num + " ");
        }
    }
}
