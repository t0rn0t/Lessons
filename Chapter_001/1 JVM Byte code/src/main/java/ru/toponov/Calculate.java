package toponov;

public class Calculate {
	boolean flag = true;
	public String echo(String value){
		return String.format("%s %s %s", value, value, value);
	}
	public static void main(String[] args){
		Calculate calc = new Calculate();
		if (!flag)
			System.out.println(calc.echo("Hello!!!!!"));

	}
}