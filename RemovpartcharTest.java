import static org.junit.Assert.*;

import org.junit.Test;

public class RemovpartcharTest {
	@Test
	public void removeAtBeginning() 
	{ 
		assertEquals("bc", Removpartchar.remove("abc",'a'));
		assertEquals("bc", Removpartchar.removeUsingJavaMethod("abc","a",""));
		
    }
	
  @Test
	    public void removeAtMiddle(){
	        assertEquals("abd", Removpartchar.remove("abcd", 'c'));
	        assertEquals("abd", Removpartchar.removeUsingJavaMethod("abcd","c",""));
	 }

	@Test
    public void removeAtEnd(){
        assertEquals("abc", Removpartchar.remove("abcd", 'd'));
        assertEquals("abc", Removpartchar.removeUsingJavaMethod("abcd","d",""));
 }
	@Test //Negative test
    public void removeNotExist()
	{
        assertEquals("abcd", Removpartchar.remove("abcd", 'e'));
        assertEquals("abcd", Removpartchar.removeUsingJavaMethod("abcd","e",""));
 }
	
	@Test //Negative test
	public void Boundryvalue()
	{ 
		assertEquals("", Removpartchar.remove("", 'd')); 
		assertEquals("", Removpartchar.removeUsingJavaMethod("","d",""));
	}

		
}
		