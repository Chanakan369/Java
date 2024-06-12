import java.util.Scanner; 
    
class Test {
    public static void main(String[] args) {
        Scanner kbd = new Scanner   (System.in);
        System.out.println("Please insert a number");
        int Innum = kbd.nextInt();
        System.out.println("A inputnumber is " +Innum);
        kbd.close();
    }
}
