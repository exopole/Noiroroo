package informations;
import java.util.Vector;
import parsing.*;

public class CompetenceList {
	private Vector<Competence> compList = new Vector<Competence>();
	
	public CompetenceList(String nameFile) {
		Vector<String> fileContenant = ParsingFile.readFile(nameFile);
		for (String comp : fileContenant) {
			compList.addElement(new Competence(comp));
		}
	}
	
	public Vector<Competence> getCompList() {
		return compList;
	}
}
