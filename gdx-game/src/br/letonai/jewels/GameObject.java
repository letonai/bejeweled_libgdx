package br.letonai.jewels;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;


public class GameObject {
	
	protected int x,y;
	protected float xSpeed,ySpeed;
	protected Sprite sprite;
	protected Texture texture;
	

	public  GameObject(Texture sp, int x, int y){
		this.x=x;
		this.y=y;
		//this.sprite=sp
		this.texture=sp;
	}

	public void setXSpeed(float xSpeed)
	{
		this.xSpeed = xSpeed;
	}

	public float getXSpeed()
	{
		return xSpeed;
	}

	public void setYSpeed(float ySpeed)
	{
		this.ySpeed = ySpeed;
	}

	public float getYSpeed()
	{
		return ySpeed;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getX()
	{
		return x;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public int getY()
	{
		return y;
	}
	
	public void draw(SpriteBatch sb){
		sb.draw(texture,x,y);
	}

	
	
}
