package interview.technical.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/creditCard")
public class CreditCardController {

    @Autowired
    public CreditCardService creditCardService;


    @GetMapping(path = "/getCreditCards", produces = "application/json")
    @ResponseBody
    public List<CreditCard> getCreditCardDetails(){

        List<CreditCard> listOfCreditCards = creditCardService.getCardDetails();

        return listOfCreditCards;
    }

    @PostMapping(path = "/addCreditCard", consumes = "application/json")
    public ResponseEntity<CreditCard> saveCreditCardDetails(@RequestBody CreditCard creditCard){

        CreditCard cardDetails = creditCardService.saveCreditCard(creditCard);

        if(cardDetails == creditCard){
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.unprocessableEntity().build();
        }
    }
}
