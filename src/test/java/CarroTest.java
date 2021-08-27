import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    public void criarCarro(){

        AbsFactory fabrica = new FabricaCar();
        Carro carro = new Carro(fabrica);

        assertEquals("Toyota", carro.exibirMarca());
        assertEquals("Toyota Corolla", carro.exibirModelo());
        assertEquals(2020, carro.exibirAno());
        assertEquals("Automático", carro.exibirCambio());
        assertEquals("2.0", carro.exibirMotor());
        assertEquals("Básico", carro.exibirTipo());

    }

}