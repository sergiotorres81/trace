package org.trc.aop.logging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Loggable {

	public boolean getter() default false;

	public boolean setter() default false;

	public boolean publicMethods() default true;

	public boolean privateMethods() default false;

}
