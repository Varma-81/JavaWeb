package com.ibm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface CustomAnnotation {
	String name();
	int duration();
	double[] version() default {1.0,2.0,3.0};
}
