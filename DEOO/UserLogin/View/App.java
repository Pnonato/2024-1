package IFSP.DEOO.View;

import java.util.Scanner;

import IFSP.DEOO.Dao.UserDao;
import IFSP.DEOO.Dao.UserDaoImp;
import IFSP.DEOO.Model.User;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        UserDao userdao = UserDaoImp.getIntance();

        // User pedro = new User("PedroNonato", "pedro.marrara.nonato@gmail.com", "pedro123");
        // User leo = new User("Leonardo", "leo.leo@hotmail.com", "leo123");

        // boolean addUserPedro = userdao.insertUser(pedro);
        // boolean addUserLeo = userdao.insertUser(leo);

        // System.out.println("Insert Pedro: " + (addUserPedro ? "OK" : "ERROR"));
        // System.out.println("Insert leo: " + (addUserLeo ? "OK" : "ERROR"));

        // boolean recoveryPasswordResult = userdao.recoveryPassword("PedroNonato", "pedro.marrara.nonato@gmail.com");
        // System.out.println("Recovery Password: " + (recoveryPasswordResult ? "OK" : "ERROR"));

        // Boolean loginResult = userdao.login("Leonardo", "leo123");
        // System.out.println("Login Result: " + (loginResult ? "OK" : "ERROR"));

        // //ERROS

        // boolean recoveryPasswordWrong = userdao.recoveryPassword("pedrasd", "pedro!sdasdl.com");
        // System.out.println("Recovery Password Wrong: " + (recoveryPasswordWrong ? "OK" : "ERROR"));

        // boolean wrongLogin = userdao.login("leoonardo", "leo1234");
        // System.out.println("Login Wrong Results: " + (wrongLogin ? "OK" : "ERROR"));


        int escolha;
        String userName, userEmail, userPassword;
        do {

            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Recuperar Senha");
            System.out.println("3. Fazer Login");
            System.out.println("4. Encerrar Programa");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("## NOVO USUÁRIO ##");

                    System.out.println("Nome do usuário: ");
                    userName = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Email do usuário: ");
                    userEmail = scanner.nextLine();

                    System.out.println("Senha do usuário: ");
                    userPassword = scanner.nextLine();

                    User user = new User(userName, userEmail, userPassword);

                    boolean addUser = userdao.insertUser(user);

                    System.out.println("Insert user : " + (addUser ? "OK" : "ERROR"));

                    break;
            
                case 2:
                    System.out.println("Nome do usuário: ");
                    userName = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Email do usuário: ");
                    userEmail = scanner.nextLine();

                    boolean recoveryPassword = userdao.recoveryPassword(userName, userEmail);

                    System.out.println("Recovery Password: " + (recoveryPassword ? "OK" : "ERROR"));

                    break;


                case 3:
                    System.out.println("Nome do usuário: ");
                    userName = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Senha do usuário: ");
                    userPassword = scanner.nextLine();

                    boolean login = userdao.login(userName, userPassword);

                    System.out.println("Login Result: " + (login ? "OK" : "ERROR"));

                    break;

                case 4:
                        System.out.println("ENCERRANDO PROGRAMA....");

                        break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        } while (escolha!= 4);

    }
}
