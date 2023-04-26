package br.com.ramon.TarefaMod15;

public class Demo {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("A", false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.criar(cliente.getNotaSoliciata());
        carro.LigarOCarro();
    }

    private static Fabrica getFabrica(Cliente cliente) {
        if (cliente.contratosDaEmpresa()) {
            return new ContratosDaFabrica();
        } else {
            return new SemContratosDaFabrica();
        }
    }
}
