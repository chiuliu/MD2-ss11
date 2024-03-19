package bt5;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String text = "Chương trình Java này sẽ tìm từ ngắn nhất trong đoạn văn.";

        String[] words = text.split("\\s+");

        List<String> shortestWords = new ArrayList<>();

        // Bước 4: Duyệt qua danh sách các từ và tìm từ ngắn nhất
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            int length = word.length();
            if (length < minLength) {
                minLength = length;
                shortestWords.clear();
                shortestWords.add(word);
            } else if (length == minLength) {
                shortestWords.add(word);
            }
        }

        // Bước 5: In ra các từ ngắn nhất
        System.out.println("Các từ ngắn nhất trong đoạn văn là:");
        for (String word : shortestWords) {
            System.out.println(word);
        }
    }
}
