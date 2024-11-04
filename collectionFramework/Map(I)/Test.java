import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"Your Name");
		map.put(2,"I Want to Eat Your Pancreas");
		map.put(3,"Weathering with You");
		for(Map.Entry entry:map.entrySet())
			System.out.println("S.no: "+entry.getKey()+" "+entry.getValue());
		System.out.println("Delete: "+map.put(3,"Suzume"));
		System.out.println("Update\n"+map);
	}

}