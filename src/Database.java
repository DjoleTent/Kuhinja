import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final List<WeightedIngredient> allIngrs = new ArrayList<>();
    private static final List<Recipe> allRecipes = new ArrayList<>();

    public static WeightedIngredient getIngr(String nazivNamirnice){
        for(var inrg:allIngrs){
            if(inrg.nazivSastojka.equals(nazivNamirnice)) return inrg;
        }
        return null;
    }
    public static Recipe getRecipe(String nazivRecepta){
        for(var oneRecipe:allRecipes){
            if(nazivRecepta.equals(oneRecipe.nazivRecepta)) return oneRecipe;
        }
        return null;
    }
    public static void deleteIngr(String nazivSastojka){
        for(var ingr:allIngrs){
            if(nazivSastojka.equals(ingr.nazivSastojka)) allIngrs.remove(ingr);
        }
    }
    public static void deleteRecipe(String nazivRecepta){
        for(var recipe:allRecipes){
            if(nazivRecepta.equals(recipe.nazivRecepta)) allRecipes.remove(recipe);
        }
    }
    public static void addIngrs(WeightedIngredient ingr) {
        allIngrs.add(ingr);
    }
    public static void addRecipe(Recipe recept) {
        allRecipes.add(recept);
    }

}
