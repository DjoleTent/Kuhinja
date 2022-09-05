import java.util.ArrayList;
import java.util.List;

public class Recipe implements Priceable {

    public String nazivRecepta;
    // enum
    public List<WeightedIngredient> ingrs;

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

    }
}
