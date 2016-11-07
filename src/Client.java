import java.util.ArrayList;

/**
 * Created by wilpiron on 07/11/2016.
 */
public class Client implements IVisitable {
    private String name;
    private ArrayList<Commande> liste;
    // capacite est le nombre maximal de Commande dans la liste
    // sa valeur est complètement arbitraire
    private final int capacite = 50;
    // remplissage indique où nous en sommes dans la liste
    private int remplissage;

    void Client(String name){
        this.name = name;
        this.liste = new ArrayList<Commande>(this.capacite);
        this.remplissage = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(IVisitor visitor) {

    }

    void addCommande(Commande c){
        if (this.remplissage < this.capacite){
            this.liste.add(c);
            this.remplissage = this.remplissage + 1;
        }
    }
}
