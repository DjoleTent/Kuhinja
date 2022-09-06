import java.util.ArrayList;
import java.util.List;

public class Fridge {
    List<WeightedIngredient> namirnice;

    Fridge() {
        this.namirnice = new ArrayList<>();
    }

    public void addIngr(WeightedIngredient ingr) {
        if (!namirnice.contains(ingr)) {
            this.namirnice.add(ingr);
        } else {
            for (var namirnica : namirnice) {
                if (ingr.nazivSastojka.equalsIgnoreCase(namirnica.nazivSastojka)) {
                    namirnica.weight += ingr.weight;
                }
            }
        }
    }

    public void canMakeFoodByRecipe(Recipe recept) {

        if (helpCanMakeFoodByRecipe(recept) == recept.ingrs.size()) {
            System.out.println("Moguce je pripremiti jelo po receptu sa namirnicama iz frizidera");
        } else System.out.println("Nije moguce pripremiti jelo po receptu");
    }

    public int helpCanMakeFoodByRecipe(Recipe recept) {
        int brojac = 0;
        for (var namirnica : recept.ingrs) {
            for (var sastojak : this.namirnice)
                if (this.namirnice.contains(namirnica) && namirnica.nazivSastojka.equalsIgnoreCase(sastojak.nazivSastojka) && namirnica.weight <= sastojak.weight) {
                    brojac++;
                }
        }
        return brojac;
    }

    public void makeFood(Recipe recept) {
        if (helpCanMakeFoodByRecipe(recept) == recept.ingrs.size()) {
            for (var namirnica : recept.ingrs) {
                for (var sastojak : this.namirnice) {
                    if (namirnica.nazivSastojka.equalsIgnoreCase(sastojak.nazivSastojka)){
                        sastojak.weight-= namirnica.weight;
                    }
                }
            }
            System.out.println("Jelo po receptu je napravljeno. Prijatno.");
        } else System.out.println("Nema dovoljno kolicine sastojka da se napravi jelo po receptu.");
    }


    public void removeIngr(WeightedIngredient ingr) {
        this.namirnice.remove(ingr);
    }
}
