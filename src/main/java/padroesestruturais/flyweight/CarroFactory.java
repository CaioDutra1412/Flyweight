package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarroFactory {
    private static Map<String, Carro> carros = new HashMap<>();

    public static Carro getCidade(String nome, String uf) {
        Carro carro = carros.get(nome);
        if (carro == null) {
            carro = new Carro(nome, uf);
            carros.put(nome, carro);
        }
        return carro;
    }

    public static int getTotalCarros() {
        return carros.size();
    }

}




