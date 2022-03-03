package GameDemo.Entity.Concretes;
import GameDemo.Entity.Abstracts.IEntity;
public class Offer implements IEntity {
    private  final int offerID;
    private  final String name;
    public Offer(int offerID, String name) {
        this.offerID=offerID;
        this.name=name;
    }

    public int getOfferID() {
        return offerID;
    }

    public String getName() {
        return name;
    }
}
