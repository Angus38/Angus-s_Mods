package tutorial.DMAexample.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
//Recipes - Very important imports for creating recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
//import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.util.EnumHelper;
import tutorial.DMAexample.MyBlocks.CopperOre;
//MyBlocks
import tutorial.DMAexample.MyBlocks.HardDirtBlock;
import tutorial.DMAexample.MyBlocks.HardOre;
import tutorial.DMAexample.MyBlocks.BaseBlock;
import tutorial.DMAexample.MyBlocks.MyIceBlock;
import tutorial.DMAexample.MyBlocks.MyTntBlock;
import tutorial.DMAexample.MyBlocks.MyBlockSlide;
import tutorial.DMAexample.MyEntities.DeathBallEntity;
//MyItems
import tutorial.DMAexample.MyItems.BaseItem;
import tutorial.DMAexample.MyItems.CustomAxe;
import tutorial.DMAexample.MyItems.CustomSword;
import tutorial.DMAexample.MyItems.MyLauncherItem;
import tutorial.DMAexample.MyItems.MyBowItem;
import tutorial.DMAexample.MyItems.bronzePick;
import tutorial.DMAexample.MyCode;
//OreGen
import tutorial.DMAexample.MyOreGenerator;


import net.minecraft.client.renderer.texture.IIconRegister;
//MyCreative Tab
import net.minecraft.creativetab.CreativeTabs;


public class bronze_armour extends ItemArmor{
	private String [] armourTypes = new String[] {"bronzeHelmet", "bronzeChestplate", "bronzeLeggings", "bronzeBoots"}; 

				public bronze_armour(ArmorMaterial armorMaterial, int renderIndex, int armourType){
						super(armorMaterial, renderIndex, armourType);
				
				}
				
				@Override
				public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
					if(stack.getItem().equals(MyCode.bronzeHelmet)|| stack.getItem().equals(MyCode.bronzeChestplate)|| stack.getItem().equals(MyCode.bronzeChestplate)|| stack.getItem().equals(MyCode.bronzeBoots)){
						return "yourmodsname:textures/armor/bronze_layer_1.png";
					}
					if (stack.getItem().equals(MyCode.bronzeLeggings)){
						return "yourmodsname:textures/armor/bronze_layer_2.png";
					}  
					else return null;
				}
				
				
				@Override
				public void registerIcons(IIconRegister reg){
					if(this == MyCode.bronzeHelmet)
						this.itemIcon = reg.registerIcon("yourmodsname:bronze_helmet");
					if(this == MyCode.bronzeChestplate)
						this.itemIcon = reg.registerIcon("yourmodsname:bronze_chestplate");
					if(this == MyCode.bronzeLeggings)
						this.itemIcon = reg.registerIcon("yourmodsname:bronze_leggings");
					if(this == MyCode.bronzeBoots)
						this.itemIcon = reg.registerIcon("yourmodsname:bronze_boots");
				}
}
