package com.springcore.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("beanObject")
public class StereoTypeBean {
	public int getHashCode() {
		return this.hashCode();
	}
}
