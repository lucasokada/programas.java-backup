package Dominio;

public class Quarto {
    private double area = 50;
    private double preco;
    private boolean ocupado = false;
    private Inquilino inquilino;

    public double getArea() {return area;}

    public void setPreco(double preco) {this.preco = preco;}
    public double getPreco() {return preco;}

    public boolean getOcupado() {return ocupado;}
    public void setOcupado(boolean ocupado) {this.ocupado = ocupado;}

   /* public Quarto(boolean ocupado)
    {
        this.ocupado = ocupado;
    }*/
}
