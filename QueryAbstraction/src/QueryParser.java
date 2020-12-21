
public class QueryParser {

	// instantiate a new object of the QueryParameter class
	private QueryParameter queryParameter = new QueryParameter();
	
			/*
	 * This method will parse the queryString and will return the 
	 * object of
	 * QueryParameter class
	 */
	
	public QueryParameter parseQuery(String queryString) {

		// Get the queryString from the QueryParameter class 
		queryString = QueryParameter.getQuery(); 
		return queryParameter;
	}
}
