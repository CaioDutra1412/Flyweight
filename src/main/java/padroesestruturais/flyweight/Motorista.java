package padroesestruturais.flyweight;

public class Motorista {

    private String nome;
    private Carro carro;

    public Motorista(String nome, Carro carroResidencia) {
        this.nome = nome;
        this.carro = carroResidencia;
    }

    public String obterMotorista() {
        return "Motorista{" +
                "Nome='" + this.nome + '\'' +
                ", Carro='" + carro.getNome() + '\'' +
                ", Modelo='" + carro.getModelo() + '\'' +
                '}';
    }
}
