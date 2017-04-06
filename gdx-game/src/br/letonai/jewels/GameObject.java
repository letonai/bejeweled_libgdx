package br.letonai.jewels;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;
import android.view.*;

public abstract class GameObject {
	
	protected int x,y;
	protected float xSpeed,ySpeed;
	protected Sprite sprite;
	protected Texture texture;
	

	public  GameObject(Sprite sp, int x, int y){
		this.x=width;
		this.y=height;
		this.sprite=sp
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

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getWidth()
	{
		return width;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getHeight()
	{
		return height;
	}
	
	public void draw(SpriteBatch sb){
		sp.draw(sb);
	}

	
	
}
