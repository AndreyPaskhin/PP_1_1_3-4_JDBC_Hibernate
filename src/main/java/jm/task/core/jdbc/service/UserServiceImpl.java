package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoJDBCImpl();
    private final UserDao userDaoHibernateimpl = new UserDaoHibernateImpl();
    public void createUsersTable() throws SQLException {
        userDaoHibernateimpl.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDaoHibernateimpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDaoHibernateimpl.saveUser(name, lastName, age);
        System.out.println("User с именем - " + name + " добавлен в базу данных" );
    }

    public void removeUserById(long id) throws SQLException {
        userDaoHibernateimpl.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userDaoHibernateimpl.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDaoHibernateimpl.cleanUsersTable();
    }
}
