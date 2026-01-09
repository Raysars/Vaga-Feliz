import java.util.Scanner;

public class Estacionamento {

    private String nome = "Estacionamento - Vaga Feliz";
    private Vaga[][] listaDeVaga;
    private int totalDeVaga;
    private double valorHoraPadrao = 15;

    public Estacionamento(String nome, Vaga[][] listaDeVaga, int totalDeVaga, double valorHoraPadrao) {
        this.nome = nome;
        this.listaDeVaga = listaDeVaga;
        this.totalDeVaga = totalDeVaga;
        this.valorHoraPadrao = valorHoraPadrao;
    }

    public void registrarEntrada(Carro carro) {
        for (int i = 0; i < this.listaDeVaga.length; i++) {
            for (int r = 0; r < this.listaDeVaga[i].length; r++) {

            }
        }
    }
}