import java.util.List;

public class Vagas {

    int idDaVaga;
    int andarDaVaga;
    boolean estaOcupada;
    String placaDoCarroQueEstaNessaVaga;

    public Vagas(int idDaVaga, int andarDaVaga, boolean estaOcupada, String placaDoCarroQueEstaNessaVaga) {
        this.idDaVaga = idDaVaga;
        this.andarDaVaga = andarDaVaga;
        this.estaOcupada = estaOcupada;
        this.placaDoCarroQueEstaNessaVaga = placaDoCarroQueEstaNessaVaga;
    }
//molde da classe
    public Vagas( int idDaVaga, int andarDaVaga) {
        this.idDaVaga = idDaVaga;
        this.andarDaVaga = andarDaVaga;
        this.estaOcupada = false;
        this.placaDoCarroQueEstaNessaVaga = placaDoCarroQueEstaNessaVaga;
    }

    public void Estacionar(int idDaVaga, boolean estaOcupada) {

    }

    public void VerificarPlaca(String placaDoCarroQueEstaNessaVaga) {

    }

}
