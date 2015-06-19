package com.comsmp.annotaion;

import java.lang.annotation.*;
/**
 * Author: Jiangtao He; Email: ross.jiangtao.he@gmail.com
 * Date: 2012-1-29
 * Since: MyJavaExpert v1.0
 * Description: class annotation（类注解定义）
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE) 
public @interface MyClassAnnotation 
{
    String uri();
    String desc();
}