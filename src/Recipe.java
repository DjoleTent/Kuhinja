import java.util.ArrayList;
import java.util.List;

public class Recipe implements Priceable {

    public String nazivRecepta;
    // enum
    public List<WeightedIngredient> ingrs;
    public PrescriptionWeight tezinaRecepta = PrescriptionWeight.BEGINNER;

    Recipe() {
    }

    ;

    public Recipe(String naziv) {
        this.nazivRecepta = naziv;
        this.ingrs = new ArrayList<>();
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public PrescriptionWeight getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(PrescriptionWeight tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public List<WeightedIngredient> getIngrs() {
        return ingrs;
    }

    public void setIngrs(List<WeightedIngredient> ingrs) {
        this.ingrs = ingrs;
    }


    public String ispisNazivaSastojka(){
        String tekst="";
        for(var ingr:ingrs){
            tekst+= ingr.nazivSastojka + ", ";
        }
        return tekst.trim().substring(0,tekst.length()-2);
    }
    @Override
    public String toString() {

        return "Recept : " + nazivRecepta + " ("  + ispisNazivaSastojka() +")";
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (var ingr : ingrs) {
            sum += ingr.weight * ingr.pricePerUnit;
        }
        return sum;
    }


    public void addIngrs(WeightedIngredient ingr) {
        ingrs.add(ingr);
        if(ingrs.size()>12){
            tezinaRecepta=PrescriptionWeight.PRO;
        } else if (ingrs.size()>9) {
            tezinaRecepta=PrescriptionWeight.HARD;
        } else if (ingrs.size()>6) {
            tezinaRecepta=PrescriptionWeight.MEDIUM;
        }else if (ingrs.size()>3) {
            tezinaRecepta=PrescriptionWeight.EASY;
        }
    }

    public void removeIngrs(WeightedIngredient ingr) {
        ingrs.remove(ingr);
    }

    //    public Recipe getScaledRecipe(Recipe recept, double x) {
//        Recipe newScaledRecipe = new Recipe(recept.nazivRecepta + (x > 100 ? " uvecan za " + (x - 100) + " posto" : " umanjen za " + (100 - x) + " posto"));
//        for (var weIngr : recept.ingrs) {
//            newScaledRecipe.ingrs.add(new WeightedIngredient(weIngr.nazivSastojka, weIngr.weight * x / 100, weIngr.pricePerUnit));
//        }
//        return newScaledRecipe;
//
//    }
    public Recipe getScaledRecipe(double x) {
        Recipe newScaledRecipe = new Recipe(this.nazivRecepta + (x > 100 ? " uvecan za " + (x - 100) + " posto" : " umanjen za " + (100 - x) + " posto"));
        for (var weIngr : this.ingrs) {
            newScaledRecipe.ingrs.add(new WeightedIngredient(weIngr.nazivSastojka, weIngr.weight * x / 100, weIngr.pricePerUnit));
        }
        return newScaledRecipe;

    }
}
