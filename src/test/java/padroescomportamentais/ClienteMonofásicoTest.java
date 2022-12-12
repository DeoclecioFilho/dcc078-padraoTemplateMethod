package padroescomportamentais;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteMonofásicoTest {

    static ClienteMonofásico clienteMonofasico;

    @BeforeAll
    static void setUpBeforeClass() {
        clienteMonofasico = new ClienteMonofásico();
    }

    @AfterAll
    static void tearDownAfterClass() {
        clienteMonofasico = null;
    }

    @Test
    void deveRetornarTensaoAdeguada(){
        clienteMonofasico.setMedicao1(235);
        clienteMonofasico.setMedicao2(230);
        assertEquals("Tensão Adequada",clienteMonofasico.verificarTensao());
    }

    @Test
    void deveRetornarTensaoPrecária(){
        clienteMonofasico.setMedicao1(228);
        clienteMonofasico.setMedicao2(230);
        assertEquals("Tensão Precária",clienteMonofasico.verificarTensao());
    }

    @Test
    void deveRetornarTensaoCritica(){
        clienteMonofasico.setMedicao1(269);
        clienteMonofasico.setMedicao2(270);
        assertEquals("Tensão Crítica",clienteMonofasico.verificarTensao());
    }
    @Test
    void deveRetornarNomeDoCliente(){
        clienteMonofasico.setMedicao1(269);
        clienteMonofasico.setMedicao2(270);
        clienteMonofasico.setNomeCliente("Fulano de Souza");
        clienteMonofasico.setNumeroInstalacao(300464434);
        assertEquals( "Cliente Monofásico {Numero de Instalação: 300464434, Nome do cliente: Fulano de Souza, Nível de tensão: Tensão Crítica}",clienteMonofasico.getInfo());
    }

}