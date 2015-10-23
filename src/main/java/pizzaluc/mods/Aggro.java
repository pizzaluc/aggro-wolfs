package pizzaluc.mods;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "aw", name = "Aggro Wolf", version = "1.1")
public class Aggro {
	
	
	
	
	
	public static Item ItemWarpRemover;
	private int SpawnRateConfig;
	private int MinumumPack;
	private int MaxPack;
	public int Day_or_Night;
	
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/Block init and registering
		//config handling
		
		
		
		 Configuration config = new Configuration(event.getSuggestedConfigurationFile());

         config.load();

         SpawnRateConfig = config.getInt("SpawnRate", "wolves", 10, 1, 100, "How high is the spawnrate. defualt zombie is 10");
         
         MinumumPack = config.getInt("MinumumPack", "wolves", 1, 1, 100, "The minumum number who spawn toghether");
         
         MaxPack = config.getInt("MaxPack", "wolves", 5, 0, 100, "The maximum number who spawn toghether");
         
        // Day_or_Night = config.getInt("DayorNight", "wolves", 1, 0, 2, "Choose between: 0,1,2 which equals to Day,night,Day and Night");

         config.save();
        
        // for(int i = 0;i<100;i++){
        // System.out.println(Day_or_Night);
        // }
     
         
         
	}
	
	

	@EventHandler
	public void Init(FMLInitializationEvent event){
	//Proxy, TileEntity, entity, gui and packet registering	
		
		 
		
		//remove Wolves from the spawning
		EntityRegistry.removeSpawn(EntityWolf.class, EnumCreatureType.creature, BiomeGenBase.beach,BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.plains,
				BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills,
				BiomeGenBase.deepOcean, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.extremeHillsPlus, BiomeGenBase.iceMountains, BiomeGenBase.forestHills, BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau, BiomeGenBase.taigaHills, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.stoneBeach,
				BiomeGenBase.roofedForest, BiomeGenBase.mesaPlateau_F, BiomeGenBase.mesaPlateau, BiomeGenBase.mesa, 
				BiomeGenBase.megaTaigaHills, BiomeGenBase.megaTaiga, BiomeGenBase.jungle);
		
		
		 EntityRegistry.registerGlobalEntityID(Agro_Wolfs.class, "Agro_Wolfs", EntityRegistry.findGlobalUniqueEntityId(), 6750105, 7859797);
	     EntityRegistry.registerModEntity(Agro_Wolfs.class, "Agro_Wolfs", 3, this, 64, 3, true);
	        
	    
	
	     
	     
	     //register the agro_wolfs to the naturally world spawn. first number is how often it spawn. second is minumum number per spawn, max number per spawn, and the biomes it should spawn in.
	    EntityRegistry.addSpawn(Agro_Wolfs.class, SpawnRateConfig, MinumumPack, MaxPack, EnumCreatureType.monster, BiomeGenBase.beach,BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.plains,
					BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.birchForest,
					BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills,
					BiomeGenBase.deepOcean, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
					BiomeGenBase.extremeHillsPlus, BiomeGenBase.iceMountains, BiomeGenBase.forestHills, BiomeGenBase.savanna,
					BiomeGenBase.savannaPlateau, BiomeGenBase.taigaHills, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.stoneBeach,
					BiomeGenBase.roofedForest, BiomeGenBase.mesaPlateau_F, BiomeGenBase.mesaPlateau, BiomeGenBase.mesa, 
					BiomeGenBase.megaTaigaHills, BiomeGenBase.megaTaiga, BiomeGenBase.jungle);
	     //System.out.println("monster");
	   
	     
	     
	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	//
		
		
		
		
	}
	
	
	
	@EventHandler
	public void Load(FMLPostInitializationEvent event){
	//
		
		
		
		
	}
	
	

	
	
	}




	



