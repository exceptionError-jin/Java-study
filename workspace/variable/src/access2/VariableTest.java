package access2;

import access1.Variable;

public class VariableTest extends Variable{
	public static void main(String[] args) {
		Variable variable = new Variable(10);
		System.out.println(variable.getData4());
		VariableTest variableTest = new VariableTest();
	}
}
