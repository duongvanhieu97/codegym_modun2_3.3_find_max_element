import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
//            Nhập độ dài trong mảng
            System.out.println("Nhập độ dài:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Độ dài không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập giá trí vào mảng:" + (i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sách mảng");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng: " + max + " Vị trí trong mảng : " + index);
    }
}
