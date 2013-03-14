package u3a3;

public class ParseException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Create a parse exception
	 * @param what description of the reason
	 * @param offset offset of the input string where the problem occured
	 */
	public ParseException(String what, int offset) {
		super(String.format("Parsing failed at offset %d: %s", offset, what));
	}
}
