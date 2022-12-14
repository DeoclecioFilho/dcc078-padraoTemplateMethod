package padroescomportamentais;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTrifasicoTest {

    static ClienteTrifasico clienteTrifasico;

    @BeforeAll
    static void setUpBeforeClass() {
        clienteTrifasico = new ClienteTrifasico();
    }

    @AfterAll
    static void tearDownAfterClass() {
        clienteTrifasico = null;
    }

    @Test
    void deveRetornarTensaoAdeguada(){
        clienteTrifasico.setMedicao1(200);
        clienteTrifasico.setMedicao2(210);
        assertEquals("Tensão Adequada",clienteTrifasico.verificarTensao());
    }

    @Test
    void deveRetornarTensaoPrecáriaAlta(){
        clienteTrifasico.setMedicao1(228);
        clienteTrifasico.setMedicao2(230);
        assertEquals("Tensão Precária",clienteTrifasico.verificarTensao());
    }
    @Test
    void deveRetornarTensaoPrecáriaBaixa(){
        clienteTrifasico.setMedicao1(190);
        clienteTrifasico.setMedicao2(200);
        assertEquals("Tensão Precária",clienteTrifasico.verificarTensao());
    }

    @Test
    void deveRetornarTensaoCriticaAlta(){
        clienteTrifasico.setMedicao1(269);
        clienteTrifasico.setMedicao2(270);
        assertEquals("Tensão Crítica",clienteTrifasico.verificarTensao());
    }
    @Test
    void deveRetornarTensaoCriticaBaixa(){
        clienteTrifasico.setMedicao1(180);
        clienteTrifasico.setMedicao2(175);
        assertEquals("Tensão Crítica",clienteTrifasico.verificarTensao());
    }
    @Test
    void deveRetornarNomeDoCliente(){
        clienteTrifasico.setMedicao1(200);
        clienteTrifasico.setMedicao2(210);
        clienteTrifasico.setNomeCliente("Ciclano dos Santos");
        clienteTrifasico.setNumeroInstalacao(300463321);
        assertEquals( "Cliente Trifásico {Numero de Instalação: 300463321, Nome do cliente: Ciclano dos Santos, Nível de tensão: Tensão Adequada}",clienteTrifasico.getInfo());
    }
}