package com.alibaba.fallback;

import org.springframework.stereotype.Component;

import com.alibaba.rpc.SchedualServiceHi;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {

	@Override
	public String sayHiFromProvider(String name) {
		return "hi, " + name + ", server is business!!";
	}

}
