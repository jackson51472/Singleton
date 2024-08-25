import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleTest {

    @Test
    void deveRetornarNovoVolume() throws Exception {
        Controle.getInstance().setModelo("tv");
        assertEquals(9,Controle.getInstance().alterarVolume(9));
    }

    @Test
    void deveRetornarSemSipositivoVolume() throws Exception {
        try {
            Controle.getInstance().alterarVolume(9);
            fail("Devia ter falado que estava sem controle");
        } catch (Exception e) {
            assertEquals("Nenhum dispositivo está definido para o controle remoto",e.getMessage());
        }
    }

    @Test
    void deveRetornarNovoCanal() throws Exception {
        Controle.getInstance().setModelo("tv");
        assertEquals("Canal 10",Controle.getInstance().trocaCanal(10));
    }

    @Test
    void deveRetornarSemSipositivoCanal() throws Exception {
        try {
            Controle.getInstance().trocaCanal(9);
            fail("Devia ter falado que estava sem controle");
        } catch (Exception e) {
            assertEquals("Nenhum dispositivo está definido para o controle remoto",e.getMessage());
        }
    }

}