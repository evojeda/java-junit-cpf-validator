package teste;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.CodigoPessoaFisica;

public class CodigoPessoaFisicaTeste {
	private CodigoPessoaFisica cpf;

    @BeforeEach
    public void setUp() {
        cpf = new CodigoPessoaFisica();
    }

    @Test
    public void deveRetornarTrueParaCpfValido() {
        String cpfValido = "52998224725";
        assertTrue(cpf.validaCPF(cpfValido));
    }

    @Test
    public void deveRetornarFalseParaCpfInvalido() {
        String cpfInvalido = "12345678900";
        assertFalse(cpf.validaCPF(cpfInvalido));
    }

    @Test
    public void deveRemoverCaracteresEspeciaisDoCpf() {
        String cpfComMascara = "529.982.247-25";
        String resultadoEsperado = "52998224725";

        assertEquals(resultadoEsperado, cpf.removeCaracteresEspeciais(cpfComMascara));
    }
}
