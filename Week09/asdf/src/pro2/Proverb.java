package pro2;

import java.util.Arrays;
import java.util.Scanner;

public class Proverb {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("입력: ");
        String proverb = in.nextLine();

        String[] words = proverb.split(" ");

        System.out.println("단어의 개수: " + words.length);
        Arrays.sort(words);
        System.out.println("정렬된 토큰: " + Arrays.toString(words));
    }
}