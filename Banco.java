import java.util.Scanner;

class Banco{
  int saldo;
  Scanner Value = new Scanner(System.in);

  public void adicionar() {
    System.out.print("Quanto vocÊ quer adicionar?: ");
    int valor = Value.nextInt();
    saldo = saldo + valor;
    Value.close();
  }

  public void sacar() {
    System.out.print("Digite o quanto você quer sacar: ");
    int valor1 = Value.nextInt();
    saldo = saldo - valor1;
    Value.close();
    System.out.print("Valor adicionado");
  }
  
}

public class Main{
  public static void main(String[] args){
    
  }
}
