package com.proyek.rahmanjai.eatitserver.Model;

public class User {
    private String Nama, Password, IsStaff, Phone;

    public User(String nama, String password) {
        Nama = nama;
        Password = password;
    }

    public User() {

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getIsStaff() {
        return IsStaff;
    }

    public void setIsStaff(String isStaff) {
        IsStaff = isStaff;
    }
}
