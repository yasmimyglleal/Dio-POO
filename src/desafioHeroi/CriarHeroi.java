package desafioHeroi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public class CriarHeroi {
            public static void main(String[] args) {2

                Scanner scan = new Scanner(System.in);
                List<Heroi> herois = new ArrayList<>();

                System.out.print("Quantos heróis deseja criar? ");
                int quantidadeHerois = scan.nextInt();
                scan.nextLine(); // Limpa o buffer do scan

                // Loop para criar a quantidade de heróis desejada
                for (int i = 0; i < quantidadeHerois; i++) {
                    System.out.println("\nCriando herói " + (i + 1) + ":");

                    System.out.print("Digite o nome do herói: ");
                    String nome = scan.nextLine();

                    System.out.print("Digite a idade do herói: ");
                    int idade = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer do scan

                    System.out.print("Digite o tipo do herói (mago, guerreiro, monge, ninja): ");
                    String tipo = scan.nextLine();

                    // Cria uma nova instância de Heroi
                    Heroi heroi = new Heroi(tipo, idade, nome);
                    herois.add(heroi);
                }

                // Exibe as informações de cada herói e realiza o ataque
                System.out.println("\n--- Heróis Criados ---");
                for (Heroi heroi : herois) {
                    heroi.mostrarInformacoes(); // Chama o método mostrarInformacoes
                    heroi.atacar();              // Chama o método atacar
                    System.out.println(); // Linha em branco para separar as informações
                }

                scan.close();
            }
        }
