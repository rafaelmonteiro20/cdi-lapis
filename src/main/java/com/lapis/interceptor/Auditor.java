package com.lapis.interceptor;

import java.io.Serializable;
import java.lang.reflect.Method;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Auditavel
@Interceptor
public class Auditor implements Serializable {

	private static final long serialVersionUID = 1L;

	@AroundInvoke
	public Object auditar(InvocationContext context) throws Exception {
		
		Method method = context.getMethod();
		Object target = context.getTarget();
			
		System.out.printf("auditando o método: '%s' do objeto: '%s' \n", method, target);
			
		Object object = context.proceed();
	
		System.out.println("Auditado...");
		
		return object;
	}

}