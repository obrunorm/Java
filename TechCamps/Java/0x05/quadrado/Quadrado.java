public class Quadrado extends Retangulo {

    //Variaveis
    private double lado;

    //Metodos Get e Set
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws IllegalArgumentException{
        if (lado < 0)
           throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");

            this.lado = lado;
    }

    //Metodos
    @Override
    public double area(){
        return lado * lado;
    }

    public String toString(){
        return "[Quadrado] " + String.format("%.2f", lado);
    }

}
