package TestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CapaDePresentacion.PVehiculo;
/**
 * 
 * @author Jesus Ruiz Alonso
 *
 */
class TestVehiculo {

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
	
	
	/**
	 * @author: Jesus Ruiz Alonso
	 */
	@Test
	void testValidarId_Positivo_ExceptTrue() {
		PVehiculo v=new PVehiculo();
		int id=10;
		
		boolean valido=v.ValidarId(id);
		
		Assert.assertEquals(true, valido);
	}
	
	
	/**
	 * @author: Jesus Ruiz Alonso
	 */
	@Test
	void testValidarId_Negativo_ExceptFalse() {
		PVehiculo v=new PVehiculo();
		int id=-10;
		
		boolean valido=v.ValidarId(id);
		
		Assert.assertEquals(false, valido);;
	}
	
	
	/**
	 * @author: Jesus Ruiz Alonso
	 */
	@Test
	void testValidarId_Excesivo_ExceptFalse() {
		PVehiculo v=new PVehiculo();
		int id=1000;
		
		boolean valido=v.ValidarId(id);
		
		Assert.assertEquals(false, valido);
	}
	
	@Test
	void testValidarModelo_Valido_ExceptTrue() {
		PVehiculo v=new PVehiculo();
		String modelo="Audjksgy";
		
		boolean valido=v.validarModelo(modelo);
		
		Assert.assertEquals(true, valido);
	}
	
	
	/**
	 * @author: Jesus Ruiz Alonso
	 */
	@Test
	void testValidarModelo_NoValido_ExceptFalse() {
		PVehiculo v=new PVehiculo();
		String modelo="Audi A6 llllll";
		
		boolean valido=v.validarModelo(modelo);
		
		Assert.assertEquals(false, valido);
	}
	
	
	/**
	 * @author: Jesus Ruiz Alonso
	 */
	@Test
	void testValidarMatricula_Valido_ExceptTrue() {
		PVehiculo v=new PVehiculo();
		String matricula="1234JKL";
		
		boolean valido=v.ValidarMatricula(matricula);
		
		Assert.assertEquals(true, valido);
	}
	
	
	/**
	 * @author: Jesus Ruiz Alonso
	 */
	@Test
	void testValidarMatricula_NoValido_ExceptFalse() {
		PVehiculo v=new PVehiculo();
		String matricula="1234 JKLL";
		
		boolean valido=v.ValidarMatricula(matricula);
		
		Assert.assertEquals(false, valido);
	}


}
