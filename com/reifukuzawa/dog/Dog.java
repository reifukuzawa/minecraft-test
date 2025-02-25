package com.reifukuzawa.dog;

public class Dog {
    //インスタンス変数
    String name;
    int age;
    String breed;
    boolean isHungry;

    //コンストラクタ
    public Dog(String name, int age, String breed, boolean isHungry) {
        //インスタンス変数の初期化
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isHungry = isHungry;
    }

    // インスタンス メソッド
    void bark(){
        if(isHungry){
            System.out.println("クゥーン");
        } else {
            System.out.println("ワン！");
        }
    }

    // プロフィールを質力
    void printProfile(){
        System.out.println("名前:" + name +
                " 犬種:" + breed + " 年齢" + age + "才");
    }




}
