import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordTrieNodeTest {

	WordTrieNode wordTrieNode1;
	WordTrieNode wordTrieNode2;
	WordTrieNode wordTrieNode3;
	
	@Before
	public void setUp() throws Exception {
		wordTrieNode1 = new WordTrieNode('a');
		wordTrieNode2 = new WordTrieNode('b');	
		wordTrieNode3 = new WordTrieNode('d');
	}
	
	@Test
	public void testGetSetC() {
		wordTrieNode3.setC('c');
		assertEquals(wordTrieNode3.getC(),'c');	
	}
	
	@Test
	public void testAddFreq() {
		assertEquals(wordTrieNode1.getFreq(),0);
		wordTrieNode1.addFreq();
		assertEquals(wordTrieNode1.getFreq(),1);
	}

	@Test
	public void testIsWord() {
		assertFalse(wordTrieNode1.valid());
		wordTrieNode1.addFreq();
		assertTrue(wordTrieNode1.valid());		
	}
	
	@Test
	public void testChildren() {
		WordTrieNode n1 = new WordTrieNode('a');
		WordTrieNode n2 = new WordTrieNode('b');
		WordTrieNode n3 = new WordTrieNode('c');
		
		WordTrieNode[] children = {n1, n2, n3};
		wordTrieNode1.setChildren(children);
		assertEquals('a', wordTrieNode1.getChildren()[0].getC());		
	}

}
