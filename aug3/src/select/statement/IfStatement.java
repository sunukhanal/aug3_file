package select.statement;

public class IfStatement {

	public static void main(String[] args) {
		int x=10;
		// if condition is true
		//then body of if statement will be executed
		//otherwise not
		if(x<=10) {
			System.out.println("X is greater than 10");
		}
		//it will execute in each case (condition is true/false)
		//because this statement is out of the body of IF STATEMENT
		System.out.println("out of if body");

	}

}
