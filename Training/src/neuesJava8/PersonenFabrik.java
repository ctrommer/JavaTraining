package neuesJava8;

@FunctionalInterface
public interface PersonenFabrik<P extends Person> {
	P erzeuge( String name );	
}
