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
            System.out.println("Moguce je pripremiti "+recept.nazivRecepta+" po receptu sa namirnicama iz frizidera.");
        } else System.out.println("Nije moguce pripremiti "+recept.nazivRecepta+" po receptu.");
    }

    public int helpCanMakeFoodByRecipe(Recipe recept) {
        int brojac = 0;
        for (var namirnica : recept.ingrs) {
            for (var sastojak : this.namirnice)
                if (namirnica.nazivSastojka.equalsIgnoreCase(sastojak.nazivSastojka) && namirnica.weight <= sastojak.weight) {
                    brojac++;
                }
        }
        return brojac;
    }

    public void makeFood(Recipe recept) {
        if (helpCanMakeFoodByRecipe(recept) == recept.ingrs.size()) {
            for (var namirnica : recept.ingrs) {
                for (var sastojak : this.namirnice) {
                    if (namirnica.nazivSastojka.equalsIgnoreCase(sastojak.nazivSastojka)) {
                        sastojak.weight -= namirnica.weight;
                    }
                }
            }
            System.out.println("Jelo po receptu je napravljeno. Prijatno.");
        } else System.out.println("Nemamo dovoljno kolicine sastojka da se napravi jelo po receptu.");
    }


    public void removeIngr(WeightedIngredient ingr) {
        this.namirnice.remove(ingr);
    }

    public void setZero(String nazivNamirnice) {
        for (var namirnica : this.namirnice) {
            if (nazivNamirnice.equalsIgnoreCase(namirnica.nazivSastojka)) {
                namirnica.weight = 0;
            }
        }
    }

    public void setLess(String nazivNamirnice, double kolicina) {

        for (var namirnica : this.namirnice) {
            if (nazivNamirnice.equalsIgnoreCase(namirnica.nazivSastojka) && kolicina <= namirnica.weight) {
                namirnica.weight -= kolicina;
                System.out.println("U frizideru je bilo dovoljna kolicina namirnice koju ste trazili.");
                return;
            } else if (nazivNamirnice.equalsIgnoreCase(namirnica.nazivSastojka) && kolicina > namirnica.weight) {
                System.out.println("Nema trazene kolicine namirnice u frizideru.");
                return;
            }
        }
        System.out.println("Ne postoji ta namirnica u frizideru.");
    }
}
