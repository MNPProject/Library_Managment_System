package app;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class LibrarianViewManager{
    private SimpleIntegerProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty password;
    private SimpleStringProperty email;
    private SimpleStringProperty address;
    private SimpleStringProperty city;
    private SimpleStringProperty contact;

    public LibrarianViewManager(Integer id, String name, String password, String email, String address, String city, String contact) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.password = new SimpleStringProperty(password);
        this.email = new SimpleStringProperty(email);
        this.address = new SimpleStringProperty(address);
        this.city = new SimpleStringProperty(city);
        this.contact = new SimpleStringProperty(contact);
    }

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getPassword() {
        return password.get();
    }

    public SimpleStringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getAddress() {
        return address.get();
    }

    public SimpleStringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getCity() {
        return city.get();
    }

    public SimpleStringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getContactNum() {
        return contact.get();
    }

    public SimpleStringProperty contactProperty() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact.set(contact);
    }
}
