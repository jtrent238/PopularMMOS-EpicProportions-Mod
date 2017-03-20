package com.jtrent238.epicproportions.profiler;

import net.minecraft.profiler.PlayerUsageSnooper;

public interface IPlayerUsage
{
    void addServerStatsToSnooper(com.jtrent238.epicproportions.profiler.PlayerUsageSnooper playerUsageSnooper);

    void addServerTypeToSnooper(com.jtrent238.epicproportions.profiler.PlayerUsageSnooper playerUsageSnooper);

    /**
     * Returns whether snooping is enabled or not.
     */
    boolean isSnooperEnabled();
}