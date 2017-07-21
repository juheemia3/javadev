package anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //printannotation을 method라는 타겟에 적용하겠다.
@Retention(RetentionPolicy.RUNTIME)//수행중(runtime)에 적용
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
