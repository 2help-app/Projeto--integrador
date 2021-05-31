package Base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {
    //Leitura dos campos digitados pelo usuário.
    Scanner entrada = new Scanner(System.in);
    // Lista de clientes cadastrados no sistema.
    List<Cliente> clientes = new ArrayList<>();
    // Lista de profissionais cadastrados no sistema.
    List<Profissional> profissionais = new ArrayList<>();


//Menu do programa
    public String mostrarMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Bem vindo a 2Help\n");
        sb.append("Escolha as opções a seguir.\n");
        sb.append("1 - Para Cadastrar Como Cliente ou profissional.\n");
        sb.append("2 - Para Consultar um Cliente.\n");
        sb.append("3 - Para Consultar um Profissional.\n");
        sb.append("4 - Pra consultar Profissionais e serviços prestado.\n");
        sb.append("5 - Para Consultar Um Profissional pelo serviço prestado.\n");
        sb.append("0 - Para Sair!.\n");
        System.out.println(sb.toString());
        return entrada.nextLine();
    }
    //Chamar as funcões
    public void iniciar(){
        String option = mostrarMenu();
        while(!option.equals("0")){
            switch (option){
                case "1":
                    //Cadastra um cliente ou um prestador de serviço
                    cadastrar();
                    option = mostrarMenu();
                    break;
                case "2":
                    //Para buscar um cliente cadastrado na plataforma
                    buscarCliente();
                    option = mostrarMenu();
                    break;
                case "3":
                    //Para buscar um profissional cadastrado na plataforma
                    buscarProfissional();
                    option = mostrarMenu();
                    break;
                case "4":
                    //Lista profissionais e area de atuação.
                    listaProfissionais();
                    option = mostrarMenu();
                    break;
                case "5":
                    //Procurar profissionais pelo serviço prestado
                    profissionalPorServicoPrestado();
                    option = mostrarMenu();
                    break;


            }
        }


    }

    public void cadastrar() {
        System.out.println("Informe os dados a seguir para efetuar o cadastro.");
        System.out.println("Digite 1 para cadastrar um Cliente ou 2 Para cadastrar um Profissional");
        String tipo = entrada.nextLine();
        System.out.println("Nome completo: ");
        String nome = entrada.nextLine();
        System.out.println("CPF: ");
        String cpf = entrada.nextLine();
        System.out.println("E-mail: ");
        String email = entrada.nextLine();
        System.out.println("Telefone: ");
        String telefone = entrada.nextLine();
        if(tipo.equals("1")){
            Cliente cliente = new Cliente(nome,cpf,email,telefone);
            clientes.add(cliente);

        }else if(tipo.equals("2")){
            System.out.println("Digite a area de atuação!");
            String area = entrada.nextLine();
            Profissional profissional = new Profissional(nome,cpf,email,telefone,area);
            profissionais.add(profissional);

        }else{
            System.out.println("Numero do tipo Informado não correspondente!");

        }
    }
    public void buscarCliente(){
        System.out.println("Digite o nome do cliente!");
        String nomeCliente = entrada.nextLine();
        for(int i = 0;i<clientes.size();i++){
            if(clientes.get(i).getNome().equals(nomeCliente)){
                System.out.println(clientes.get(i));
            }else{
                continue;
            }
        };
    }
    public void buscarProfissional(){
        System.out.println("Digite o nome do Profissional.");
        String nomeProfissional = entrada.nextLine();
        for(int p = 0;p<profissionais.size();p++){
            if(profissionais.get(p).getNome().equals(nomeProfissional)){
                System.out.println(profissionais.get(p));
            }else{
                continue;
            }
        }
    }
    public void listaProfissionais(){
        for(int service = 0;service<profissionais.size();service++){

            System.out.println(profissionais.get(service).getNome() + "\n Area de atuação: " +
                    profissionais.get(service).getAreaAtuacao());
        }
    }
    public void profissionalPorServicoPrestado(){
        System.out.println("Digite o nome do serviço");
        String servico = entrada.nextLine();
        for(int procurarProfissional = 0;procurarProfissional<profissionais.size();procurarProfissional++){
            if(profissionais.get(procurarProfissional).getAreaAtuacao().equals(servico)){
                System.out.println(profissionais.get(procurarProfissional));
            }else{
                continue;
            }
        }
    }
}
