import java.util.Scanner;

public class CriarConta {
    public static void main(String[] args) {

        //Pedir se tem uma conta
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tu possui uma conta? (S/N)");
        String Criar = scanner.nextLine();
        if (Criar.equals("s") || Criar.equals("S")) {
            System.out.println("Conta não criada");
        }
        // Pedir para criar uma conta
        else if (Criar.equals("N") || Criar.equals("n")) {
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
        }
    }
}
}
}
}
