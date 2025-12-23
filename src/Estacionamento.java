import java.util.List;

public class Estacionamento {

    List<Carro> Carros;
    int QdeVagas;
    int VagasPorAndar;
    int QVagasDisponiveis;

    public Estacionamento(String carro, int qdeVagas, int vagasPorAndar, int QVagasDisponiveis) {
        Carros = Carros;
        QdeVagas = qdeVagas;
        VagasPorAndar = vagasPorAndar;
        this.QVagasDisponiveis = QVagasDisponiveis;
    }

    public void Estacionar2(int idDaVaga, boolean estaOcupada) {

    }

    public List<Carro> getCarros() {
        return Carros;
    }

    public int getQdeVagas() {
        return QdeVagas;
    }

    public int getVagasPorAndar() {
        return VagasPorAndar;
    }

    public int getQVagasDisponiveis() {
        return QVagasDisponiveis;
    }

    public void setCarros(List<Carro> carros) {
        Carros = carros;
    }

    public void setQdeVagas(int qdeVagas) {
        QdeVagas = qdeVagas;
    }

    public void setVagasPorAndar(int vagasPorAndar) {
        VagasPorAndar = vagasPorAndar;
    }

    public void setQVagasDisponiveis(int QVagasDisponiveis) {
        this.QVagasDisponiveis = QVagasDisponiveis;
    }

    public void QVagasDisponiveis() {
        System.out.println("Estoque atual do " + QVagasDisponiveis + "");
    }

    public void Bucar_Carro() {
        // System.out.println("Buscar " + Carro + "");
    }

    public void RetirarCarro() {
    }

    public void Adicionar_Carro() {
    }

    public void Estacionar(int idDaVaga, boolean estaOcupada) {

    }
}
