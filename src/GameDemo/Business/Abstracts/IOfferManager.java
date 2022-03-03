package GameDemo.Business.Abstracts;

import GameDemo.Entity.Concretes.Offer;

public interface IOfferManager {
    void newOffer(Offer offer);
    void deleteOffer(Offer offer);
    void updateOffer(Offer offer);
}
