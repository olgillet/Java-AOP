package com.spring.music;

import org.springframework.stereotype.Component;

@Component
public class Synth implements IInstrument{

	@Override
	public String toString() {
		return "synth sound";
	}

}
