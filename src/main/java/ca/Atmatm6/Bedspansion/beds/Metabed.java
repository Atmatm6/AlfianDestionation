package ca.Atmatm6.Bedspansion.beds;

import net.minecraft.block.BlockBed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Metabed extends BlockBed{
    private EntityPlayer player;
    @Override
    public void onBlockClicked(World world, int p_149699_2_, int p_149699_3_, int p_149699_4_, EntityPlayer playerd) {
        World worldy = world;
        player = playerd;
        player.wakeUpPlayer(true, true, true);
        super.onBlockClicked(worldy, p_149699_2_, p_149699_3_, p_149699_4_, playerd);
    }
}
