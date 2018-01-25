package com.vicpin.extrasprocessor.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by victor on 25/1/18.
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ForActivity {
    Class activityClass();
}