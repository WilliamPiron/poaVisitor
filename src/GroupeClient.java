import java.util.ArrayList;

/**
 * Created by wilpiron on 07/11/2016.
 */
public class GroupeClient implements IVisitable {
    private String name;
    private ArrayList<Client> liste;
    // capacite est le nombre maximal de Client dans la liste
    // sa valeur est complètement arbitraire
    private final int capacite = 50;
    // remplissage indique où nous en sommes dans la liste
    private int remplissage;


    void GroupeClient(String name){
        this.name = name;
        this.liste = new ArrayList<Client>(this.capacite);
        this.remplissage = 0;
    }

    @Override
    public void accept(IVisitor visitor) {

    }

    public String getName() {
        return name;
    }

    void addClient(Client c){
        if (this.remplissage < this.capacite){
            this.liste.add(c);
            this.remplissage = this.remplissage + 1;
        }
    }

}
