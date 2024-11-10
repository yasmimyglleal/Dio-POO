package desafioHeroi;

public class Heroi {
    public String nome;
    public Integer idade;
    public String tipo;

    public Heroi(String tipo, Integer idade, String nome) {
        this.tipo = tipo;
        this.idade = idade;
        this.nome = nome;
    }

    // Método para exibir as informações do herói
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo: " + tipo);
    }

    // Método para exibir o ataque baseado no tipo
    public void atacar() {
        String ataque;

        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "atacou de uma forma desconhecida";
                break;
        }

        System.out.println("O " + tipo + " atacou usando " + ataque);
    }
}
