public class Application {
    public static void main(String[] args) {
        WeightedIngredient sastojak1 = new WeightedIngredient("jogurt", 0.3, 150);
        WeightedIngredient sastojak2 = new WeightedIngredient("brasno", 0.2, 100);
        WeightedIngredient sastojak3 = new WeightedIngredient("zejtin", 0.05, 180);
        WeightedIngredient sastojak4 = new WeightedIngredient("jaja",3,10);
        WeightedIngredient sastojak5 = new WeightedIngredient("mleko", 5, 180);
        WeightedIngredient sastojak6 = new WeightedIngredient("paradajz", 2, 200);
        WeightedIngredient sastojak7 = new WeightedIngredient("bolonjeze-sos", 1, 175);
        WeightedIngredient sastojak8 = new WeightedIngredient("virsle",3,110);
        WeightedIngredient sastojak9 = new WeightedIngredient("sladoled", 2, 400);
        WeightedIngredient sastojak10 = new WeightedIngredient("so", 1, 136);
        WeightedIngredient sastojak11 = new WeightedIngredient("salama", 0.5, 250);
        WeightedIngredient sastojak12 = new WeightedIngredient("sir",3,300);
        WeightedIngredient sastojak13 = new WeightedIngredient("kackavalj", 1, 756);
        WeightedIngredient sastojak14 = new WeightedIngredient("kecap", 1, 202);
        WeightedIngredient sastojak15 = new WeightedIngredient("majonez", 1, 208);
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



//        System.out.println(sastojak1);
//        System.out.println(sastojak2);
//        System.out.println(sastojak3);
        Recipe recept1 = new Recipe("Proja");
        recept1.addIngrs(sastojak1);
        recept1.addIngrs(sastojak2);
        recept1.addIngrs(sastojak3);
        recept1.addIngrs(sastojak4);
        Database.addIngrs(sastojak1);
        System.out.println(recept1);
//        System.out.println(recept1.getIngrs());
        Recipe scaledRecept1 = recept1.getScaledRecipe( 50.0);
//        System.out.println(recept1.getScaledRecipe(50.0).getIngrs());
        System.out.println(scaledRecept1.ingrs);
        System.out.println(scaledRecept1);
//        System.out.println(recept1.getPrice());
//        System.out.println(scaledRecept1.getPrice());
        Fridge frizider = new Fridge();
        frizider.addIngr(sastojak1);
        frizider.addIngr(sastojak2);
        frizider.addIngr(sastojak3);
        frizider.addIngr(sastojak1);
        System.out.println(frizider.namirnice);
        frizider.canMakeFoodByRecipe(recept1);
        frizider.makeFood(recept1);
        System.out.println(recept1.getTezinaRecepta());
        System.out.println(Database.getIngr("jogurt"));
    }
}
