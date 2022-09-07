import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final List<WeightedIngredient> allIngrs = new ArrayList<>();
    private static final List<Recipe> allRecipes = new ArrayList<>();



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
        allIngrs.add(ingr);
    }
    public static void addRecipe(Recipe recept) {
        allRecipes.add(recept);
    }

}
