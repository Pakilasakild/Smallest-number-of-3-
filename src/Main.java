import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int[] arr = new int[3];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The smallest number is " + min);
    }
}