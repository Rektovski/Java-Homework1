package Implements;

import java.time.LocalDate;

public class Person {
    String id, gender;
    LocalDate date;

    public Person(String id, LocalDate date, String gender){
        setId(id);
        setDate(date);
        setGender(gender);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
