package curs19;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.RUNTIME) //unde vrei sa o pui )
@Target(ElementType.METHOD)		//la ce nivel sa ruleze
public @interface RuleazaDoarPeGermania {

}
