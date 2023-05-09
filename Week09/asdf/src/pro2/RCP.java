package pro2;

import java.util.Random;
import java.util.Scanner;

public class RCP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("가위(0), 바위(1), 보(2)를 입력하세요 (-1: 종료): ");
            int user = in.nextInt();
            if (user == -1) {
                break;
            }

            int computer = random.nextInt(3);

            if (user == computer) {
                System.out.println("비겼습니다");
            } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
                System.out.println("이겼습니다");
            } else {
                System.out.println("졌습니다");
            }
        }

        System.out.println("게임을 종료합니다.");
    }
}