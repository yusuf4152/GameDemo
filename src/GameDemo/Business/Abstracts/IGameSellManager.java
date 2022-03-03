package GameDemo.Business.Abstracts;
import GameDemo.Entity.Concretes.Customer;
import GameDemo.Entity.Concretes.Game;
import GameDemo.Entity.Concretes.Offer;

public interface IGameSellManager{
    void gameSell(Game game, Customer customer, Offer offer);
}
