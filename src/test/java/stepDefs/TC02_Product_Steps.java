package stepDefs;

import io.cucumber.java.en.And;
import pages.TC02_Product;

public class TC02_Product_Steps {


        TC02_Product product = new TC02_Product();

        //list.get(index): Retrieves the element at the specified index in a list.
        @And("Add {int} product to the cart")
        public void Add_Number_Of_products_to_card(int P) {

            for (int i = 0; i < P; i++) {

                product.addToCartButtons().get(i).click();  // Click the 'Add to Cart' button
  }

}

}
