package optional;

/*
 * 1. In a Runner class, make a SeaCreature called "Spongebob". Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeaCreature {

	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		spongebob.eat();
		spongebob.laugh();

		SeaCreature patrick = new SeaCreature("patrick");
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();

		SeaCreature squidward = new SeaCreature("squidward");
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
