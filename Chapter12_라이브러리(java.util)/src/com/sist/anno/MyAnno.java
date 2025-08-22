package com.sist.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
// @MyAnno("login")
@Retention(RUNTIME)
@Target(METHOD)
public @interface MyAnno {

}
