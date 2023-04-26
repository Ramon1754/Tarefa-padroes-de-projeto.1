package br.com.ramon.TarefaMod15;

public class SemContratosDaFabrica extends Fabrica{


    @Override
    Carro recuperarCarro(String notaSolicitada) {
        if ("A".equals((notaSolicitada))) {
            return new Siena(100,"gasolina", "azul");
        } else {
            if ("B".equals(notaSolicitada)) {
                return new Fiorino(115, "gasolina", "branco");
            } return null;
        }
    }
}
