import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("กรุณาใส่ข้อความ: ");
        String text = sc.nextLine();
 
        if (text.length() > 15) {
            System.out.println("ข้อความยาวเกินไป กรุณาใส่ข้อความที่มีความยาวไม่เกิน 15 ตัวอักษร");
            return;
        }
 
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
 
            switch (ch) {
                case 'a':
                case 'A':
                    countA++;
                    break;
                case 'e':
                case 'E':
                    countE++;
                    break;
                case 'i':
                case 'I':
                    countI++;
                    break;
                case 'o':
                case 'O':
                    countO++;
                    break;
                case 'u':
                case 'U':
                    countU++;
                    break;
            }
        }
 
        System.out.println("จำนวนสระ a: " + countA);
        System.out.println("จำนวนสระ e: " + countE);
        System.out.println("จำนวนสระ i: " + countI);
        System.out.println("จำนวนสระ o: " + countO);
        System.out.println("จำนวนสระ u: " + countU);
    }
}
 