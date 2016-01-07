import java.util.Vector;

public class ParsingVector {
	static Vector <Integer> stringToInt(Vector<String> vect){
		Vector<Integer> result = new Vector<Integer>();
		for (String str : vect) {
			result.add(Integer.parseInt(str));
		}
		return result;
	}
	
	static Vector <Vector <Integer>> vectOfVectstringToInteger(Vector<Vector<String>> vect){
		Vector <Vector <Integer>> result = new Vector <Vector<Integer>>();
		for (Vector<String> str : vect) {
			result.add(stringToInt(str));
		}
		return result;
	}
}
