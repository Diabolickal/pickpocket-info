package com.diabolickal.pickpocketinfo;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("Pickpocket Info")
public interface PickpocketInfoConfig extends Config
{

    @ConfigItem(
            keyName = "showDodgy",
            name = "Show Dodgy Necklace Info",
            description = "Whether or not to display Dodgy Necklace charges.",
            position = 0
    )
    default boolean showDodgy()
    {
        return true;
    }

    @ConfigItem(
            keyName = "showPouches",
            name = "Show Pouches Counter",
            description = "Whether or not to display the number pouches in your inventory on the overlay.",
            position = 1
    )
    default boolean showPouches()
    {
        return true;
    }

    /*@ConfigItem(
            keyName = "showTotal",
            name = "Show Total Attempts",
            description = "Whether or not to display the total number of pickpockets includes both successful and unsuccessful.",
            position = 2
    )
    default boolean showTotal()
    {
        return true;
    }*/

    @Range(
            min = 1,
            max = 10
    )
    @ConfigItem(
            keyName = "warnThreshold",
            name = "Warning Threshold",
            description = "At how many dodgy necklace charges should the overlay text turn red.",
            position = 3
    )
    default int warnThreshold(){ return 1;}

    @Range(
            max = 30
    )
    @ConfigItem(
            keyName = "overlayDuration",
            name = "Overlay Duration",
            description = "How long the overlay lasts between pickpockets in seconds. Zero means overlay will never go away.",
            position = 4
    )
    default int overlayDuration(){ return 10;}

    @ConfigItem(
            keyName = "resetType",
            name = "Reset Rate on",
            description = "When to reset the timer. On logout or upon exiting Runelite.",
            position = 5
    )
    default ResetType resetType()
    {
        return ResetType.EXIT;
    }



    /*===HIDDEN===*/

    //Keeps track of dodgy necklace charges even if Runelite is closed
    @ConfigItem(
            keyName = "dodgyNecklace",
            name = "",
            description = "",
            hidden = true
    )
    default int dodgyNecklace()
    {
        return -1;
    }

    @ConfigItem(
            keyName = "dodgyNecklace",
            name = "",
            description = ""
    )
    void dodgyNecklace(int dodgyNecklace);


}


