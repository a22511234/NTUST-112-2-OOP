package BookExcptionDemo;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book books = new Book();

        // ====================== Try-to-Call "createArray()" ======================
        do{
            try{ // 防止錯誤導致程式被中斷
                books.createArray();
                break;
            }catch (NonNegativeNumberException e){ // 偵測「Try」區塊有 NonNegativeNumberException 時會執行
                System.out.println(e.getMessage());
            }
        }while (true);

        System.out.println("\n");

        // ====================== Try-to-Call "getArray()" ======================
        do{

            try{ // 防止錯誤導致程式被中斷
                System.out.print("請輸入欲查詢的書籍序號(輸入0離開)：");
                String input_index = scanner.next();

                if(input_index.equals("0")){
                    break;
                }

                books.getArray(input_index);

            }catch (NonNegativeNumberException e){ // 偵測「Try」區塊有 NonNegativeNumberException 時會執行
                System.out.println(e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){ // 偵測「Try」區塊有 ArrayIndexOutOfBoundsException 時會執行
                System.out.println("Array index out of bounds.");
            }catch (Exception e){ // 偵測「Try」區塊有 其他錯誤 時會執行
                e.printStackTrace();
            }finally { // 無論是否有出錯 都會執行
                System.out.println("執行操作完成!\n");
            }

        }while (true);


    }

}
