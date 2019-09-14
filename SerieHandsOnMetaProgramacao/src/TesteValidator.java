import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class TesteValidator {

	@Test()
	public void test() {
		Candidato candidato = new Candidato();
		
		Validador validador = new Validador();
		List<String> invalidados = validador.validar(candidato);
		
		assertTrue(invalidados.contains("Nome Completo"));
		assertTrue(invalidados.contains("CPF"));
		assertTrue(invalidados.contains("Nota"));		
	}
	
	@Test()
	public void falso() {
		Candidato candidato = new Candidato();
		candidato.setNome("Satanta Raio Lazer");
		
		Validador validador = new Validador();
		List<String> invalidados = validador.validar(candidato);
		
		assertTrue(invalidados.contains("Nota"));		
		assertTrue(invalidados.contains("CPF"));
		assertFalse(invalidados.contains("Nome Completo"));	
	}

}
