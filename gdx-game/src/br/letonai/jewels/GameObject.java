package br.letonai.jewels;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;


public class GameObject {
	
	private int x,y;
	private float xSpeed,ySpeed;
	private Sprite sprite;
	private Texture texture;
	
	public GameObject(){
	}
	
	public GameObject(Texture sp){
		this.texture=sp;
	}
	
	public void setTexture(Texture txt){
		this.texture=txt;
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
		sb.draw(this.texture,x,y);
	}

	
	
}
