package ch26_annotation.step04;
@MyTarget	// TYPE
public class Test {
	@MyTarget	// FIELD
	private int val;
	@MyTarget	// METHOD
	public void call(@MyTarget int val) {}	// PARAMETER
}
