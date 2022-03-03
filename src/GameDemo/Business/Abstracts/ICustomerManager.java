package GameDemo.Business.Abstracts;

import GameDemo.Entity.Concretes.Customer;

public interface ICustomerManager {
    void add(Customer customer) throws Exception;
    void update(Customer customer);
    void delete(Customer customer);
}
