import java.util.ArrayList;

/**
 * Created by wilpiron on 07/11/2016.
 */
public class Commande implements IVisitable {
    private String name;
    private ArrayList<Ligne> liste;
    // capacite est le nombre maximal de Ligne dans la liste
    // sa valeur est complètement arbitraire
    private final int capacite = 50;
    // remplissage indique où nous en sommes dans la liste
    private int remplissage;

    public String getName() {
        return name;
    }

    void addLigne(Ligne l){
        if (this.remplissage < this.capacite){
            this.liste.add(l);
            this.remplissage = this.remplissage + 1;
        }
    }

    void Commande(String name){
        this.name = name;
        this.liste = new ArrayList<Ligne>(this.capacite);
        this.remplissage = 0;
    }

    @Override
    public void accept(IVisitor visitor) {
        IVisitor.visit(this);
    }
}
