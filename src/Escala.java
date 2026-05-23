package src;

public class Escala {
    
    private Funcionario funcionario;
    private int horario;
    private String folga;
    

    public Escala() {
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

    
    
}
