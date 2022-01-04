package service;

import model.User;

public class UserCreation {
    public static final String USER_NAME = "testData.userLogin";
    public static final String USER_PASSWORD = "testData.userPassword";

    public static User withCredentialFromProperty() {
        return new User(TestDataReader.getTestData(USER_NAME), TestDataReader.getTestData(USER_PASSWORD));
    }

    public static User withEmptyUsername() {
        return new User("", TestDataReader.getTestData(USER_PASSWORD));
    }

    public static User withEmptyUserPassword() {
        return new User(TestDataReader.getTestData(USER_NAME), "");
    }
}
