package UserAuth;

public class Costumer extends User {

    String fullName;
    String adres;

    public Costumer(String username, String password, String fullName, String adres) {
        super(username, password);
        this.fullName = fullName;
        this.adres = adres;
    }

    public Costumer(String username, String password) {
        super(username, password);
    }
}
