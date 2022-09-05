public abstract class Ingridient implements Priceable{
    private int id;
    public final String nazivSastojka;
    public Ingridient(String naziv){
        this.nazivSastojka=naziv;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }
}
