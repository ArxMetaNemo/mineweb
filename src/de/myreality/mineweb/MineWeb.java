/* mineweb is a Bukkit plugin for Minecraft to provide server information.
 *  Copyright (C) 2013  Miguel Gonzalez
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 */
package de.myreality.mineweb;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main plugin class which is loaded by minecraft. Handles all
 * required submodules.
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.0
 * @version 1.0
 */
public class MineWeb extends JavaPlugin {

	// ===========================================================
	// Constants
	// ===========================================================
	
	public static final int DEFAULT_PORT = 25566;

	// ===========================================================
	// Fields
	// ===========================================================
	
	private WebServer server;

	// ===========================================================
	// Constructors
	// ===========================================================
	
	public MineWeb() {
		this.server = new ConcurrentWebServer(this, DEFAULT_PORT);
	}


	// ===========================================================
	// Methods from superclass/interface
	// ===========================================================
	

	@Override
	public void onDisable() {
		super.onDisable();
		server.stop();
	}

	@Override
	public void onEnable() {
		super.onEnable();
		server.start();
	}

	// ===========================================================
	// Other methods
	// ===========================================================

	// ===========================================================
	// Inner classes
	// ===========================================================

}
