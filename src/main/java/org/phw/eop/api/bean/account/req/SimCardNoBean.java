package org.phw.eop.api.bean.account.req;

import org.phw.eop.api.internal.mapping.annotation.ReqField;

public class SimCardNoBean {

    @ReqField(tagName = "CardDataProcID")
    private String cardDataProcID;

    @ReqField(tagName = "SimID")
    private String simID;

    @ReqField(tagName = "IMSI")
    private String imsi;

    @ReqField(tagName = "CardType")
    private String cardType;

    @ReqField(tagName = "CardData")
    private String cardData;

    public String getCardDataProcID() {
        return cardDataProcID;
    }

    public void setCardDataProcID(String cardDataProcID) {
        this.cardDataProcID = cardDataProcID;
    }

    public String getSimID() {
        return simID;
    }

    public void setSimID(String simID) {
        this.simID = simID;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardData() {
        return cardData;
    }

    public void setCardData(String cardData) {
        this.cardData = cardData;
    }

}
