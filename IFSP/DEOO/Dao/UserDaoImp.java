package IFSP.DEOO.Dao;

import java.util.ArrayList;
import java.util.List;

import IFSP.DEOO.Model.User;

public class UserDaoImp implements UserDao{

    private static UserDaoImp instance;
    private List<User> users;

    private UserDaoImp(){
        users = new ArrayList<>();
    }


    public static synchronized UserDaoImp getIntance(){
        
            if (instance == null) {
                instance = new UserDaoImp();
            }

            return instance;
    }
   
    private boolean validadeUser(User user){

        for (User u : users) {
            if (u.getUserEmail().equals(user.getUserEmail()) || u.getUserName().equals(user.getUserName())) {
                return false;
            }
        }

        return true;
    }
   

    private boolean validateLogin(String userName, String passWord){
        for (User u : users) {
            if(userName.equals(u.getUserName()) && passWord.equals(u.getUsserPassword())){
                return true;
            }
        }

        return false;
    }


    private boolean validatePassword(String userName, String email){
        for (User u : users) {
            if (userName.equals(u.getUserName()) && email.equals(u.getUserEmail())) {
                return true;
            }
        }

        return false;
    }
   
    
    @Override
    public boolean deleteUser(User user) {
        return users.remove(user);
    }
   
   
    @Override
    public List<User> getAllUsers() {
        return users;
    }
   
   
    @Override
    public boolean insertUser(User user) {

        if(validadeUser(user)){
            user.setUserId(users.size() + 1);
            if(users.add(user)){
                return true;
            }
        }

        return false;
    }



    @Override
    public boolean login(String userName, String password) {
        if (validateLogin(userName, password)) {
            return true;
        }
        return false;
    }
    
    
    @Override
    public boolean uptadeUser(User oldUser, User newUser) {

        int index = users.indexOf(oldUser); // percorre a lista ate achar a posição de oldUser e retorena ela para index
        if (index != -1) {
            users.set(index, newUser);
        }

        return false;
    }


    @Override
    public boolean recoveryPassword(String userName, String email) {
       
       if (validatePassword(userName, email)) {
        return true;
       }
       
        return false;
    }



    
}
