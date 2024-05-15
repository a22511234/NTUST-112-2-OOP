package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // 添加元素
        colors.add("紅色");
        colors.add("藍色");
        colors.add("綠色");
        colors.add("紅色"); // 允許重複元素

        // 存取元素
        String firstColor = colors.get(0);
        System.out.println("第一種顏色：" + firstColor);

        // 刪除元素
        colors.remove("綠色");

        // 顯示集合大小和內容
        System.out.println("集合大小：" + colors.size());
        System.out.println("集合內容：" + colors);
    }
}

