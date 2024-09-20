public class Exame extends Procedimento {  //mudar para herança de procedimento

    private int codigo;
    private String consulta;


    public Exame(String data, String descritivo, int codigo, String consulta) throws Exception {
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
            throw new Exception("informe o codigo do exame corretamente!");
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
        System.out.println("EXAME>>>");
        super.mostrar();
        System.out.println("codigo:"+ getCodigo());
        System.out.println("consulta:"+ getConsulta());
    }

    @Override //sobrepoe consultar em procedimento
    public void consultar() { //dinamico - vem de procedimento
        System.out.println("Consultando exame com descritivo " + getDescritivo());
    }
}
