package interview.technical.challenge;

public class CreditCard {
    public String name;
    public String cardNumber;
    public Long limit;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public String getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public Long getLimit(){
        return limit;
    }
    public void setLimit(Long newLimit){
        this.limit = newLimit;
    }
}
