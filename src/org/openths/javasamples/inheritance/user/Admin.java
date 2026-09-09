package org.openths.javasamples.inheritance.user;

public class Admin extends User {

    public Admin(String username, String email) {
        super(username, email);
    }

    public Boolean deleteUser(String username) {
        return true;
    }

    public String updateInventory(String item) {
        return "Item Updated successfully";
    }
}
