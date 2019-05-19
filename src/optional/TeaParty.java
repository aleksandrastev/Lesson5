package optional;

public class TeaParty {

	public String welcome(String name, boolean isWomen, boolean isKnighted) {
		String prefix;
		if (isWomen) {
			prefix = "Ms.";
		} else if (isKnighted) {
			prefix = "Sir";
		} else {
			prefix = "Mr.";
		}
		return "Hello " + prefix + " " + name;
	}

}
