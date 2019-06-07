package com.pcadventure.game.Tutorials;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Images extends ApplicationAdapter {
    SpriteBatch batch;
    Texture pic;

    @Override
    public void create () {
        batch = new SpriteBatch();
        pic = new Texture("D:\\FinalProject\\core\\assets\\Fries.jpg");
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(pic, 0, 0);
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        pic.dispose();
    }
}
