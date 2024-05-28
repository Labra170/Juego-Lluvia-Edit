package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public abstract class PowerUp
{
	private String nombre;
	private Texture powerUpImage;
	
	public PowerUp(String nombre, Texture powerUpImage)
	{
		this.nombre = nombre;
		this.powerUpImage = powerUpImage;
	}
	
	// Método abstracto
	public abstract void accionPowerUp(Tarro tarro);
	
	// Setter's y Getter's
	public String getNombre()
	{
		return nombre;
	}
	public Texture getTexture()
	{
		return powerUpImage;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public void setTexture(Texture powerUpImage)
	{
		this.powerUpImage = powerUpImage;
	}
}
