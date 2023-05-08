package adaptor_pattern;



public class AdapterMain {
	public static void main(String[] args) {
		
		 String json = "    {\r\n"
		 		+ "        \"company\": \"3M\",\r\n"
		 		+ "        \"description\": \"3M, based in Minnesota, may be best known for its Scotch tape and Post-It Notes, but it also produces sand paper, adhesives, medical products, computer screen filters, food safety items, stationery products and many products used in automotive, marine, and aircraft industries.\",\r\n"
		 		+ "        \"initial_price\": 44.28,\r\n"
		 		+ "        \"price_2002\": 56.27,\r\n"
		 		+ "        \"price_2007\": 95.85,\r\n"
		 		+ "        \"symbol\": \"MMM\"\r\n"
		 		+ "    }";
		 JSONConverter jsonConverter = new JSONConverter();
		 JSONToXMLAdapter jsonToXMLAdapter = new JSONToXMLAdapter(jsonConverter);
		 String xml = jsonToXMLAdapter.convertjsontoxml("json");
		 System.out.println(xml);
	}

}
