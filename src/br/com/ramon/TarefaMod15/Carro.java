package br.com.ramon.TarefaMod15;

public abstract class Carro {

    private int potencia;
    private String combustivel;
    private String cor;

    public Carro(int potencia, String combustivel, String cor) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.cor = cor;
    }
    public void LigarOCarro() {
        System.out.println(getClass().getSimpleName());
        System.out.println("O motor foi ligado e está pronto para utilizar " + potencia + " potência.n");
    }
    public void clean() {
        System.out.println("O carro foi limpo, e o " + cor.toLowerCase() + " é brilhante");
    }
    public void chequeMecanico() {
        System.out.println("O carro foi verificado pelo meânico. O carro está em um estado bom");
    }

    public void combustivel() {
        System.out.println("O carro está sendo abastecido com " + combustivel.toLowerCase());
    }
}
