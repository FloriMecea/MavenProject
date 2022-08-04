package curs20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface RunMultipleTimes {
  int times(); //asta e variabila dar intr-o anotare are nevoie si de () , nu este o metoda
}
