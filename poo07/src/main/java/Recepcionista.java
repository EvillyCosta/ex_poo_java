
public class Recepcionista extends Funcionario { //virar herança de funcionario
    private String cpf;

    public Recepcionista(long codigo, String nome, String telefone, String senha, String cpf) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrar(){
        System.out.println("RECEPCIONISTA>>>");
        super.mostrar();
        System.out.println("cpf:"+ getCpf());
    }

    @Override //dinamico - vem de funcionario
    public void acessar() {
        System.out.println("Recepcionista com o nome " + getNome() + " acessando o sistema...\n");
    }

    public void cadastrar() throws Exception { //associação cadastrar com paciente
        Paciente obj = new Paciente(1,"maria","345435","4555-3455","F",30);
        obj.mostrar();
    }

    public void marcar() throws Exception { //associação marcar com consulta
        Consulta obj = new Consulta("consulta clinico","2h", "tosse", "catarro no peito");
        obj.mostrar();
    }



}
