import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        while (choice!=2) {
            System.out.println("Lua chon:");
            System.out.println("1.Them moi");
            System.out.println("2.Thoat");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                System.out.println("Nhap du lieu can them");
                queue.add(scanner.nextLine());
                break;
                default:
                    System.out.println("Moi hao lai");
                    break;
            }
        }
    }
}