package br.letonai.jewels;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.utils.*;
import android.util.Log;

//import android.view.*;

public class MyGdxGame implements ApplicationListener
{
	//Texture texture;
	Texture ball;
	SpriteBatch batch;
	GameObject player;
	Sprite sprite;
	int count;
	//teste celular

	@Override
	public void create()
	{
		count=0;
		//texture = new Texture(Gdx.files.internal("android.jpg"));
		batch = new SpriteBatch();
		ball = new Texture(Gdx.files.internal("images.jpg"));
		player = new GameObject(ball);
		//player.setTexture(ball);
		//Sprite s = new Sprite(ball);
	}

	@Override
	public void render()
	{        
		Vector3 touchPos = new Vector3();
		Vector2 gravity = new Vector2(0,-1);
		float t=(float) TimeUtils.millis();
		
		if(false && Gdx.input.isTouched()){
			touchPos.set(Gdx.input.getX(),Gdx.input.getY(),0);
		}else{
			touchPos.set(Gdx.graphics.getWidth() / 4, 
		    Gdx.graphics.getWidth() / 2, Gdx.graphics.getWidth() / 2);
		}
		
	    Gdx.gl.glClearColor(0, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(texture, Gdx.graphics.getWidth() / 4, 0, 
		//		   Gdx.graphics.getWidth() / 2, Gdx.graphics.getWidth() / 2);
		//batch.draw(texture, /*Gdx.graphics.getWidth()-*/touchPos.x,Gdx.graphics.getHeight()-touchPos.y);
		player.draw(batch);
		
		player.setX(touchPos.x-player.getTexture().getWidth()/2);
		//player.setX(MathUtils.sin(t*player.getY())-player.getTexture().getWidth()/2);
		//player.setY((Gdx.graphics.getHeight()-touchPos.y)-player.getTexture().getHeight()/2);
		player.setY((player.getY()*MathUtils.sin(count++))-player.getTexture().getHeight()/2);
		Log.i("bejeweled","SIN: "+(player.getY()*MathUtils.sin(t)));
		batch.end();
	}

	@Override
	public void dispose()
	{
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
