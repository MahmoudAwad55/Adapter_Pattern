package adaptor_pattern;


public class JSONToXMLAdapter implements XMLConverter {
	
	  private JSONConverter jsonConverter;
	  
	  public JSONToXMLAdapter(JSONConverter jsonConverter) { 
		  this.jsonConverter = jsonConverter;
	  }
	  

	@Override
	public String convertjsontoxml(String json) {
		// implementation 
	    String xml = jsonConverter.convertJSON(json);
		return xml;
	}
	
	
	
	
}
