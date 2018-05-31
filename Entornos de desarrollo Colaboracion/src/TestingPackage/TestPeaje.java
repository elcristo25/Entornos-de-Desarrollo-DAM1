package TestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import CapaDePresentacion.*;
import junit.framework.Assert;

class TestPeaje {

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
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarId_Menor1_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String id = "-5";
		
		boolean resultado = peaj.ValidarId(id);
		
		Assert.assertEquals(false, resultado);
	}
	
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarId_Mayor1000_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String id = "10000";
		
		boolean resultado = peaj.ValidarId(id);
		
		Assert.assertEquals(false, resultado);
	}
	
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarId_Valido_ExpectedTrue() {
		
		PPeaje peaj = new PPeaje();
		String id = "187";
		
		boolean resultado = peaj.ValidarId(id);
		
		Assert.assertEquals(true, resultado);
	}
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarPunto_Mayor1000_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String punto = "10000";
		
		boolean resultado = peaj.ValidarPunto(punto);
		
		Assert.assertEquals(false, resultado);
	}
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarPunto_Menor0_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String punto = "-234";
		
		boolean resultado = peaj.ValidarPunto(punto);
		
		Assert.assertEquals(false, resultado);
	}
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarPunto_correcto_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String punto = "198";
		
		boolean resultado = peaj.ValidarPunto(punto);
		
		Assert.assertEquals(true, resultado);
	}
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarSentido_I_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String sentido = "I";
		
		boolean resultado = peaj.ValidarSentido(sentido);
		
		Assert.assertEquals(true, resultado);
	}
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarSentido_D_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String sentido = "D";
		
		boolean resultado = peaj.ValidarSentido(sentido);
		
		Assert.assertEquals(true, resultado);
	}
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarSentido_cualquierotrodato_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String sentido = "X";
		
		boolean resultado = peaj.ValidarSentido(sentido);
		
		Assert.assertEquals(false, resultado);
	}
	@Test
	/**
	 * @author Mario Fernandez
	 */
	void TestValidarSentido_unNumero_ExpectedFalse() {
		
		PPeaje peaj = new PPeaje();
		String sentido = "234";
		
		boolean resultado = peaj.ValidarSentido(sentido);
		
		Assert.assertEquals(false, resultado);
	}
}
