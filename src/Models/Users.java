package Models;

public class Users {
    String name;
    String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Users(String name, String contact) {
        this.name = name;
        this.contact = contact;

    }
}
