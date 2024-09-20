public abstract class Funcionario {
    private long codigo;
    private String nome;
    private String telefone;
    private String senha;

    public  Funcionario(){}

    Funcionario (long codigo, String nome, String telefone, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) throws Exception {
        if(codigo<=0){
            throw new Exception("codigo não pode ser menor ou igual a zero");
        } else {
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length()<=6){
            throw new Exception("nome não pode ser menor ou igual a 6 caracteres!");
        } else {
            this.nome = nome;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return "******";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar() {
        System.out.println("Funcionário acessando o sistema.");
    }

    public void mostrar() {
        System.out.println("Funcionario>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
    }
}
