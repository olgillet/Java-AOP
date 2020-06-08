package com.spring.music;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements IInstrument{

	@Override
	public String toString() {
		return "guitar sound";
	}

}
