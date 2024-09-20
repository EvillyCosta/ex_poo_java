public class Medico extends Funcionario {  //virar herança de funcionario
    private String crm;
    private String especialidade;

    public Medico(int codigo, String nome, String telefone, String senha, String crm, String especialidade) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    } // exemplo 1 de construtor

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void mostrar(){
        System.out.println("MEDICO>>>");
        super.mostrar();
        System.out.println("crm:"+ getCrm());
        System.out.println("especialidade:"+ getEspecialidade());
    }

    @Override //dinamico - vem de funcionario
    public void acessar() {
        System.out.println("Medico com o nome " + getNome() + " acessando o sistema...");
    }

    public void receitar(Consulta obj) throws Exception { //associação com receita
        Receita novaReceita = new Receita("12/01/2022", "clinico", 12, "dores nas costas");
        obj.getReceitas().add(novaReceita);
    }

    public void preescrever(Consulta obj) throws Exception { //associação com exame
        Exame novoExame = new Exame("04/05/2020","teste",3, "Raio x torax");
        obj.getExames().add(novoExame);
    }

}
