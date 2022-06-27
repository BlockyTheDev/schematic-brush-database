/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2021 EldoriaRPG Team and Contributor
 */

package de.eldoria.sbrdatabase.configuration;

import de.eldoria.eldoutilities.configuration.EldoConfig;
import org.bukkit.plugin.Plugin;

public class Configuration extends EldoConfig {
    private Storages storages;
    private Cache cache;

    public Configuration(Plugin plugin) {
        super(plugin);
    }

    @Override
    protected void reloadConfigs() {
        storages = getConfig().getObject("storages", Storages.class, new Storages());
        cache = getConfig().getObject("cache", Cache.class, new Cache());
    }

    @Override
    protected void saveConfigs() {
        getConfig().set("storages", storages);
    }

    public Storages storages() {
        return storages;
    }

    public Cache cache() {
        return cache;
    }
}
