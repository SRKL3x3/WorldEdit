/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.sponge.registry;

import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.block.trait.BlockTrait;

import java.util.List;
import java.util.Map;

class SpongeBlockDescriptor {
    private BlockType blockType;
    private List<Map<BlockTrait<?>, ?>> variants;

    private Map<String, SpongeBlockState<?>> blockState;

    SpongeBlockDescriptor(BlockType blockType, List<Map<BlockTrait<?>, ?>> variants, Map<String, SpongeBlockState<?>> blockState) {
        this.blockType = blockType;
        this.variants = variants;
        this.blockState = blockState;
    }

    public BlockType getBlockType() {
        return blockType;
    }

    public List<Map<BlockTrait<?>, ?>> getVariants() {
        return variants;
    }

    public Map<String, SpongeBlockState<?>> getBlockStates() {
        return blockState;
    }
}