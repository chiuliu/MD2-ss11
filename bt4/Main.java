package bt4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Rikkei Academy để nông dân biết code ";
        List<String> stringList = new ArrayList<>();

        // convert string ở bước 1 thành List string rồi gán vào List đc tạo ở b2.
String [] words = str.split("\\s+");

for (String word : words){
    stringList.add(word);
}

for (String word : stringList){
    if (word.length()>3){
        System.out.println(word);

    }
}



    }
}
