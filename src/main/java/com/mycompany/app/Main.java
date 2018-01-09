
/**
 * Hello world!
 *
 */
 
import java.io.*;
public class Main 
{
    public static void main( String[] args )throws Exception
    {
    	try{
    		PrintWriter writer = new PrintWriter("test_out.txt", "UTF-8");
			writer.println("Ornek Dosya , Deployment");
			writer.close();
		}catch (Exception e)
		{
		}
		
    }
}
