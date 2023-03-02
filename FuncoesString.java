public class FuncoesString {
       public static void main (String [] args){
      String mensagem = "Aprendendo Java - Aula 4";
      String mensagem1 = "Aula de Java";
        int tamanho = mensagem.length();
        System.out.println("String :" +mensagem);
        System.out.println("Tamanho da String :" +tamanho);
        System.out.println("Caracter :" +mensagem.charAt(5));
        for(int indice = 10; indice<=14; indice++)   {
            System.out.println(mensagem.charAt(indice));
            System.out.println("do 3o caracter até o fim" +mensagem.substring(2));
            System.out.println("do 1o caracter até o 10o caracter" +mensagem.substring(0,10));
            System.out.println("do 11o caracter até o 24o" +mensagem.substring(11,24));
            System.out.println();
            System.out.println("String com espaço " + "*" +mensagem1 + "*");
            System.out.println("String sem espaço " + "*" +mensagem1.trim() + "*");
            System.out.println();
            System.out.println ("Troca de caracter 'a' por 'u': " +mensagem1.replace('a', 'u'));
            System.out.println ("Troca de caracter 'v' por 'V': " +mensagem1.replace('v', 'V'));
            System.out.println();
            System.out.println ("Tudo em maiusculo: "+mensagem1.toUpperCase());
            System.out.println ("Tudo em minusculo: "+mensagem1.toLowerCase());
            System.out.println();
} } }