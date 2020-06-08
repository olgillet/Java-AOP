package com.spring.music;

import org.springframework.stereotype.Component;

@Component
public class Ukulele implements IInstrument{

	@Override
	public String toString() {
		return "ukulele sound";
	}

}
