/**
 * Created by wilpiron on 07/11/2016.
 */
public class Ligne implements IVisitable {
    private String name;

    public String getName() {
        return name;
    }

    void Ligne(String name){
        this.name = name;
    }

    @Override
    public void accept(IVisitor visitor) {
        IVisitor.visit(this);
    }
}
