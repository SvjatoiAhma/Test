package svjat.test;


import java.util.Scanner;

public class StartPoint {
    public static void main(String[] args) {
        Human man3 = new Man();
        Human man2 = new Man();
        Human man1 = new Man();
        man1.speak();
        Human woman = new Woman();
        woman.speak();

        /* System.out.println(man.equals(woman));  тренировка не более того
        boolean manWomen = (man.equals(woman));
        System.out.println(manWomen);
        */
        if (man1 instanceof Human) {
            System.out.println("I'm Human");
        }
        if (woman instanceof Man) {
        } else {
            System.out.println("I'm not Man");
        }
        if (man1.equals(woman)) {
            System.out.println("Not I'm");
        }
        boolean manWoman = (man1.equals(woman));
        System.out.println(manWoman);
        boolean wumanMan = (woman.equals(man1));
        System.out.println(wumanMan);
        boolean manIsNull = (man1.equals(null));
        boolean manIsMan = (man1.equals(man1));
        boolean man2IsMan = (man1.equals(man2));
        boolean man2Man3 = man2.equals(man3);
        boolean transitivTrueMan = man1.equals(man3);

        int a = 0, b = -3, c = 9;
        boolean task1 = a - b == c;
        System.out.println(task1);
        boolean task2 = a * c < b;
        System.out.println(task2);
        boolean task3 = b * b == c;
        System.out.println(task3);
        boolean task4 = b * b - c == 0;
        System.out.println(task4);
        boolean task5 = a * b == c;
        System.out.println(task5);

        int x = -2, y = 5, z = 13;
        boolean task6 = (z > x) || (x < 0) && (z - y > 9);
        System.out.println(task6);

        System.out.println("Ваше значение:");
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        if ((a1 < b1) || (b1 < 100)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");

        }
    }

}
