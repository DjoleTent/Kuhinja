import java.util.ArrayList;
import java.util.List;

public class Recipe implements Priceable {

    public String nazivRecepta;
    // enum
    public List<WeightedIngredient> ingrs;


    Recipe() {
    }

    ;

    public Recipe(String naziv) {
        this.nazivRecepta = naziv;
        this.ingrs = new ArrayList<>();
    }


    @Override
    public double getPrice() {
        return 0;
    }

    public void addIngrs(WeightedIngredient ingr) {
        ingrs.add(ingr);
    }

    public void removeIngrs(WeightedIngredient ingr) {
        ingrs.remove(ingr);
    }

    public void getScaledRecipe(Recipe recept, double x) {
        Recipe newScaledRecipe = new Recipe(recept.nazivRecepta + " promenjen za " + x);
        for (var weIngr : recept.ingrs) {
            newScaledRecipe.ingrs.add(new WeightedIngredient(weIngr.nazivSastojka, weIngr.weight * x / 100, weIngr.pricePerUnit));
        }

    }
}
