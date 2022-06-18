/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2021 EldoriaRPG Team and Contributor
 */

package de.eldoria.sbrdatabase.dao.mysql;

import de.eldoria.sbrdatabase.dao.base.BasePresets;
import de.eldoria.schematicbrush.storage.preset.PresetContainer;

import javax.sql.DataSource;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class MySqlPresets extends BasePresets {
    public MySqlPresets(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public CompletableFuture<Map<UUID, ? extends PresetContainer>> playerContainers() {
        return null;
    }

    @Override
    public CompletableFuture<Integer> count() {
        return null;
    }

    @Override
    public PresetContainer getContainer(UUID uuid) {
        return new MySqlPresetContainer(uuid, this);
    }
}
