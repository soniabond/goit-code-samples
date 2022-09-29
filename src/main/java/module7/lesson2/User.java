package module7.lesson2;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private String surname;
    private String mail;
    private String phone;
    private LocalDate registrationDate;
    private LocalDate lastUpdates;

    public User() {
    }

    public User(int id, String name, String surname, String mail, String phone, LocalDate registrationDate, LocalDate lastUpdates) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phone = phone;
        this.registrationDate = registrationDate;
        this.lastUpdates = lastUpdates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getLastUpdates() {
        return lastUpdates;
    }

    public void setLastUpdates(LocalDate lastUpdates) {
        this.lastUpdates = lastUpdates;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String name;
        private String surname;
        private String mail;
        private String phone;
        private LocalDate registrationDate;
        private LocalDate lastUpdates;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder registrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public Builder lastUpdates(LocalDate lastUpdates) {
            this.lastUpdates = lastUpdates;
            return this;
        }

        public User build() {
            User user = new User();
            user.setId(id);
            user.setPhone(phone);
            user.setMail(mail);
            user.setName(name);
            user.setSurname(surname);
            user.setLastUpdates(lastUpdates);
            user.setRegistrationDate(registrationDate);
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", registrationDate=" + registrationDate +
                ", lastUpdates=" + lastUpdates +
                '}';
    }
}
