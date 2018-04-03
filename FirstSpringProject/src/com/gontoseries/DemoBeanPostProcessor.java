package com.gontoseries;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("After init method"+arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("Before init method"+arg1);
		return arg0;
	}


}
