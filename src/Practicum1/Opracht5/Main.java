package Practicum1.Opracht5;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        for (int item : numbers) {
            String text = "ss";
            if (item % 2 != 0) {
                text = "s";
            }
            System.out.println(text);
        }
    }
}
