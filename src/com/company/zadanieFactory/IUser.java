package com.company.zadanieFactory;

import javax.management.relation.Role;

public interface IUser {
    Role getRole();
    String getFullName();
    String getEmail();
    boolean isAdult();
}
