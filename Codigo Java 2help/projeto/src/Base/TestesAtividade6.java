package Base;

public class TestesAtividade6 {
    public static void main(String[] args){
        Profissional profissional1 = new Profissional("Antonio","999.999.999.99,",
                "alkds@gmail.com","999999999","Programador Backend");

        System.out.println("Dados do Profissional: "+ profissional1 + "\n\n");

        Cliente cliente = new Cliente("Aline","888.111.222-44","aline@hotmail.com","999999999");

        System.out.println("Dados do cliente: " + cliente);


    }
}
