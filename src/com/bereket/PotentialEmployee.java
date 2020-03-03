package com.bereket;

public class PotentialEmployee {
    private String fName;
    private String lName;
    private String email;
    private int social;

    public PotentialEmployee(String email){
        this(email,"","",0);
    }

    public PotentialEmployee(String email, int social){
        this("", "", email, social);
    }

    public PotentialEmployee(String fName, String lName, String email, int social) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.social = social;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }
}
