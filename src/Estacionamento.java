import java.util.List;

public class Estacionamento {

<<<<<<< HEAD
    List<Carro> Carros;
=======
    List<Carros> Carros;
>>>>>>> 7b9a4df64915550f950622cbcb67e92a36917606
    int QdeVagas;
    int VagasPorAndar;
    int QVagasDisponiveis;

    public Estacionamento(String carro, int qdeVagas, int vagasPorAndar, int QVagasDisponiveis) {
        Carros = Carros;
        QdeVagas = qdeVagas;
        VagasPorAndar = vagasPorAndar;
        this.QVagasDisponiveis = QVagasDisponiveis;
    }

<<<<<<< HEAD
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
        System.out.println("A quantidade de vagas disponiviis é: " + QVagasDisponiveis);
    }

    public void Bucar_Carro() {

=======
    public void QVagasDisponiveis() {
        System.out.println("Estoque atual do " + QVagasDisponiveis + "");
    }

    public void Bucar_Carro() {
        System.out.println("Buscar " + Carro + );
>>>>>>> 7b9a4df64915550f950622cbcb67e92a36917606
    }

    public void RetirarCarro() {
    }

    public void Adicionar_Carro() {
    }

<<<<<<< HEAD
    public void Estacionar(int idDaVaga, boolean estaOcupada) {

    }

=======
>>>>>>> 7b9a4df64915550f950622cbcb67e92a36917606
}
