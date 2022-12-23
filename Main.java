import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert seconds");
        int seconds = input.nextInt();
        int D = seconds/68400;
        int DR = seconds%68400;
        int H = DR/3600;
        int HR = DR%3600;
        int M = HR/60;
        int MR = HR%60;

        System.out.println("days" + D);
        System.out.println("hours" + H);
        System.out.println("minutes" + M);
        System.out.println("seconds" + MR);
        input.close();
    }
}