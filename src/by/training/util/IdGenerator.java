package by.training.util;

public class IdGenerator {
    private static long id = 0;

    private static long registrationNumber = 0;

    public static long getId() {
        return id++;
    }

    public static long getRegistrationNumber() {
        return registrationNumber++;
    }
}
