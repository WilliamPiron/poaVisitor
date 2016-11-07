/**
 * Created by wilpiron on 07/11/2016.
 */
public class RapportCommandes implements IVisitor {

    //@Override
    public void visit(Client client) {
        System.out.println("Je suis le Client "+client.getName()+".");
    }

    //@Override
    public void visit(Commande commande) {
        System.out.println("Je suis la Commande "+commande.getName()+".");
    }

    //@Override
    public void visit(Ligne ligne) {
        System.out.println("Je suis la Ligne "+ligne.getName()+".");
    }


}
