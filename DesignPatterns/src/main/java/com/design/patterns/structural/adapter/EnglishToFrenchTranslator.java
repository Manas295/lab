package com.design.patterns.structural.adapter;
/*
FrenchSpeaker is the Adaptee, providing functionality in French.
EnglishSpeaker is the Target Interface.
Translator is the Adapter, converting English messages to French.
EnglishClient is the Client, using the services of EnglishSpeaker.

 */
// Adaptee
class FrenchSpeaker {
	public void speakFrench(String message) {
		System.out.println("Speaking in French: " + message);
	}
}

// Target Interface
interface EnglishSpeaker {
	void speakEnglish(String message);
}

// Adapter
class Translator implements EnglishSpeaker {
	private FrenchSpeaker frenchSpeaker;

	public Translator(FrenchSpeaker frenchSpeaker) {
		this.frenchSpeaker = frenchSpeaker;
	}

	@Override
	public void speakEnglish(String message) {
		String frenchMessage = translateToFrench(message);
		frenchSpeaker.speakFrench(frenchMessage);
	}

	private String translateToFrench(String message) {
		// Simplified translation logic
		return message.replace("Hello", "Bonjour").replace("Thank you", "Merci");
	}
}

// Client
class EnglishClient {
	private EnglishSpeaker speaker;

	public EnglishClient(EnglishSpeaker speaker) {
		this.speaker = speaker;
	}

	public void express(String message) {
		speaker.speakEnglish(message);
	}
}

// Main class to demonstrate the adapter pattern
public class EnglishToFrenchTranslator {
	public static void main(String[] args) {
		FrenchSpeaker frenchSpeaker = new FrenchSpeaker();
		Translator translator = new Translator(frenchSpeaker);
		EnglishClient client = new EnglishClient(translator);

		client.express("Hello! Thank you for the meeting.");
	}
}
