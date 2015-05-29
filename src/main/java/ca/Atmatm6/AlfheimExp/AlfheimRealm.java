package ca.Atmatm6.AlfheimExp;

import ca.Atmatm6.AlfheimExp.misc.InitBlock;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.modid, name = Ref.name, dependencies = "required-before:Botania")
public class AlfheimRealm{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent){
        InitBlock.preInitBlock();
    }
}
