package Business;
import java.util.Scanner;
import Dominio.Quarto;

public class GerarQuartos {
    private static Scanner input = new Scanner(System.in);

    private final static int NUMERO_QUARTOS = 3;

     public static void inicializaQuartos(Quarto[] quartos)
     {
         int i;
         double preco;

         for (i = 0; i < NUMERO_QUARTOS; i++)
         {
             System.out.println("preço do quarto " + i);
             preco = input.nextDouble();
             //quartos[i].setPreco(preco);
         }
     }

     public static void imprimirQuartos(Quarto[] quartos)
     {
         int i;
         double area, preco;
         boolean ocupado;


         System.out.println("==========Quartos==========");
         for(i=0; i<NUMERO_QUARTOS; i++)
         {
             area = quartos[i].getArea();
             preco = quartos[i].getPreco();
             ocupado = quartos[i].getOcupado();

             System.out.println("quarto " +(i+1));
             System.out.println("area " +area);
             System.out.println("preco "+preco);
             System.out.println("ocupado " +ocupado);
         }
     }
}
