package br.letonai.jewels;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;


public class GameObject extends Sprite{
	
	private float x,y;
	private float xSpeed,ySpeed;
	
	//private Texture texture;
	
	public GameObject(){
	}
	
	public GameObject(Texture sp){
		super(sp);
		//this.texture=sp;
	}
	
	public void setTexture(Texture txt){
		super.setTexture(txt);
		//this.texture=txt;
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

	public void setX(float x)
	{
		this.x = x;
	}

	public float getX()
	{
		return x;
	}

	public void setY(float y)
	{
		this.y = y;
	}

	public float getY()
	{
		return y;
	}
	
	public void draw(SpriteBatch sb){
		sb.draw(this.getTexture(),x,y);
	}

	
	
}
