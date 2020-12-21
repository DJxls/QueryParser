/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * generate getter and setter for this class,
 * Also override toString method
 * */



public class AggregateFunction {
	
	String field; 
	String function; 
	
	@Override
	public String toString() {
		return "AggregateFunction [field=" + field + ", function=" + function + "]";
	}

	// Getters/Setters
	protected String getField() {
		return field;
	}

	protected void setField(String field) {
		this.field = field;
	}

	protected String getFunction() {
		return function;
	}

	protected void setFunction(String function) {
		this.function = function;
	}

		// Write logic for constructor
		public AggregateFunction(String field, String function) {

		}
}
