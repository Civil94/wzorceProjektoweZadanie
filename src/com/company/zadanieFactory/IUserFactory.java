package com.company.zadanieFactory;

public interface IUserFactory {
    IUser create(String firstName, String lastName, String email);
}
