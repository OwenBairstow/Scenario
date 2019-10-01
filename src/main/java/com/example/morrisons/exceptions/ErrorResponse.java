package com.example.morrisons.exceptions;

	import java.util.List;
	import javax.xml.bind.annotation.XmlRootElement;
	 
	// This class sets out the layout for the error messages
	@XmlRootElement(name = "error")
	public class ErrorResponse
	{
	    public ErrorResponse(String message, List<String> details) {
	        super();
	        this.setMessage(message);
	        this.setDetails(details);
	    }
	 

		//General error message about nature of error
	    private String message;
	 
	    //Specific errors in API request processing
	    private List<String> details;
	    
	    
	    public List<String> getDetails() {
			return details;
		}

		public void setDetails(List<String> details) {
			this.details = details;
		}
		
		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	 
	    //Getter and setters
	    
	}
