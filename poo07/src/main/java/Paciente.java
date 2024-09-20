public class Paciente {
    private long codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;


    public Paciente() {}

    public Paciente(int codigo, String nome, String cpf, String telefone, String genero, int idade) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if(cpf.length() <=0) {
            throw new Exception("cpf nao pode estar vazio!!!");
        } else {
            this.cpf = cpf;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {  //exemplo de throws exception
        if(idade <= 0){
            throw new Exception("informe uma idade valida!");
        } else {
            this.idade = idade;
        }
    }

    public void cadastrar(){
        //TODO
    }

    public void consultar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("PACIENTE>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("cpf:"+ getCpf());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("genero:"+ getGenero());
        System.out.println("idade:"+ getIdade());
    }
}
