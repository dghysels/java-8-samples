package annotations;
import java.lang.annotation.Annotation;


//Method declarations must not have any parameters or a throws clause. 
//Return types are restricted to primitives
public @interface Identity{
	String first();
	String last();
}
	
