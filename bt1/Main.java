package bt1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();

        //tạo đối tượng random
        Random random = new Random();

        // thêm tối đa 10 phần tử vào danh sách
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt());

        }
        System.out.println("Danh sách số nguyên : ");
        for (int number : randomList){
            System.out.println(number+"");
        }

        int maxNumber = Collections.max(randomList);
        System.out.println("Phần tử lơớn nhất là " +maxNumber);


    }}
