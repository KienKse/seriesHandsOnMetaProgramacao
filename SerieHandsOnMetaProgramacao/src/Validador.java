import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validador {

	private static List<String> invalidos = null;

	public List<String> validar(Object objeto) {
		
		invalidos = new ArrayList<String>();		
		Class<?> classe = objeto.getClass();
		Field[] atributos = classe.getDeclaredFields();
		
		for (Field field : atributos) {
			field.setAccessible(true);
			Object valor = null;
			try {
				valor = field.get(objeto);
				if(valor == null) {
					if(field.isAnnotationPresent(Validacao.class)) {
						Validacao validacao = field.getAnnotation(Validacao.class);
						invalidos.add(validacao.descricao());
					}
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		return invalidos;
	}
	
	public List<String> validarOld1(Candidato candidato) {
		invalidos = new ArrayList<String>();
		if(candidato == null) {
			invalidos.add("candidato inválido - Não iniciado");
		}
		
		if(candidato.getNome() == null) {
			invalidos.add("nome");
		}
		
		if(candidato.getCpf() == null) {
			invalidos.add("cpf");
		}
		
		if(candidato.getPosicao() == 0) {
			invalidos.add("posicao");
		}
		
		if(candidato.getNota() == null) {
			invalidos.add("nota");
		}
		
		return invalidos;
	}
	
}
