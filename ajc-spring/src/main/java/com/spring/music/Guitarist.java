package com.spring.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Guitarist implements IMusician{
	@Autowired
	@Qualifier("ukulele")
	IInstrument instrument;
	String name;

	// Commented since we created a Constructor with Instrument param 
	public IInstrument getInstrument() {
		return instrument;
	}
	public void setInstrument(IInstrument instrument) {
		this.instrument = instrument;
	}
	

	public void play() {
		//System.out.println("Guitarist "+ this.name +" is playing " + instrument.toString());
		System.out.println("Guitarist is playing " + instrument.toString());
	}
	
	/*
	public Guitarist(String name, Guitar guitar) {
		this.name = name;
		this.instrument = guitar;
	}
	*/
	
}
