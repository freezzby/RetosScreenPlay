/*
  @since 25/04/2018
 */
package utilities;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created this annotation to copy from the Excel file
 * to the .feature file before execution
 *
 * @since 25/04/2018
 * @author carmarlo
 *
 */
// @Retention(RUNTIME)
// @Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BeforeSuite {

}
