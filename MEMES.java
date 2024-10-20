import java.net.URI;
import java.util.Scanner;

public class Zueiras {
    public static void main(String[] args) {
        //Pedir se tem uma conta
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tu possui uma conta? (S/N)");
        String Criar = scanner.nextLine();
        
        if (Criar.equals("N") || Criar.equals("n")) {
            Scanner Quer = new Scanner(System.in);
        
            System.out.println("Deseja criar uma conta? (S/N)");
            String Criar1 = Quer.nextLine();
            // processo de criar cancelado
            if (Criar1.equals("N") || Criar1.equals("n")) {
                System.out.println("Processo de criar conta cancelado");
            }
            // processo de criar
            if (Criar1.equals("S") || Criar1.equals("s")) {
            System.out.println("Começar Processo de Criar conta");

            // pedir o nome da conta
            Scanner nome = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String username = nome.nextLine();
            Scanner nome1 = new Scanner(System.in);
            System.out.println("Confirme o seu nome de usuario: ");
            String username1 = nome1.nextLine();
//m9@
            // verificando o nome de usuario
            if (username.equals(username1)) {
                System.out.println("Nome de usuario criado com sucesso");
            } 
            else {
                System.out.println("Nome de usuario invalido")
                ;}

            // pedir a senha da conta
            Scanner senha = new Scanner(System.in);
            System.out.println("Crie sua senha: ");
            String password = senha.nextLine();
            Scanner senha1 = new Scanner(System.in);
            System.out.println("Confirme sua senha: ");
            String password1 = senha1.nextLine();

            // verificando a senha
            if (password.equals(password1)) {
                System.out.println("Senha criada com sucesso");
            } else {
                System.out.println("Senha invalida");
            }

            //mostrando a conta criada
            System.out.println("Conta Criada Com Sucesso");
            Scanner querlogar = new Scanner(System.in);

            // pedindo para logar a conta
            System.out.println("Deseja logar? (S/N)");
            String logar = querlogar.nextLine();

            // se nao quiser logar
            if (logar.equals("N") || logar.equals("n")) {
                System.out.println("Conta não Logada");
            }
//lol90
            // se quiser logar
            if (logar.equals("s") || logar.equals( "S")) {
                System.out.println("Degite seu username: ");
                Scanner username2 = new Scanner(System.in);
                String usernameC = username2.nextLine();

                // verificando o username
                if (usernameC.equals(username1)) {
                    System.out.println("Digite sua senha: ");
                    Scanner senhaC = new Scanner(System.in);
                    String passwordC = senhaC.nextLine();
                    if (passwordC.equals(password1)) {
                        System.out.println("Entrando na conta");
                        System.out.println("Bem vindo " + username);
                        System.out.println("Selecione uma das opções abaixo: ");
                        System.out.println("[1] Sair | [2] Sacar | [3] Depositar | [4] Transferir");
                        Scanner operacao = new Scanner(System.in);
                        int op = operacao.nextInt();
                        switch (op) {
                            default:
                                    System.out.println("Opção Invalida");
                                    break;
                            case 1:
                                    System.out.println("Saindo da conta");
                                    break;
                            case 2:
                                    System.out.println("Saque");
                                    System.out.println("Quanto deseja sacar? (Acima de R$ 2,500,00 tem um imposto de 14%)");
                                    Scanner Sacar = new Scanner(System.in);
                                    double quantidade1 = Sacar.nextInt();
                                    if (quantidade1 <= 2500) {
                                        System.out.println("Sacando "+ quantidade1);
                                        break;
                                    }else if (quantidade1 >= 2501) {
                                        System.out.println("Você degitou um valor acima do permitido você vai ganhar um imposto de 14%");
                                        quantidade1 = quantidade1 - (quantidade1 * 0.14);
                                        System.out.println("Sacando "+ quantidade1);
                                    }
                                    break;
                            case 3:
                                    System.out.println("Deposito");
                                    System.out.println("Quanto deseja depositar? (Acima de R$ 2,500,00 tem um imposto de 18%)");
                                    Scanner Depositar = new Scanner(System.in);
                                    double quantidade = Depositar.nextInt();

                                    if (quantidade <= 2500) {
                                    System.out.println("Depositando "+ quantidade);
                                    break;
                                    }else if (quantidade >= 2501) {
                                        System.out.println("Você degitou um valor acima do permitido você vai ganhar um imposto de 18%");
                                        quantidade = quantidade - (quantidade * 0.18);
                                        System.out.println("Depositando "+ quantidade);
                                        break;
                                    }
                            case 4:
                                    System.out.println("Transferencia");
                                    System.out.println("Qual conta deseja transferir?");
                                    Scanner conta = new Scanner(System.in);
                                    String nomeoutro = conta.nextLine();
                                    System.out.println("Quanto deseja transferir?");
                                    Scanner valor = new Scanner(System.in);
                                    int valor2 = valor.nextInt();
                                    System.out.println("Transferindo "+ valor2 + " para " + nomeoutro);
                                    break;
                            }                        
                            operacao.close();
                        // se o username e a senha tiver errado mandar mensagem de erro
                    }else if (!usernameC.equals(username1)) {
                            System.out.println("Nome de usuário inválido");
                        } else if (!passwordC.equals(password1)) {
                            System.out.println("Senha inválida");
                }
else {
                System.out.println("Conta não criada");
            }
    // ignorar tags de fechamento dos Scanners
        
            Quer.close();
            scanner.close();
            nome.close();
            senha.close();
            querlogar.close();
            senha1.close();
            nome1.close();
            senhaC.close();
            username2.close();
        }
        else {
            System.out.println("Processo de criar conta cancelado");
            }
        }
    }
}


        // entrando na conta 
        if (Criar.equals("s") || Criar.equals("S")) {
            System.out.println("Ok, Quer entrar na conta? (S/N)");
            Scanner Quer2 = new Scanner(System.in);
            String Criar2 = Quer2.nextLine();
            if (Criar2.equals("S") || Criar2.equals("s")) {
                Scanner nome = new Scanner(System.in);
                System.out.println("Digite seu nome: ");
                String username = nome.nextLine();

                Scanner Senha = new Scanner(System.in);
                System.out.println("Digite sua senha: ");
                String password = Senha.nextLine();
                
                nome.close();
                Senha.close();
                Quer2.close();
                //! avisando novamente o nome tu pode olhar mas asenha não porfavor!!
                //! porfavor não olhe isto primeiro faça o enigma
                if (username.equals("programmer_time") && password.equals("S2m9@lol90")) {
                    System.out.println("!BEM VINDO AOS COMANDOS ESCONDIDOS!");
                    System.out.println("[1] Roleta | [2] Video Misterioso | [3] Site Misterioso");
                    int poderes = 4; // Seguiser usar um poder coloque esses valores (1,2,3,4)
                    switch (poderes) {
                        case 1:
                        try{
                            URI link = new URI("https://pt.piliapp.com/random/wheel/emoji-smileys/");
                            java.awt.Desktop.getDesktop().browse(link);
                        }catch(Exception erro){
                            System.out.println(erro);
                        }
                        break;
                        case 2:
                            System.out.println("Video Misterioso");
                            try{
                                URI link = new URI("https://www.youtube.com/watch?v=4oICK8karv8");
                                java.awt.Desktop.getDesktop().browse(link);
                            }catch(Exception erro){
                                System.out.println(erro);
                            }
                            break;
                        case 3:
                            System.out.println("Site Misterioso");
                            try{
                                URI link = new URI("https://github.com/0rubens0");
                                java.awt.Desktop.getDesktop().browse(link);
                            }catch(Exception erro){
                                System.out.println(erro);
                            }
                            try{
                                URI link = new URI("https://www.linkedin.com/in/rubens-golfett-83959332a/");
                                java.awt.Desktop.getDesktop().browse(link);
                            }catch(Exception erro){
                                System.out.println(erro);
                            }
                            break;
                        default:
                            System.out.println("Erro poder invalido");
                            try{
                                URI link = new URI("https://www.youtube.com/shorts/ACdOdtOviMk");
                                java.awt.Desktop.getDesktop().browse(link);
                            }catch(Exception erro){
                                System.out.println(erro);
                            }
                        }
                }
            }
        }
    }
}
