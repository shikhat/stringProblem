import java.util.ArrayList;
import java.util.Arrays;

public class Removpartchar {
	
	
public static String remove(String str, char rem)
{
	// str = "Shikhjajainjaaj";
	
	 //rem='a';
	char []chraray =str.toCharArray();
    StringBuffer builder = new StringBuffer();
    StringBuffer builder1 = new StringBuffer();
    //;System.out.println(str.replaceAll("j", ""))
	for(int i=0;i<chraray.length;i++)
	{
		if(chraray[i]!=rem)
		{
			builder.append(chraray[i]);
		}
		
		
	}
	System.out.println(builder.toString());
	return builder.toString();

}

// Code Using Java Method
public static String removeUsingJavaMethod(String str, String rem, String replaceby)
{
 
	return(str.replaceAll(rem, replaceby));
    
}

	public static void main(String[] args) {
		
		Removpartchar.remove("abcj",'a');
		System.out.println(Removpartchar.removeUsingJavaMethod("pqrs", "q",""));
		
}
}