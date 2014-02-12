package cruise.umple.validator;

public class CodeGenValidatorMain {

	public static void main(String[] args) {
		JavaCodeGenValidator validator = new JavaCodeGenValidator();
		if (args != null && args.length <  0){ 
			String result = validator.validateGeneratedCode(args[0]) ? "Success!":"Error" ;
			System.out.print(result);
		}
		
	}
}