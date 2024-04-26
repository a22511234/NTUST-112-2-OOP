package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // 添加元素
        fruits.add("蘋果");
        fruits.add("香蕉");
        fruits.add("蘋果"); // 重複元素，不會被加入

        // 顯示集合大小和內容
        System.out.println("集合大小：" + fruits.size());
        System.out.println("集合內容：" + fruits);
    }
}
