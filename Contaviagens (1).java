import java.util.Scanner;

public class ContaViagens{ 
     public static void main (String[] args){
    float x, y;
     Scanner LerObjeto = new Scanner(System.in);
     System.out.println("Qual a capacidade do elevador em kg: ");
     x=LerObjeto.nextFloat();
     System.out.println("Qual a quantidade de areia em kg: ");
     y = LerObjeto.nextFloat();
      System.out.println("O elevador terá que fazer " + x/y + " viagens.");
 }

}