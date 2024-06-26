import java.util.Scanner;

public class labtwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่จำนวนของตัวเลขที่ต้องการใส่: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("กรุณาใส่ค่าตัวเลขที่ " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        
        System.out.println("ค่าเฉลี่ยของตัวเลขที่ใส่คือ: " + average);
        
        scanner.close();
    }
}
