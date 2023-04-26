package br.com.ramon.TarefaMod15;

public class Cliente {

    private String notaSoliciata;
    private boolean contratosDaEmpresa;

    public Cliente(String notaSoliciata, boolean contratosDaEmpresa) {
        this.notaSoliciata= notaSoliciata;
        this.contratosDaEmpresa = contratosDaEmpresa;
    }
    public boolean contratosDaEmpresa() {
        return contratosDaEmpresa;
    }
    public String getNotaSoliciata() {
        return notaSoliciata;
    }
}
