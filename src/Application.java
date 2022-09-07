public class Application {
    public static void main(String[] args) {
        WeightedIngredient sastojak1 = new WeightedIngredient("jogurt", 0.3, 150);
        WeightedIngredient sastojak2 = new WeightedIngredient("brasno", 0.2, 100);
        WeightedIngredient sastojak3 = new WeightedIngredient("zejtin", 0.05, 180);
        WeightedIngredient sastojak4 = new WeightedIngredient("jaja",3,10);
//        System.out.println(sastojak1);
//        System.out.println(sastojak2);
//        System.out.println(sastojak3);
        Recipe recept1 = new Recipe("Proja");
        recept1.addIngrs(sastojak1);
        recept1.addIngrs(sastojak2);
        recept1.addIngrs(sastojak3);
        recept1.addIngrs(sastojak4);
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
    }
}
