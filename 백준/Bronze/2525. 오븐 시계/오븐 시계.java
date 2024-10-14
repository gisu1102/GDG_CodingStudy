import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A =in.nextInt();
        int B =in.nextInt();

        int C =in.nextInt();

       int time = 60*A + B;
       time += C;

       int h = (time/60) % 24;
       int m = time % 60;

       System.out.println(h + " " + m);


    }
}