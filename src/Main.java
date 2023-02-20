import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 8. Массивы часть 1");
        task12();
        task3();
        task4();
    }

    public static void task12() {
        System.out.println("Задача 1,2");
        int[] birds = new int[3];
        birds[0] = 1;
        birds[1] = 2;
        birds[2] = 3;
        double[] cats = {1.57, 7.654, 9.986};
        byte[] dogs = {23, 88, 76};

        for (int i = 0; i < birds.length; i++) {
            System.out.print(birds[i]);
            if (i != birds.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < cats.length; i++) {
            System.out.print(cats[i]);
            if (i != cats.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i]);
            if (i != dogs.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] birds = new int[3];
        birds[0] = 1;
        birds[1] = 2;
        birds[2] = 3;
        double[] cats = {1.57, 7.654, 9.986};
        byte[] dogs = {23, 88, 76};

        for (int i = birds.length - 1; i >= 0; i--) {
            System.out.print(birds[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = cats.length - 1; i >= 0; i--) {
            System.out.print(cats[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = dogs.length - 1; i >= 0; i--) {
            System.out.print(dogs[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] birds = new int[]{1, 2, 3};
        for (int i = 0; i < birds.length; i++) {
            if (birds[i] % 2 != 0) {
                birds[i]++;
            }
        }
        System.out.println(Arrays.toString(birds));
    }
}





















