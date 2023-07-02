package UserAuth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginSystem {
    private List<Costumer> costumer;

    public LoginSystem() {

        costumer = new ArrayList<>();
    }

    public void addUser(String username, String password) {
        Costumer costumer1 = new Costumer(username, password);
        costumer.add(costumer1);
    }

    public boolean authenticate(String username, String password) {
        for (User user : costumer) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}