public class WeightedIngredient extends Ingridient{
    public double weight;
    public double pricePerUnit;
    public WeightedIngredient(String naziv, double weight,double pricePerUnit) {
        super(naziv);
        this.weight=weight;
        this.pricePerUnit=pricePerUnit;
    }

    public void getScaledIngr(double n){
        this.weight=this.weight*n/100;
    }


    @Override
    public double getPrice() {
        return weight*pricePerUnit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "" + nazivSastojka + ", kolicina: " + weight + ", cena: " + pricePerUnit;
    }
}
