import java.util.List;

public class Estacionamento {

    List<Carros> Carros;
    int QdeVagas;
    int VagasPorAndar;
    int QVagasDisponiveis;

    public Estacionamento(String carro, int qdeVagas, int vagasPorAndar, int QVagasDisponiveis) {
        Carros = Carros;
        QdeVagas = qdeVagas;
        VagasPorAndar = vagasPorAndar;
        this.QVagasDisponiveis = QVagasDisponiveis;
    }

    public void QVagasDisponiveis() {
        System.out.println("Estoque atual do " + QVagasDisponiveis + "");
    }

    public void Bucar_Carro() {
        System.out.println("Buscar " + Carro + );
    }

    public void RetirarCarro() {
    }

    public void Adicionar_Carro() {
    }

}
