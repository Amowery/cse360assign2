//Angelique Mowery

package cse360assign2;

public class AddingMachine {

	private int total;
	private StringBuffer Calc; 
	/**
	 *This method stores the initial values for variable used in
	 *the AddingMachine. StringBuffer used in order to empty string. 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		Calc = new StringBuffer("0"); 
	}
	/**
	 *This method 
	 * @return total value after calculations
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * This method adds a value to the total and appends " + value " to string 
	 * @param value is the value being added to the total
	 */
	public void add (int value) {
		total += value; 
		Calc.append(" + "+ value);
		
	}
	/**
	 * This method subtracts a value from the total and append " - value" to string
	 * @param value is value being subtracted from total
	 */
	public void subtract (int value) {
		total = total - value; 
		Calc.append(" - "+ value);
	}
	/**
	 * This method returns the Calculations in string format
	 * (i.e) "0 + 5 - 3 + 2" 
	 */
	public String toString () {
		return Calc.toString();
	}
	/**
	 * This method clears the string that is returned by the toString() method
	 * by resetting stringBuffer to original value and total to original value
	 */
	public void clear() {
		Calc.delete(0, Calc.length());
		total = 0; 
	}
}
