public class Caractere {
    public static boolean EhMaiusculo(char c){
        if((int) c >= 97 && (int) c <= 122)
            return false;
        else
            return true;
    }
}