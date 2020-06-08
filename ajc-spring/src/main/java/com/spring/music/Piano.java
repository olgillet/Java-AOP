package com.spring.music;

import org.springframework.stereotype.Component;

@Component
public class Piano implements IInstrument{

	@Override
	public String toString() {
		return "piano sound";
	}

}
