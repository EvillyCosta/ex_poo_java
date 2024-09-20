import java.util.ArrayList;
import java.util.List;

public class Consulta extends Agenda {  //virar herança de agenda
    private String motivo;
    private String historico;
    private Paciente paciente; //agregação com paciente
    private Medico medico; //agregação com medico
    private List<Receita> receitas; //agregação com receita
    private List<Exame> exames; //agregação com exame


    Consulta(String data, String hora, String motivo, String historico) throws Exception {
        setData(data);
        setHora(hora);
        setMotivo(motivo);
        setHistorico(historico);
        setReceitas(new ArrayList<>());
        setExames(new ArrayList<>());
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    //marcar sem parametros
    public void marcar() {
        System.out.println("Consulta marcada sem detalhes.");
    }

    //estatico - marcar com parametros
    public void marcar(String data, String hora) {
        System.out.println("Consulta marcada para a data: " + data + " e hora: " + hora);
    }

    @Override //dinamico - vem de agenda que é classe pai
    public void consultar() {
        System.out.println("Consultando detalhes da consulta com o motivo: " + getMotivo());
        System.out.println("Data: " + getData() + ", Hora: " + getHora());
    }

    public void cancelar() {
        //TODO
    }

    public void realizar() {
        //TODO
    }

    public void atualizar() {
        //TODO
    }

    public void mostrar() {
        System.out.println("CONSULTA>>>");
        System.out.println("data:" + getData());
        System.out.println("hora:" + getHora());
        if (getMedico() != null) {
            getMedico().mostrar();
        } else {
            System.out.println("Médico não informado.");
        } //mostrar agregação

        if (getPaciente() != null) {
            getPaciente().mostrar();
        } else {
            System.out.println("Paciente não informado.");
        }//mostrar agregação

        if (getReceitas() != null) {
            for (Receita obj : getReceitas()) {
                obj.mostrar();
            }//mostrar agregação
        }

        if (getExames() != null) {
            for (Exame obj : getExames()) {
                obj.mostrar();
            }//mostrar agregação
        }
    }
}

