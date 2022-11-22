import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	
	JSONObject playerobj;
	
	int count=0;
	
	@Test
	public void jsonreader() throws IOException, ParseException
	{
		JSONParser jsonparser=new JSONParser();
		
		FileReader reader= new FileReader("C:\\Users\\Arun Kumar KR\\Eclipse folder\\New folder\\InterviewTestvagrant\\resource\\File.json");
		
		Object obj = jsonparser.parse(reader);

		JSONObject playerobj=(JSONObject)obj;
		
		JSONArray array = (JSONArray) playerobj.get("player");
		
		for(int i=0;i<array.size();i++)
		{
		
			JSONObject player=(JSONObject) array.get(i);
			
			String name1 = (String) player.get("name");
			String  country = (String) player.get("country");
			String  role = (String) player.get("role");
			String  price = (String) player.get("price-in-crores");
			
			if(!country.equals("India"))
			{
				count++;
			}
			
			
		}
		System.out.println(count);
		
		Assert.assertEquals(4, count);
		
		
	}

}
