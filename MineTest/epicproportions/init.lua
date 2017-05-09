-- default (Minetest 0.4 mod)
-- Most default stuff

-- The API documentation in here was moved into doc/lua_api.txt

WATER_ALPHA = 160
WATER_VISC = 1
LAVA_VISC = 7
LIGHT_MAX = 14

-- Definitions made by this mod that other mods can use too
default = {}

-- Load other files
dofile(minetest.get_modpath("epicproportions").."/mapgen.lua")

-- Set a noticeable inventory formspec for players
minetest.register_on_joinplayer(function(player)
	local cb = function(player)
		minetest.chat_send_player(player:get_player_name(), "This is the [minimal] \"Minimal Development Test\" game. Use [minetest_game] for the real thing.")
	end
	minetest.after(2.0, cb, player)
end)

--
-- Tool definition
--



minetest.register_tool("epicproportions:pick_pat", {
	description = "FuriousDestryoer Pickaxe",
	inventory_image = "itemPatPick.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("epicproportions:pick_jen", {
	description = "SuperGirlyGamer Pickaxe",
	inventory_image = "itemJenPick.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

-- ITEMS
minetest.register_craftitem('epicproportions:ingot_jen', {
    description = 'SuperGirlyGamer Ingot',
    inventory_image = 'itemJenIngot.png',
    stack_max = 64,
})

minetest.register_craftitem('epicproportions:ingot_pat', {
    description = 'FuriousDestryoer Ingot',
    inventory_image = 'itemPatIngot.png',
    stack_max = 64,
})

-- CRAFTS

minetest.register_craft({
    output = 'epicproportions:pick_pat',
    recipe = {
      {'epicproportions:ingot_pat','epicproportions:ingot_pat','epicproportions:ingot_pat'},
      {'', 'group:stick', ''},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'epicproportions:pick_jen',
    recipe = {
      {'epicproportions:ingot_jen','epicproportions:ingot_jen','epicproportions:ingot_jen'},
      {'', 'group:stick', ''},
      {'', 'group:stick', ''},
    }
})