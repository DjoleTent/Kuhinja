import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        // BAZA SASTOJAKA

//        WeightedIngredient sastojak1 = new WeightedIngredient("jogurt", 0.3, 150);
//        WeightedIngredient sastojak2 = new WeightedIngredient("brasno", 0.2, 100);
//        WeightedIngredient sastojak3 = new WeightedIngredient("ulje", 0.05, 180);
//        WeightedIngredient sastojak4 = new WeightedIngredient("jaja", 30, 10);
//        WeightedIngredient sastojak5 = new WeightedIngredient("mleko", 5, 180);
//        WeightedIngredient sastojak6 = new WeightedIngredient("paradajz", 2, 200);
//        WeightedIngredient sastojak7 = new WeightedIngredient("bolonjeze-sos", 1, 175);
//        WeightedIngredient sastojak8 = new WeightedIngredient("virsle", 3, 110);
//        WeightedIngredient sastojak9 = new WeightedIngredient("sladoled", 2, 400);
//        WeightedIngredient sastojak10 = new WeightedIngredient("so", 1, 136);
//        WeightedIngredient sastojak11 = new WeightedIngredient("salama", 0.5, 250);
//        WeightedIngredient sastojak12 = new WeightedIngredient("sir", 3, 300);
//        WeightedIngredient sastojak13 = new WeightedIngredient("kackavalj", 1, 756);
//        WeightedIngredient sastojak14 = new WeightedIngredient("kecap", 1, 202);
//        WeightedIngredient sastojak15 = new WeightedIngredient("majonez", 1, 208);
//        WeightedIngredient sastojak16 = new WeightedIngredient("testenine",3,421);
//        WeightedIngredient sastojak17 = new WeightedIngredient("mesano meso",2,522);
//        WeightedIngredient sastojak18 = new WeightedIngredient("crni luk", 8,16);
//        WeightedIngredient sastojak19 = new WeightedIngredient("pasulj", 2,89);
//        WeightedIngredient sastojak20 = new WeightedIngredient("aleva paprika", 0.2,115);
//        WeightedIngredient sastojak21 = new WeightedIngredient("secer", 5,109);
//        WeightedIngredient sastojak22 = new WeightedIngredient("limun", 0.5,286);
//        WeightedIngredient sastojak23 = new WeightedIngredient("prasak za pecivo", 0.2,120);
//        WeightedIngredient sastojak24 = new WeightedIngredient("kvasac",0.1,72);

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
        WeightedIngredient sastojak016 = new WeightedIngredient("testenine",1,421);
        WeightedIngredient sastojak017 = new WeightedIngredient("mesano meso",1,522);
        WeightedIngredient sastojak018 = new WeightedIngredient("crni luk", 1,16);
        WeightedIngredient sastojak019 = new WeightedIngredient("pasulj", 1,89);
        WeightedIngredient sastojak020 = new WeightedIngredient("aleva paprika", 1,550);
        WeightedIngredient sastojak021 = new WeightedIngredient("secer", 1,109);
        WeightedIngredient sastojak022 = new WeightedIngredient("limun", 1,286);
        WeightedIngredient sastojak023 = new WeightedIngredient("prasak za pecivo", 1,12);
        WeightedIngredient sastojak024 = new WeightedIngredient("kvasac",1,72);

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
        Recipe recept4 = new Recipe("Slatka palacinka");
        recept4.addIngrs(sastojak02.getScaledIngr(10));
        recept4.addIngrs(sastojak03.getScaledIngr(5));
        recept4.addIngrs(sastojak04.getScaledIngr(100));
        recept4.addIngrs(sastojak05.getScaledIngr(25));
        recept4.addIngrs(sastojak09.getScaledIngr(5));
        Recipe recept5 = new Recipe("Slana palacinka");
        recept5.addIngrs(sastojak02.getScaledIngr(10));
        recept5.addIngrs(sastojak03.getScaledIngr(5));
        recept5.addIngrs(sastojak04.getScaledIngr(100));
        recept5.addIngrs(sastojak05.getScaledIngr(25));
        recept5.addIngrs(sastojak011.getScaledIngr(5));
        recept5.addIngrs(sastojak012.getScaledIngr(2));
        Recipe recept6= new Recipe("Bolonjeze");
        recept6.addIngrs(sastojak03.getScaledIngr(1));
        recept6.addIngrs(sastojak07.getScaledIngr(20));
        recept6.addIngrs(sastojak010.getScaledIngr(1));
        recept6.addIngrs(sastojak013.getScaledIngr(20));
        recept6.addIngrs(sastojak016.getScaledIngr(50));
        recept6.addIngrs(sastojak017.getScaledIngr(50));
        recept6.addIngrs(sastojak018.getScaledIngr(200));
        Recipe recept7 = new Recipe("Pasulj - klot");
        recept7.addIngrs(sastojak02.getScaledIngr(1));
        recept7.addIngrs(sastojak010.getScaledIngr(1));
        recept7.addIngrs(sastojak019.getScaledIngr(40));
        recept7.addIngrs(sastojak020.getScaledIngr(1));
        Recipe recept8 = new Recipe("Bakin kolac");
        recept8.addIngrs(sastojak02.getScaledIngr(60));
        recept8.addIngrs(sastojak03.getScaledIngr(30));
        recept8.addIngrs(sastojak04.getScaledIngr(400));
        recept8.addIngrs(sastojak05.getScaledIngr(25));
        recept8.addIngrs(sastojak021.getScaledIngr(30));
        recept8.addIngrs(sastojak022.getScaledIngr(50));
        recept8.addIngrs(sastojak023.getScaledIngr(100));
        Recipe recept9 = new Recipe("Kiflice sa sirom");
        recept9.addIngrs(sastojak02.getScaledIngr(100));
        recept9.addIngrs(sastojak03.getScaledIngr(20));
        recept9.addIngrs(sastojak05.getScaledIngr(50));
        recept9.addIngrs(sastojak010.getScaledIngr(0.2));
        recept9.addIngrs(sastojak021.getScaledIngr(0.4));
        recept9.addIngrs(sastojak024.getScaledIngr(100));
        recept9.addIngrs(sastojak012.getScaledIngr(25));
        recept9.addIngrs(sastojak04.getScaledIngr(200));
        Recipe recept10 = new Recipe("Kajgana sa kobasicom");
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

        var r = Database.getAllRecipes();
//        System.out.println(r);


        //////////////////////////////////////////////////////////////// KRAJ BAZA

//        var y = Database.getRecipe("Proja");
//        System.out.println("++++++++++++++++++++++++++++++");
//        System.out.println(y);

//        System.out.println(recept1);
//        System.out.println(recept1.getIngrs());
        Recipe scaledRecept1 = recept1.getScaledRecipe(50.0);
//        System.out.println(recept1.getScaledRecipe(50.0).getIngrs());
//        System.out.println(scaledRecept1.ingrs);
//        System.out.println(scaledRecept1);
//        System.out.println(recept1.getPrice());
//        System.out.println(scaledRecept1.getPrice());
        Fridge frizider = new Fridge();
        WeightedIngredient sastojak111 = new WeightedIngredient("jogurt", 1, 150);

        frizider.addIngr(sastojak111);
        frizider.addIngr(sastojak02);
        frizider.addIngr(sastojak03);
        frizider.addIngr(sastojak04);
        frizider.addIngr(sastojak010);
        frizider.addIngr(sastojak021);
//        System.out.println(frizider.namirnice);
        frizider.canMakeFoodByRecipe(recept1);
        frizider.makeFood(recept1);
//        System.out.println(recept1.getTezinaRecepta());
        System.out.println(Database.getRecipe("bakin kolac"));

    }
}
