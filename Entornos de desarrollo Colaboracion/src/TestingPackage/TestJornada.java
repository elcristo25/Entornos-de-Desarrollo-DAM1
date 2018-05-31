package TestingPackage;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CapaDeDatos.Jornada;
import CapaDeDatos.SimuladorBaseDeDatos;
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

	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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

	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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

	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
	@Test
	void ValidarFechaJornada_Nulo_ExpectFalse() {
		//ARRANGE
		PJornada jor = new PJornada();
		String year = null;
		String month = null;
		String day = null;
		
		
		//ACT
		boolean valido = jor.ValidarFecha(year,month,day);
		
		//ASSERT
	
		Assert.assertEquals(false, valido);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void ValidarFechaJornada_AñoMesDiaValidos_ExpectTrue() {
		//ARRANGE
		PJornada jor = new PJornada();
		String year = "1994";
		String month = "07";
		String day = "15";
		
		
		//ACT
		boolean valido = jor.ValidarFecha(year,month,day);
		
		//ASSERT
	
		Assert.assertEquals(true, valido);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void ValidarInsercionJornada_JornadaValida_ExtectOK() {
		//ARRANGE
		SimuladorBaseDeDatos db = new SimuladorBaseDeDatos();
		Jornada jor = new Jornada(1,new Date(1994,05,15),'C');
		
		//ACT
		String retornoInsercion = db.InsertarJornada(jor);
		
		//ASSERT
		Assert.assertEquals("OK", retornoInsercion);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void ValidarBorradoJornada_JornadaValida_ExtectOK() {
		//ARRANGE
		SimuladorBaseDeDatos db = new SimuladorBaseDeDatos();
		Jornada jor = new Jornada(1,new Date(1994,05,15),'C');
		db.InsertarJornada(jor);
		
		//ACT
		String retornoBorrado = db.BorrarJornada(1);
		
		//ASSERT
		Assert.assertEquals("OK", retornoBorrado);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void ValidarBorradoJornada_JornadaInexistente_ExtectOK() {
		//ARRANGE
		SimuladorBaseDeDatos db = new SimuladorBaseDeDatos();
		Jornada jor = new Jornada(1,new Date(1994,05,15),'C');
		db.InsertarJornada(jor);
		
		//ACT
		String retornoBorrado = db.BorrarJornada(1);
		
		//ASSERT
		Assert.assertEquals("OK", retornoBorrado);
	}

}
