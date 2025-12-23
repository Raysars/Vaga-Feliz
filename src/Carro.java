import java.time.LocalDate;

public class Carro {
//comment
    String placa;
    String modelo;
    LocalDate dataHoraEntrada;
    LocalDate dataHoraSaida;
    double valorTotal;

    public Carro(String placa, String modelo, LocalDate dataHoraEntrada, LocalDate dataHoraSaida, double valorTotal) {
        this.placa = placa;
        this.modelo = modelo;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.valorTotal = valorTotal;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public LocalDate getDataHoraSaida() {
        return dataHoraSaida;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDataHoraEntrada(LocalDate dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public void setDataHoraSaida(LocalDate dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
