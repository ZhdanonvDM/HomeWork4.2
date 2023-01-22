public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2 () {
        int i=0;
        while (i<10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(;i>=1;i--) {
            System.out.print(i + " ");
        }
    }
    public static void task3 () {
        int population = 12_000_000;
        int fert = 17;
        int mort = 8;
        for (int i=1;i<=10;i++) {
            population = population + population*fert/1000 - population*mort/1000;
            System.out.println("Год " + i + " , численность населения составляет " + population + " человек");
        }
    }
    public static void task4 () {
        int salary = 15000;
        float total = 0;
        int i = 0;
        while (total < 12_000_000) {
            i = i + 1;
            total = (float) ((1+0.07/12)*total + salary);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + (int)total + " рублей");
        }
    }
    public static void task5 () {
        int salary = 15000;
        float total = 0;
        int i = 0;
        while (total < 12_000_000) {
            i = i + 1;
            total = (float) ((1+0.07/12)*total + salary);
            if (i%6 == 0) {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + (int)total + " рублей");
            }
        }
    }
    public static void task6 () {
        int salary = 15000;
        float total = 0;
        int i = 0;
        while (i <= 12*9) {
            i = i + 1;
            total = (float) ((1+0.07/12)*total + salary);
            if (i%6 == 0) {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + (int)total + " рублей");
            }
        }
    }
    public static void task7 () {
        int i = 1;
        int friday = 5;
        while (i < 31) {
            if ((i-friday)%7 == 0 || i == friday)   {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет ");
            }
            i = i + 1;
        }
    }
    public static void task8 () {
        int year200 = 2023-200;
        int year100 = 2023+100;
        int i = 0;
        while (i < year100) {
            i = i + 79;
            if (i>year200)   {
                System.out.println(i);
            }
        }
    }
}