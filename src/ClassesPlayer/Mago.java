package ClassesPlayer;


import java.util.Scanner;

public class Mago {
    private String nome;
    protected String especialidade;
    protected int forca = 70;
    protected int inteligencia = 200;
    protected int vida = 100;
    protected int destreza = 20;

        //Construtor para poder criar uma nova instancia do Mago
    public Mago(String nomePlayer) {
            Scanner sc = new Scanner(System.in);
            this.nome = nomePlayer;
            int escolha;
            do {
                
                System.out.println(String.format("\nSelecione o elemento do mago %s:\n", nomePlayer));
                System.out.println("1. Fogo");
                System.out.println("2. Água");
                System.out.println("3. Terra");
                System.out.println("4. Ar");
    
                escolha = sc.nextInt();
    
                
                switch (escolha) {
                    case 1:
                        this.especialidade = "Fogo";
                        break;
                    case 2:
                        this.especialidade = "Água";
                        break;
                    case 3:
                        this.especialidade = "Terra";
                        break;
                    case 4:
                        this.especialidade = "Ar";
                        break;
                
                    default:
                        System.out.println("Escolha uma classe valida!\n");
                        break;
                }
            } while (escolha >= 4);

            System.out.println("\nSeus atributos atuais:");
            System.out.println("\nNome: " + nome);
            System.out.println("Elemento: " + especialidade);
            System.out.println("Força: " + forca);
            System.out.println("Inteligencia: " + inteligencia);
            System.out.println("Vida: " + vida);
            System.out.println("Destreza: " + destreza);

            sc.close();
        }

        //criar habilidades (metodos)
    
        // Metodo que mostra os Status do
    public void imprimirStatus() {
        System.out.println("\nNome: " + nome);
        System.out.println("Elemento: " + especialidade);
        System.out.println("Força: " + forca);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Vidas: " + vida);
        System.out.println("Destreza: " + destreza);
    }
    
}
