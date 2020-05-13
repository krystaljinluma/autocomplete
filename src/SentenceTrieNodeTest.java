import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class SentenceTrieNodeTest {
	
	@Test
	public void test() {
		SentenceTrieNode stn = new SentenceTrieNode("University");
		ArrayList<SentenceTrieNode> children = new ArrayList<>();
		SentenceTrieNode child1 = new SentenceTrieNode("of");
		SentenceTrieNode child2 = new SentenceTrieNode("City");
		SentenceTrieNode child3 = new SentenceTrieNode("District");
		children.add(child1);
		children.add(child2);
		children.add(child3);
		assertTrue(stn.valid());
		stn.setChildren(children);
		assertEquals("of", stn.getChildren().get(0).getWord());
		assertEquals(1, stn.getChildren().get(0).getFrequency());
		stn.getChildren().get(0).setFrequency(1);
		assertEquals(2, stn.getChildren().get(0).getFrequency());
		stn.getChildren().get(0).setWord("Of");
		assertEquals("Of", stn.getChildren().get(0).getWord());		
	}

}
