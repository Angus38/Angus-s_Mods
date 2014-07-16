package tutorial.DMAexample.MyBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;


public class MyBlockSlide extends Block 
	{

	        public MyBlockSlide (Material material) 
	        {
	        	
	        	super(Material.ice);
	            this.slipperiness = 0.98F;
	            this.setTickRandomly(true);
	                
	                
	        }
	       
	

/**
 * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
 */
@SideOnly(Side.CLIENT)
public int getRenderBlockPass()
{
    return 1;
}

/**
 * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
 * coordinates.  Args: blockAccess, x, y, z, side
 */
@SideOnly(Side.CLIENT)
public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
{
    return super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, 1 - p_149646_5_);
}}