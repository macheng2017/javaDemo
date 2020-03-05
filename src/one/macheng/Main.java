package one.macheng;

import one.macheng.hero.Camille;
import one.macheng.hero.Diana;
import one.macheng.hero.Irelia;

import java.util.Scanner;
// 使用开闭原则的三种方式:
// 1. interface
// 2. 工厂模式
// 3. IOC DI
public class Main {

    public static void main(String[] args) {
        // write your code here
        ISkill iSkill;
        String name = Main.getPlayerInput();
        switch (name) {
            case "diana":
                iSkill = new Diana();
                break;
            case "irelia":
                iSkill = new Irelia();
                break;
            case "camille":
                iSkill = new Camille();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        iSkill.r();

    }

    private static String getPlayerInput() {
        System.out.println("Enter hero's name");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
