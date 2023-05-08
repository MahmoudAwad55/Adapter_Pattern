package adaptor_pattern;

public class JSONConverter {
	
	private String xml = "<company>3MXT</company>\r\n"
			+ "    <description>3M, based in Minnesota, may be best known for its Scotch tape and Post-It Notes, but it also produces sand paper, adhesives, medical products, computer screen filters, food safety items, stationery products and many products used in automotive, marine, and aircraft industries.</description>\r\n"
			+ "    <initial_price>44.28</initial_price>\r\n"
			+ "    <price_2002>56.27</price_2002>\r\n"
			+ "    <price_2007>95.85</price_2007>\r\n"
			+ "    <symbol>MMMO</symbol>";

	public String  convertJSON(String json) {
		return xml;
	}

}
