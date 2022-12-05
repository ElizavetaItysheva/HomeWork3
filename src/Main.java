import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
            // task 1

            System.out.println("Задача 1");
            for(int a = 1; a < 11; a++) {
            System.out.println("Итерация - " + a);
            }
            // task 2

            System.out.println();
            System.out.println("Задача 2");
            for(int b = 10; b > 0; b-=1) {
                System.out.println(" Итерация - " + b);
            }

            // task 3

            System.out.println();
            System.out.println("Задача 3");
            for(int c = 0; c < 17; c +=2) {
            System.out.println("Итерация - " + c);
            }

            // task 4

            System.out.println();
            System.out.println("Задача 4");
            for(int d = 10; d >-11;d--) {
                System.out.println("Итерация - " + d);
            }

            // task 5

            System.out.println();
            System.out.println("Задача 5");
            for(int e = 1904; e < 2096;e+= 4 ) {
                if (e % 4 == 0 && e % 100 != 0 || e % 400 == 0){  // условия задачи позволяют написать код без условного оператора, просто прибавляя по 4
                    System.out.println("Високосный год - " + e);
                } else {
                    System.out.println("Год не високосный - " + e);
                }
            }

            //task 6

            System.out.println();
            System.out.println("Задача 6");
            for(int f = 7; f < 99; f += 7) {
                System.out.println("Итерация - " + f);
            }

            // task 7

            System.out.println();
            System.out.println("Задача 7");
            for(int g = 1; g < 513; g *= 2) {
                System.out.println("Итерация - " + g);
            }

            // task 8

            System.out.println();
            System.out.println("Задача 8");
            int money = 29000;
            int total = 0;
            for (int m = 1; m < 13; m++) {
            total += money;
                System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей.");
            }

            // task 9

            System.out.println();
            System.out.println("Задача 9");
            int money1 = 29000;
            int total1 = 0;
            for (int m1 = 1; m1 < 13; m1++) {
            total1 = total1 + total1/100;
            total1 = total1 + money1;
                System.out.println("Месяц " + m1 + ", сумма накоплений равна " + total1 + " рублей.");
            }
            System.out.println(total1);

            // task 10

            System.out.println();
            System.out.println("Задача 10");
            int zero = 0;
            int one = 1;
            int two;
            System.out.print("1" + " ");
            for(int h = 0; h < 11; h++){
                two = zero + one;
                zero = one;
                one = two;
                System.out.print(one + " ");

            }

            // task 11
            System.out.println();
            System.out.println();
            System.out.println("Задача 11");
            int money3 = 15_000;
            int month3 = 1;
            int total3 = 0;
            while (total3 < 2_459_000) {
                System.out.println("Месяц " + month3 + ". Сумма накоплений " + total3);
                total3 = total3 + total3/100; // в критериях задачи был момент, где нужно учитывать проценты по вкладу, я не до конца поняла это условие, но взяла просто 1%.
                total3 += money3;
                month3 += 1;
            }
            // task 12

            System.out.println();
            System.out.println("Задача 12");
            int i = 1;
            while (i<11) {
                System.out.print(i + " ");
                i+=1;
            }
            System.out.println();
            for (int j = 10; j > 0; j-=1) {
                System.out.print(j + " ");
            }

            // task 13

            System.out.println();
            System.out.println("Задача 13");
            int population = 12_000_000;
            int born = 17;
            int death = 8;
            for(int k = 0; k < 10; k++) {
                System.out.println("Год " + k + ", численность населения составляет " + population);
                population = population + population/1000 * (born - death);

            }

            // task 14

            System.out.println();
            System.out.println("Задача 14");
            int money4 = 15_000;
            int total4 = 0;
            int month4 = 0;
            while (total4 < 12_000_000){
                month4 = month4 + 1;
                total4 = total4 + money4;
                total4 = total4 + ((total4 * 7) / 100);
                System.out.println("Месяц " + month4 + ", накопления составляют " + total4);
            }

            // task 15

            System.out.println();
            System.out.println("Задача 15");
            int money5 = 15_000;
            int total5 = 0;
            int month5 = 0;
            while (total5 < 12_000_000){
            month5 = month5 + 1;
            total5 = total5 + money5;
            total5 = total5 + ((total5 * 7) / 100);
            if (month5 % 6 == 0) {
                System.out.println("Месяц " + month5 + ", накопления составляют " + total5);
            }
            }

            // task 16

            System.out.println();
            System.out.println("Задача 16");
            int money6 = 15000;
            int month6 = 0;
            int total6 = 0;
            while (month6 < 108) {
                month6 += 1;
                total6 = total6 + money6;
                total6 = total6 + ((total6 * 7)/100);
                if (month6 % 6 == 0) {
                    System.out.println("Месяц " + month6 + ", накопления равны " + total6);
                }
            }

            // task 17

            System.out.println();
            System.out.println("Задача 17"); // при условии что месяц начался с понедельника 1-го числа
            int friday = 5;
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
            while (friday < 26) {
                friday += 7;
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
            }

            // task 18


            }
        }

