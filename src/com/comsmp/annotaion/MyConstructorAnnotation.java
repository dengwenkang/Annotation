package com.comsmp.annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Author: Jiangtao He; Email: ross.jiangtao.he@gmail.com
 * Date: 2012-1-29
 * Since: MyJavaExpert v1.0
 * Description: Constructor annotation （默认构造方法注解定义）
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.CONSTRUCTOR) 
public @interface MyConstructorAnnotation 
{
    String uri();
    String desc();
}