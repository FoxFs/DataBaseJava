import java.util.Scanner;

class banco{
  int saldo;

  public void adicionar() {
    Scanner Value = new Scanner(System.in);
    System.out.print("Quanto vocÊ quer adicionar?: ");
    int valor = Value.nextInt();
    saldo = saldo + valor;
    Value.close();
  }

  public void sacar() {
    
  }
  
}

public class Main{
  public static void main(String[] args){
    
  }
}