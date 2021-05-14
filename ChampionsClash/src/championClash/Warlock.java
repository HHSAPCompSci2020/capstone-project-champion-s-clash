package championClash;

import ucigame.Image;
import ucigame.Sprite;

public class Warlock extends Champion{
    
	Warlock(Sprite sprite, Image image, int speed, int frame, boolean b)
    {
        super(sprite, image, speed, frame, b);
        setup();
    }

    void setup()
    {
        sprite.addFrames(picture,      
            0, 0,
            100, 0,
            200, 0,
            300, 0,
            250, 0,
            0, 100,
            100, 100,
            300, 100,
            400, 100,
            500, 100,
            600, 100,
            0, 300,
            100, 300,
            200, 300,
            300, 300,
            200, 400,
            300, 400,
            500, 400, 
            600, 400, 
            0, 500,
            100, 500,
            200, 500,
            300, 500,
            400, 500,
            500, 500,
            600, 500,
            700, 500,
            0, 600,
            100, 600,
            200, 600,
            300, 600,
            400, 600,
            500, 600,
            600, 600,
            0, 700,
            100, 700,
            200, 700,
            300, 700,
            400, 700,
            500, 700,
            0, 900,
            100, 900,
            200, 900,
            300, 900,
            400, 900,
            500, 900,
            600, 900,
            700, 900,
            800, 900,
            900, 900,
            1000, 900,
            1000, 800,
            0, 800,
            100, 800,
            200, 800,
            300, 800,
            400, 800,
            500, 800
        );

        sprite.defineSequence("Stand", 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3);
        sprite.defineSequence("Jump", 5, 5, 6, 6, 7, 7, 8, 8, 9, 9);
        sprite.defineSequence("Fall", 10);
        sprite.defineSequence("Run", 11, 11, 12, 12, 13, 13, 14, 14);
        sprite.defineSequence("Crouch", 15);
        sprite.defineSequence("Basic Combo", 19, 20, 21, 22, 23, 24, 25, 26);
        sprite.defineSequence("Special", 52, 53, 54, 55, 56, 57);

        sprite.play("Stand");
    }

    /**
     * This plays the sequence of whatever the warlock will do when each key is pressed
     */
    void keyPressed(String str)
    {
        if(!champCollided)
            sprite.defineSequence("Stand", 10);
        else 
            sprite.defineSequence("Stand", 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3);

        if(str.equals("WandA"))
        {
            champY = champY - 7;
            champX = champX - 7;
            champHeadedRight = false;
            sprite.play("Jump");
        }
        else if(str.equals("WandD"))
        {
            champY = champY - 7;
            champX = champX + 7;
            champHeadedRight = true;
            sprite.play("Jump");
        }
        else if(str.equals("W"))
        {
            champY = champY - 7;
            sprite.play("Jump");
        }
        else if(str.equals("D"))
        {
            champX = champX + 10;
            champHeadedRight = true;
        if(!champCollided)
        {
                sprite.play("Fall");
            }
            else 
            {
                sprite.play("Run");
            }
        }
        else if(str.equals("A"))
        {
            champX = champX - 10;
            champHeadedRight = false;
            if(!champCollided)
                sprite.play("Fall");
            else 
                sprite.play("Run");
        }
        else if(str.equals("S"))
        {
            if(champCollided)
                sprite.play("Crouch");
        }
        
        else if(str.equals("Shift"))
        {
            if(champCollided)    
                sprite.play("Special Attack");
        }
       
        else if(str.equals("T"))
        {
            if(champCollided)
                sprite.play("Basic Combo");
        }
    }
}


