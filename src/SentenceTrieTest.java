import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class SentenceTrieTest {

	@Test
	public void testAdd() {
		SentenceTrie st = new SentenceTrie();
		assertNull(st.getRoot());
	}
	
	@Test
	public void testSearch() {
		SentenceTrie st = new SentenceTrie();
		ArrayList<String> ret = new ArrayList<>();
		st.add("University of Pennsylvania");
		st.add("University of Pennsylvania");
		st.add("University of Pittsburg");
		st.add("University of Virginia");
		st.add("University of Virginia");
		st.add("How to apply for university");
		st.add("Universal studio");
		st.add("Universal studio");
		st.add("Universal studio");
		st.add("Universal studio");
		ret.add("Universal studio");
		ret.add("University of Pennsylvania");
		ret.add("University of Virginia");
		assertEquals(ret.get(0), st.search('U').get(0));
	
		st.search('n');
		st.search('i');
		st.search('v');
		st.search('e');
		st.search('r');
		st.search('s');
		st.add("University of Pennsylvania");
		ret.set(0, "University of Pennsylvania");
		ret.set(1, "University of Virginia");
		ret.set(2, "University of Pittsburg");

		assertEquals(ret.get(0), st.search('i').get(0));
		assertEquals("Universi", st.getCurrentPrefix());
		st.search('t');
		st.search('y');
		st.search(' ');
		st.search('o');
		st.search('f');
		st.search(' ');
		assertEquals("of", st.getCurrentRoot().getWord());		
		
	}

}
