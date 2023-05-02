package padroesestruturais.flyweight;

public class Carro {

    private String nome;
    private String modelo;

    public Carro(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }
}
