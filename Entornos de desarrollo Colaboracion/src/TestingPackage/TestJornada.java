package TestingPackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CapaDePresentacion.PJornada;
import junit.framework.Assert;



class TestJornada {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ValidarIdTest_Positivo_ExcpetTrue() {
		//ARRANGE
		PJornada jor = new PJornada();
		String id = "1";
		
		
		//ACT
		boolean valido = jor.ValidarId(id);
		
		//ASSERT

		Assert.assertEquals(true, valido);
	}
	
	@Test
	void ValidarIdTest_Negativo_ExcpetFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String id = "-1";
		
		
		//ACT
		boolean valido = jor.ValidarId(id);
		
		//ASSERT

		Assert.assertEquals(false, valido);
	}
	
	@Test
	void ValidarIdTest_Nulo_ExcpetFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String id = "0";
		
		
		//ACT
		boolean valido = jor.ValidarId(id);
		
		//ASSERT

		Assert.assertEquals(false, valido);
	}
	
	@Test
	void ValidarIdTest_Maximo_ExcpetTrue() {
		//ARRANGE
		PJornada jor = new PJornada();
		String id = "999";
		
		
		//ACT
		boolean valido = jor.ValidarId(id);
		
		//ASSERT

		Assert.assertEquals(false, valido);
	}

	@Test
	void ValidarIdTest_Excesivo_ExcpetFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String id = "10000";
		
		
		//ACT
		boolean valido = jor.ValidarId(id);
		
		//ASSERT

		Assert.assertEquals(false, valido);
	}
	
	@Test
	void ValidarIdTest_CadenaVacia_ExcpetFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String id = "";
		
		
		//ACT
		boolean valido = jor.ValidarId(id);
		
		//ASSERT

		Assert.assertEquals(false, valido);
	}

	@Test
	void ValidarTipoJornada_C_ExpectTrue() {
		//ARRANGE
		PJornada jor = new PJornada();
		String tipo = "C";
		
		
		//ACT
		boolean valido = jor.ValidarTipo(tipo);
		
		//ASSERT

		Assert.assertEquals(true, valido);
	}
	
	@Test
	void ValidarTipoJornada_P_ExpectTrue() {
		//ARRANGE
		PJornada jor = new PJornada();
		String tipo = "P";
		
		
		//ACT
		boolean valido = jor.ValidarTipo(tipo);
		
		//ASSERT
	
		Assert.assertEquals(true, valido);
	}
	
	@Test
	void ValidarTipoJornada_CualquierTexto_ExpectFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String tipo = "TEXTOALEATORIO";
		
		
		//ACT
		boolean valido = jor.ValidarTipo(tipo);
		
		//ASSERT
	
		Assert.assertEquals(false, valido);
	}
	
	@Test
	void ValidarTipoJornada_TextoLongitud1NoEsCniP_ExpectFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String tipo = "J";
		
		
		//ACT
		boolean valido = jor.ValidarTipo(tipo);
		
		//ASSERT
	
		Assert.assertEquals(false, valido);
	}
	
	@Test
	void ValidarTipoJornada_TextoVacio_ExpectFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String tipo = "";
		
		
		//ACT
		boolean valido = jor.ValidarTipo(tipo);
		
		//ASSERT
	
		Assert.assertEquals(false, valido);
	}
	
	@Test
	void ValidarTipoJornada_Nulo_ExpectFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String tipo = null;
		
		
		//ACT
		boolean valido = jor.ValidarTipo(tipo);
		
		//ASSERT
	
		Assert.assertEquals(false, valido);
	}
	

}
