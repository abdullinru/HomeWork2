public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1(){
        byte byteValue = 1;
        short shortValue = 2;
        int intValue = 3;
        long longValue = 4_000L;
        float floatValue = 5.5F;
        double doubleValue = 10.56;
        boolean a = true;
        char b = 'b';
    }
    public static void task2(){
        double weightBoxer1 = 78.2;
        double weightBoxer2 = 82.7;
        System.out.println("Общий вес двух боксеров равен " + (weightBoxer2+weightBoxer2));
        System.out.println("Разница между весами боксеров равна " + Math.abs(weightBoxer2-weightBoxer1));



    }
    public static void task3(){
        int weightBananas = 5*80;
        int weightMilt = 2*105;
        int weightCream = 2*100;
        int weightEggs = 4*70;
        int weightKokteil = weightBananas+weightMilt+weightCream+weightEggs;
        double weightKokteilKG = (double)weightKokteil/1000;
        System.out.println("Вес всего коктейля получился "+ weightKokteilKG + " кг");


    }
    public static void task4(){
        int resultVes = 7;
        int minusVes1 = 250;
        int minusVes2 = 500;
        int countDays1 = 7*1000/250;
        int countDays2 = 7*1000/500;
        double countDaysSrednee = (countDays2+countDays1)/(2*1.0);
        System.out.println("Если спортсмен худеет на " + minusVes1 + " граммов в день, то сбросит 7 кг через " + countDays1 + " дней");
        System.out.println("Если спортсмен худеет на " + minusVes2 + " граммов в день, то сбросит 7 кг через " + countDays2 + " дней");
        System.out.println("в среднем спортсмен сбросит 7 кг через " + countDaysSrednee + " дней");


    }
    public static void task5(){
        int procent = 10;
        double multy = (double)procent/100;
        int zarplataMasha = 67760;
        int zarplataDenis = 83690;
        int zarplataKristina = 76230;
        int newZarpMasha = (int) (zarplataMasha*(1+multy));
        int newZarpDenis = (int) (zarplataDenis*(1+multy));
        int newZarpKristina = (int) (zarplataKristina*(1+multy));
        int deltaMasha = (newZarpMasha-zarplataMasha)*12;
        int deltaDenis = (newZarpDenis-zarplataDenis)*12;
        int deltaKristina = (newZarpKristina-zarplataKristina)*12;
        System.out.println("Маша теперь получает " + newZarpMasha + " рублей. Годовой доход вырос на "+ deltaMasha + " рублей");
        System.out.println("Денис теперь получает " + newZarpDenis + " рублей. Годовой доход вырос на "+ deltaDenis + " рублей");
        System.out.println("Маша теперь получает " + newZarpKristina + " рублей. Годовой доход вырос на "+ deltaKristina + " рублей");

    }
}