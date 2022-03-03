package GameDemo.Business.Concretes;
import GameDemo.Business.Abstracts.IGameSellManager;
import GameDemo.Entity.Concretes.Customer;
import GameDemo.Entity.Concretes.Game;
import GameDemo.Entity.Concretes.Offer;

public class GameSellManager implements IGameSellManager {
    @Override
    public void gameSell(Game game, Customer customer, Offer offer) {
        System.out.println(game.getProductID()+" id li oyun"+" " + offer.getName()+" kampanyası kullanılarak"+customer.getName()+" adlı kişiye satıldı");
    }
}
