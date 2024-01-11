public class Retangulo extends FormaGeometrica {

    //Variaveis
    private double largura;
    private double altura;

    //Metodos Get e Set
    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) throws IllegalArgumentException{
        if (largura < 0)
           throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");

            this.largura = largura;

    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException{
        if (largura < 0)
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");

            this.altura = altura;
    }
}
