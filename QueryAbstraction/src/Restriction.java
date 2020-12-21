/*
 * This class is used for storing name of field, condition and value for 
 * each conditions
 * generate getter and setter for this class,
 * Also override toString method
 * */



public class Restriction {
	
	String name; 
	String value; 
	String condition; 
	
	@Override
	public String toString() {
		return "Restriction [name=" + name + ", value=" + value + ", condition=" + condition + "]";
	}

	// Getters/Setters 
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getValue() {
		return value;
	}

	protected void setValue(String value) {
		this.value = value;
	}

	protected String getCondition() {
		return condition;
	}

	protected void setCondition(String condition) {
		this.condition = condition;
	}

		// Write logic for constructor
		public Restriction(String name, String value, String condition) {

		}
}
