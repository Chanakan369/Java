import java.util.ArrayList;
import java.util.Scanner;

public class CareerList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> careers = new ArrayList<>();

        while (true) {
            System.out.print("กรุณาใส่ชื่อ (หรือพิมพ์ 'Exit' เพื่อออก): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Exit")) {
                break;
            }

            System.out.print("กรุณาใส่อาชีพที่อยากทำ: ");
            String career = scanner.nextLine();
            if (career.equalsIgnoreCase("Exit")) {
                break;
            }

            names.add(name);
            careers.add(career);
        }

        System.out.println("\nข้อมูลทั้งหมด:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("ชื่อ: " + names.get(i) + ", อาชีพที่อยากทำ: " + careers.get(i));
        }

        scanner.close();
    }
}
