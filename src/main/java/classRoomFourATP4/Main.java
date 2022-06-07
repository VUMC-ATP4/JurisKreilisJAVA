package classRoomFourATP4;

public class Main {

    public static void main(String[] args) {
        //objekts viens

        House majaViens = new House();
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brīvības iela";
        majaViens.ieejuSkaits = 1;
        Cena cena1 = new Cena();
        cena1.cena = 30000;
        cena1.valuta = '$';
        majaViens.cena = cena1;
        majaViens.platiba = 300;
        majaViens.stavuSkaits = 2;
        majaViens.irStavvieta = true;
        //objekts divi
        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Ģertrūdes iela";
        majaDivi.stavuSkaits = 3;
        majaDivi.istabuSkaits = 4;
        majaDivi.irStavvieta = false;
        majaDivi.platiba = 400;

        Cena cena2 = new Cena();
        majaDivi.cena = cena2;


        majaViens.printetAdresi();
        majaViens.printetVisu();

        majaDivi.printetAdresi();
        majaDivi.printetVisu();

        majaDivi.skatijumuSkaits++;

        Velosipeds velosipeds1 = new Velosipeds();
        Velosipeds velosipeds2 = new Velosipeds();
        velosipeds2.bremzuTips = "Disku";
        velosipeds2.rataIzmers = 27.3;
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        velosipeds2.bremze();
        velosipeds2.bremze();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.nosaukums);
        velosipeds1.atrumi = 28;
        System.out.println(velosipeds1.atrumi);

        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        System.out.println("Priekšā ir gājējs");
        velosipeds1.bremze();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.bremze();
        velosipeds1.bremze();
        velosipeds1.bremze();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);


        Automasina testCar = new Automasina("Opel", 1990, 200000, 500);
        Automasina testCar2 = new Automasina("BMW", 1991, 230000, 1000);
        testCar.printetAuto();
        testCar2.printetAuto();


        Zivs zivsViens = new Zivs();
        zivsViens.vecums = 3;
        zivsViens.vide = "Saldūdens";
        zivsViens.dzimums = 'V';
        zivsViens.nosaukums = "Klaunzivs";
        zivsViens.printetZivi();

        Zivs[] zivis = {new Zivs(), new Zivs(), new Zivs(), new Zivs()};
        zivis[3].nosaukums = "līdaka";
        zivis[2].nosaukums = "Asaris";
        zivis[1].nosaukums = "Rauda";
        zivis[0].nosaukums = "Sams";

        for (int i = 0; i < zivis.length; i++) {
            zivis[i].printetZivi();
        }


        Darbinieks pirmaisdarbinieks = new Darbinieks();
        pirmaisdarbinieks.vards = "Jānis";
        pirmaisdarbinieks.uzvards = "Strautiņš";
        pirmaisdarbinieks.talrunis = 11122222;
        pirmaisdarbinieks.nodala = "grāmatvedības";
        pirmaisdarbinieks.amats = "uzskaitvedis";
        pirmaisdarbinieks.vecums = 34;
        pirmaisdarbinieks.stavs = 3;

        pirmaisdarbinieks.darbiniekaID();
        pirmaisdarbinieks.darbinieksAtrodas();

        Kompanija kompanija1 = new Kompanija();
        kompanija1.nosaukums = "GOOOGL";
        kompanija1.darbiniekuSkaits = 4;
        kompanija1.gadaIenakumi = 23000;
        kompanija1.komersantaTips = "IK";
        kompanija1.vaiMaksatSpejigs = false;
        Kompanija kompanija2 = new Kompanija();
        kompanija2.nosaukums = "Ramy";
        kompanija2.darbiniekuSkaits = 23;
        kompanija2.gadaIenakumi = 1000000000;
        kompanija2.komersantaTips = "SIA";
        kompanija2.vaiMaksatSpejigs = true;

        Darbinieks darbinieks1 = new Darbinieks();
        darbinieks1.vards = "Juris";
        Darbinieks darbinieks2 = new Darbinieks();
        darbinieks1.vards = "Pēteris";
        Darbinieks[] darbinieki = {darbinieks1, darbinieks2};
        kompanija2.darbiniekuSaraksts = darbinieki;


        kompanija1.kompInfo();

        Kakis kakisViens = new Kakis("V",10,"īsa",true,false,false);
        kakisViens.printetKakis();
        System.out.println("Vedam kaki pie vetarsta");
        kakisViens.irSterilizets = true;
        kakisViens.printetKakis();

        Rinkis rinkis2 = new Rinkis();
        rinkis2.radiuss = 15.30;

        Rinkis rinkis1 = new Rinkis(5.34);


        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());

        System.out.println(rinkis1.diametrs());
        System.out.println(rinkis2.diametrs());


    }

}
