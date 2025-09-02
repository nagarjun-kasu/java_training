package constructors;

public class SearchDocuments {
	
	String id;
	String invoiceNumber;
	String invoiceDate;
	
	SearchDocuments(){
		id = "";
		invoiceNumber="";
		invoiceDate = "";
		
	}
	
	void fillCrieteria(String value) {
		//Reusable.sendKeys(invoiceNumber, value);
	}
	
	public static void main(String[] args) {
		SearchDocuments obj=new SearchDocuments();
		
	}
	
	
	

}
