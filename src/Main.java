public class Main {
    public static void main(String[] args) {

        System.out.println("Задания 1 ");

        System.out.println("Задания 2 ");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786F;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short y = -159;
        System.out.println(y);
        short u = 27897;
        System.out.println(u);
        byte i = 67;
        System.out.println(i);

        System.out.println("Задания 3 ");
        byte classOne = 23;
        System.out.println("Первый класс " + classOne);
        byte classTwo = 27;
        System.out.println("Второй класс " + classTwo);
        byte classThree = 30;
        System.out.println("Третий класс " + classThree);
        int totalNumberofParticipants = classOne+classTwo+classThree;
        System.out.println("Общее количество учиников "+totalNumberofParticipants);
        short sheet = 480;
        System.out.println("Общее число бумаги "+ sheet);
        int classSheet = sheet/totalNumberofParticipants;
        System.out.println("Число бумаги на каждого учинека " + classSheet);

        System.out.println("Задания 4 ");
        int bottlesInTwoMinutes = 16 ;
        System.out.println("За 2 минуты машина произведет " + bottlesInTwoMinutes +" бутылок");
        int bottlesInOneMinutes = 16 / 2;
        System.out.println("За 1 минуту машина произведет " + bottlesInOneMinutes+" бутылок");
        int bottlesInTwentyMinutes = bottlesInOneMinutes * 3;
        System.out.println("За 3 минуты машина произведет "+bottlesInTwentyMinutes+" бутылок");
        int day = 24 * 60;
        int bottlesInDay = day * bottlesInOneMinutes;
        System.out.println("За 1 день машина произведет "+bottlesInDay+" бутылок");
        int theerDay = 72 * 60;
        int bottlesInThreeDay = theerDay * bottlesInOneMinutes;
        System.out.println("За 3 дня машина произведет "+bottlesInThreeDay+" бутылок");
        int oneMonth = (30*24) *60;
        int bottlesOneMonth = oneMonth * bottlesInOneMinutes;
        System.out.println("За 1 месяц машина произведет "+bottlesOneMonth+" бутылок");



        System.out.println("Задания 5 ");
        byte toPaintSchool = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int oneClass = whitePaint + brownPaint;
        int numberOfClasses = toPaintSchool/oneClass;
        int whitePaintSchool= numberOfClasses*whitePaint;
        int brownPaintSchool= numberOfClasses*brownPaint;
        System.out.println("В школе,где "+numberOfClasses+" классов,нужно "+whitePaintSchool+" банок белой краски и "+brownPaintSchool+" банок коричневой краски");


        System.out.println("Задания 6 ");
        byte bananas = 5;
        short milk = 200;
        byte iceCreamSundae = 2;
        byte raweggs = 4;
        int weightBananas = bananas*80;
        int weightMilk = 105*2;
        int weightIceCreamSundae = iceCreamSundae*100;
        int weightRawEggs=raweggs*70;
        int totalWeight= weightBananas+weightMilk+weightRawEggs+weightIceCreamSundae;
        System.out.println(totalWeight);
        float totalweight= totalWeight/1000f;
        System.out.println(totalweight);


        System.out.println("Задания 7 ");
        int needToReset = 7 * 1000 ;
        int weightlossisthefirstway = 250 ;
        int weightlosssthesecondway = 500 ;
        int weightlossisTheFirstWay = needToReset / weightlosssthesecondway;
        int weightlossisthesecondWay = needToReset / weightlossisthefirstway;
        System.out.println( "Если спортсмен будет терять каждый день по 500 грамм " + weightlossisTheFirstWay+ " дней" );
        System.out.println(" Eсли каждый день будет худеть на 250 грамм "  + weightlossisthesecondWay+ " дней");



        System.out.println("Задания 8 ");
        int MashaGets = 67760;
        int DenisGets = 83690;
        int KristinaGets = 76230;
        int MashaIncreasedSalary = (67760 / 100) * 10;
        int DenisIncreasedSalary = (83690/ 100) * 10;
        int KristinaIncreasedSalary = (76230 / 100) * 10;
        int MashaNowGets = MashaGets + MashaIncreasedSalary;
        int DenisNowGets = DenisGets + DenisIncreasedSalary;
        int KristinaNowGets = KristinaGets + KristinaIncreasedSalary;
        int KristinIsAnnualIncomeHasGrown = KristinaIncreasedSalary * 12;
        int MashaIsAnnualIncomeHasGrown = MashaIncreasedSalary * 12;
        int DenisIsAnnualIncomeHasGrown = DenisIncreasedSalary * 12;
        System.out.println("Маша теперь получает "+ MashaNowGets +" рублей.Годовой доход вырос на " + MashaIsAnnualIncomeHasGrown + " рублей");
        System.out.println("Денис теперь получает "+ DenisNowGets +" рублей.Годовой доход вырос на " + DenisIsAnnualIncomeHasGrown + " рублей");
        System.out.println("Кристина теперь получает "+ KristinaNowGets +" рублей.Годовой доход вырос на " + KristinIsAnnualIncomeHasGrown + " рублей");






    }


}