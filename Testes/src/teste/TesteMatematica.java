package teste;

import leandro.Matematica;

import org.junit.Assert;
import org.junit.Test;

public class TesteMatematica {

	@Test
	public void testSoma(){
		Matematica m = new Matematica();
		int res = m.soma(1, 2);
		
		// ok
		Assert.assertEquals(3, res);
		
		// failed
		// Assert.assertEquals(4, res);
	}
}
