public class Carro {

    private String placa;
    private String marca;
    private int idVagaAtual;
    private Taxa_Pagamento conta;

    public Carro(String placa, String marca, int idVagaAtual) {
        this.placa = placa;
        this.marca = marca;
        this.idVagaAtual = idVagaAtual;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa='" + placa + '\'' + ", marca='" + marca + '\'' + ", idVagaAtual=" + idVagaAtual + '}';
    }
}
