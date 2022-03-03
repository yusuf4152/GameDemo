package GameDemo.Adapter.Concretes;

import GameDemo.Adapter.Abstracts.BaseServices;
import GameDemo.Entity.Concretes.Customer;
import MernisReference.LMIKPSPublicSoap;

public class MernisService implements BaseServices {
    @Override
    public boolean Check(Customer customer) throws Exception {
        LMIKPSPublicSoap lmikpsPublicSoap= new LMIKPSPublicSoap();
      boolean dogrumu=  lmikpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()),customer.getName(),customer.getLastName(),customer.getBirthYear());
        if (dogrumu){
            return true;
        }
        else {
            return false;
        }
    }
}
