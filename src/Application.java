public class Application {
    public static void main(String[] args) {
        WeightedIngredient sastojak1 = new WeightedIngredient("jogurt", 0.3, 150);
        WeightedIngredient sastojak2 = new WeightedIngredient("brasno", 0.2, 100);
        WeightedIngredient sastojak3 = new WeightedIngredient("zejtin", 0.05, 180);
        System.out.println(sastojak1);
        System.out.println(sastojak2);
        System.out.println(sastojak3);
        Recipe recept1 = new Recipe("Proja");
        recept1.ingrs.add(sastojak1);
        recept1.ingrs.add(sastojak2);
        recept1.ingrs.add(sastojak3);
        System.out.println(recept1);
//        System.out.println(recept1.getIngrs());
        Recipe scaledRecept1 = recept1.getScaledRecipe(recept1, 50.0);
        System.out.println(recept1.getScaledRecipe(recept1,50.0).getIngrs());
        System.out.println(scaledRecept1.ingrs);
    }
}
