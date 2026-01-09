import java.time.LocalDateTime;

public class Taxa_Pagamento {

    private LocalDateTime hEntrada;
    private LocalDateTime hSaida;
    private long tempoLimite = 15;
    private double valorHora = 10;
    double valorTotal;
    private Carro veiculo;
    private long tempoPermanencia;

    public Taxa_Pagamento(LocalDateTime hEntrada, LocalDateTime hSaida, long tempoLimite, double valorHora, double valorTotal, Carro veiculo, long tempoPermanencia) {
        this.hEntrada = hEntrada;
        this.hSaida = hSaida;
        this.tempoLimite = tempoLimite;
        this.valorHora = valorHora;
        this.valorTotal = valorTotal;
        this.veiculo = veiculo;
        this.tempoPermanencia = tempoPermanencia;
    }


}
