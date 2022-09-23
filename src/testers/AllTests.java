package testers;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import Classes.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

// Format for JUnit 5 Jupiter Tests 
// stolen from https://junit.org/junit5/docs/current/user-guide/#junit-platform-suite-engine (Links to an external site.)
// more docs found  https://www.baeldung.com/junit-5 (Links to an external site.)

@Suite
@SuiteDisplayName("Git Project Tester")
@SelectPackages("testers")
@IncludeClassNamePatterns(".*Test")
class AllTests {
    
    @Test
    public void test() throws NoSuchAlgorithmException, IOException {
    	File EriksBitches = new File("EriksBitches");
        assertFalse(EriksBitches.exists());
        testTree();
    }
    
    static void testTree() throws IOException, NoSuchAlgorithmException{
		String treeStr = "Erik's hypothetical String";
		String teStr = "657df719b38bdb04d78a858c908d240522015799";
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(teStr);
		Tree tesT = new Tree(arr);
		assertTrue(tesT.getTreeName().equals(teStr));
	}
}
