package zhujie;

import java.lang.annotation.*;

/**
 * @Target
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(value = {ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})
public @interface MyAnno3 {
}
