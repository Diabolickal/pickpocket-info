package com.diabolickal.pickpocketinfo;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PickpocketInfoPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PickpocketInfoPlugin.class);
		RuneLite.main(args);
	}
}