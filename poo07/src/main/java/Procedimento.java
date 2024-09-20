public abstract class Procedimento {
    private String data;
    private String descritivo;

    public Procedimento() {}

    public Procedimento(String data, String descritivo) {
        setData(data);
        setDescritivo(descritivo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void consultar() {
        System.out.println("Consultando procedimento sem parâmetros.");
    }

    public void mostrar () {
        System.out.println("Detalhes de Procedimento>>>");
        System.out.println("Data: " + getData());
        System.out.println("Descritivo: " + getDescritivo());
    }

}
