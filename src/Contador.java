import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);  
            for (parametroUm < parametroDois, parametroUm++){


            }
            


        }catch (Exception exception){

            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
        
    }
    
}
