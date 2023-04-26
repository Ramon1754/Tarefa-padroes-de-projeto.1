package br.com.ramon.TarefaMod15;

public abstract class Fabrica {

    public Carro criar(String notaSolicitada) {
        Carro carro = recuperarCarro(notaSolicitada);
        carro = prepararCarro(carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro){
        carro.clean();
        carro.chequeMecanico();
        carro.combustivel();
        return carro;
    }
    abstract Carro recuperarCarro(String notaSolicitada);
}
