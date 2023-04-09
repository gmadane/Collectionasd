package sapient_practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class arr1 {

	public static void main(String[] args) 
	{
		String str="ganeshmadaneganesh";		
		char c[]=str.toCharArray();
		int distinct;
		Map<Character, Integer> m=new HashMap<Character,Integer>();
		
		for (char d : c) {
			if(m.containsKey(d))
			{
				m.put(d, m.get(d)+1);
			}
			else
			{
				m.put(d, 1);
			}			
		}		
		System.out.println(Collections.singletonList(m));
		
	for(Map.Entry<Character,Integer> entry: m.entrySet())	
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey()+"  " + entry.getValue());
		}
		else
		{
			System.out.println(entry.getKey()+"  " + entry.getValue());
		}
	}
		
	}
}
