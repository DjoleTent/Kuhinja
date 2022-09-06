import java.util.ArrayList;
import java.util.List;

public class Fridge {
    List<WeightedIngredient> namirnice;

    Fridge(){
        this.namirnice=new ArrayList<>();
    }
    public void addIngr(WeightedIngredient ingr){
        if(!namirnice.contains(ingr)) {
            this.namirnice.add(ingr);
        } else{
            for(var namirnica:namirnice){
                if(ingr.nazivSastojka.equalsIgnoreCase(namirnica.nazivSastojka)){
                    namirnica.weight+= ingr.weight;
                }
            }
        }
    }
    public void removeIngr(WeightedIngredient ingr){
        this.namirnice.remove(ingr);
    }
}
