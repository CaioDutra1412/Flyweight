package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Motorista> motoristas = new ArrayList<>();

    public void registrar(String nomeMotorista, String nomeCarro, String Modelo) {
        Carro carro = CarroFactory.getCidade(nomeCarro, Modelo);
        Motorista motorista = new Motorista(nomeMotorista, carro);
        motoristas.add(motorista);
    }

    public List<String> obterMotoristas() {
        List<String> saida = new ArrayList<String>();
        for (Motorista motorista : this.motoristas) {
            saida.add(motorista.obterMotorista());
        }
        return saida;
    }


}
