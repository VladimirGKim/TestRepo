/**
 * Implements a visitor that prints the field colors. 
 * 
 * @author Marcus
 */
public class ColorPrinter implements Visitor { // TODO: add interface
	
	/**
	 * Prints the field color at the current position
	 * using System.out.print (not println).
	 */
	// TODO: override Visitor.nextField
	public void nextRow() {
		System.out.println();
	}
	
	/**
	 * Prints a new line using System.out.println.
	 */
	// TODO: override Visitor.nextField
	public void nextField(Field fields) {
		System.out.print(fields.getColor());
	}

}
