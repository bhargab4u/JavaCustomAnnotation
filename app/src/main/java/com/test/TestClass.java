package com.test;

import java.lang.reflect.Field;

public class TestClass {
	
	public TestClass () {
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field f : fields) {
            System.out.println(f.getName());
            if (f.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation a = f.getAnnotation(MyAnnotation.class);
                this.myvariable = a.val();
            }
        }
	}

    @MyAnnotation(val = "Hello World")
    String myvariable;    
}
