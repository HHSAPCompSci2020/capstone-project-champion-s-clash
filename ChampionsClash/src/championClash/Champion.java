package championClash;

import ucigame.Image;
import ucigame.Sprite;

public class Champion {
	public Sprite sprite;
    int health;
    char leftKey;
    Image picture;
    int champX, champY, champSpeed, damage;
    boolean champHeadedRight, champCollided, hit;
    final int WEAK = 2;
    final int STRONG = 5;
    static final int MAX_HEALTH = 100;
    
    Champion(Sprite s, Image image, int speed, int frame, boolean b)
    {
        sprite = s;
        picture = image;
        champSpeed = speed;
        champHeadedRight = b;   
        sprite.framerate(frame);
        damage = 0;
    }
    
    void setup()
    {
       
    }
    
    
    
    
    /**
     *  Moves the sprite, reversing directions at the edge of the screen.
     */
    void moveCharXAxis(int other)
    {
        if(champX + sprite.width() >= other)
        {
            champHeadedRight = false;
            champSpeed = - champSpeed;
        }
        else if(champX <= 0 )
        {
            champHeadedRight = true;
            champSpeed = - champSpeed;
        }
    }

    /**
     * Moves the character down by a factor of "gravity", if it is in the air
     */
    void moveGravity(int gravity)
    {
        if(!sprite.collided())
        {
            champY = champY + gravity;
        }
    }

    /**
     * Changes the direction of the sprite
     */
    void changeDirection()
    {
        if(!champHeadedRight)
        {
            sprite.flipHorizontal();
        }
    }

    /**
     * Checks to see if the sprite is in the range of the screen
     */
    boolean inBounds(int other)
    {
        return champY < other - sprite.height();
    }

    /**
     * Plays a certain sequence of images and moves the character depending on what "attack" 
     * is passed in. 
     */
    void keyPressed(String str)
    {
        //overridden in each subclass
    }

 
    void setDamage(int a, boolean b)
    {
        if(a < 0)
        {
            damage = damage + WEAK;
        }
        else if( a > 0)
        {
            damage = damage + STRONG;
        }
        hit = false;
        moveBCHit(b);
    }

    int getDamage()
    {
        return damage;
    }

    void moveBCHit(boolean otherHeadedRight)
    {
        if(otherHeadedRight)
        {
            champX = champX + 20;
        }
        else
        {
            champX = champX - 20;
        }
        sprite.play("Crouch");
    }
    
  //getter and setter methods for fields
    //
    Sprite getSprite()
    {
        return sprite;
    }

    void setCharX(int x)
    {
        champX = x;
    }

    int getCharX()
    {
        return champX;
    }

    void setCharY(int y)
    {
        champY = y;
    }

    int getCharY()
    {
        return champY;
    }

    void setCharSpeed(int speed)
    {
        champSpeed = speed;
    }

    int getCharSpeed()
    {
        return champSpeed;
    }

    void setHeadedRight(boolean b)
    {
        champHeadedRight = b;
    }

    boolean getHeadedRight()
    {
        return champHeadedRight;
    }

    void setCharCollided(boolean boo)
    {
        champCollided = boo;
    }

    boolean getCharCollided()
    {
        return champCollided;
    }

    void setHit(boolean isHit)
    {
        hit = isHit;
    }

    boolean getHit()
    {
        return hit;
    }

}
