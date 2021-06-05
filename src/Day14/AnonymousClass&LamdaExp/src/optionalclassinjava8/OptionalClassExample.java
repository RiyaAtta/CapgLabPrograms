package optionalclassinjava8;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) throws StringNotFoundException {
		// TODO Auto-generated method stub
		String[] str= new String[10];
		str[9]="This is a String";
		str[8]="is a String";
		str[7]="a String";
		Optional<String> emptyOp = Optional.empty();
		System.out.println(emptyOp);
		Optional<String> value=Optional.of(str[9]);
		System.out.println(value);
		System.out.println("Filtered Values : "+value.filter((s)->s.equals("This is a String")));
		System.out.println(value.get());
		System.out.println("Hashcode of Value = "+value.hashCode());
		System.out.println("Is Value non-empty = "+value.isPresent());
		System.out.println("Nullable in Optional Class = "+Optional.ofNullable(emptyOp));
		System.out.println("Nullable in Optional Class = "+Optional.ofNullable(value));
		System.out.println("OrElse in OptionalClass = "+value.orElse("value is not present"));
		System.out.println("OrElse in OptionalClass = "+value.orElseThrow(()->new StringNotFoundException("String is empty")));
		System.out.println("OrElse in OptionalClass = "+emptyOp.orElseThrow(()->new StringNotFoundException("String is empty")));
	}

}