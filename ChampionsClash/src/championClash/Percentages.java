package championClash;

import ucigame.Image;
import ucigame.Sprite;

public class Percentages {
	    Sprite sprite;
	    Image picture;
	    int health;
	    static final int DEAD = 0;

	    Percentages(Sprite s, Image i, int h)
	    {
	        sprite = s;
	        picture = i;
	        health = h;
	        setup();
	    }

	    /**
	     * Creates 150 frames for health bars and defines the sequence
	     */
	    void setup()
	    {
	        sprite.addFrames(picture,      
	        							0, 0,
	        							150, 0,
	        							300, 0,
	        							450, 0,
	        							600, 0,
	        							750, 0,
	        							900, 0,
	        							1050, 0, 
	        							1200, 0,
	        							1350, 0,
	        							0, 80,
	        							150, 80,
	        							300, 80,
	        							450, 80,
	        							600, 80,
	        							750, 80,
	        							900, 80,
	        							1050, 80, 
	        							1200, 80,
	        							1350, 80,
	        							0, 160,
	        							150, 160,
	        							300, 160,
	        							450, 160,
	        							600, 160,
	        							750, 160,
	        							900, 160,
	        							1050, 160, 
	        							1200, 160,
	        							1350, 160,
	        							0, 240,
	        							150, 240,
	        							300, 240,
	        							450, 240,
	        							600, 240,
	        							750, 240,
	        							900, 240,
	        							1050, 240, 
	        							1200, 240,
	        							1350, 240,
	        							0, 320,
	        							150, 320,
	        							300, 320,
	        							450, 320,
	        							600, 320,
	        							750, 320,
	        							900, 320,
	        							1050, 320, 
	        							1200, 320,
	        							1350, 320,
	        							0, 400,
	        							150, 400,
	        							300, 400,
	        							450, 400,
	        							600, 400,
	        							750, 400,
	        							900, 400,
	        							1050, 400, 
	        							1200, 400,
	        							1350, 400,
	        							0, 480,
	        							150, 480,
	        							300, 480,
	        							450, 480,
	        							600, 480,
	        							750, 480,
	        							900, 480,
	        							1050, 480, 
	        							1200, 480,
	        							1350, 480,
	        							0, 560,
	        							150, 560,
	        							300, 560,
	        							450, 560,
	        							600, 560,
	        							750, 560,
	        							900, 560,
	        							1050, 560, 
	        							1200, 560,
	        							1350, 560,
	        							0, 640,
	        							150, 640,
	        							300, 640,
	        							450, 640,
	        							600, 640,
	        							750, 640,
	        							900, 640,
	        							1050, 640, 
	        							1200, 640,
	        							1350, 640,
	        							0, 720,
	        							150, 720,
	        							300, 720,
	        							450, 720,
	        							600, 720,
	        							750, 720,
	        							900, 720,
	        							1050, 720, 
	        							1200, 720,
	        							1350, 720,
	        							0, 800,
	        							150, 800,
	        							300, 800,
	        							450, 800,
	        							600, 800,
	        							750, 800,
	        							900, 800,
	        							1050, 800, 
	        							1200, 800,
	        							1350, 800,
	        							0, 880,
	        							150, 880,
	        							300, 880,
	        							450, 880,
	        							600, 880,
	        							750, 880,
	        							900, 880,
	        							1050, 880, 
	        							1200, 880,
	        							1350, 880,
	        							0, 960,
	        							150, 960,
	        							300, 960,
	        							450, 960,
	        							600, 960,
	        							750, 960,
	        							900, 960,
	        							1050, 960, 
	        							1200, 960,
	        							1350, 960,
	        							0, 1040,
	        							150, 1040,
	        							300, 1040,
	        							450, 1040,
	        							600, 1040,
	        							750, 1040,
	        							900, 1040,
	        							1050, 1040, 
	        							1200, 1040,
	        							1350, 1040,
	        							0, 1120,
	        							150, 1120,
	        							300, 1120,
	        							450, 1120,
	        							600, 1120,
	        							750, 1120,
	        							900, 1120,
	        							1050, 1120, 
	        							1200, 1120,
	        							1350, 1120
	        );

	        sprite.defineSequence("100", 100);
	        sprite.defineSequence("99", 99);
	        sprite.defineSequence("98", 98);
	        sprite.defineSequence("97", 97);
	        sprite.defineSequence("96", 96);
	        sprite.defineSequence("95", 95);
	        sprite.defineSequence("94", 94);
	        sprite.defineSequence("93", 93);
	        sprite.defineSequence("92", 92);
	        sprite.defineSequence("91", 91);
	        sprite.defineSequence("90", 90);
	        sprite.defineSequence("89", 89);
	        sprite.defineSequence("88", 88);
	        sprite.defineSequence("87", 87);
	        sprite.defineSequence("86", 86);
	        sprite.defineSequence("85", 85);
	        sprite.defineSequence("84", 84);
	        sprite.defineSequence("83", 83);
	        sprite.defineSequence("82", 82);
	        sprite.defineSequence("81", 81);
	        sprite.defineSequence("80", 80);
	        sprite.defineSequence("79", 79);
	        sprite.defineSequence("78", 78);
	        sprite.defineSequence("77", 77);
	        sprite.defineSequence("76", 76);
	        sprite.defineSequence("75", 75);
	        sprite.defineSequence("74", 74);
	        sprite.defineSequence("73", 73);
	        sprite.defineSequence("72", 72);
	        sprite.defineSequence("71", 71);
	        sprite.defineSequence("70", 70);
	        sprite.defineSequence("69", 69);
	        sprite.defineSequence("68", 68);
	        sprite.defineSequence("67", 67);
	        sprite.defineSequence("66", 66);
	        sprite.defineSequence("65", 65);
	        sprite.defineSequence("64", 64);
	        sprite.defineSequence("63", 63);
	        sprite.defineSequence("62", 62);
	        sprite.defineSequence("61", 61);
	        sprite.defineSequence("60", 60);
	        sprite.defineSequence("59", 59);
	        sprite.defineSequence("58", 58);
	        sprite.defineSequence("57", 57);
	        sprite.defineSequence("56", 56);
	        sprite.defineSequence("55", 55);
	        sprite.defineSequence("54", 54);
	        sprite.defineSequence("53", 53);
	        sprite.defineSequence("52", 52);
	        sprite.defineSequence("51", 51);
	        sprite.defineSequence("50", 50);
	        sprite.defineSequence("49", 49);
	        sprite.defineSequence("48", 48);
	        sprite.defineSequence("47", 47);
	        sprite.defineSequence("46", 46);
	        sprite.defineSequence("45", 45);
	        sprite.defineSequence("44", 44);
	        sprite.defineSequence("43", 43);
	        sprite.defineSequence("42", 42);
	        sprite.defineSequence("41", 41);
	        sprite.defineSequence("40", 40);
	        sprite.defineSequence("39", 39);
	        sprite.defineSequence("38", 38);
	        sprite.defineSequence("37", 37);
	        sprite.defineSequence("36", 36);
	        sprite.defineSequence("35", 35);
	        sprite.defineSequence("34", 34);
	        sprite.defineSequence("33", 33);
	        sprite.defineSequence("32", 32);
	        sprite.defineSequence("31", 31);
	        sprite.defineSequence("30", 30);
	        sprite.defineSequence("29", 29);
	        sprite.defineSequence("28", 28);
	        sprite.defineSequence("27", 27);
	        sprite.defineSequence("26", 26);
	        sprite.defineSequence("25", 25);
	        sprite.defineSequence("24", 24);
	        sprite.defineSequence("23", 23);
	        sprite.defineSequence("22", 22);
	        sprite.defineSequence("21", 21);
	        sprite.defineSequence("20", 20);
	        sprite.defineSequence("19", 19);
	        sprite.defineSequence("18", 18);
	        sprite.defineSequence("17", 17);
	        sprite.defineSequence("16", 16);
	        sprite.defineSequence("15", 15);
	        sprite.defineSequence("14", 14);
	        sprite.defineSequence("13", 13);
	        sprite.defineSequence("12", 12);
	        sprite.defineSequence("11", 11);
	        sprite.defineSequence("10", 10);
	        sprite.defineSequence("9", 9);
	        sprite.defineSequence("8", 8);
	        sprite.defineSequence("7", 7);
	        sprite.defineSequence("6", 6);
	        sprite.defineSequence("5", 5);
	        sprite.defineSequence("4", 4);
	        sprite.defineSequence("3", 3);
	        sprite.defineSequence("2", 2);
	        sprite.defineSequence("1", 1);
	        sprite.defineSequence("0", 0);
	 
	    }

	    Sprite getSprite()
	    {
	        return sprite;
	    }

	    /**
	     * This sets the damage to an amount depending on the integer value passed in.
	     */
	    void getDamage(int d)
	    {
	        if (health > DEAD)
	            health = d;
	        else
	            health = DEAD;
	    }

	    /**
	     * This displays how much health the sprite has left.
	     */
	    void illustrate()
	    {        
	        if (health == 100)
	            sprite.play("100");
	        if (health == 99)
	            sprite.play("99");
	        if (health == 98)
	            sprite.play("98");
	        if (health == 97)
	            sprite.play("97");
	        if (health == 96)
	            sprite.play("96");
	        if (health == 95)
	            sprite.play("95");
	        if (health == 94)
	            sprite.play("94");
	        if (health == 93)
	            sprite.play("93");
	        if (health == 92)
	            sprite.play("92");
	        if (health == 91)
	            sprite.play("91");
	        if (health == 90)
	            sprite.play("90");
	        if (health == 89)
	            sprite.play("89");
	        if (health == 88)
	            sprite.play("88");
	        if (health == 87)
	            sprite.play("87");
	        if (health == 86)
	            sprite.play("86");
	        if (health == 85)
	            sprite.play("85");
	        if (health == 84)
	            sprite.play("84");
	        if (health == 83)
	            sprite.play("83");
	        if (health == 82)
	            sprite.play("82");
	        if (health == 81)
	            sprite.play("81");
	        if (health == 80)
	            sprite.play("80");
	        if (health == 79)
	            sprite.play("79");
	        if (health == 78)
	            sprite.play("78");
	        if (health == 77)
	            sprite.play("77");
	        if (health == 76)
	            sprite.play("76");
	        if (health == 75)
	            sprite.play("75");
	        if (health == 74)
	            sprite.play("74");
	        if (health == 73)
	            sprite.play("73");
	        if (health == 72)
	            sprite.play("72");
	        if (health == 71)
	            sprite.play("71");
	        if (health == 70)
	            sprite.play("70");
	        if (health == 69)
	            sprite.play("69");
	        if (health == 68)
	            sprite.play("68");
	        if (health == 67)
	            sprite.play("67");
	        if (health == 66)
	            sprite.play("66");
	        if (health == 65)
	            sprite.play("65");
	        if (health == 64)
	            sprite.play("64");
	        if (health == 63)
	            sprite.play("63");
	        if (health == 62)
	            sprite.play("62");
	        if (health == 61)
	            sprite.play("61");
	        if (health == 60)
	            sprite.play("60");
	        if (health == 59)
	            sprite.play("59");
	        if (health == 58)
	            sprite.play("58");
	        if (health == 57)
	            sprite.play("57");
	        if (health == 56)
	            sprite.play("56");
	        if (health == 55)
	            sprite.play("55");
	        if (health == 54)
	            sprite.play("54");
	        if (health == 53)
	            sprite.play("53");
	        if (health == 52)
	            sprite.play("52");
	        if (health == 51)
	            sprite.play("51");
	        if (health == 50)
	            sprite.play("50");
	        if (health == 49)
	            sprite.play("49");
	        if (health == 48)
	            sprite.play("48");
	        if (health == 47)
	            sprite.play("47");
	        if (health == 46)
	            sprite.play("46");
	        if (health == 45)
	            sprite.play("45");
	        if (health == 44)
	            sprite.play("44");
	        if (health == 43)
	            sprite.play("43");
	        if (health == 42)
	            sprite.play("42");
	        if (health == 41)
	            sprite.play("41");
	        if (health == 40)
	            sprite.play("40");
	        if (health == 39)
	            sprite.play("39");
	        if (health == 38)
	            sprite.play("38");
	        if (health == 37)
	            sprite.play("37");
	        if (health == 36)
	            sprite.play("36");
	        if (health == 35)
	            sprite.play("35");
	        if (health == 34)
	            sprite.play("34");
	        if (health == 33)
	            sprite.play("33");
	        if (health == 32)
	            sprite.play("32");
	        if (health == 31)
	            sprite.play("31");
	        if (health == 30)
	            sprite.play("30");
	        if (health == 29)
	            sprite.play("29");
	        if (health == 28)
	            sprite.play("28");
	        if (health == 27)
	            sprite.play("27");
	        if (health == 26)
	            sprite.play("26");
	        if (health == 25)
	            sprite.play("25");
	        if (health == 24)
	            sprite.play("24");
	        if (health == 23)
	            sprite.play("23");
	        if (health == 22)
	            sprite.play("22");
	        if (health == 21)
	            sprite.play("21");
	        if (health == 20)
	            sprite.play("20");
	        if (health == 19)
	            sprite.play("19");
	        if (health == 18)
	            sprite.play("18");
	        if (health == 17)
	            sprite.play("17");
	        if (health == 16)
	            sprite.play("16");
	        if (health == 15)
	            sprite.play("15");
	        if (health == 14)
	            sprite.play("14");
	        if (health == 13)
	            sprite.play("13");
	        if (health == 12)
	            sprite.play("12");
	        if (health == 11)
	            sprite.play("11");
	        if (health == 10)
	            sprite.play("10");
	        if (health == 9)
	            sprite.play("9");
	        if (health == 8)
	            sprite.play("8");
	        if (health == 7)
	            sprite.play("7");
	        if (health == 6)
	            sprite.play("6");
	        if (health == 5)
	            sprite.play("5");
	        if (health == 4)
	            sprite.play("4");
	        if (health == 3)
	            sprite.play("3");
	        if (health == 2)
	            sprite.play("2");
	        if (health == 1)
	            sprite.play("1");
	        if (health == 0)
	            sprite.play("0");
	       
	    }
	}



