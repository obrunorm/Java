package email;

public class Pessoa {

    public Pessoa(String s) {

    }

    public static boolean emailValid(String email){
        return email.contains("@") && email.length() <= 50;
    }

}