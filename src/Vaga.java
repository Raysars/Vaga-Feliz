public class Vaga {

    int idDaVaga;
    int andarDaVaga;
    Carro carroEstacionado;

    public Vaga(int idDaVaga, int andarDaVaga, Carro carroEstacionado) {
        this.idDaVaga = idDaVaga;
        this.andarDaVaga = andarDaVaga;
        this.carroEstacionado = carroEstacionado;
    }

    //molde da classe
    public Vaga(int idDaVaga, int andarDaVaga) {
        this.idDaVaga = idDaVaga;
        this.andarDaVaga = andarDaVaga;
        this.carroEstacionado = null;
    }

    public void setIdDaVaga(int idDaVaga) {
        this.idDaVaga = idDaVaga;
    }

    public void setAndarDaVaga(int andarDaVaga) {
        this.andarDaVaga = andarDaVaga;
    }

    public int getIdDaVaga() {
        return idDaVaga;
    }

    public int getAndarDaVaga() {
        return andarDaVaga;
    }

    public Carro getCarroEstacionado() {
        return carroEstacionado;
    }

    public void setCarroEstacionado(Carro carroEstacionado) {
        this.carroEstacionado = carroEstacionado;
    }

    public void VerificarPlaca(String placaDoCarroQueEstaNessaVaga) {

    }

    public boolean estaOcupada() {
        return !(this.carroEstacionado == null);
    }

}
