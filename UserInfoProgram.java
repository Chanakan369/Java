import java.util.Scanner;

public class UserInfoProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("โปรดป้อนข้อมูลของคุณ:");
        System.out.print("ชื่อ: ");
        String name = scanner.nextLine();
        System.out.print("อายุ: ");
        String age = scanner.nextLine();
        System.out.print("อาชีพที่อยากทำ: ");
        String occupation = scanner.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(occupation);
        scanner.close();
    }
}