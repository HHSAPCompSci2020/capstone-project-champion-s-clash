package championClash;
import java.awt.Dimension;

import javax.swing.JFrame;

import ucigame.Image;
import ucigame.Sound;
import ucigame.Sprite;
import ucigame.Ucigame;

public class ChampionsClash extends Ucigame{
	
	
    final int gravity = 4;
    static final int DEAD = 0;
    Sound maintheme = getSound("sounds/maintheme.wav");
    Sound selected = getSound("sounds/selected-ok.wav");
    Sound go = getSound("sounds/go-command.wav");
    Champion player1;
    Champion player2;
	
	public ChampionsClash() {
		
	}

	
}
