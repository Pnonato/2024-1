package IFSP.DEOO.View;

import IFSP.DEOO.Dao.UserDao;
import IFSP.DEOO.Dao.UserDaoImp;
import IFSP.DEOO.Model.User;

public class App {
    
    public static void main(String[] args) {
        
        UserDao userdao = UserDaoImp.getIntance();

        User pedro = new User("PedroNonato", "pedro.marrara.nonato@gmail.com", "pedro123");
        User leo = new User("Leonardo", "leo.leo@hotmail.com", "leo123");
        User git = new User("github", "githubemail", "senha");

        boolean addUserPedro = userdao.insertUser(pedro);
        boolean addUserLeo = userdao.insertUser(leo);

        System.out.println("Insert Pedro: " + (addUserPedro ? "OK" : "ERROR"));
        System.out.println("Insert leo: " + (addUserLeo ? "OK" : "ERROR"));

        boolean recoveryPasswordResult = userdao.recoveryPassword("PedroNonato", "pedro.marrara.nonato@gmail.com");
        System.out.println("Recovery Password: " + (recoveryPasswordResult ? "OK" : "ERROR"));

        Boolean loginResult = userdao.login("Leonardo", "leo123");
        System.out.println("Login Result: " + (loginResult ? "OK" : "ERROR"));

        //ERROS

        boolean recoveryPasswordWrong = userdao.recoveryPassword("pedrasd", "pedro!sdasdl.com");
        System.out.println("Recovery Password Wrong: " + (recoveryPasswordWrong ? "OK" : "ERROR"));

        boolean wrongLogin = userdao.login("leoonardo", "leo1234");
        System.out.println("Login Wrong Results: " + (wrongLogin ? "OK" : "ERROR"));

    }
}
