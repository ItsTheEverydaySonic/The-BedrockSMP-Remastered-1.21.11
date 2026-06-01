execute store result score @s bcount run data get entity @s SelectedItem.count
give @s milk_bucket
item replace entity @s weapon.mainhand with air
scoreboard players remove @s bcount 1
function milking:milkloop

execute at @a[distance=0.5.., sort=nearest] run playsound entity.cow.milk master @a ~ ~ ~ 100
effect give @a[tag=nuasea] nausea 12 0 true
tag @a[tag=nuasea] remove nuasea