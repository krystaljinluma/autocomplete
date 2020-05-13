import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class WordTrieTest {

	WordTrie wordTrie;
	String s1 = "a";
	String s2 = "ab";
	String s3 = "abc";
	String s4 = "abcd";
	
	@Before
	public void setUp() throws Exception {
		wordTrie = new WordTrie();
	}

	@Test
	public void testAdd() {
		wordTrie.add(s1);
		wordTrie.add(s2);
		wordTrie.add(s3);
		wordTrie.add(s4);
		
		WordTrieNode[] children1 = wordTrie.getRoot().getChildren();
		assertEquals('a', children1[0].getC());
		assertEquals(1, children1[0].getFreq());
		
		WordTrieNode[] children2 = children1[0].getChildren();
		assertEquals('b', children2[1].getC());
		assertEquals(1, children2[1].getFreq());
		
		wordTrie.add(s2);
		WordTrieNode[] children3 = wordTrie.getRoot().getChildren();
		WordTrieNode[] children4 = children3[0].getChildren();
		assertEquals('b', children4[1].getC());
		assertEquals(2, children4[1].getFreq());		
	}
	
	@Test
	public void testSearch() {
		WordTrie wordTrie2 = new WordTrie();
		wordTrie2.add(s1);
		wordTrie2.add(s1);
		wordTrie2.add(s1);
		wordTrie2.add(s1);
		wordTrie2.add(s1);
		wordTrie2.add(s1);
		
		wordTrie2.add(s2);
		wordTrie2.add(s2);
		wordTrie2.add(s2);
		wordTrie2.add(s2);
		wordTrie2.add(s2);
		
		wordTrie2.add(s3);
		wordTrie2.add(s3);
		wordTrie2.add(s3);
		wordTrie2.add(s3);
		
		wordTrie2.add(s4);
		wordTrie2.add(s4);
		wordTrie2.add(s4);
		
		ArrayList<String> list = wordTrie2.search('a');
		assertEquals(s1, list.get(0));
		assertEquals(s2, list.get(1));
		assertEquals(s3, list.get(2));
		assertEquals(s4, list.get(3));
		assertEquals(4, list.size());
		
		wordTrie2.add("abcde");
		wordTrie2.add("abcde");
		
		wordTrie2.add("abcdef");
		ArrayList<String> list2 = wordTrie2.search('b');
		assertEquals("abcdef", list2.get(4));
		assertEquals(5, list2.size());		
	}
}

