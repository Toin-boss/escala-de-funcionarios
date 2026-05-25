package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        Escala escala = new Escala(funcionario);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> listaEscala = new ArrayList<>();
        System.out.println("---- Escala de Funcionário ----");
        System.out.println("1 - Adicionar \n2 - Alterar");
        
        int choose1 = scanner.nextInt();
        String a;
        String b;
        String stop;
        int i = 0;

        boolean x = false;
        switch (choose1) {
            case 1:
                System.out.println("Preencha os campos:");
                do {
                    System.out.print("Nome:");
                    a = scanner.nextLine();
                    funcionario.setNome(a);
                    System.out.print("Cargo:");
                    b = scanner.nextLine();
                    funcionario.setCargo(b);
                    
                    String cadastro = funcionario.getNome() + funcionario.getCargo() + escala.cadastroEscala();

                    listaEscala.add(i, cadastro);

                    System.out.print("Quer parar o cadastro (s/n): ");
                    stop = scanner.next();
                    if (stop == "s") {
                        x = true;
                        i++;
                    }

                } while (x =! true);
            
                
                break;
            
            case 2:

                break;

            default:
                break;
        }
        System.out.println(listaEscala);
        scanner.close();
    }
}
