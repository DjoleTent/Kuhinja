public class Application {
    public static void main(String[] args) {

        // BAZA SASTOJAKA

        WeightedIngredient sastojak1 = new WeightedIngredient("jogurt", 0.3, 150);
        WeightedIngredient sastojak2 = new WeightedIngredient("brasno", 0.2, 100);
        WeightedIngredient sastojak3 = new WeightedIngredient("ulje", 0.05, 180);
        WeightedIngredient sastojak4 = new WeightedIngredient("jaja", 30, 10);
        WeightedIngredient sastojak5 = new WeightedIngredient("mleko", 5, 180);
        WeightedIngredient sastojak6 = new WeightedIngredient("paradajz", 2, 200);
        WeightedIngredient sastojak7 = new WeightedIngredient("bolonjeze-sos", 1, 175);
        WeightedIngredient sastojak8 = new WeightedIngredient("virsle", 3, 110);
        WeightedIngredient sastojak9 = new WeightedIngredient("sladoled", 2, 400);
        WeightedIngredient sastojak10 = new WeightedIngredient("so", 1, 136);
        WeightedIngredient sastojak11 = new WeightedIngredient("salama", 0.5, 250);
        WeightedIngredient sastojak12 = new WeightedIngredient("sir", 3, 300);
        WeightedIngredient sastojak13 = new WeightedIngredient("kackavalj", 1, 756);
        WeightedIngredient sastojak14 = new WeightedIngredient("kecap", 1, 202);
        WeightedIngredient sastojak15 = new WeightedIngredient("majonez", 1, 208);
        WeightedIngredient sastojak16 = new WeightedIngredient("testenine",3,421);
        WeightedIngredient sastojak17 = new WeightedIngredient("mesano meso",2,522);
        WeightedIngredient sastojak18 = new WeightedIngredient("crni luk", 8,16);
        WeightedIngredient sastojak19 = new WeightedIngredient("pasulj", 2,89);
        WeightedIngredient sastojak20 = new WeightedIngredient("aleva paprika", 0.2,115);
        WeightedIngredient sastojak21 = new WeightedIngredient("secer", 5,109);
        WeightedIngredient sastojak22 = new WeightedIngredient("limun", 0.5,286);
        WeightedIngredient sastojak23 = new WeightedIngredient("prasak za pecivo", 0.2,120);
        WeightedIngredient sastojak24 = new WeightedIngredient("kvasac",0.1,72);


        Database.addIngrs(sastojak1);
        Database.addIngrs(sastojak2);
        Database.addIngrs(sastojak3);
        Database.addIngrs(sastojak4);
        Database.addIngrs(sastojak5);
        Database.addIngrs(sastojak6);
        Database.addIngrs(sastojak7);
        Database.addIngrs(sastojak8);
        Database.addIngrs(sastojak9);
        Database.addIngrs(sastojak10);
        Database.addIngrs(sastojak11);
        Database.addIngrs(sastojak12);
        Database.addIngrs(sastojak13);
        Database.addIngrs(sastojak14);
        Database.addIngrs(sastojak15);
        Database.addIngrs(sastojak16);
        Database.addIngrs(sastojak17);
        Database.addIngrs(sastojak18);
        Database.addIngrs(sastojak19);
        Database.addIngrs(sastojak20);
        Database.addIngrs(sastojak21);
        Database.addIngrs(sastojak22);
        Database.addIngrs(sastojak23);
        Database.addIngrs(sastojak24);

        var x = Database.getAllIngrs();
        System.out.println("------------------------------------");
//        System.out.println(x);

        // BAZA RECEPATA


//        System.out.println(sastojak1);
//        System.out.println(sastojak2);
//        System.out.println(sastojak3);
        Recipe recept1 = new Recipe("Proja");
        recept1.addIngrs(sastojak1);
        recept1.addIngrs(sastojak2);
        recept1.addIngrs(sastojak3);
        recept1.addIngrs(sastojak4);
        Recipe recept2 = new Recipe("Omlet");
        recept2.addIngrs(sastojak3);
        recept2.addIngrs(sastojak4);
        recept2.addIngrs(sastojak10);
        Recipe recept3 = new Recipe("Piza");
        recept3.addIngrs(sastojak2);
        recept3.addIngrs(sastojak11);
        recept3.addIngrs(sastojak13);
        recept3.addIngrs(sastojak14);
        recept3.addIngrs(sastojak15);
        Recipe recept4 = new Recipe("Slatka palacinka");
        recept4.addIngrs(sastojak2);
        recept4.addIngrs(sastojak3);
        recept4.addIngrs(sastojak4);
        recept4.addIngrs(sastojak5);
        recept4.addIngrs(sastojak9);
        Recipe recept5 = new Recipe("Slana palacinka");
        recept5.addIngrs(sastojak2);
        recept5.addIngrs(sastojak3);
        recept5.addIngrs(sastojak4);
        recept5.addIngrs(sastojak5);
        recept5.addIngrs(sastojak11);
        recept5.addIngrs(sastojak12);
        Recipe recept6= new Recipe("Bolonjeze");
        recept6.addIngrs(sastojak3);
        recept6.addIngrs(sastojak7);
        recept6.addIngrs(sastojak10);
        recept6.addIngrs(sastojak13);
        recept6.addIngrs(sastojak16);
        recept6.addIngrs(sastojak17);
        recept6.addIngrs(sastojak18);
        Recipe recept7 = new Recipe("Pasulj - klot");
        recept7.addIngrs(sastojak2);
        recept7.addIngrs(sastojak10);
        recept7.addIngrs(sastojak19);
        recept7.addIngrs(sastojak20);
        Recipe recept8 = new Recipe("Bakin kolac");
        recept8.addIngrs(sastojak2);
        recept8.addIngrs(sastojak3);
        recept8.addIngrs(sastojak4);
        recept8.addIngrs(sastojak5);
        recept8.addIngrs(sastojak21);
        recept8.addIngrs(sastojak22);
        recept8.addIngrs(sastojak23);
        Recipe recept9 = new Recipe("Kiflice sa sirom");
        recept9.addIngrs(sastojak2);
        recept9.addIngrs(sastojak3);
        recept9.addIngrs(sastojak5);
        recept9.addIngrs(sastojak10);
        recept9.addIngrs(sastojak21);
        recept9.addIngrs(sastojak24);
        Recipe recept10 = new Recipe("Kajgana sa kobasicom");
        recept10.addIngrs(sastojak3);
        recept10.addIngrs(sastojak4);
        recept10.addIngrs(sastojak8);
        recept10.addIngrs(sastojak10);












        Database.addRecipe(recept1);
        Database.addRecipe(recept2);
        Database.addRecipe(recept3);

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
        WeightedIngredient sastojak111 = new WeightedIngredient("jogurt", 0.2, 150);

        frizider.addIngr(sastojak111);
        frizider.addIngr(sastojak2);
        frizider.addIngr(sastojak3);
        frizider.addIngr(sastojak4);
//        System.out.println(frizider.namirnice);
        frizider.canMakeFoodByRecipe(recept1);
        frizider.makeFood(recept1);
//        System.out.println(recept1.getTezinaRecepta());

    }
}
