package com.company.zadanieFactory;

import javax.management.relation.Role;

public class Admin implements IUser{

    public Role role;
    private String fullName;
    private String email;
    private boolean isAdult;

    public Admin(Role role, String fullName, String email,boolean isAdult) {
        this.role = role;
        this.fullName = fullName;
        this.email = email;
        this.isAdult = isAdult;

    }
    @Override
    public Role getRole() { return Role.ADMIN; }
    @Override
    public String getFullName() {
        return fullName;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public boolean isAdult() {
        return true;
    }

    public Admin build(){
        return new Admin(this.role,this.fullName,this.email, this.isAdult());
    }
}
