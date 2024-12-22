package stepDefs;

import io.cucumber.java.en.And;
import pages.TC03_Card;

public class TC03_Card_Steps {
    TC03_Card card=new TC03_Card();

    @And("go to the cart")
    public void go_to_the_cart( ) {

        card.CardIcon().click();
    }

    @And("remove {int} product from the cart")
    public void Add_Number_Of_products_to_card(int P) {

        for (int i = 0; i < P; i++) {

            card.removeFromCartButtons().get(i).click();  // Click the 'Add to Cart' button
        }

    }

    @And("go to checkout page")
    public void go_to_checkout_page( ) {

        card.CheckoutIcon().click();
}
}

