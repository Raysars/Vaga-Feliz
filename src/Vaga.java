public class Vaga {

    private int idVaga;
    private String numeroDaVaga;
    private boolean estaOcupada;
    private Carro carroAtual;

    public Vaga(int idVaga, String numeroDaVaga, boolean estaOcupada, Carro carroAtual) {
        this.idVaga = idVaga;
        this.numeroDaVaga = numeroDaVaga;
        this.estaOcupada = estaOcupada;
        this.carroAtual = carroAtual;
    }

    @Override
    public String toString() {
        return "Vaga{" + "idVaga=" + idVaga + ", numeroDaVaga='" + numeroDaVaga + '\'' + ", estaOcupada=" + estaOcupada + '}';
    }

    //o metodo altera o estado da vaga para ocupado e coloca um objeto carro dentro
    public void ocuparVaga(Carro carro) {
        this.estaOcupada = true;
        this.carroAtual = carro;

        System.out.println("A vaga" + this.numeroDaVaga + "esta ocupada!");
    }

    //null remove a referencia do carro que estava ocupando a vaga
    public void liberarVaga() {
        this.estaOcupada = false;
        this.carroAtual = null;

        System.out.println("A vaga" + this.numeroDaVaga + "esta livre!");
    }

    public void verificarDisponibilidade() {
        if (this.estaOcupada) {
            System.out.println("A vaga" + this.numeroDaVaga + "esta ocupada!");
        } else {
            System.out.println("A vaga" + this.numeroDaVaga + "esta desocupada!");
        }
    }
}
