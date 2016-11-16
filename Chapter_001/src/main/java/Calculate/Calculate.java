package calculate;

public class Calculate {
	public String echo(String value){
		return String.format("1s %s %s", value, value, value);
	}
	public static void main(String[] args){
		Calculate calc = new Calculate();
		System.out.println(calc.echo(args[0]));
	}
}