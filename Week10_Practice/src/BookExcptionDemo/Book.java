package BookExcptionDemo;

import java.util.Scanner;

public class Book {

    private String[] name;

    public Book(){
    }

    public void createArray() throws NonNegativeNumberException {
        Scanner scanner = new Scanner(System.in);

        // ====================== Create Array ======================
        System.out.print("請填寫欲建立的書籍清單數量：");
        String input_count = scanner.next();
        int number_count = 0;

        if(!input_count.matches("^[\\d]+$")){ // 若不是非負整數
            throw new NonNegativeNumberException("Please enter a non-negative integer!! \n"); // 強制程式回報錯誤
        }else{
            number_count = Integer.parseInt(input_count);
            name = new String[number_count];
        }

        // ====================== Set Array ======================
        for(int i = 0; i < number_count; i++){
            System.out.print("第 " + (i+1)+ " 本書籍：");
            String input_name = scanner.next();

            this.name[i] = input_name;
        }
    }


    public void getArray(String input_index) throws NonNegativeNumberException {

        int number_index = 0;

        if(!input_index.matches("^[\\d]+$")){ // 若不是非負整數
            throw new NonNegativeNumberException("Please enter a non-negative integer!! "); // 強制程式回報錯誤
        }else{
            number_index = Integer.parseInt(input_index);
            System.out.println("第 " + (number_index)+ " 本書籍是：" + name[(number_index - 1)]);
        }
    }

}
