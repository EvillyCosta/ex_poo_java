public class Receita extends Procedimento{  //mudar para herança de procedimento

    private int codigo;
    private String consulta;

    public Receita(String data, String descritivo, int codigo, String consulta) throws Exception {
        setData(data);
        setDescritivo(descritivo);
        setCodigo(codigo);
        setConsulta(consulta);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws Exception {
        if(codigo<=0){
            throw new Exception("Informe o codigo da receita corretamente!");
        } else {
            this.codigo = codigo;
        }
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }


    public void mostrar(){
        System.out.println("RECEITA>>>");
        super.mostrar();
        System.out.println("codigo:"+ getCodigo());
        System.out.println("consulta:"+ getConsulta());
    }

    @Override //dinamico - sobrepoe consultar de procedimento
    public void consultar() { //dinamico - vem de procedimento
        System.out.println("Consultando receita com descritivo" + getDescritivo());
    }

}
