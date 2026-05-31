public class Main {
    public static void main(String[] args)
    {
        /// Объявите переменные типа int, byte, short, long, float, double.
        /// Задача 1
        System.out.println("Задача 1");
        int i = 543;
        byte b = 3;
        short s = 12576;
        long l = 25433655;
        float f = 5.4525f;
        double d = 6.587368134;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);


        /// Задача 2
        System.out.println("Задача 2");
        float f1 = 27.12f;
        long l1 = 987678965549L;
        float f2 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b1 = 67;


        /// Задача 3
        System.out.println("Задача 3");
        byte c1 = 23;
        byte c2 = 27;
        byte c3 = 30;
        int c = c1 + c2 + c3;
        int paper = 480 / c;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");


        /// Задача 4
        System.out.println("Задача 4");
        byte p = 16 / 2;
        int p1 = p * 20;
        System.out.println("За 20 минут машина произвела " + p1 + " штук бутылок");
        int p2 = p * 60 * 24;
        System.out.println("За сутки машина произвела " + p2 + " штук бутылок");
        int p3 = p * 60 * 24 * 3;
        System.out.println("За 3 дня машина произвела " + p3 + " штук бутылок");
        int p4 = p * 60 * 24 * 30;
        System.out.println("За месяц машина произвела " + p4 + " штук бутылок");


        /// Задача 5
        System.out.println("Задача 5");
        byte class1 = 2 + 4;
        int countClass = 120 / class1;
        System.out.println("В школе, где " + countClass +" классов, нужно " + (countClass * 2) +" банок белой краски и " + (countClass * 4) +" банок коричневой краски");


        /// Задача 6
        System.out.println("Задача 6");
        byte mb = 80;
        byte mm = 105;
        byte mi = 100;
        byte me = 70;
        int sum = (mb * 5) + (mm * 2) + (mi * 2) + (me * 4);
        System.out.println("Вес в граммах " + sum);
        System.out.println("Вес в килограммах " + (sum / 1000f));


        /// Задача 7
        System.out.println("Задача 7");
        short m1 = 250;
        short m2 = 500;
        int t1 = 7000 / m1;
        int t2 = 7000 / m2;
        int mid = (t1 + t2) / 2;
        System.out.println("Потребуется " + mid + " дней в среднем, чтобы похудеть");


        /// Задача 8
        System.out.println("Задача 8");
        int zp1 = 67760;
        int zp2 = 83690;
        int zp3 = 76230;

        float zp11 = zp1 * 1.1f;
        float zp21 = zp2 * 1.1f;
        float zp31 = zp3 * 1.1f;

        System.out.println("Маша теперь получает " + zp11 + " рублей. Годовой доход вырос на " + ((zp11 * 12) - (zp1 * 12)) + " рублей");
        System.out.println("Денис теперь получает " + zp21 + " рублей. Годовой доход вырос на " + ((zp21 * 12) - (zp2 * 12)) + " рублей");
        System.out.println("Кристина теперь получает " + zp31 + " рублей. Годовой доход вырос на " + ((zp31 * 12) - (zp3 * 12)) + " рублей");





        /*
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?

Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».

Для объявления переменных не используйте тип var.
        */
    }
}