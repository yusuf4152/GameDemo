package GameDemo.Business.Concretes;

import GameDemo.Business.Abstracts.IOfferServices;
import GameDemo.Entity.Concretes.Offer;

public class OfferManager implements IOfferServices {
    @Override
    public void newOffer(Offer offer) {
        System.out.println(offer.getName()+ "kampanyası eklendi");
    }

    @Override
    public void deleteOffer(Offer offer) {
        System.out.println(offer.getName()+ " kampanyası silindi");
    }

    @Override
    public void updateOffer(Offer offer) {
        System.out.println(offer.getName()+ " kampanyası güncellendi..");
    }
}
