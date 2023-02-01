package interview.technical.challenge;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditCardService {

    public CreditCard saveCreditCard(CreditCard cardDetails){
        if(checkValidCreditCard(cardDetails.getCardNumber()) == true){
            return cardDetails;
        }
        else{
            return null;
        }
    }

    private boolean checkValidCreditCard(String cardNumber){

        int length = cardNumber.length();

        int sum = 0;
        boolean isSecond = false;
        for (int i = length - 1; i >= 0; i--)
        {
            int d = cardNumber.charAt(i)-'0';

            if (isSecond == true)
                d = d * 2;
                sum += d / 10;
                sum += d % 10;

            isSecond = !isSecond;
        }
        return (sum % 10 == 0);
    }

    public List<CreditCard> getCardDetails(){
        List<CreditCard> listOfCreditCards = new ArrayList<>();
        CreditCard card = new CreditCard();
        card.setCardNumber("1234567890");
        card.setLimit(20000L);
        card.setName("ABCD");
        listOfCreditCards.add(card);
        return listOfCreditCards;
    }
}
