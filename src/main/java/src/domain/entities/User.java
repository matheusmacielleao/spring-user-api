package src.domain.entities;

import jakarta.persistence.*;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import src.domain.entities.Address;

import java.util.Date;
    @Entity
    @Table(name = "users")
    public class User {
        @Id
        @Column(name = "cpf")
        private String cpf;

        @Column(name = "name")
        private String name;

        @Column(name = "birth_date")
        private Date birthDate;

        @Column(name = "email", unique = true)
        private String email;

        @Column(name = "phone_number", unique = true)
        private String phoneNumber;

        @Column(name = "password")
        private String password;

        @Embedded
        private Address address;

        public User(){}

        public User(String cpf, String name, Date birthDate, String email, String phoneNumber, String password, Address address) {
            this.cpf = cpf;
            this.name = name;
            this.birthDate = birthDate;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.password = password;
            this.address = address;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
    }


