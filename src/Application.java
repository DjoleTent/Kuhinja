import java.util.*;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;

public class Application {

    public static void dobroDosli() {
        System.out.println("Ako ste baki doneli namirnice - ukucajte 1" +
                "\nAko zelite da pozajmite nesto iz bakinog frizidera - ukucajte 2" +
                "\nUkoliko vas interesuje sta baka moze trenutno da Vam napravi za jelo - ukucajte 3" +
                "\nZelite da znate sta sve baka moze upola da spremi za Vas - ukucajte 4" +
                "\nZelete da pojedete nesto - ukucajte 5" +
                "\nZelite da pojedete nesto ali da to jelo baku ne kosta vise od odredjene sume novca - ukucajte 6" +
                "\nKako baka razvrstava jela po tezini - ukucajte 7" +
                "\nKoja sve jela baka moze da Vam spremi za odredjenu svotu novca i odredjene tezine - ukucajte 8" +
                "\nKako baka razvstava jela po tezini - ukucajte 9" +
                "\nZamolite baku da Vam nabroji jela od najnize do najvise cene - ukucajte 10" +
                "\nUkoliko zelite da izaberete neko jelo koje ce Vam biti omiljeno - ukucajte 11" +
                "\nVidite svoje omiljene recepte - ukucajte 12" +
                "\nDodajte ili izbrisite omiljene recepte - ukucajte 13" +
                "\nVidite omiljene recepte do odredjene svote novca - ukucajte 14" +
                "\nIpak ne zelite nista iz bakine kuhinje - ukucajte 15");
        System.out.println("Unesite broj od 1 do 14: ");

    }

    public static Recipe daLiPostojiRecept(String jelo) {
        for (var recept : Database.getAllRecipes()) {
            if (recept.nazivRecepta.equalsIgnoreCase(jelo)) {
                return recept;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // BAZA SASTOJAKA


        ////////////////////// sastojci za recepte /////////////////////////////

        WeightedIngredient sastojak01 = new WeightedIngredient("jogurt", 1, 150);
        WeightedIngredient sastojak02 = new WeightedIngredient("brasno", 1, 105);
        WeightedIngredient sastojak03 = new WeightedIngredient("ulje", 1, 184);
        WeightedIngredient sastojak04 = new WeightedIngredient("jaje", 1, 10);
        WeightedIngredient sastojak05 = new WeightedIngredient("mleko", 1, 180);
        WeightedIngredient sastojak06 = new WeightedIngredient("paradajz", 1, 200);
        WeightedIngredient sastojak07 = new WeightedIngredient("bolonjeze-sos", 1, 175);
        WeightedIngredient sastojak08 = new WeightedIngredient("virsle", 1, 110);
        WeightedIngredient sastojak09 = new WeightedIngredient("sladoled", 1, 400);
        WeightedIngredient sastojak010 = new WeightedIngredient("so", 1, 136);
        WeightedIngredient sastojak011 = new WeightedIngredient("salama", 1, 250);
        WeightedIngredient sastojak012 = new WeightedIngredient("sir", 1, 300);
        WeightedIngredient sastojak013 = new WeightedIngredient("kackavalj", 1, 756);
        WeightedIngredient sastojak014 = new WeightedIngredient("kecap", 1, 202);
        WeightedIngredient sastojak015 = new WeightedIngredient("majonez", 1, 208);
        WeightedIngredient sastojak016 = new WeightedIngredient("testenine", 1, 421);
        WeightedIngredient sastojak017 = new WeightedIngredient("mesano meso", 1, 522);
        WeightedIngredient sastojak018 = new WeightedIngredient("crni luk", 1, 16);
        WeightedIngredient sastojak019 = new WeightedIngredient("pasulj", 1, 89);
        WeightedIngredient sastojak020 = new WeightedIngredient("aleva paprika", 1, 550);
        WeightedIngredient sastojak021 = new WeightedIngredient("secer", 1, 109);
        WeightedIngredient sastojak022 = new WeightedIngredient("limun", 1, 286);
        WeightedIngredient sastojak023 = new WeightedIngredient("prasak za pecivo", 1, 12);
        WeightedIngredient sastojak024 = new WeightedIngredient("kvasac", 1, 72);

        Database.addIngrs(sastojak01.getScaledIngr(300));
        Database.addIngrs(sastojak02.getScaledIngr(200));
        Database.addIngrs(sastojak03.getScaledIngr(200));
        Database.addIngrs(sastojak04.getScaledIngr(2000));
        Database.addIngrs(sastojak05.getScaledIngr(300));
        Database.addIngrs(sastojak06.getScaledIngr(400));
        Database.addIngrs(sastojak07.getScaledIngr(100));
        Database.addIngrs(sastojak08.getScaledIngr(200));
        Database.addIngrs(sastojak09.getScaledIngr(200));
        Database.addIngrs(sastojak010.getScaledIngr(100));
        Database.addIngrs(sastojak011.getScaledIngr(50));
        Database.addIngrs(sastojak012.getScaledIngr(100));
        Database.addIngrs(sastojak013.getScaledIngr(50));
        Database.addIngrs(sastojak014.getScaledIngr(100));
        Database.addIngrs(sastojak015.getScaledIngr(100));
        Database.addIngrs(sastojak016.getScaledIngr(100));
        Database.addIngrs(sastojak017.getScaledIngr(200));
        Database.addIngrs(sastojak018.getScaledIngr(600));
        Database.addIngrs(sastojak019.getScaledIngr(150));
        Database.addIngrs(sastojak020.getScaledIngr(20));
        Database.addIngrs(sastojak021.getScaledIngr(200));
        Database.addIngrs(sastojak022.getScaledIngr(500));
        Database.addIngrs(sastojak023.getScaledIngr(600));
        Database.addIngrs(sastojak024.getScaledIngr(300));

        var x = Database.getAllIngrs();
//        System.out.println("------------------------------------");
//        System.out.println(x);

        // BAZA RECEPATA


//        System.out.println(sastojak1);
//        System.out.println(sastojak2);
//        System.out.println(sastojak3);
        Recipe recept1 = new Recipe("Proja");
        recept1.addIngrs(sastojak01.getScaledIngr(30));
        recept1.addIngrs(sastojak02.getScaledIngr(30));
        recept1.addIngrs(sastojak03.getScaledIngr(2));
        recept1.addIngrs(sastojak04.getScaledIngr(300));
        recept1.addIngrs(sastojak010.getScaledIngr(2));
        recept1.addIngrs(sastojak023.getScaledIngr(100));
        Recipe recept2 = new Recipe("Omlet");
        recept2.addIngrs(sastojak03.getScaledIngr(2));
        recept2.addIngrs(sastojak04.getScaledIngr(300));
        recept2.addIngrs(sastojak010.getScaledIngr(2));
        Recipe recept3 = new Recipe("Piza");
        recept3.addIngrs(sastojak02.getScaledIngr(20));
        recept3.addIngrs(sastojak011.getScaledIngr(15));
        recept3.addIngrs(sastojak013.getScaledIngr(10));
        recept3.addIngrs(sastojak014.getScaledIngr(5));
        recept3.addIngrs(sastojak015.getScaledIngr(3));
        Recipe recept4 = new Recipe("Slatka-palacinka");
        recept4.addIngrs(sastojak02.getScaledIngr(10));
        recept4.addIngrs(sastojak03.getScaledIngr(5));
        recept4.addIngrs(sastojak04.getScaledIngr(100));
        recept4.addIngrs(sastojak05.getScaledIngr(25));
        recept4.addIngrs(sastojak09.getScaledIngr(5));
        Recipe recept5 = new Recipe("Slana-palacinka");
        recept5.addIngrs(sastojak02.getScaledIngr(10));
        recept5.addIngrs(sastojak03.getScaledIngr(5));
        recept5.addIngrs(sastojak04.getScaledIngr(100));
        recept5.addIngrs(sastojak05.getScaledIngr(25));
        recept5.addIngrs(sastojak011.getScaledIngr(5));
        recept5.addIngrs(sastojak012.getScaledIngr(2));
        Recipe recept6 = new Recipe("Bolonjeze");
        recept6.addIngrs(sastojak03.getScaledIngr(1));
        recept6.addIngrs(sastojak07.getScaledIngr(20));
        recept6.addIngrs(sastojak010.getScaledIngr(1));
        recept6.addIngrs(sastojak013.getScaledIngr(20));
        recept6.addIngrs(sastojak016.getScaledIngr(50));
        recept6.addIngrs(sastojak017.getScaledIngr(50));
        recept6.addIngrs(sastojak018.getScaledIngr(200));
        Recipe recept7 = new Recipe("Pasulj-klot");
        recept7.addIngrs(sastojak02.getScaledIngr(1));
        recept7.addIngrs(sastojak010.getScaledIngr(1));
        recept7.addIngrs(sastojak019.getScaledIngr(40));
        recept7.addIngrs(sastojak020.getScaledIngr(1));
        Recipe recept8 = new Recipe("Bakin-kolac");
        recept8.addIngrs(sastojak02.getScaledIngr(60));
        recept8.addIngrs(sastojak03.getScaledIngr(30));
        recept8.addIngrs(sastojak04.getScaledIngr(400));
        recept8.addIngrs(sastojak05.getScaledIngr(25));
        recept8.addIngrs(sastojak021.getScaledIngr(30));
        recept8.addIngrs(sastojak022.getScaledIngr(50));
        recept8.addIngrs(sastojak023.getScaledIngr(100));
        Recipe recept9 = new Recipe("Kiflice-sa-sirom");
        recept9.addIngrs(sastojak02.getScaledIngr(100));
        recept9.addIngrs(sastojak03.getScaledIngr(20));
        recept9.addIngrs(sastojak05.getScaledIngr(50));
        recept9.addIngrs(sastojak010.getScaledIngr(0.2));
        recept9.addIngrs(sastojak021.getScaledIngr(0.4));
        recept9.addIngrs(sastojak024.getScaledIngr(100));
        recept9.addIngrs(sastojak012.getScaledIngr(25));
        recept9.addIngrs(sastojak04.getScaledIngr(200));
        Recipe recept10 = new Recipe("Kajgana-sa-kobasicom");
        recept10.addIngrs(sastojak03.getScaledIngr(2));
        recept10.addIngrs(sastojak04.getScaledIngr(300));
        recept10.addIngrs(sastojak08.getScaledIngr(15));
        recept10.addIngrs(sastojak010.getScaledIngr(0.2));

        ////////////// SMESTANJE U BAZE //////////////////
        Database.addRecipe(recept1);
        Database.addRecipe(recept2);
        Database.addRecipe(recept3);
        Database.addRecipe(recept4);
        Database.addRecipe(recept5);
        Database.addRecipe(recept6);
        Database.addRecipe(recept7);
        Database.addRecipe(recept8);
        Database.addRecipe(recept9);
        Database.addRecipe(recept10);

//        var r = Database.getAllRecipes();
//        System.out.println(r);

        /////////// DODAVANEJ OMILJENIH RECEPATA U BAZU ////////////////////

//        Database.addFavoriteRecipe(recept1);
//        Database.addFavoriteRecipe(recept3);
//        Database.addFavoriteRecipe(recept4);
//        Database.addFavoriteRecipe(recept7);


        //////////////////////////////////////////////////////////////// KRAJ BAZA

//        var y = Database.getRecipe("Proja");
//        System.out.println("++++++++++++++++++++++++++++++");
//        System.out.println(y);

//        System.out.println(recept1);
//        System.out.println(recept1.getIngrs());
//        Recipe scaledRecept1 = recept1.getScaledRecipe(50.0);
//        System.out.println(recept1.getScaledRecipe(50.0).getIngrs());
//        System.out.println(scaledRecept1.ingrs);
//        System.out.println(scaledRecept1);
//        System.out.println(recept1.getPrice());
//        System.out.println(scaledRecept1.getPrice());


        Fridge frizider = new Fridge();


//        WeightedIngredient sastojak111 = new WeightedIngredient("jogurt", 1, 150);
//
//        frizider.addIngr(sastojak111);
//        frizider.addIngr(sastojak02);
//        frizider.addIngr(sastojak03);
//        frizider.addIngr(sastojak04);
//        frizider.addIngr(sastojak010);
//        frizider.addIngr(sastojak021);
//        System.out.println(frizider.namirnice);
//        frizider.canMakeFoodByRecipe(recept1);
//        frizider.makeFood(recept1);
//        System.out.println(recept1.getTezinaRecepta());
//        System.out.println(Database.getRecipe("bakin kolac"));
        for (var ingr : Database.getAllIngrs()) {
            frizider.addIngr(ingr);
        }
        System.out.println("Dobro dosli u Bakinu domacu kuhinju!");
        System.out.println("Ljubazna baka Milunka Vam je na usluzi. Koji je razlog Vaseg dolaska u bakinu kuhinju?");


        dobroDosli();
        Scanner s = new Scanner(System.in);

        String unos = s.next();
        while (!unos.equalsIgnoreCase("15")) {
            switch (unos) {
                case "0":
                    dobroDosli();
                    unos = s.next();
                    break;

                case "1":
                    System.out.println("Unesite naziv namirnice, njenu kolicnu i kolika je cena namirnice(jedinicna/kg): ");
                    frizider.addIngr(new WeightedIngredient(s.next(), s.nextDouble(), s.nextDouble()));
                    System.out.println("Baka Vam se zahvaljuje na namirnici.");
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "2":
                    System.out.println("Sta i koliko biste uzeli iz frizidera? Unesite naziv namirnice: ");
                    String namirnica = s.next();
                    s.nextLine();
                    System.out.println("Unesite i kolicinu: ");
                    double kolicina = s.nextDouble();
                    frizider.setLess(namirnica, kolicina);
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "3":
                    System.out.println("Sa namirnicama iz frizidera mogu da se naprave sledeca jela: ");
                    for (var recept : Database.getAllRecipes()) {
                        frizider.canMakeFoodByRecipe(recept);
                    }
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "4":
                    System.out.println("Pola porcije je: ");
                    for (var recept : Database.getAllRecipes()) {
                        recept.getScaledRecipe(50);
                    }
                    for (var recept : Database.getAllRecipes()) {
                        frizider.canMakeFoodByRecipe(recept);
                    }
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "5":
                    System.out.println("Koje jelo biste zeleli?");
                    System.out.println("Jela sa vise reci u imenu pisite sa '-' izmedju");
                    String jelo = s.next();
                    s.nextLine();
                    frizider.makeFood(daLiPostojiRecept(jelo));
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "6":
                    System.out.println("Unesite sumu novca: ");
                    double novac = s.nextDouble();
                    double min = MAX_VALUE;
                    System.out.println("Za ovu sumu novac moguce je napraviti: ");
                    for (var recept : Database.getAllRecipes()) {
                        if (recept.getPrice() < novac) {
                            System.out.print(recept.nazivRecepta + ".....");
                            if (recept.getPrice() < min) {
                                min = recept.getPrice();
                            }
                        }
                    }
                    System.out.println();
                    if (novac < min) {
                        System.out.println("Trenutno ni jedno jelo po receptima baka Milunke.");
                    }
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "7":
                    System.out.println("Razvsrtava ih po broju sastojaka koje koristi za pripremanje recepta.");
                    System.out.println("Unesite tezinu recepta koja Vas interesuje (begginer,easy,medium,hard,pro): ");
                    String tezina = s.next();
                    PrescriptionWeight per = null;
                    switch (tezina) {
                        case "begginer":
                            per = PrescriptionWeight.BEGINNER;
                            break;
                        case "easy":
                            per = PrescriptionWeight.EASY;
                            break;
                        case "medium":
                            per = PrescriptionWeight.MEDIUM;
                            break;
                        case "hard":
                            per = PrescriptionWeight.HARD;
                            break;
                        case "pro":
                            per = PrescriptionWeight.PRO;
                            break;
                        default:
                            System.out.println("Pogresan unos.");
                    }

                    for (var recept : Database.getAllRecipes()) {
                        if (recept.tezinaRecepta == per) {
                            System.out.println(recept);
                        }
                    }
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "8":
                    System.out.println("Unesite sumu za koju biste zeleli recept: ");
                    double suma = s.nextDouble();
                    System.out.println("Unesite tezinu jela koju biste zeleli (begginer,easy,medium,hard,pro): ");
                    String tezinaJela = s.next();
                    PrescriptionWeight per8 = null;
                    switch (tezinaJela) {
                        case "begginer":
                            per8 = PrescriptionWeight.BEGINNER;
                            break;
                        case "easy":
                            per8 = PrescriptionWeight.EASY;
                            break;
                        case "medium":
                            per8 = PrescriptionWeight.MEDIUM;
                            break;
                        case "hard":
                            per8 = PrescriptionWeight.HARD;
                            break;
                        case "pro":
                            per8 = PrescriptionWeight.PRO;
                            break;
                        default:
                            System.out.println("Pogresan unos.");
                    }
                    for (var recept : Database.getAllRecipes()) {
                        if (suma >= recept.getPrice() && recept.tezinaRecepta == per8) {
                            System.out.println(recept);
                        }
                    }
                    System.out.println("(Postoji mogucnost da za unetu sumu novca i unetu tezine nema nijednog recepta)");
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;

                case "9":
                    System.out.println("Od najtezeg do najlakse jela: ");
                    for (var recept : Database.getAllRecipes()) {
                        if (recept.tezinaRecepta == PrescriptionWeight.PRO) {
                            System.out.println(recept);
                        }
                    }
                    for (var recept : Database.getAllRecipes()) {
                        if (recept.tezinaRecepta == PrescriptionWeight.HARD) {
                            System.out.println(recept);
                        }
                    }
                    for (var recept : Database.getAllRecipes()) {
                        if (recept.tezinaRecepta == PrescriptionWeight.MEDIUM) {
                            System.out.println(recept);
                        }
                    }
                    for (var recept : Database.getAllRecipes()) {
                        if (recept.tezinaRecepta == PrescriptionWeight.EASY) {
                            System.out.println(recept);
                        }
                    }
                    for (var recept : Database.getAllRecipes()) {
                        if (recept.tezinaRecepta == PrescriptionWeight.BEGINNER) {
                            System.out.println(recept);
                        }
                    }
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();

                    break;
                case "10":
                    List<Double> listaCena = new ArrayList<>();

                    for (var recept : Database.getAllRecipes()) {
                        listaCena.add(recept.getPrice());
                    }

                    Collections.sort(listaCena);
                    System.out.println("Od najjeftinijeg jela do najskupljeg: ");
                    for (var pojedinacnaCena : listaCena) {
                        for (var recept : Database.getAllRecipes()) {
                            if (pojedinacnaCena == recept.getPrice()) {
                                System.out.println(recept);
                            }
                        }
                    }

                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "11":
                    System.out.println("Dodajte jelo u Vase omiljene: ");
                    Database.addFavoriteRecipePoNazivu(s.next());
                    System.out.println("(Ako Vam baka nije potvrdila da je dodala jelo u Vase omiljene recepte, znaci da ste pogresno uneli naziv recepta.)");
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "12":
                    System.out.println("Vasa omiljena jela su: ");
                    System.out.println("(Ako niste uneli, unesite preko opcije 11)");
                    for(var omiljena:Database.getAllFavoriteRecipes()){
                        System.out.println(omiljena);
                    }

                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "13":
                    System.out.println("Unesite naziv omiljenog recepta koji zelite da uklonite iz liste omiljenih: ");
                    Database.removeFavoriteRecipe(s.next());
                    System.out.println("Za dodavanje koristite opciju 11");
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                case "14":
                    System.out.println("Unesite sumu novac do koje biste zeleli omiljeno jelo: ");
                    double sumaOmiljeno=s.nextDouble();
                    System.out.println("Takva jela su: ");
                    for(var omiljeni:Database.getAllFavoriteRecipes()){
                        if(omiljeni.getPrice()<sumaOmiljeno){
                            System.out.println(omiljeni);
                        }
                    }
                    System.out.println("(Postoji mogucnost da ne postoje takva jela do unete sume)");
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
                default:
                    System.out.println("Pogresan unos.");
                    System.out.println("Da li zelite jos nesto?");
                    System.out.println("Ako zelite da vidite ponovo listu mogucnosti - ukucajte 0");
                    unos = s.next();
                    break;
            }
        }
        System.out.println("Dovidjenja! Baka Milunka Vas pozdravlja do sledeceg vidjenja.");

    }
}
