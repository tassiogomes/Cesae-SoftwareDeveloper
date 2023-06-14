package ex3;

import org.example.ex3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal suricata;


    @BeforeEach
    public void setUp(){
        this.suricata= new Animal("Suricata", Alimento.FRUTAS);
    }

    @Test
    public void comerAlimentoValidoTest(){ // retorna true (com fome) se ele comer algo diferente de fruta
        suricata.comer(Alimento.FRUTAS);
        assertFalse(suricata.estaComFome()); // verifica se a função é false, nesse caso é pq ele comeu, entao o teste passou
    }

    @Test
    public void comerAlimentoInvalidoTest(){
        suricata.comer(Alimento.CARNE);
        assertTrue(suricata.estaComFome()); // se retorna true (nao comeu) é pq o alimento não é o que ele come.
    }

    @Test
    public void comerAlimentoNullTest(){
        suricata.comer(null);
        assertTrue(suricata.estaComFome());
    }
}