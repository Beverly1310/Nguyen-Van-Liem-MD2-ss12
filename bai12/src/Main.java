import java.util.ArrayDeque;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {-1,-2,-5,6,4,3,8,9,-7};
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        int min=queue.peek();
        for (int i = 0; i < queue.size(); i++) {
            int tg = queue.poll();
            if (tg<min){
                min=tg;
            }
            i--;
        }
        System.out.println("Min: "+min);
    }
}