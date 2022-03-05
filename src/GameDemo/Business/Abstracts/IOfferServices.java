package GameDemo.Business.Abstracts;

import GameDemo.Entity.Concretes.Offer;

public interface IOfferServices {
    void newOffer(Offer offer);
    void deleteOffer(Offer offer);
    void updateOffer(Offer offer);
}
