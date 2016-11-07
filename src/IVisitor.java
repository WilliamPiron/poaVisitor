/**
 * Created by wilpiron on 07/11/2016.
 */
public interface IVisitor {

    void visit(Client client);
    void visit(Commande commande);
    void visit(Ligne ligne);
    void afficherCommande();
}
