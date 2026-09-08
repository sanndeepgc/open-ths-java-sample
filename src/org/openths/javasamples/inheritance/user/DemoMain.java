package org.openths.javasamples.inheritance.user;

public class DemoMain {
    static void main() {
        User user = new User("Whiskas", "whiskas@mail.com");
        Customer user1  = new Customer("Tom Cruise", "tom@mail.com");
        Admin user2 = new Admin("AppnAdmin", "appnadmin@mail.com");


        System.out.println(user.login());
        System.out.println(user1.login());


        user1.addToCart("Water Bottle");
        user1.addToCart("stationary");
        user1.addToCart("Wireless Mouse");
        user1.fetchPurchaseHistory();

    }
}
