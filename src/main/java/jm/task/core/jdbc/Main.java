package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (UserService table = new UserServiceImpl()) {
            table.createUsersTable();
            table.saveUser("Daniel", "Aviidow", (byte) 18);
            table.saveUser("Stan", "Ford", (byte) 55);
            table.saveUser("Stella", "Forger", (byte) 29);
            table.saveUser("Harry", "Lobster", (byte) 37);
            List<User> users = table.getAllUsers();
            users.forEach(System.out::println);
            table.cleanUsersTable();
            table.dropUsersTable();
        } catch (Exception e) {
            // ignore
        }
    }
}
