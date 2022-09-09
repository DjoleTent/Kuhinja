import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final List<WeightedIngredient> allIngrs = new ArrayList<>();
    private static final List<Recipe> allRecipes = new ArrayList<>();

    private static final List<Recipe> favoriteRecipes = new ArrayList<>();

    public static Recipe getFavoriteRecipe(String nazivRecepta){
        for(var oneRecipe:favoriteRecipes){
            if(nazivRecepta.equalsIgnoreCase(oneRecipe.nazivRecepta)) return oneRecipe;
        }
        return null;
    }
    public static void addFavoriteRecipe(Recipe recept) {
        if(!favoriteRecipes.contains(recept)) {
            favoriteRecipes.add(recept);
        }
    }
    public static void removeFavoriteRecipe(String nazivRecepta){
        for(var omiljeni:Database.getAllFavoriteRecipes()){
            if(nazivRecepta.equalsIgnoreCase(omiljeni.nazivRecepta)){
                favoriteRecipes.remove(omiljeni);
                System.out.println("Jelo je uklonjeno iz omiljenih.");
            }
        }
    }
    public static void addFavoriteRecipePoNazivu(String nazivJela) {
        for(var recept:Database.getAllRecipes()){
            if(nazivJela.equalsIgnoreCase(recept.nazivRecepta) && !favoriteRecipes.contains(recept)){
                Database.addFavoriteRecipe(recept);
                System.out.println("Jelo je dodato u omiljene.");
            }
        }
    }
    public static List<Recipe> getAllFavoriteRecipes(){
        return new ArrayList<>(favoriteRecipes);
    }

    public static WeightedIngredient getIngr(String nazivNamirnice){
        for(var inrg:allIngrs){
            if(inrg.nazivSastojka.equalsIgnoreCase(nazivNamirnice)) return inrg;
        }
        return null;
    }
    public static List<WeightedIngredient> getAllIngrs(){
        return new ArrayList<>(allIngrs);
    }
    public static Recipe getRecipe(String nazivRecepta){
        for(var oneRecipe:allRecipes){
            if(nazivRecepta.equalsIgnoreCase(oneRecipe.nazivRecepta)) return oneRecipe;
        }
        return null;
    }
    public static List<Recipe> getAllRecipes(){
        return new ArrayList<>(allRecipes);
    }
    public static void deleteIngr(String nazivSastojka){
        for(var ingr:allIngrs){
            if(nazivSastojka.equalsIgnoreCase(ingr.nazivSastojka)) allIngrs.remove(ingr);
        }
    }
    public static void deleteRecipe(String nazivRecepta){
        for(var recipe:allRecipes){
            if(nazivRecepta.equalsIgnoreCase(recipe.nazivRecepta)) allRecipes.remove(recipe);
        }
    }
    public static void addIngrs(WeightedIngredient ingr) {
        if (!allIngrs.contains(ingr)) {
            allIngrs.add(ingr);
        } else {
            for (var namirnica : allIngrs) {
                if (ingr.nazivSastojka.equalsIgnoreCase(namirnica.nazivSastojka)) {
                    namirnica.weight += ingr.weight;
                }
            }
        }
    }
    public static void addRecipe(Recipe recept) {
        if(!allRecipes.contains(recept)) {
            allRecipes.add(recept);
        }
    }


}
