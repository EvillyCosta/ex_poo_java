import java.util.ArrayList;
import java.util.List;

public class ClinicaMain {

    public static void main(String[] args) {
            try {

                Recepcionista r1 = new Recepcionista(23, "Ana Julia", "2377-2382", "*****", "123.948.529-4");
                r1.acessar(); //poli dinamico (sobrepoe acessar de funcionario)

                Medico m1 = new Medico(1, "Dr. João", "1234-5456", "******", "273182", "cirurgião");
                m1.acessar(); //poli dinamico (sobrepoe acessar de funcionario)

                Paciente p2 = new Paciente(45, "Joãozinho", "234234", "2344-2344", "M", 40);

                Consulta c1 = new Consulta("02/05/2010", "3h", "colica", "dor na pelvis");
                c1.setMedico(m1);
                c1.setPaciente(p2);
                c1.marcar(); //marcar sem parametro
                c1.marcar("02/05/2010", "3h"); //marcar com parametro (poli estatico)
                c1.consultar(); //poli dinamico (sobrepoe consultar de agenda)

                Exame ex1 = new Exame("12/09/2010","exame de sangue",345,"02/05/2010");
                ex1.consultar();// poli dinamico (sobrepoe consultar em procedimento)

                Receita re1 = new Receita("30/09/2010", "dipirona - tomar 2h em 2h horas", 234, "02/05/2010");
                re1.consultar(); //poli dinamico (sobrepoe consultar em procedimento)

                List<Receita> receitas = new ArrayList<>(); //adicionando receita e exame criado no main
                receitas.add(re1);
                List<Exame> exames = new ArrayList<>();
                exames.add(ex1);
                c1.setReceitas(receitas);
                c1.setExames(exames);
                c1.mostrar();

            }
            catch(Exception err){
                System.out.println("Ocorreu um erro = "+ err.getMessage());
            }
            finally {
                System.out.println("ACABOU>>>>>>>>");
            }

    }
}


