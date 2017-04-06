package br.letonai.jewels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;

public class Player extends GameObject implements InputProcessor{
	
	private Sprite sp
	private Texture texture;
	
	public Player(Texture txt,int x, int y){
		super(x,y);
		this.texture=txt;
	}
	

}
