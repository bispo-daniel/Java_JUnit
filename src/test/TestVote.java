package test;
import projectPack.Vote;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/*Test Brazilian Voting Age Rule*/

public class TestVote {
	static Vote vote = new Vote();
		
	@Test
	void ageShouldntBeNegative() {
		assertThrows(IllegalArgumentException.class, () -> {
			vote.rule(-11);
		});
	}
	
	@Test
	void testTypeReturned() {
		assertTrue(vote.rule(22).getClass().getSimpleName().equals("String"));
	}
	
	/**/
	
	@Test
	void fifteenCannotVote() {
		assertEquals("Cannot", vote.rule(15));
	}
	
	@Test
	void sixteenCanVote() {
		assertEquals("Can", vote.rule(16));
	}
	
	@Test 
	void nineteenMustVote(){
		assertEquals("Must", vote.rule(19));
	}
	
	@Test 
	void sixtyFourMustVote() {
		assertEquals("Must", vote.rule(64));
	}
	
	@Test 
	void eightyOneCanVote() {
		assertEquals("Can", vote.rule(81));
	}
	
	/**/
	
	@Test 
	void nineteenMust(){
		assertNotEquals("Can", vote.rule(19));
	}
	
}