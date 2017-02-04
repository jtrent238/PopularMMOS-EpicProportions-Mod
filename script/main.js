///* --- EpicProportions Mod PE --- *///
///* ---- Version 1.0.0.0 ---- *///
///* -- By:@jtrent238 -- *///


///# MultiLang System #///
var Lang = {
	directory:"-epicproportionsmod.lang",
	rawString:"",
	processedString:[],
	finalString:[],
	fillString:function(){
		this.rawString = new java.lang.String(ModPE.getBytesFromTexturePack("assets/lang/"+ModPE.getLanguage()+this.directory)||ModPE.getBytesFromTexturePack("assets/lang/en_US"+this.directory));
		this.processedString = this.rawString.split("\n");
		for(var ps in this.processedString){
			this.finalString[ps] = this.processedString[ps].split("=");
		}
	},
	get:function(index,raw){
		this.fillString();
		for(var fs in this.finalString){
			if(this.finalString[fs][0]==index&&raw!=true){
				return this.finalString[fs][1];
			}	
		}
		return index;
	},
	setItemLang:function(id,dmg){
		ModPE.langEdit(Item.getName(id,dmg,true),this.get(Item.getName(id,dmg,true)));
	}
};
function newLevel(){
	for(var i=2000;i<2098;i++){
		Lang.setItemLang(i,0);
	}
	for(var i=210;i<226;i++){
		Lang.setItemLang(i,0);
	}
}


///# Easy Tools Coding API v2.0 #///

function modTick(){
	Sword.modTick();
	Pickaxe.modTick();
	Shovel.modTick();
	Axe.modTick();
	OreGen.modTick();
	mainModTick();
}
function destroyBlock(x,y,z,s){
	if(Item.isSword(Player.getCarriedItem()))
		Sword.destroyBlock(x,y,z,s);
	else if(Item.isPickaxe(Player.getCarriedItem()))
		Pickaxe.destroyBlock(x,y,z,s);
	else if(Item.isShovel(Player.getCarriedItem()))
		Shovel.destroyBlock(x,y,z,s);
	else if(Item.isAxe(Player.getCarriedItem()))
		Axe.destroyBlock(x,y,z,s);
	mainDestroyBlock(x,y,z,s);
}
function attackHook(a,v){
	if(Item.isSword(Player.getCarriedItem()))
		Sword.attackHook(a,v);
	else if(Item.isPickaxe(Player.getCarriedItem()))
		Pickaxe.attackHook(a,v);
	else if(Item.isShovel(Player.getCarriedItem()))
		Shovel.attackHook(a,v);
	else if(Item.isAxe(Player.getCarriedItem()))
		Axe.attackHook(a,v);
	mainAttackHook(a,v);
}
function useItem(x,y,z,i,b,s,iD,bD){
	if(Item.isShovel(i))
		Shovel.useItem(x,y,z,i,b,s,iD,bD);
	else if(Item.isHoe(i))
		Hoe.useItem(x,y,z,i,b,s,iD,bD);
	mainUseItem(x,y,z,i,b,s,iD,bD);
}
Item.setDamage = function(id,maxDamage,damageAmount){
	if(id===Player.getCarriedItem()&&maxDamage>Player.getCarriedItemData()&&Level.getGameMode()===0){
		Entity.setCarriedItem(Player.getEntity(),Player.getCarriedItem(),Player.getCarriedItemCount(),Player.getCarriedItemData()+1);
	}
	else if(id===Player.getCarriedItem()&&maxDamage<=Player.getCarriedItemData()&&Level.getGameMode()===0){
		Entity.setCarriedItem(Player.getEntity(),Player.getCarriedItem(),Player.getCarriedItemCount()-1,0);
		Level.playSoundEnt(Player.getEntity(),"random.break",16);
	}
}
//Swords System
var Sword = {
	itemsData:{itemId:[],durability:[],damage:[]},
	currentData:{itemId:null,durability:null,damage:null},	
	setDestroyTimes:function(){
		Block.setDestroyTime(18,0.2/1.5);Block.setDestroyTime(30,4/3.3/15);Block.setDestroyTime(86,1/1.5);Block.setDestroyTime(91,1/1.5);Block.setDestroyTime(103,1/1.5);Block.setDestroyTime(106,0.2/1.5);Block.setDestroyTime(127,0.2/1.5);
	},
	resetDestroyTimes:function(){
		Block.setDestroyTime(18,0.2);Block.setDestroyTime(30,4);Block.setDestroyTime(86,1);Block.setDestroyTime(91,1);Block.setDestroyTime(103,1);Block.setDestroyTime(106,0.2);Block.setDestroyTime(127,0.2);
	},
	modTick:function(){
		if(Item.isSword(Player.getCarriedItem())===true&&this.currentData.itemId!==Player.getCarriedItem()){
			this.currentData.itemId = Player.getCarriedItem();
			this.currentData.durability = this.getDurability(Player.getCarriedItem());
			this.currentData.damage = this.getDamage(Player.getCarriedItem());
			this.setDestroyTimes();
		}
		else if(Item.isSword(Player.getCarriedItem())===false&&this.currentData.itemId!==null){
			this.currentData.itemId = null;
			this.currentData.durability = null;
			this.currentData.damage = null;
			this.resetDestroyTimes();
		}			
	},
	destroyBlock:function(x,y,z,s){
		Item.setDamage(this.currentData.itemId,this.currentData.durability);
		switch(getTile(x,y,z)){
			case 30:Level.dropItem(x+0.5,y,z+0.5,0,287,1,0);break;
			case 127:Level.dropItem(x+0.5,y,z+0.5,0,351,3,3);break;
		}
	},
	attackHook:function(a,v){
		if(Entity.getHealth(v)>this.currentData.damage&&Entity.getHealth(v)>0){
			Entity.setHealth(v,Entity.getHealth(v)-this.currentData.damage);
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
		}
		else if(Entity.getHealth(v)<=this.currentData.damage&&Entity.getHealth(v)>0){
			Entity.setHealth(v,1);
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
		}
	},	
	getDurability:function(id){
		return this.itemsData.durability[this.itemsData.itemId.indexOf(id)];
	},
	getDamage:function(id){
		return this.itemsData.damage[this.itemsData.itemId.indexOf(id)];
	}
};
Item.defineSword = function(id,texture,textureData,name,durability,damage){
	ModPE.setItem(id,texture,textureData,name,1);
	Item.setCategory(id,ItemCategory.TOOL);
	Item.setMaxDamage(id,durability);
	Item.setHandEquipped(id,true);
	Sword.itemsData.itemId.push(id);
	Sword.itemsData.durability.push(durability);
	Sword.itemsData.damage.push(damage-2);
};
Item.isSword = function(id){
	return Sword.itemsData.itemId.indexOf(id)!==-1;
};
//Pickaxes System
var MiningLevel ={WOOD:1,STONE:2,IRON:3,DIAMOND:5};
var Pickaxe = {
	blocksData:[{id:1,dTime:1.5,mLevel:1,drop:[1,1,-1]},{id:4,dTime:2,mLevel:1,drop:[4,1,0]},{id:14,dTime:3,mLevel:2,drop:[14,1,0]},{id:15,dTime:3,mLevel:3,drop:[15,1,0]},{id:16,dTime:3,mLevel:1,drop:[263,1,0]},{id:21,dTime:3,mLevel:2,drop:[351,4,4]},{id:22,dTime:3,mLevel:2,drop:[22,1,0]},{id:23,dTime:3.5,mLevel:1,drop:[23,1,0]},{id:24,dTime:0.8,mLevel:1,drop:[24,1,-1]},{id:41,dTime:5,mLevel:2,drop:[41,1,0]},{id:42,dTime:3,mLevel:3,drop:[42,1,0]},{id:43,dTime:2,mLevel:1,drop:[43,2,-1]},{id:44,dTime:2,mLevel:1,drop:[44,1,-1]},{id:45,dTime:2,mLevel:1,drop:[45,1,0]},{id:48,dTime:2,mLevel:1,drop:[48,1,0]},{id:49,dTime:50,mLevel:4,drop:[49,1,0]},{id:52,dTime:5,mLevel:1,drop:[0,0,0]},{id:56,dTime:3,mLevel:3,drop:[264,1,0]},{id:57,dTime:5,mLevel:4,drop:[57,1,0]},{id:61,dTime:3.5,mLevel:1,drop:[61,1,0]},{id:62,dTime:3.5,mLevel:1,drop:[61,1,0]},{id:67,dTime:2,mLevel:1,drop:[67,1,0]},{id:70,dTime:0.5,mLevel:1,drop:[70,1,0]},{id:71,dTime:5,mLevel:2,drop:[330,1,0]},{id:73,dTime:3,mLevel:3,drop:[331,4,0]},{id:74,dTime:4,mLevel:3,drop:[331,4,0]},{id:87,dTime:0.4,mLevel:1,drop:[87,1,0]},{id:98,dTime:1.5,mLevel:1,drop:[98,1,-1]},{id:101,dTime:5,mLevel:1,drop:[101,1,0]},{id:108,dTime:2,mLevel:1,drop:[108,1,0]},{id:109,dTime:1.5,mLevel:1,drop:[109,1,-1]},{id:112,dTime:2,mLevel:1,drop:[112,1,0]},{id:113,dTime:2,mLevel:1,drop:[113,1,0]},{id:114,dTime:2,mLevel:1,drop:[114,1,0]},{id:116,dTime:5,mLevel:1,drop:[116,1,9]},{id:117,dTime:0.5,mLevel:1,drop:[379,1,0]},{id:118,dTime:2,mLevel:1,drop:[380,1,0]},{id:121,dTime:3,mLevel:1,drop:[121,1,0]},{id:125,dTime:3.5,mLevel:1,drop:[125,1,0]},{id:128,dTime:0.8,mLevel:1,drop:[128,1,0]},{id:129,dTime:3,mLevel:3,drop:[388,1,0]},{id:130,dTime:22.5,mLevel:1,drop:[49,8,0]},{id:133,dTime:5,mLevel:3,drop:[133,1,0]},{id:139,dTime:2,mLevel:1,drop:[139,1,0]},{id:145,dTime:5,mLevel:1,drop:[145,1,0]},{id:147,dTime:0.5,mLevel:1,drop:[147,1,0]},{id:148,dTime:0.5,mLevel:1,drop:[148,1,0]},{id:152,dTime:5,mLevel:1,drop:[152,1,0]},{id:153,dTime:3,mLevel:1,drop:[406,1,0]},{id:154,dTime:3,mLevel:1,drop:[410,1,0]},{id:155,dTime:0.8,mLevel:1,drop:[155,1,0]},{id:156,dTime:0.8,mLevel:1,drop:[156,1,0]},{id:159,dTime:1.25,mLevel:1,drop:[159,1,-1]},{id:167,dTime:5,mLevel:1,drop:[167,1,0]},{id:168,dTime:1.5,mLevel:1,drop:[168,1,-1]},{id:172,dTime:1.25,mLevel:1,drop:[172,1,0]},{id:173,dTime:5,mLevel:1,drop:[173,1,0]},{id:174,dTime:0.5,mLevel:1,drop:[0,0,0]},{id:182,dTime:1.5,mLevel:1,drop:[182,1,-1]},{id:201,dTime:1.5,mLevel:1,drop:[201,1,-1]},{id:203,dTime:1.5,mLevel:1,drop:[203,1,0]},{id:206,dTime:3,mLevel:1,drop:[206,1,0]},{id:251,dTime:3.5,mLevel:1,drop:[251,1,0]}],
	itemsData:{itemId:[],durability:[],damage:[],mSpeed:[],mLevel:[]},
	currentData:{itemId:null,durability:null,damage:null,mSpeed:null,mLevel:null},
	setDestroyTimes:function(){
		for(var a in this.blocksData){
			if(this.currentData.mLevel>=this.blocksData[a].mLevel){
				Block.setDestroyTime(this.blocksData[a].id,this.currentData.mSpeed*(this.blocksData[a].dTime/3.33));
			}
		}
	},
	resetDestroyTimes:function(){
		for(var b in this.blocksData){
			Block.setDestroyTime(this.blocksData[b].id,this.blocksData[b].dTime);
		}
	},
	modTick:function(){
		if(Item.isPickaxe(Player.getCarriedItem())===true&&this.currentData.itemId!==Player.getCarriedItem()){
			this.currentData.itemId = Player.getCarriedItem();
			this.currentData.durability = this.getDurability(Player.getCarriedItem());
			this.currentData.damage = this.getDamage(Player.getCarriedItem());
			this.currentData.mSpeed = this.getMiningSpeed(Player.getCarriedItem());
			this.currentData.mLevel = this.getMiningLevel(Player.getCarriedItem());
			this.setDestroyTimes();
		}
		else if(Item.isPickaxe(Player.getCarriedItem())===false&&this.currentData.itemId!==null){
			this.currentData.itemId = null;
			this.currentData.durability = null;
			this.currentData.damage = null;
			this.currentData.mSpeed = null;
			this.currentData.mLevel = null;
			this.resetDestroyTimes();
		}			
	},
	destroyBlock:function(x,y,z,s){
		for(var c in this.blocksData){			
			if(this.blocksData[c].id===getTile(x,y,z)&&this.blocksData[c].drop[2]<0){
				Level.dropItem(x+0.5,y+0.5,z+0.5,0,this.blocksData[c].drop[0],this.blocksData[c].drop[1],Level.getData(x,y,z));
				Item.setDamage(this.currentData.itemId,this.currentData.durability);
			}			
			else if(this.blocksData[c].id===getTile(x,y,z)&&this.blocksData[c].drop[2]>=0){
				Level.dropItem(x+0.5,y+0.5,z+0.5,0,this.blocksData[c].drop[0],this.blocksData[c].drop[1],this.blocksData[c].drop[2]);
				Item.setDamage(this.currentData.itemId,this.currentData.durability);
			}
		}
	},
	attackHook:function(a,v){
		if(Entity.getHealth(v)>this.currentData.damage&&Entity.getHealth(v)>0){
			Entity.setHealth(v,Entity.getHealth(v)-this.currentData.damage);
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
		}
		else if(Entity.getHealth(v)<=this.currentData.damage&&Entity.getHealth(v)>0){
			Entity.setHealth(v,1);
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
		}
	},	
	getDurability:function(id){
		return this.itemsData.durability[this.itemsData.itemId.indexOf(id)];
	},
	getDamage:function(id){
		return this.itemsData.damage[this.itemsData.itemId.indexOf(id)];
	},
	getMiningSpeed:function(id){
		return this.itemsData.mSpeed[this.itemsData.itemId.indexOf(id)];
	},
	getMiningLevel:function(id){
		return this.itemsData.mLevel[this.itemsData.itemId.indexOf(id)];
	}	
};
Item.definePickaxe = function(id,texture,textureData,name,durability,damage,mSpeed,mLevel){
	ModPE.setItem(id,texture,textureData,name,1);
	Item.setCategory(id,ItemCategory.TOOL);
	Item.setMaxDamage(id,durability);
	Item.setHandEquipped(id,true);
	Pickaxe.itemsData.itemId.push(id);
	Pickaxe.itemsData.durability.push(durability);
	Pickaxe.itemsData.damage.push(damage-2);
	Pickaxe.itemsData.mSpeed.push(mSpeed);
	Pickaxe.itemsData.mLevel.push(mLevel);
};
Item.isPickaxe = function(id){
	return Pickaxe.itemsData.itemId.indexOf(id)!==-1
};
//Shovels System
var Shovel = {
	blocksData:[{id:2,dTime:0.6},{id:3,dTime:0.5},{id:12,dTime:0.5},{id:13,dTime:0.6},{id:60,dTime:0.6},{id:78,dTime:0.1},{id:80,dTime:0.2},{id:82,dTime:0.6},{id:88,dTime:0.5},{id:110,dTime:0.6},{id:198,dTime:0.6},{id:243,dTime:0.6}],	
	itemsData:{itemId:[],durability:[],damage:[],dSpeed:[]},
	currentData:{itemId:null,durability:null,damage:null,dSpeed:null},
	setDestroyTimes:function(){
		for(var a in this.blocksData){
			Block.setDestroyTime(this.blocksData[a].id,this.currentData.dSpeed*this.blocksData[a].dTime);
		}
	},
	resetDestroyTimes:function(){
		for(var b in this.blocksData){
			Block.setDestroyTime(this.blocksData[b].id,this.blocksData[b].dTime);
		}
	},
	modTick:function(){
		if(Item.isShovel(Player.getCarriedItem())===true&&this.currentData.itemId!==Player.getCarriedItem()){
			this.currentData.itemId = Player.getCarriedItem();
			this.currentData.durability = this.getDurability(Player.getCarriedItem());
			this.currentData.damage = this.getDamage(Player.getCarriedItem());
			this.currentData.dSpeed = this.getDiggingSpeed(Player.getCarriedItem());
			this.setDestroyTimes();
		}
		else if(Item.isShovel(Player.getCarriedItem())===false&&this.currentData.itemId!==null){
			this.currentData.itemId = null;
			this.currentData.durability = null;
			this.currentData.damage = null;
			this.currentData.dSpeed = null;
			this.resetDestroyTimes();
		}			
	},
	destroyBlock:function(x,y,z,s){
		Item.setDamage(this.currentData.itemId,this.currentData.durability);
		switch(getTile(x,y,z)){
			case 78:Level.dropItem(x+0.5,y,z+0.5,0,332,1,0);break;
			case 80:Level.dropItem(x+0.5,y,z+0.5,0,332,4,0);break;
		}
	},
	useItem:function(x,y,z,i,b,s,iD,bD){
		if(b===2){
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
			Level.playSound(x,y,z,"step.grass",16);
			setTile(x,y,z,198,0);
		}
	},
	attackHook:function(a,v){
		if(Entity.getHealth(v)>this.currentData.damage&&Entity.getHealth(v)>0){
			Entity.setHealth(v,Entity.getHealth(v)-this.currentData.damage);
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
		}
		else if(Entity.getHealth(v)<=this.currentData.damage&&Entity.getHealth(v)>0){
			Entity.setHealth(v,1);
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
		}
	},	
	getDurability:function(id){
		return this.itemsData.durability[this.itemsData.itemId.indexOf(id)];
	},
	getDamage:function(id){
		return this.itemsData.damage[this.itemsData.itemId.indexOf(id)];
	},
	getDiggingSpeed:function(id){
		return this.itemsData.dSpeed[this.itemsData.itemId.indexOf(id)];
	}
};
Item.defineShovel = function(id,texture,textureData,name,durability,damage,dSpeed){
	ModPE.setItem(id,texture,textureData,name,1);
	Item.setCategory(id,ItemCategory.TOOL);
	Item.setMaxDamage(id,durability);
	Item.setHandEquipped(id,true);
	Shovel.itemsData.itemId.push(id);
	Shovel.itemsData.durability.push(durability);
	Shovel.itemsData.damage.push(damage-2);
	Shovel.itemsData.dSpeed.push(dSpeed);
};
Item.isShovel = function(id){
	return Shovel.itemsData.itemId.indexOf(id)!==-1;
};
//Axes System
var Axe = {
	blocksData:[{id:5,dTime:2},{id:17,dTime:2},{id:25,dTime:0.8},{id:43,dTime:2},{id:44,dTime:2},{id:47,dTime:1.5},{id:53,dTime:2},{id:54,dTime:2.5},{id:58,dTime:2.5},{id:63,dTime:1},{id:64,dTime:3},{id:65,dTime:0.4},{id:68,dTime:1},{id:72,dTime:0.5},{id:85,dTime:2},{id:86,dTime:1},{id:91,dTime:1},{id:96,dTime:3},{id:99,dTime:0.2},{id:100,dTime:0.2},{id:103,dTime:1},{id:106,dTime:0.2},{id:107,dTime:2},{id:127,dTime:0.2},{id:134,dTime:2},{id:135,dTime:2},{id:136,dTime:2},{id:146,dTime:2.5},{id:151,dTime:0.2},{id:157,dTime:2},{id:158,dTime:2},{id:162,dTime:2},{id:163,dTime:2},{id:178,dTime:0.2},{id:164,dTime:2},{id:183,dTime:2},{id:184,dTime:2},{id:185,dTime:2},{id:186,dTime:2},{id:187,dTime:2},{id:193,dTime:3},{id:194,dTime:3},{id:195,dTime:3},{id:196,dTime:3},{id:197,dTime:3}],
	itemsData:{itemId:[],durability:[],damage:[],cSpeed:[]},
	currentData:{itemId:null,durability:null,damage:null,cSpeed:null},
	setDestroyTimes:function(){
		for(var a in this.blocksData){
			Block.setDestroyTime(this.blocksData[a].id,this.currentData.cSpeed*this.blocksData[a].dTime);
		}
	},
	resetDestroyTimes:function(){
		for(var b in this.blocksData){
			Block.setDestroyTime(this.blocksData[b].id,this.blocksData[b].dTime);
		}
	},
	modTick:function(){
		if(Item.isAxe(Player.getCarriedItem())===true&&this.currentData.itemId!==Player.getCarriedItem()){
			this.currentData.itemId = Player.getCarriedItem();
			this.currentData.durability = this.getDurability(Player.getCarriedItem());
			this.currentData.damage = this.getDamage(Player.getCarriedItem());
			this.currentData.cSpeed = this.getChoppingSpeed(Player.getCarriedItem());
			this.setDestroyTimes();
		}
		else if(Item.isAxe(Player.getCarriedItem())===false&&this.currentData.itemId!==null){
			this.currentData.itemId = null;
			this.currentData.durability = null;
			this.currentData.damage = null;
			this.currentData.cSpeed = null;
			this.resetDestroyTimes();
		}			
	},
	destroyBlock:function(x,y,z,s){
		Item.setDamage(this.currentData.itemId,this.currentData.durability);
	},
	attackHook:function(a,v){
		if(Entity.getHealth(v)>this.currentData.damage&&Entity.getHealth(v)>0){
			Entity.setHealth(v,Entity.getHealth(v)-this.currentData.damage);
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
		}
		else if(Entity.getHealth(v)<=this.currentData.damage&&Entity.getHealth(v)>0){
			Entity.setHealth(v,1);
			Item.setDamage(this.currentData.itemId,this.currentData.durability);
		}
	},	
	getDurability:function(id){
		return this.itemsData.durability[this.itemsData.itemId.indexOf(id)];
	},
	getDamage:function(id){
		return this.itemsData.damage[this.itemsData.itemId.indexOf(id)];
	},
	getChoppingSpeed:function(id){
		return this.itemsData.cSpeed[this.itemsData.itemId.indexOf(id)];
	}
};
Item.defineAxe = function(id,texture,textureData,name,durability,damage,cSpeed){
	ModPE.setItem(id,texture,textureData,name,1);
	Item.setCategory(id,ItemCategory.TOOL);
	Item.setMaxDamage(id,durability);
	Item.setHandEquipped(id,true);
	Axe.itemsData.itemId.push(id);
	Axe.itemsData.durability.push(durability);
	Axe.itemsData.damage.push(damage-2);
	Axe.itemsData.cSpeed.push(cSpeed);
};
Item.isAxe = function(id){
	return Axe.itemsData.itemId.indexOf(id)!==-1;
};
//Hoes System
var Hoe = {
	itemsData:{itemId:[],durability:[]},	
	useItem:function(x,y,z,i,b,s,iD,bD){
		var SeedDrop = Math.round(Math.random());
		if((b===2||b===3||b===198)&&SeedDrop===0){
			Item.setDamage(i,this.getDurability(i));
			Level.playSound(x,y,z,"step.gravel",16);
			setTile(x,y,z,60,0);
		}
		else if((b===2||b===3||b===198)&&SeedDrop===1){
			Item.setDamage(i,this.getDurability(i));
			Level.playSound(x,y,z,"step.gravel",16);
			Level.dropItem(x+0.5,y+1,z+0.5,0,295,1,0);
			setTile(x,y,z,60,0);
		}
	},		
	getDurability:function(id){
		return this.itemsData.durability[this.itemsData.itemId.indexOf(id)];
	}
};
Item.defineHoe = function(id,texture,textureData,name,durability){
	ModPE.setItem(id,texture,textureData,name,1);
	Item.setCategory(id,ItemCategory.TOOL);
	Item.setMaxDamage(id,durability);
	Item.setHandEquipped(id,true);
	Hoe.itemsData.itemId.push(id);
	Hoe.itemsData.durability.push(durability);
};
Item.isHoe = function(id){
	return Hoe.itemsData.itemId.indexOf(id)!==-1;
};

///# World Generation System #///
var OreGen = {
	chunkSize:32,
	oresData:[],
	modTick:function(){
		if(getTile(Player.getChunkX(this.chunkSize)*this.chunkSize,1,Player.getChunkZ(this.chunkSize)*this.chunkSize)!==247&&Player.getDimension()===DimensionId.NORMAL){
			this.generateChunk(Player.getChunkX(this.chunkSize)*this.chunkSize,Player.getChunkZ(this.chunkSize)*this.chunkSize);
		}		
	},
	generateChunk:function(x,z){
		setTile(x,1,z,247,0);
		for(var a in this.oresData){
			for(var b=0;b<Math.round(Math.random()*this.oresData[a].rarity);b++){
				this.generateVein(x+this.chunkSize/2-Math.round(Math.random()*this.chunkSize),this.oresData[a].minY+Math.round(Math.random()*(this.oresData[a].maxY-this.oresData[a].minY)),z+this.chunkSize/2-Math.round(Math.random()*this.chunkSize),this.oresData[a].id[0],this.oresData[a].id[1]);
			}
		}
	},
	generateVein:function(x,y,z,id,dmg){
		var veinPositions = [[0,0,0],[1,0,0],[1,0,1],[1,0,0],[0,1,0],[1,1,0],[1,1,1],[1,1,0]];
		for(var c in veinPositions){
			if(getTile(x+veinPositions[c][0],y+veinPositions[c][1],z+veinPositions[c][2])===1&&Math.round(Math.random())===1){
				setTile(x+veinPositions[c][0],y+veinPositions[c][1],z+veinPositions[c][2],id,dmg);
			}
		}
	}
};


///# Other Functions #///
Entity.setKnockback = function(entity,blocks){
	Entity.setVelX(entity,blocks*0.05*Math.cos((getYaw()+90)*(Math.PI/180)));
	Entity.setVelY(entity,1);
	Entity.setVelZ(entity,blocks*0.05*Math.sin((getYaw()+90)*(Math.PI/180)));
};
Player.getChunkX = function(chunkSize){
	return Math.round(Math.floor(Player.getX())/chunkSize||16);
};
Player.getChunkZ = function(chunkSize){
	return Math.round(Math.floor(Player.getZ())/chunkSize||16);
};
Block.defineOre = function(id,name,textures,sourceId,minY,maxY,rarity){
	Block.defineBlock(id,name,textures,sourceId);
	OreGen.oresData.push({"id":[id,0],"minY":minY,"maxY":maxY,"rarity":rarity*(OreGen.chunkSize/8)});
};
Block.setMinable = function(id,dTime,mLevel,drop){
	Pickaxe.blocksData.push({"id":id,"dTime":dTime,"mLevel":mLevel,"drop":drop});
};
Item.addInCreativeInv = function(id,count,dmg,category){
	Item.setCategory(id,category||ItemCategory.FOOD);
	Player.addItemCreativeInv(id,count,dmg);
};
Item.defineItem = function(id,texture,textureDmg,name,foil,category,handEquipped,stackSize){
	ModPE.setItem(id,texture,textureDmg,name,stackSize);
	Item.addInCreativeInv(id,1,0,category);
	Item.setProperties(id,{"foil":foil});
	Item.setHandEquipped(id,handEquipped||false);
};
Level.grouth = function(x,y,z,radius){
	var plants = [31,31,31,31,31,31,31,31,37,38,0,0];
	for(var pX=0;pX<radius;pX++){
		for(var pZ=0;pZ<radius;pZ++){
			if(getTile(x+pX-radius/2,y,z+pZ-radius/2)===2&&getTile(x+pX,y+1,z+pZ)===0){
				setTile(x+pX-radius/2,y+1,z+pZ-radius/2,plants[Math.round(Math.random()*plants.length)],0);
				Level.addParticle(ParticleType.happyVillager,x+pX-radius/2,y+1.5,z+pZ-radius/2,0,0.2,0,8);
			}
		}
	}
	if((getTile(x,y,z)===59||getTile(x,y,z)===104||getTile(x,y,z)===105||getTile(x,y,z)===141||getTile(x,y,z)===142||getTile(x,y,z)===244)&&Level.getData(x,y,z)<9){
		setTile(x,y,z,getTile(x,y,z),Level.getData(x,y,z)+1);
		Level.addParticle(ParticleType.happyVillager,x,y+1,z,0,0.2,0,8);
	}
};
function mainDestroyBlock(x,y,z,s){
	if((Player.getCarriedItem()===257||Player.getCarriedItem()===278)&&Level.getGameMode()===0){
		switch(getTile(x,y,z)){
			case 210:Level.dropItem(x+0.5,y,z+0.5,0,2000,1,0);preventDefault();setTile(x,y,z,0);Level.playSound(x,y,z,"dig.stone");break;
			case 212:Level.dropItem(x+0.5,y,z+0.5,0,2011,1,0);preventDefault();setTile(x,y,z,0);Level.playSound(x,y,z,"dig.stone");break;
			case 214:Level.dropItem(x+0.5,y,z+0.5,0,2022,1,0);preventDefault();setTile(x,y,z,0);Level.playSound(x,y,z,"dig.stone");break;
			case 216:Level.dropItem(x+0.5,y,z+0.5,0,2033,1,0);preventDefault();setTile(x,y,z,0);Level.playSound(x,y,z,"dig.stone");break;
			case 218:Level.dropItem(x+0.5,y,z+0.5,0,2044,1,0);preventDefault();setTile(x,y,z,0);Level.playSound(x,y,z,"dig.stone");break;
			case 220:Level.dropItem(x+0.5,y,z+0.5,0,2055,1,0);preventDefault();setTile(x,y,z,0);Level.playSound(x,y,z,"dig.stone");break;
			case 222:Level.dropItem(x+0.5,y,z+0.5,0,2066,1,0);preventDefault();setTile(x,y,z,0);Level.playSound(x,y,z,"dig.stone");break;
			case 224:Level.dropItem(x+0.5,y,z+0.5,0,2077,1,0);preventDefault();setTile(x,y,z,0);Level.playSound(x,y,z,"dig.stone");break;
		}
	}
}


///# Power Gems Abilities #///
var notRepair = [263,325,349,351,383];
var repairTickCounter = 0;

function mainModTick(){
	repairTickCounter++;
	if(Player.getArmorSlot(0)===2002&&Player.getArmorSlot(1)===2003&&Player.getArmorSlot(2)===2004&&Player.getArmorSlot(3)===2005){
		Entity.addEffect(Player.getEntity(),MobEffect.damageBoost,21,1,true,true);
	}
	else if(Player.getArmorSlot(0)===2013&&Player.getArmorSlot(1)===2014&&Player.getArmorSlot(2)===2015&&Player.getArmorSlot(3)===2016){
		Entity.addEffect(Player.getEntity(),MobEffect.movementSpeed,21,1,true,true);
	}
	else if(Player.getArmorSlot(0)===2024&&Player.getArmorSlot(1)===2025&&Player.getArmorSlot(2)===2026&&Player.getArmorSlot(3)===2027){
		Entity.addEffect(Player.getEntity(),MobEffect.fireResistance,21,0,true,true);
	}
	else if(Player.getArmorSlot(0)===2035&&Player.getArmorSlot(1)===2036&&Player.getArmorSlot(2)===2037&&Player.getArmorSlot(3)===2038){
		Entity.addEffect(Player.getEntity(),MobEffect.digSpeed,21,0,true,true);
	}
	else if(Player.getArmorSlot(0)===2046&&Player.getArmorSlot(1)===2047&&Player.getArmorSlot(2)===2048&&Player.getArmorSlot(3)===2049){
		Entity.addEffect(Player.getEntity(),MobEffect.damageResistance,21,1,true,true);
	}
	else if(Player.getArmorSlot(0)===2057&&Player.getArmorSlot(1)===2058&&Player.getArmorSlot(2)===2059&&Player.getArmorSlot(3)===2060){
		Entity.addEffect(Player.getEntity(),MobEffect.jump,21,1,true,true);
	}
	else if(Player.getArmorSlot(0)===2068&&Player.getArmorSlot(1)===2069&&Player.getArmorSlot(2)===2070&&Player.getArmorSlot(3)===2071){
		Entity.addEffect(Player.getEntity(),MobEffect.regeneration,101,1,true,true);
	}
	else if(Player.getArmorSlot(0)===2079&&Player.getArmorSlot(1)===2080&&Player.getArmorSlot(2)===2081&&Player.getArmorSlot(3)===2082&&repairTickCounter>=100&&notRepair.indexOf(Player.getCarriedItem())===-1&&Player.getCarriedItem()>255){
		Entity.setCarriedItem(Player.getEntity(),Player.getCarriedItem(),Player.getCarriedItemCount(),Math.max(0,Player.getCarriedItemCount()-1));
		Player.setArmorSlot(0,2079,Math.max(0,Player.getArmorSlotDamage(0)-1));
		Player.setArmorSlot(1,2080,Math.max(0,Player.getArmorSlotDamage(1)-1));
		Player.getArmorSlot(2,2081,Math.max(0,Player.getArmorSlotDamage(2)-1));
		Player.getArmorSlot(3,2082,Math.max(0,Player.getArmorSlotDamage(3)-1));
		repairTickCounter = 0;
	}
	else if(Player.getArmorSlot(0)===2090&&Player.getArmorSlot(1)===2091&&Player.getArmorSlot(2)===2092&&Player.getArmorSlot(3)===2093){
		Entity.addEffect(Player.getEntity(),MobEffect.waterBreathing,21,0,true,true);
	}
}
/*
function mainAttackHook(a,v){try{
	switch(Player.getCarriedItem()){
		case 2006:Entity.addEffect(v,MobEffect.wither,101,1,true,true);break;
		case 2017:Entity.addEffect(v,MobEffect.movementSlowdown,101,126,true,true);break;
		case 2028:Entity.setFireTicks(v,5);Entity.setArmor(v,0,0,0);Entity.setArmor(v,1,0,0);Entity.setArmor(v,2,0,0);Entity.setArmor(v,3,0,0);Entity.setCarriedItem(v,0,0,0);break;
		case 2050:Entity.addEffect(v,MobEffect.weakness,101,3,true,true);break;
		case 2061:Entity.setVelY(v,1);break;
		case 2072:Player.setHealth(Entity.getHealth(Player.getEntity())+1);Level.addParticle(ParticleType.redstone,Entity.getX(v),Entity.getY(v),Entity.getZ(v),0,0,0,2);
		case 2083:for(var i=0;i<4;i++){if(Entity.getArmor(v,i)!==0){Level.dropItem(Entity.getX(v),Entity.getY(v),Entity.getZ(v),0,Entity.getArmor(v,i),1,Entity.getArmorDamage(v,i));Entity.setArmor(v,i,0,0);}}break;
	}
	}catch(e){}
}
*/
function mainUseItem(x,y,z,i,b){
	if(Player.getCarriedItem()===2094){
		Level.grouth(x,y,z,6);
	}
}


///# Blocks, Items & Recipes #///

Item.defineItem(2000,"gemofepicproportions",0,"gemofepicproportions");
Item.defineItem(2001,"pat_ingot",0,"pat_ingot",true);
Item.addShapedRecipe(2001,1,0,[" 1 ","111"," 1 "],["1",2000,0]);	
Item.defineArmor(2002,"pat_helmet",0,"pat_helmet","images/armor/pat_1.png",4,365,ArmorType.helmet);
Item.addShapedRecipe(2002,1,0,["111","1 1","   "],["1",2000,0]);
Item.addInCreativeInv(2002,1,0,ItemCategory.TOOL);
Item.defineArmor(2003,"pat_chestplate",0,"pat_chestplate","images/armor/pat_1.png",9,530,ArmorType.chestplate);
Item.addShapedRecipe(2003,1,0,["1 1","121","111"],["1",2000,0,"2",2001,0]);
Item.addInCreativeInv(2003,1,0,ItemCategory.TOOL);	
Item.defineArmor(2004,"pat_leggings",0,"pat_leggings","images/armor/pat_2.png",7,497,ArmorType.leggings);
Item.addShapedRecipe(2004,1,0,["111","1 1","1 1"],["1",2000,0]);
Item.addInCreativeInv(2004,1,0,ItemCategory.TOOL);
Item.defineArmor(2005,"pat_boots",0,"pat_boots","images/armor/pat_1.png",4,431,ArmorType.boots);
Item.addShapedRecipe(2005,1,0,["1 1","1 1","   "],["1",2000,0]);
Item.addInCreativeInv(2005,1,0,ItemCategory.TOOL);
Item.defineSword(2006,"pat_sword",0,"pat_sword",2271,8);
Item.addShapedRecipe(2006,1,0,[" 1 "," 2 "," 3 "],["1",2000,0,"2",2001,0,"3",265,0]);
Item.addInCreativeInv(2006,1,0,ItemCategory.TOOL);
Item.definePickaxe(2007,"pat_pickaxe",0,"pat_pickaxe",2271,6,0.125,MiningLevel.DIAMOND);
Item.addShapedRecipe(2007,1,0,["111"," 2 "," 2 "],["1",2000,0,"2",280,0]);
Item.addInCreativeInv(2007,1,0,ItemCategory.TOOL);
Item.defineShovel(2008,"pat_shovel",0,"amethyst_shovel",2271,5,0.125);
Item.addShapedRecipe(2008,1,0,[" 1 "," 2 "," 2 "],["1",2000,0,"2",280,0]);
Item.addInCreativeInv(2008,1,0,ItemCategory.TOOL);	
Item.defineAxe(2009,"pat_axe",0,"pat_axe",2271,7,0.125);
Item.addShapedRecipe(2009,1,0,["11 ","12 "," 2 "],["1",2000,0,"2",280,0]);
Item.addInCreativeInv(2009,1,0,ItemCategory.TOOL);	
Item.defineHoe(2010,"pat_hoe",0,"pat_hoe",2271);
Item.addShapedRecipe(2010,1,0,["11 "," 2 "," 2 "],["1",2000,0,"2",280,0]);
Item.addInCreativeInv(2010,1,0,ItemCategory.TOOL);	
Block.defineOre(210,"pat_ore",["pat_ore",0],56,1,12,3);
Block.setMinable(210,5,3,[2000,1,0]);
Block.setDestroyTime(210,3);	
Item.addInCreativeInv(210,1,0,ItemCategory.MATERIAL);
Block.defineBlock(211,"pat_block",["pat_block",0],57);
Block.setMinable(211,5,3,[211,1,0]);
Block.setDestroyTime(211,5);
Item.addInCreativeInv(211,1,0,ItemCategory.DECORATION);
Item.addCraftRecipe(211,1,0,[2000,9,0]);
Item.addCraftRecipe(2000,9,0,[211,1,0]);
Item.addFurnaceRecipe(210,2000,0);
