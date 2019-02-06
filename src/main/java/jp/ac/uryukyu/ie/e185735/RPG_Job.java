package jp.ac.uryukyu.ie.e185735;

import java.util.Scanner;


public class RPG_Job {
    /**
     * ジョブを作成するためのプログラムです。
     *
     */
    String name;int hitpoint;
    int attack;int magicattack;
    int defense;int magicdefense;

    public RPG_Job(){
        System.out.println("ジョブの作成をします。");
    }

    /**
     *ジョブを選択するメソッドです。
     *
     */
    public void Job_Choice(){
        System.out.println("ジョブを選択してください。\n１：戦士　２：魔道士　３：赤魔道士");
        System.out.println("数字を入力して選択できます。");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1){
            System.out.println("戦士はHPと攻撃力が高いジョブです。");
            this.name = "戦士";this.hitpoint = 50;
            this.attack = 20;this.magicattack = 0;
            this.defense = 15;this.magicdefense = 5;
        }else if(num == 2){
            System.out.println("魔道士は魔法防御と魔法攻撃力が高いジョブです。");
            this.name = "魔道士";this.hitpoint = 30;
            this.attack = 3;this.magicattack = 20;
            this.defense = 5;this.magicdefense = 20;
        }else if(num == 3){
            System.out.println("赤魔道士はバランスのとれたジョブです。");
            this.name = "赤魔道士";this.hitpoint = 40;
            this.attack = 12;this.magicattack = 12;
            this.defense = 12;this.magicdefense = 12;
        }

    }

    /**
     * パラメータを表示するためのメソッドです。
     *
     */
    public void show_param(){
        System.out.println("パラメータを表示します。");
        String str =  String.format("ジョブ：%s HP:%d 攻撃力：%d 魔法攻撃力：%d 防御力：%d 魔法防御力：%d",name,hitpoint,attack,magicattack,defense,magicdefense);
        System.out.println(str);
    }
}
