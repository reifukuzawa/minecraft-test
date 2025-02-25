package com.reifukuzawa.game.guessname;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int answer = new Random().nextInt(10) + 1;
            int chance = 0;
            List<Integer> madeChoice = new ArrayList<>();

            System.out.println("1から１０の間の数字を思い浮かべてみてね！三回チャンスがあるよ!");

            while (chance < 3) {
                System.out.print("数字を入力!: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("数字を入力してね! \n");
                    scanner.next();
                    continue;
                }

                int input = scanner.nextInt();

                if (input < 1 || input > 10) {
                    System.out.println("入力する文字は1~10にしてね☆ \n");
                    continue;
                }

                if(madeChoice.contains(input)) {
                    System.out.println("その数字は予想済み！\n");
                    continue;
                }

                chance++;

                if(input < answer) {
                    System.out.println("もっと多いよ！\n");
                } else if (input > answer) {
                    System.out.println("もっと少ないよ！\n");
                } else {
                    System.out.println("大当たり！！！\n");
                    break;
                }

                System.out.println("現在の挑戦回数: " + chance);
                madeChoice.add(input);

                if (chance == 3) {
                    System.out.println("残念！正解は " + answer + " だったよ！");
                }



            }

            System.out.println("もう一回遊ぶ？(yes/no): ");
            String restart = scanner.next().toLowerCase();

            if(!restart.equals("yes")) {
                System.out.println("また遊んでね！");
                break;
            }
        }

        scanner.close();
    }
}
