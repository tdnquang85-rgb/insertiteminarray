import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        // khai bao mang
        int[] numbers = { 10, 4, 6, 7, 8, 0, 0, 0, 0, 0 };
        // duyet truoc chen
        for (int item : numbers)
            System.out.print(item);
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("nhap so can chen: ");
        int x = scanner.nextInt();
        System.out.println("nhap vi tri can chen: ");
        int index = scanner.nextInt();
        if ((index <= -1) & (index >= numbers.length - 1)) {
            System.out.println("khong chen duoc phan tu vao mang");
        } else {
            // thuc hien chen
            for (int i = index; i < numbers.length; i++) {
                numbers[index + 1] = numbers[i];

            }
            numbers[index] = x;
        }
        // duyet sau khi chen
        System.out.println("ket qua sau khi chen");
        for (int item : numbers)
            System.out.print(item);

    }
}