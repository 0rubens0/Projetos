import java.util.Scanner;

public class calendario {
public static void main(String[] args) {
    // perguntar se quer um calendario
    
    Scanner calendario = new Scanner(System.in);
    System.out.println("Quer um calendario? (S/N)");
    String calendario1 = calendario.nextLine();
    if (calendario1.equals("S") || calendario1.equals("s")) {
        System.out.println("criado Calendario ");
        // perguntar se quer criar um evento
        System.out.println("Quer criar um evento? (S/N): ");
        Scanner eventos = new Scanner(System.in);
        String eventos1 = eventos.nextLine();
        //rejeiçao do evento
        if (eventos1.equals("N") || eventos1.equals("n")) {
            System.out.println("Dia: ");
            Scanner calendario2 = new Scanner(System.in);
            int dia = calendario2.nextInt();//
            try {
                Thread.sleep(1000); // atraso de 1 segundo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // vendo se o dia for menor doque 32
            while(dia < 32) {
                System.out.println("Mes: ");
                Scanner calendario3 = new Scanner(System.in);
                int mes = calendario3.nextInt();
                // vendo se o mes for menor do que 13
                while (mes < 13) {
                    //pedindo o ano
                System.out.println("Ano: ");
                Scanner anoEvento = new Scanner(System.in);
                int ano = anoEvento.nextInt();

                calendario3.close();
                anoEvento.close();
                calendario.close();
                calendario2.close();
                System.out.println("Dia "+ dia+ " e o Mes "+ mes + " e o Ano "+ ano);
                break;
            }
        }
        // aceitaçao do evento
        }else if (eventos1.equals("S") || eventos1.equals("s")) {
            System.out.println("criado evento ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // perguntado o nome do evento atual
            System.out.println("Nome do evento: ");
            Scanner eventoC = new Scanner(System.in);
            String eventoA = eventoC.nextLine();
            // pedindo o dia
            System.out.println("Dia do evento: ");
            Scanner diaevento = new Scanner(System.in);
            int diaV = diaevento.nextInt();
            // vendo se o dia for menor doque 32
            while (diaV < 32) {
                System.out.println("Mes do evento: ");
                Scanner mesV = new Scanner(System.in);
                int mesC = mesV.nextInt();
                // vendo se o mes for menor do que 13
                while (mesC < 13) {
                    // pedidno o ano
                    System.out.println("Ano do evento: ");
                    Scanner anoEvento = new Scanner(System.in);
                    int ano = anoEvento.nextInt();
                diaevento.close();
                mesV.close();
                anoEvento.close();
                eventoC.close();
                eventos.close();
                char seta = 26;
                System.out.println("día /"+ diaV+ "/ Més /"+ mesC + "/ Ano /"+ ano + "/ terá o evento "+ seta + ' ' +eventoA);
                break;
}}}}}}
