package pizzaluc.mods;

import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import pizzaluc.mods.*;



public class Agro_Wolfs extends EntityWolf {
	
	
	


int IsAiOn = 0;





	public Agro_Wolfs(World par1World) {
		super(par1World);
		
		
		// TODO Auto-generated constructor stub
	
	
	}
	

	
	
	
	
	
	   public void onLivingUpdate()
	    {
	           
	       
		   //kill the wolf if its day, and there is a clear sight to the sun
		   if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
	        {
	            float f = this.getBrightness(1.0F);

	            if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)))
	            {
	               
	                 this.setDead();
	                
	            }
	        }
		   
		   
	       
		  
		   
	                if(IsAiOn == 0){
	       //set the wolf ai into attacking players without being hit first
	        	this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	               IsAiOn = 1;
	               
	              
	                


		   }
		        super.onLivingUpdate();
			 
	        
	        
	       
	    }

	   
}