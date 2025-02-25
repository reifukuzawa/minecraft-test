package com.reifukuzawa.dog;

public class Main {
    public static void main(String[] args) {
        // Dogインスタンス作成
        Dog pochi = new Dog("ポチ", 1, "柴犬", false);
        Dog chikuwa = new Dog("チクワ", 5, "チワワ", true);

        // メソッド呼び出し
        pochi.printProfile();
        pochi.bark();

        chikuwa.printProfile();
        chikuwa.bark();
    }
}
