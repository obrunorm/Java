public class Retangulo extends FormaGeometrica {

    //Variaveis
    protected double largura;
    protected double altura;

    //Metodos
    @Override
    public double area(){
        return altura * largura;
    }

    public String toString(){
        return "[Retangulo] " + String.format("%.2f", largura) + " / " + String.format("%.2f", altura) ;
    }

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
