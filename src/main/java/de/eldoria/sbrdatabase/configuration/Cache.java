package de.eldoria.sbrdatabase.configuration;

import de.eldoria.eldoutilities.serialization.SerializationUtil;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

@SerializableAs("sbdCache")
public class Cache implements ConfigurationSerializable {

    private final int cacheRefreshSec;


    public Cache() {
        cacheRefreshSec = 30;
    }

    /**
     * Constructor required by {@link ConfigurationSerializable} in order to deserialize the object.
     */
    @SuppressWarnings("unused")
    public Cache(Map<String, Object> objectMap) {
        var map = SerializationUtil.mapOf(objectMap);
        cacheRefreshSec = map.getValueOrDefault("cacheRefreshSec", 30);
    }

    @Override
    @NotNull
    public Map<String, Object> serialize() {
        return SerializationUtil.newBuilder()
                .add("cacheRefreshSec", cacheRefreshSec)
                .build();
    }

    public int cacheRefreshSec() {
        return cacheRefreshSec;
    }
}
