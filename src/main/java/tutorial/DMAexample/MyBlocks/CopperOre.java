package tutorial.DMAexample.MyBlocks;


import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import tutorial.DMAexample.MyCode;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.block.material.Material;

public class CopperOre extends Block
{
  

		public CopperOre(Material material) 
     {
             super(material);
                
        }
		
		

        
        
         
         @Override
         public Item getItemDropped(int metadata, Random random, int fortune) {
        	 
        	    int d = 0, rh;
	            rh = random.nextInt(99);
	        	
	        	
	        	if(rh > 100){
	        	    //Rare Drop
	        		return Item.getItemFromBlock(MyCode.copperOre);
	        	} else {
	        		//Common Drop
	        		return Item.getItemFromBlock(MyCode.copperOre);
	        	}
	        	
        	 
         }
	

}
