package GameDemo.Entity.Concretes;

import GameDemo.Entity.Abstracts.IEntity;

public class Game implements IEntity {
    private final int id;
    private final int ProductID;
    public Game(int id, int productID) {
        this.id=id;
        ProductID=productID;
    }

    public int getId() {
        return id;
    }

    public int getProductID() {
        return ProductID;
    }
}
