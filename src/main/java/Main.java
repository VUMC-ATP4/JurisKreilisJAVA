public class Main {


    public static void main(String[] args) {
        System.out.println("Mācāmies mainīgos");

        //EN:Integer - LV:Vesels skaitlis

        int x = 5;
        int y = 10;
        int q = -10;

        double lowestTemperature = -20.4;
        float highestTemperature = 40.65512312F;
        System.out.println("Augstaka temp ir " + highestTemperature + "zemaka temp ir " + lowestTemperature);


        System.out.println("X ir vienāds ar:");
        System.out.println(x);
        System.out.println("Y ir vienāds ar:");
        System.out.println(y);
        System.out.println("x+y ir vienads ar:");
        System.out.println(x + y);
        System.out.println(x + y);

        //[Mainīga tips] [Mainīgā nosaukums] = [Vērtība];
        //Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā 'String'
        String dogName = "Reksis";
        //Veseli skaitļi tiek definēti ar mainīgā tipu 'int'
        int dogAge = 5;
        //Daļskaitļi tiek definēti ar mainīgā tipu 'double' vai 'float'
        double dogWeigth = 15.5;
        String dogBreed = "VAS";
        //Jā(true) nē(false) jautājums tiek definēts ar mainīgā tipu 'boolean'
        boolean isDogHungry = false;
        boolean isDogVaccinated = true;
        //vienu simbolu definē ar mainīgā tipu 'char'
        char currency = '€';
        int dogPrice = 100;
        char dogGender = 'M';

        System.out.println("Suņa Vārds:" + dogName);
        System.out.println("Suņa Vecums: " + dogAge);
        System.out.println("Suņa Svars: " + dogWeigth);
        System.out.println("Suņa Škirne: " + dogBreed);
        System.out.println("Vai suns ir izsalcis? " + isDogHungry);
        System.out.println("Vai suns ir vakcinēts? " + isDogVaccinated);
        System.out.println("Suņa dzimums ir: " + dogGender);
        System.out.println("Suņa kucēni maksā: " + dogPrice + currency);


        byte age = 10;
        short deepestSeaLevel = 11000;
        int highestIntNumber = 2147483647;
        long USACountryDebt = 21474836471232L;
        System.out.println(age);
        System.out.println(deepestSeaLevel);
        System.out.println(highestIntNumber);
        System.out.println(USACountryDebt);

        int starpiba;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;


        starpiba = pirmaisSkaitlis - otraisSkaitlis;
        int summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = 10 % 3;

        double a = 3.5;
        int b = 5;
        System.out.println((double) b);
        System.out.println((int) a);


        int c = 7;

        System.out.println("########"+b/a);



        System.out.println("Ja atlikums ir 0, tad para skaitlis" + b % 2);

        System.out.println("starpiba" + starpiba);
        System.out.println("summa" + summa);
        System.out.println("dalijums" + dalijums);
        System.out.println("reizinajums" + reizinajums);
        System.out.println("atlikums" + atlikums);

    }


}
