package org.openths.javasamples.inheritance.user;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{

    private List<String> shoppingCart;
    private  List<String> purchaseHistory;

    public Customer(String username, String email) {
        super(username, email);
        this.shoppingCart = new ArrayList<>();
        this.purchaseHistory = new ArrayList<>();
    }

public List<String> addToCart(String item) {
        shoppingCart.add(item);
    return List.of();
}

    public void fetchPurchaseHistory() {
        return;
    }
}
