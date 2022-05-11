package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        //Числа які генерить програма
        int a1 = (int) (Math.random()* 3+1);
        int a2 = (int) (Math.random()*3+1);
        int a3 = (int) (Math.random() *3+1);

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        Scanner s6 = new Scanner(System.in);

        System.out.println("Введіть три числа від 1 до 3");
        //Числа які записуємо ми
        int d1 = s1.nextInt();
        int d2 = s2.nextInt();
        int d3 = s3.nextInt();

        if (a1==d1 && a2==d2 && a3==d3) {
            System.out.println("Ви вгадали ");
        }
        else {
            System.out.println("Ви не вгадали, але у вас є ще одна спроба");
        }

        System.out.println("Введіть знову три числа від 1 до 3");
        //Другий try
        int d4 = s4.nextInt();
        int d5 = s5.nextInt();
        int d6 = s6.nextInt();

        if (a1==d4 && a2==d5 && a3==d6) {
            System.out.println("Ви вгадали молодець!");
        }
        else {
            System.out.println("Ви не вгадали Game Over");
        }

        System.out.println("Програма згенерувала дані числа");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
