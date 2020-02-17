package CodingTest.CodingTest;
import java.util.Arrays;
import java.util.HashMap;

public class CodingTest {
	public void codingTest(String code) {
		HashMap<String, String[]> codeMaps = new HashMap<String, String[]>();
		codeMaps.put("0", new String[]{"0"});
		codeMaps.put("1", new String[]{"1"});
		codeMaps.put("2", new String[]{"2","a","b","c"});
		codeMaps.put("3", new String[]{"3","d","e","f"});
		codeMaps.put("4", new String[]{"4","g","h","i"});
		codeMaps.put("5", new String[]{"5","j","k","l"});
		codeMaps.put("6", new String[]{"6","m","n","o"});
		codeMaps.put("7", new String[]{"7","p","q","r","s"});
		codeMaps.put("8", new String[]{"8","t","u","v"});
		codeMaps.put("9", new String[]{"9","w","x","y","z"});
		codeMaps.put("*", new String[]{"*"});
		codeMaps.put("#", new String[]{"#"});
		
		//
		if(code.length()==1) {
			String cs [] = codeMaps.get(code);
			System.out.println(Arrays.toString(cs));
		}else if(code.length()==2) {
			String cs1 [] = codeMaps.get(code.charAt(0)+"");
			String cs2 [] = codeMaps.get(code.charAt(1)+"");
			for (int i = 0; i < cs1.length; i++) {
				for (int j = 0; j < cs2.length; j++) {
					System.out.println(cs1[i]+cs2[j]);
				}
			}
			
		}else if(code.length()>2) {
			//
			System.out.println("");
		}
		
	}
}