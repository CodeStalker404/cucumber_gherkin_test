package com.codestalker404.cucumber.gherkin_test.pojos;

public class Credentials {
    private String user;
    private String password;

    public Credentials() { }

    public Credentials(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
