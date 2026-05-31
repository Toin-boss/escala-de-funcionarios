package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        Escala escala = new Escala(funcionario);

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaEscala = new ArrayList<>();
        System.out.println("---- Escala de Funcionário ----");
        System.out.println("1 - Adicionar \n2 - Alterar");
        
        int choose1 = scanner.nextInt();

        String a;
        String b;
        String stop;
        //int i = 0;
        a = scanner.nextLine();
        boolean x = true;
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
                   
                     
                    escala.cadastroEscalaV();

                    String cadastro = funcionario.getNome() + " " + funcionario.getCargo() + " " + escala.cadastroEscalaR();

                    listaEscala.add(cadastro);
                   
                    System.out.print("Quer parar o cadastro (s/n): ");
                    
                    stop = scanner.next();

                    if (stop.equalsIgnoreCase("s")) {
                        x = false;
                        break;
                    } else if (stop.equalsIgnoreCase("n")) {
                        //i++;
                        System.out.println("Paramos aqui");
                    } else {
                        System.out.println("Opção inválida!!");
                    }

                    
                } while (x);
            
                
                break;
            
            case 2:
                System.out.println(listaEscala);
                System.out.println("\nEscolha o número do registro para alterar");

                int o = scanner.nextInt();

                for (int index = 0; index < listaEscala.size(); index++) {
                    if (index == o){
                        System.out.println(listaEscala.get(index));
                        System.out.println("Deseja mudar o valor de qual coluna?");

                        int collum = scanner.nextInt();

                        switch (collum) {
                            case 1:
                                System.out.println("Adicione");
                                a = scanner.nextLine();
                                listaEscala.set(index, a + funcionario.getCargo() + escala.cadastroEscalaR());
                                break;
                            
                            case 2:
                                System.out.println("Adicione");
                                b = scanner.nextLine();
                                listaEscala.set(index, funcionario.getNome() + b + escala.cadastroEscalaR());
                                break;

                            case 3:
                                System.out.println("Adicione");
                                escala.cadastroEscalaV();
                                listaEscala.set(index, funcionario.getNome() + funcionario.getCargo() + escala.cadastroEscalaR());
                                break;

                            default:
                                System.out.println("Essa coluna é inválida!");
                                break;
                        }
                    }
                }

                break;

            default:
                break;
        }
        System.out.println(listaEscala);
        scanner.close();
    }
}
