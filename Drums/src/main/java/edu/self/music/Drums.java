package edu.self.music;

import java.lang.Thread;

import java.util.Random;
import java.util.Scanner;

import org.jfugue.Player;
import org.jfugue.Pattern;
import org.jfugue.Rhythm;

public class Drums {

    public static void main(String[] args) {

        Player player = new Player();
		Rhythm rhythm1 = new Rhythm();
		Rhythm rhythm1Var = new Rhythm();
		Rhythm rhythm1Long = new Rhythm();

		rhythm1.setLayer(1, "o.........o...o.o....o..o.......");
		rhythm1.setLayer(2, "....*.......*.......*.......*...");
		rhythm1.setLayer(3, "................................");
		rhythm1.setLayer(4, "................................");

		rhythm1Var.setLayer(1, "..o...o.o....o..o.......");
		rhythm1Var.setLayer(2, "....*.......*.......*...");
		rhythm1Var.setLayer(3, "........................");
		rhythm1Var.setLayer(4, "........................");

		
		rhythm1Long.setLayer(1, "o.........o...o.o....o..o...............................");
		rhythm1Long.setLayer(2, "....*.......*.......*.......*.......*.......*.......*...");
		rhythm1Long.setLayer(3, "........................................................");
		rhythm1Long.setLayer(4, "!.......................................................");

		rhythm1.addSubstitution('o', "[BASS_DRUM]s");
		rhythm1.addSubstitution('*', "[ACOUSTIC_SNARE]s");
		rhythm1.addSubstitution('^', "[PEDAL_HI_HAT]s");
		rhythm1.addSubstitution('!', "[CRASH_CYMBAL_1]s");
		rhythm1.addSubstitution('.', "Rs");

		rhythm1Var.addSubstitution('o', "[BASS_DRUM]s");
		rhythm1Var.addSubstitution('*', "[ACOUSTIC_SNARE]s");
		rhythm1Var.addSubstitution('^', "[PEDAL_HI_HAT]s");
		rhythm1Var.addSubstitution('!', "[CRASH_CYMBAL_1]s");
		rhythm1Var.addSubstitution('.', "Rs");

		rhythm1Long.addSubstitution('o', "[BASS_DRUM]s");
		rhythm1Long.addSubstitution('*', "[ACOUSTIC_SNARE]s");
		rhythm1Long.addSubstitution('^', "[PEDAL_HI_HAT]s");
		rhythm1Long.addSubstitution('!', "[CRASH_CYMBAL_1]s");
		rhythm1Long.addSubstitution('.', "Rs");

        Pattern rhythm1Pat = rhythm1.getPattern();
        Pattern rhythm1VarPat = rhythm1Var.getPattern();
        Pattern rhythm1LongPat = rhythm1Long.getPattern();

		Pattern wholeSong = new Pattern();

		wholeSong.add(rhythm1Pat);
		wholeSong.add(rhythm1VarPat);
		wholeSong.add(rhythm1VarPat);
		wholeSong.add(rhythm1VarPat);
		wholeSong.add(rhythm1LongPat);
		wholeSong.add(rhythm1LongPat);
		wholeSong.add(rhythm1LongPat);
		wholeSong.add(rhythm1LongPat);

        player.play(wholeSong);
        player.close();
    }
}