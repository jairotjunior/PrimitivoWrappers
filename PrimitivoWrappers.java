package Java.Tarefa_wrappers;

import java.util.Scanner;

public class PrimitivoWrappers{

  public static void main(String[] args) {
    conversao();
  }

  public static void conversao(){

    Scanner ler = new Scanner(System.in);
    int valorPrimitivo;

    System.out.printf("Digite um número: ");
    valorPrimitivo = ler.nextInt();
    ler.close();

    Integer variavelWrapper = valorPrimitivo; 
    System.out.println("Variavel do tipo Wrapper " + variavelWrapper);
  } 
}