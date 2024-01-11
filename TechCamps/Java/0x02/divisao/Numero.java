public class Numero {
    public static void dividir(int a, int b){
        try{
            int result = a/b;
        }catch(java.lang.Exception e){
            System.out.println("Nao eh possivel dividir por zero");
        }finally{
            if(b == 0)
                System.out.println(a + " / " + b + " = 0");
            else
                System.out.println(a + " / " + b + " = " + (a/b) );
        }
    }
}