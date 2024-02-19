package IFSP.DEOO.Dao;

import java.util.List;

import IFSP.DEOO.Model.User;

public interface UserDao {
    
    List<User> getAllUsers();

    boolean insertUser(User user);

    boolean deleteUser(User user);

    boolean uptadeUser(User oldUser, User newUser);

    boolean login(String userName, String password);

    boolean recoveryPassword(String userName, String email);
}
