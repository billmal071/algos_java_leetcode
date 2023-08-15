import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// class annotation
@Target({ElementType.METHOD, ElementType.TYPE}) /* For what you can use the annotation for */
@Retention(RetentionPolicy.RUNTIME) /* how long the annotation runs */
public @interface LearnAnnotations {

}
