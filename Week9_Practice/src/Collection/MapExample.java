package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        // 添加鍵值對
        studentMap.put(1, "小明");
        studentMap.put(2, "小華");
        studentMap.put(3, "小紅");

        // 存取鍵值對
        String studentName = studentMap.get(2);
        System.out.println("學號2的學生名稱：" + studentName);

        // 刪除鍵值對
        studentMap.remove(3);

        // 顯示集合大小和內容
        System.out.println("集合大小：" + studentMap.size());
        System.out.println("集合內容：" + studentMap);
    }
}

