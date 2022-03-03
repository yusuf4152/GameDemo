package GameDemo.Adapter.Abstracts;

import GameDemo.Entity.Concretes.Customer;

public interface BaseServices {
    boolean Check(Customer customer) throws Exception;
}
