package day31_Constuctors;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("UK","Sony","SDET",50000,true,false,false);
        Offer offer2 = new Offer();
        offer2.setInfo("USA","Apple","SDET",60000,false,true,false);
        Offer offer3 = new Offer();
        offer3.setInfo("Belgium","TPM","SDET",50000,true,false,true);
        Offer offer4 = new Offer();
        offer4.setInfo("UK","Google","SDET",55000,true,false,false);
        Offer offer5 = new Offer();
        offer5.setInfo("UK","Samsung","SDET",40000,true,true,true);
        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer1 = " + offer1);
        
        Offer[] offers= {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
       /* for (Offer each : offers) {
            if (each.isFullTime==true){
                fullTime.add(each);
            }
        }
        */
        fullTimeOffers.removeIf(p->!p.isFullTime);
        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p->!p.location.equals("UK"));
        System.out.println("localOffers = " + localOffers);
        System.out.println("fullTime = " + fullTimeOffers);
        localOffers.size();
        System.out.println(localOffers.size());//how many offer from local area
        
    }
}
