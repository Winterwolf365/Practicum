package Practicum1.Opracht4;

public class Main {
    public static void main(String[] args){
        int count = 1;
        int sum = 0;
        do {
            sum += count;
            count++;
        } while (count < 40);
        System.out.println("The total sum is: " + sum);
    }
}
