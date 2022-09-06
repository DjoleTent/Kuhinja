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

    public void makeFoodByRecipe(Recipe recept){
        int brojac=0;
        for(var namirnica:recept.ingrs){
            for(var sastojak:this.namirnice)
            if(this.namirnice.contains(namirnica) && namirnica.nazivSastojka.equalsIgnoreCase(sastojak.nazivSastojka) && namirnica.weight<=sastojak.weight){
                brojac++;
            }
        }
        if(brojac==recept.ingrs.size()){
            System.out.println("Moguce je pripremiti jelo po receptu sa namirnicama iz frizidera");
        } else System.out.println("Nije moguce pripremiti jelo po receptu");
    }


    public void removeIngr(WeightedIngredient ingr){
        this.namirnice.remove(ingr);
    }
}
