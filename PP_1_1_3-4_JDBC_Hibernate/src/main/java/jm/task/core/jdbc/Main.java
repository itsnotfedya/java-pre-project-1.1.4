package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Walter", "White", (byte) 52);
        userDao.saveUser("Jesse", "Pinkman", (byte) 26);
        userDao.saveUser("Mike", "Ehrmantraut", (byte) 69);
        userDao.saveUser("Saul", "Goodman", (byte) 50);
        userDao.removeUserById(1);
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
