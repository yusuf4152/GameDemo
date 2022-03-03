package GameDemo.Business.Concretes;
import GameDemo.Adapter.Abstracts.BaseServices;
import GameDemo.Business.Abstracts.ICustomerManager;
import GameDemo.Entity.Concretes.Customer;

public class CustomerManager implements ICustomerManager {
    private final BaseServices baseServices;
    public CustomerManager(BaseServices baseServices) {
        this.baseServices=baseServices;
    }
    @Override
    public void add(Customer customer) throws Exception {
         if (this.baseServices.Check(customer)){
             System.out.println("müşteri ekleme Başarılı");
         }
         else {
             System.out.println("müşteri ekleme başarısız");
         }
    }
    @Override
    public void update(Customer customer) {
        System.out.println("müşteri güncellendi");
    }
    @Override
    public void delete(Customer customer) {
        System.out.println("müşteri silindi");
    }
}
