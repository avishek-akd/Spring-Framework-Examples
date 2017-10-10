package com.avishek.spring;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	
	
	@Override
	public Object postProcessBeforeInitialization(Object obj, String bname) throws BeansException {
		System.out.println("postProcessBeforeInitialization:-"+bname);
		
		Class cls =  obj.getClass();
		Class inter[] = cls.getInterfaces();
		for (Class class1 : inter) {
			String iname = class1.getSimpleName();
			if (iname.equals("XYZ")){
				System.out.println("Yes\t"+cls.getSimpleName()+"\timplement XYZ interface");
				//Check Reflection API to invoke a method Dynamicly
				Class cls1 = XYZ.class;
				Method method[] = cls1.getMethods();
				for (Method method2 : method) {
					System.out.println(method2.getName());
					try {
						method2.invoke(obj);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			}
			
			
		}
		
		
		return obj;
	}
	
	
	
	@Override
	public Object postProcessAfterInitialization(Object obj, String bname) throws BeansException {
		System.out.println("postProcessAfterInitialization:-"+bname);
		
		Class cls = obj.getClass();
		Method m[] = cls.getDeclaredMethods();
		//System.out.println(m.length);
		for (Method method : m) {
			if (method.getAnnotation(MyXYZ1.class)!=null) {
				try {
					method.invoke(obj);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			/*System.out.println(method.getName());
			System.out.println(method.getAnnotation(MyXYZ1.class));
			System.out.println(method.getName());
			Annotation ann[] = method.getAnnotations();
			for (Annotation annotation : ann) {
				String ann1 = annotation.toString();
				System.out.println(ann1);
				//not work
			}*/
		}
		
		return obj;
	}

	

}
