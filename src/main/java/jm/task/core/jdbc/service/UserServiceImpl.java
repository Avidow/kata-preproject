package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    public void createUsersTable() {
        new UserDaoJDBCImpl().createUsersTable();
    }

    public void dropUsersTable() {
        new UserDaoJDBCImpl().dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        new UserDaoJDBCImpl().saveUser(name, lastName, age);
        System.out.println(String.format("User с именем - %s добавлен в базу данных", name));
    }

    public void removeUserById(long id) {
        new UserDaoJDBCImpl().removeUserById(id);
    }

    public List<User> getAllUsers() {
        return new UserDaoJDBCImpl().getAllUsers();
    }

    public void cleanUsersTable() {
        new UserDaoJDBCImpl().cleanUsersTable();
    }
}
