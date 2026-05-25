package src;

//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Escala {
    
    private Funcionario funcionario;
    private int horario;
    private String folga;
    

    public Escala(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Escala(Funcionario funcionario, int horario, String folga) {
        this.funcionario = funcionario;
        this.horario = horario;
        this.folga = folga;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getFolga() {
        return folga;
    }

    public void setFolga(String folga) {
        this.folga = folga;
    }

    public String cadastroEscala(){
        Scanner scan = new Scanner(System.in);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite a hora no formato HH:mm (Ex.: 12:30)");
        //try {
            System.out.print("Horário de entrada: ");
            String entrada = scan.nextLine();

            System.out.print("Horário de saída: ");
            String saida = scan.nextLine();

            System.out.print("Intervalo: ");
            String intervaloE = scan.nextLine();
            System.out.println(" as ");
            String intervaloS = scan.nextLine();
            
            //LocalTime hora1 = LocalTime.parse(entrada, formatter);
            //LocalTime hora2 = LocalTime.parse(saida, formatter);
            //LocalTime hora3 = LocalTime.parse(intervaloE, formatter);
            //LocalTime hora4 = LocalTime.parse(intervaloS, formatter);

        //} catch (DateTimeParseException e) {
            //System.out.println("Formato de horário inválido! Use o padrão.");
        //}
        scan.close();
        return "Horário de entrada: " + entrada + "\nHorário de saída: " + saida + "\nIntervalo das " + intervaloE + " as " + intervaloS;
    }
    
}
