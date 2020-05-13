import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class UserInterfaceTest {

	@Test
	public void testPrintInstructions() {
		//pass as long as no exceptions thrown
		return;
	}
	
	@Test
	public void testBuildWordTrie() {
		List<String> l1= new ArrayList<>();
		l1.add("hello");
		l1.add("world");
		UserInterface u = new UserInterface();
		WordTrie t = u.buildWordTrie(l1);
		assertEquals('h',t.getRoot().getChildren()[7].getC());
	}
	
	@Test
	public void testBuildSentenceTrie() {
		List<String> l1= new ArrayList<>();
		l1.add("University of Pennsylvania");
		l1.add("cit five ninety four");
		UserInterface u = new UserInterface();
		SentenceTrie s = u.buildSentenceTrie(l1);
		assertEquals("University of Pennsylvania", s.search('U').get(0));
	}
	
	@Test
	public void testValidChar() {
		assertTrue(UserInterface.validChar('c'));
		assertTrue(UserInterface.validChar('A'));
		assertTrue(UserInterface.validChar('z'));
		assertTrue(UserInterface.validChar('0'));
		assertTrue(UserInterface.validChar('9'));
		assertTrue(UserInterface.validChar(' '));
		assertFalse(UserInterface.validChar('.'));
		assertFalse(UserInterface.validChar('#'));
		assertFalse(UserInterface.validChar(';'));
	}

}
