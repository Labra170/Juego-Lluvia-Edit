package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class VidaMas extends PowerUp
{
	public VidaMas(String nombre, Texture texture)
	{
		super(nombre, texture);
	}
	public void accionPowerUp(Tarro tarro)
	{
		tarro.sanar();
	}
}
