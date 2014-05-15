package guru.haun.hackery.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GlitchBlock extends Block {

	public GlitchBlock(Material mat) {
		super(mat);
		setResistance(9000000);
		setBlockName("blockGlitch");
		setBlockBounds(.35F,.35F,.35F,.65F,.65F,.65F);
		setLightOpacity(3);
	}

}
