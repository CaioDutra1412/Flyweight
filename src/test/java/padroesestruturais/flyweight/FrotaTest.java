package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FrotaTest {

    @Test
    void retornaMotoristasCarros() {
        Frota frota = new Frota();
        frota.registrar("Caio", "Compass", "Jeep");
        frota.registrar("Rafaela", "CRV", "Honda");
        frota.registrar("Bernardo", "Compass", "Jeep");
        frota.registrar("Diego", "Compass", "Jeep");

        List<String> saida = Arrays.asList(
                "Motorista{Nome='Caio', Carro='Compass', Modelo='Jeep'}",
                "Motorista{Nome='Rafaela', Carro='CRV', Modelo='Honda'}",
                "Motorista{Nome='Bernardo', Carro='Compass', Modelo='Jeep'}",
                "Motorista{Nome='Diego', Carro='Compass', Modelo='Jeep'}");

        assertEquals(saida, frota.obterMotoristas());
    }

    @Test
    void retornarModelosCarros() {
        Frota frota = new Frota();
        frota.registrar("Caio", "Compass", "Jeep");
        frota.registrar("Rafaela", "CRV", "Honda");
        frota.registrar("Bernardo", "Compass", "Jeep");
        frota.registrar("Diego", "Compass", "Jeep");

        assertEquals(2, CarroFactory.getTotalCarros());
    }

}