import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {

        //задача 1
        int a = 15;
        byte b = 45;
        short c = 12000;
        float v = 26.0056f;
        long d = 150000L;
        double n = 25.14;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной v с типом float равно " + v);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной n с типом double равно " + n);

        //задача 2
        double x = 27.12;
        long j = 987678965549L;
        byte r = 2;
        int w = 786;
        boolean i = j > w;
        int q = 569;
        short h = -159;
        int t = 27897;
        byte p = 67;
        System.out.println(i);

        //задача 3

        int lP = 23;
        int aC = 27;
        int eA = 30;
        int total = lP + aC + eA;
        int paperTotal = 480;
        int paperOne = paperTotal / total;

        System.out.println("На каждого ученика рассчитано по " + paperOne + " листов бумаги.");

        //задача 4

        int machineProductivityTime1 = 16;
        int time1 = 2;
        int machineProductivityTime = machineProductivityTime1 / time1;
        int time20 = machineProductivityTime * 20;
        int timeDay = machineProductivityTime * 24;
        int timeDay3 = timeDay * 3;
        int timeMonth = timeDay * 30;
        System.out.println("За 20 минут работы машина произвела бутылок " + time20 + " шт.");
        System.out.println("За сутки работы машина произвела бутылок " + timeDay + " шт.");
        System.out.println("За 3 дня работы машина произвела бутылок " + timeDay3 + " шт.");
        System.out.println("За 1 месяц работы машина произвела бутылок " + timeMonth + " шт.");

        //задача 5

        int cansTotal = 120;
        int cansWhite = 2;
        int cansBrown = 4;
        int classroomOne = cansWhite + cansBrown;
        int classroomTotal = cansTotal / classroomOne;
        int cansWhiteTotal = classroomTotal * cansWhite;
        int cansBrownTotal = classroomTotal * cansBrown;

        System.out.println("В школе, где " + classroomTotal + " классов, нужно " + cansWhiteTotal + " банок белой краски и " + cansBrownTotal + " банок коричневой краски.");

        //задача 6

        int banana = 5;
        int wtBananaOne = 80;
        int milk = 200;
        int wtMilk100 = 105;
        int iceCreame = 2;
        int wtIceCreameOne = 100;
        int egg = 4;
        int wtEggOne = 70;
        int wtTotal = (banana * wtBananaOne) + (2 * wtMilk100) + (iceCreame * wtIceCreameOne) + (egg * wtEggOne);

        double totalKg = wtTotal / 1000;

        System.out.println("Общий вес спорт-завтрака " + totalKg + " кг.");

        //задача 7

        int wtLose = 7;
        int loseDayOne = 250;
        int totalDay1 = wtLose*1000/loseDayOne;
        int loseDayTwo = 500;
        int totalDay2 = wtLose*1000/loseDayTwo;

        System.out.println ("Если спортсмен будет худеть на 250 гр ежедневно, то на 7 кг он похудеет через " + totalDay1 + " дней.");
        System.out.println ("Если спортсмен будет худеть на 500 гр ежедневно, то на 7 кг он похудеет через " + totalDay2 + " дней.");

        //задача 8

        double salaryMacha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double increase = 0.1;
        double salaryMachaNew = salaryMacha + salaryMacha*increase;
        double salaryDenisNew = salaryDenis + salaryDenis*increase;
        double salaryKristinaNew = salaryKristina + salaryKristina*increase;
        double yearMachaMin = salaryMacha*12;
        double yearMachaMax = salaryMachaNew*12;
        double differenceYearMacha = yearMachaMax-yearMachaMin;
        double yearDenisMin = salaryDenis*12;
        double yearDenisMax = salaryDenisNew*12;
        double differenceYearDenis = yearDenisMax-yearDenisMin;
        double yearKristinaMin = salaryKristina*12;
        double yearKristinaMax = salaryKristinaNew*12;
        double differenceYearKristina = yearKristinaMax - yearKristinaMin;


        System.out.println ("Маша теперь получает " + salaryMachaNew + " рублей. Годовой доход вырос на " + differenceYearMacha + " рублей." );
        System.out.println ("Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей." );
        System.out.println ("Кристина теперь получает " + salaryKristinaNew + " рублей. Годовой доход вырос на " + differenceYearKristina + " рублей." );




    }
}






