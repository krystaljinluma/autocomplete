import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class FileParserTest {

	@Test
	public void testReadFile() {
		FileParser fp = new FileParser();
		ArrayList<String> parsedLines = fp.readFile("test.txt");
		assertEquals("This is a test file", parsedLines.get(0));
		assertEquals("University of Virginia", parsedLines.get(1));

		ArrayList<String> parsedWords = fp.readFile("test1.txt");
		assertEquals("test", parsedWords.get(0));
		assertEquals("file", parsedWords.get(1));
	}

}
