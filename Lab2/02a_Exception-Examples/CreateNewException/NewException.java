class NewException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2532514814818849347L;

	NewException() {
		super();
	}
	
	NewException(String message) {
		super(message);
	}
	
	NewException(String message, Throwable cause) {
	  super(message, cause);
	 }
	
	NewException(Throwable cause) {
	  super(cause);
	}
}
