package com.guillaume009.slayerwiki;

import com.guillaume009.slayerwiki.SlayerWikiPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class SlayerWikiPluginTest
{

	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(SlayerWikiPlugin.class);
		RuneLite.main(args);
	}

}