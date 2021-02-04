package ch.makery.painters.model;

import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Painters {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty birthPlace;
    private final StringProperty deathPlace;
    private final ObjectProperty<LocalDate> birthday;
    private final ObjectProperty<LocalDate> deathday;

    /**
     * Default constructor.
     */
    public Painters() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public Painters(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        // Some initial dummy data, just for convenient testing.
        this.birthPlace = new SimpleStringProperty("some birthPlace");
        this.deathPlace = new SimpleStringProperty("some deathPlace");
        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
        this.deathday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getbirthPlace() {
        return birthPlace.get();
    }

    public void setbirthPlace(String birthPlace) {
        this.birthPlace.set(birthPlace);
    }

    public StringProperty birthPlaceProperty() {
        return birthPlace;
    }

    public String getdeathPlace() {
        return deathPlace.get();
    }

    public void setdeathPlace(String deathPlace) {
        this.deathPlace.set(deathPlace);
    }

    public StringProperty deathPlaceProperty() {
        return deathPlace;
    }

    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
    
    public LocalDate getDeathday() {
        return birthday.get();
    }

    public void setDeathday(LocalDate deathday) {
        this.deathday.set(deathday);
    }

    public ObjectProperty<LocalDate> deathdayProperty() {
        return deathday;
    }
}