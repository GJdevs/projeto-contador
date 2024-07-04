import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
      try{  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro parametro: ");
        int paramentroUm = scanner.nextInt();
        System.out.println("Digite o valor do segundo paramentro: ");
        int parametroDois = scanner.nextInt();

        contar(paramentroUm, parametroDois);
      }
      catch(ParametrosInvalidosException e){
        System.out.println("O segundo parametro deve ser maior que o primeiro");
      }

    }
    public static void contar(int paramentroUm, int parametroDois) throws ParametrosInvalidosException{
        if(paramentroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo paramentro deve ser maior que o segundo");

        }
        int contagem = parametroDois - paramentroUm;
        for(int i = 0; i<= contagem;i++){
            System.out.println(paramentroUm + i);
        }
    }
}
