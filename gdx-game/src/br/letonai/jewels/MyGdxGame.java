package br.letonai.jewels;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;

//import android.view.*;

public class MyGdxGame implements ApplicationListener
{
	Texture texture;
	Texture ball;
	SpriteBatch batch;
	Player player;
	//teste celular

	@Override
	public void create()
	{
		texture = new Texture(Gdx.files.internal("android.jpg"));
		batch = new SpriteBatch();
		ball = new Texture(Gdx.files.internal("android.jpg"));
		player = new Player(ball,0,0);
		//teste
		
	}

	@Override
	public void render()
	{        
		Vector3 touchPos = new Vector3();
		Vector2 gravity = new Vector2(0,-1);
		
	
		if(false && Gdx.input.isTouched()){
			
			touchPos.set(Gdx.input.getX(),Gdx.input.getY(),0);
			
			}else{
				touchPos.set(Gdx.graphics.getWidth() / 4, 
					   Gdx.graphics.getWidth() / 2, Gdx.graphics.getWidth() / 2);
			}
	    Gdx.gl.glClearColor(1, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(texture, Gdx.graphics.getWidth() / 4, 0, 
		//		   Gdx.graphics.getWidth() / 2, Gdx.graphics.getWidth() / 2);
		//batch.draw(texture, /*Gdx.graphics.getWidth()-*/touchPos.x,Gdx.graphics.getHeight()-touchPos.y);
		player.draw(batch);
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
