import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Permutation_Test {

	
	@Test
	void testSuccess() {
		
		//check the Success of String Permutation
		assertTrue(Permutation.isStringPermutation("fbsa", "bsaf"));
		
	}
	
	@Test
	void checkStringSizes() {
		
		equals(Permutation.isStringPermutation("tictactoe", "toetictas"));
		
	}
	
	
	@Test
	void testFail()
	{
		
		assertFalse(Permutation.isStringPermutation("fdsa", "fbsa"));
	}
	

	
	
	
	
}
