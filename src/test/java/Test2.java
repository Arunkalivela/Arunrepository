import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void role() throws IOException, ParseException
	{
		JSONParser jsonparser=new JSONParser(); 
		
		FileReader reader= new FileReader("C:\\Users\\Arun Kumar KR\\Eclipse folder\\arunPractice\\TestVagrant\\resource\\File.json");
		
		Object obj = jsonparser.parse(reader);

		JSONObject playerobj=(JSONObject)obj;
		
		JSONArray array = (JSONArray) playerobj.get("player");
		
		
		int role_count=0;
		
		for(int i=0;i<array.size();i++)
		{
			JSONObject player=(JSONObject) array.get(i);
			
			String name1 = (String) player.get("name");
			String  country = (String) player.get("country");
			String  role = (String) player.get("role");
			String  price = (String) player.get("price-in-crores");
			
	
			
			if(role.equals("Wicket-keeper"))
			{
				role_count++;
			}
			
		}
		
		System.out.println(role_count);
		
		Assert.assertEquals(1, role_count);
	}
	
}

