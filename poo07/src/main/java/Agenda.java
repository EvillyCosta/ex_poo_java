public class Agenda {
    private String data;
    private String hora;

    public Agenda() {}

    Agenda(String data, String hora) throws Exception {
        setData(data);
        setHora(hora);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) throws Exception {
        if(hora == null || hora.isEmpty()){
            throw new Exception("hora não pode maior que 24 ou menor que 0");
        } else {
            this.hora = hora;
        }
    }

    public void consultar() {
        System.out.println("Consultando agenda para a data: " + getData() + " e hora: " + getHora());
    }

    public void mostrar(){
        System.out.println("AGENDA>>>");
        System.out.println("data:"+ getData());
        System.out.println("hora:"+ getHora());
    }

}
