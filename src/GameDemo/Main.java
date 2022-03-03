package GameDemo;
import GameDemo.Adapter.Concretes.MernisService;
import GameDemo.Business.Concretes.CustomerManager;
import GameDemo.Business.Concretes.GameSellManager;
import GameDemo.Entity.Concretes.Customer;
import GameDemo.Entity.Concretes.Game;
import GameDemo.Entity.Concretes.Offer;
public class Main {

    public static void main(String[] args) throws Exception {
        CustomerManager customerManager= new CustomerManager(new MernisService());
        Customer customer=new Customer("43183833812","yusuf islam","demir",2001);
        customerManager.add(customer);
        GameSellManager gameSellManager= new GameSellManager();
        gameSellManager.gameSell(new Game(1,2),customer,new Offer(1,"kış kampanyası"));
    }
}
