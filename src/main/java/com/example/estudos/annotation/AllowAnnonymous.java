package com.example.estudos.annotation;

import com.example.estudos.entity.enums.ValidationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( ElementType.METHOD )
@Retention( RetentionPolicy.RUNTIME)
public @interface AllowAnnonymous {

    ValidationType validationType() default ValidationType.ANNONYMOUS;

}
