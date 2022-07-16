package io.github.rexolon.rexores.world.feature;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier placementModifier, PlacementModifier placementModifier2) {
        return List.of(placementModifier, InSquarePlacement.spread(), placementModifier2, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int placementModifier, PlacementModifier placementModifier2) {
        return orePlacement(CountPlacement.of(placementModifier), placementModifier2);
    }

    public static List<PlacementModifier> rareOrePlacement(int placementModifier, PlacementModifier placementModifier2) {
        return orePlacement(RarityFilter.onAverageOnceEvery(placementModifier), placementModifier2);
    }
}
