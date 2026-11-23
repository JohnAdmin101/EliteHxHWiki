# Hunter's Arsenal

The Hunter's Arsenal is gear a Hunter would carry: five weapons and eight armor sets with their own 3D look. Anyone can use it, awake or not. In the hands of a Nen user it is a little better, because [Shu](Techniques-and-the-Wheel) and [infusion](Infused-Gear) already work on it. A weapon counts as a sword, so it can be enchanted, infused and cursed like one.

Armor sets do not take armor trims.

## Hunter Alloy

Everything craftable here starts with **Hunter Alloy**. Craft 2 iron ingots, 1 copper ingot and 1 amethyst shard (shapeless) into 2 alloy.

## Weapons

All five are crafted with Hunter Alloy. Damage and speed are fixed in the item, as with vanilla tools, so a server owner cannot change them.

| Weapon | Damage | Speed | Trait |
| --- | --- | --- | --- |
| Field Knife | 5 | 2.4 | **Backstab.** A plain melee hit from behind the target deals 1.5 times the damage. |
| Wayfarer Blade | 6.5 | 1.8 | **Draw Cut.** The first plain melee hit after 3 seconds without one deals 1.4 times the damage. |
| Breaker | 10 | 0.9 | Disables a shield for 5 seconds. |
| Long Glaive | 6.5 | 1.2 | Reaches 1.5 blocks further while held in the main hand. |
| War Knuckles | 4.5 | 2.6 | **Shu Conductor.** While Shu is on, Shu's melee bonus counts twice. |

Notes on the traits:

- A trait works only on a direct melee attack by a player with the weapon in the **main hand**. Arrows, Nen hits and infusion imprints never trigger it.
- "Behind" means within 120 degrees of the back of the target's body. Where the target looks does not matter, only where its body faces.
- Draw Cut needs a swing that reaches a target. Swinging at air does not restart the wait, and a hit that a shield blocks still spends the Draw Cut.

Recipes, all with Hunter Alloy: the Knife is one alloy over leather and a stick; the Blade is two alloy over a stick; the Glaive is two alloy beside two sticks; the Breaker is four alloy over leather and a stick; the Knuckles are three alloy over three leather.

## Armor sets

A set bonus needs all four pieces. By default sets give their bonus; the server owner can turn all of them off. Each piece also has its own small bonus, shown in the tooltip. Wearing any full set earns the advancement **Fully Outfitted**, even with set bonuses off.

### Craftable sets

| Set | Pieces | Armor per piece | Each piece | Full set |
| --- | --- | --- | --- | --- |
| Field Set | Field Cap, Field Coat, Field Trousers, Field Boots | 2, 6, 5, 2 | +1.5% speed | +3 blocks safe fall distance |
| Bulwark Plate | Bulwark Helm, Cuirass, Greaves, Sabatons | 3, 8, 6, 3 (toughness 2 and 0.1 knockback resistance each) | -3% speed | +4 max health |
| Aura-Woven Robe | Aura-Woven Hood, Robe, Wraps, Sandals | 1, 4, 3, 2 | +5% aura regeneration and 3% less aura upkeep | +10% max aura |

The Field Set is leather and Hunter Alloy. Bulwark Plate is Hunter Alloy and iron. The Robe is made from **Aura-Woven Cloth** (4 string and 1 amethyst shard make 2 cloth), and the same cloth repairs it. When a Robe piece comes off, your aura is cut back to the lower maximum at once.

### Creative-only sets

These sets are not craftable and have no recipe, loot or trade. They are in the Nen creative tab and can be given with `/give`. Each piece is as strong as diamond (armor 3, 8, 6, 3, toughness 2, no speed penalty), and each has one small bonus on every piece and one bonus for the full set. They are original outfit designs.

| Set | Pieces | Each piece | Full set |
| --- | --- | --- | --- |
| Pathfinder Set | Pathfinder Hood, Mantle, Trousers, Boots | +1% speed and +3% aura regeneration | +50% sneaking speed |
| Trickster's Motley | Trickster's Marks, Top, Trousers, Shoes | +2% attack speed | Your aura is 20% less visible, so mobs notice you less |
| Greenwood Set | Greenwood Headband, Jacket, Shorts, Boots | +2% max health | +1 attack damage |
| Chainbinder's Vestment | Chainbinder's Circlet, Tabard, Trousers, Shoes | +3% aura regeneration | 10% less aura upkeep |
| Stormstep Set | Stormstep Hood, Shirt, Shorts, Boots | +2% speed | +10% attack speed |
| Midnight Regent | Regent's Band, Coat, Trousers, Boots | +3% aura potency | +10% max aura |

The Pathfinder cloak, the Chainbinder tabard and the Regent coat move as you walk, and the Pathfinder cloak stays still if you turn on reduced motion in the client settings. The Stormstep Hood is worn down around the neck.

## With Nen

Any piece or weapon can take the [infusion ritual](Infused-Gear) and be cursed or [exorcised](Cursed-Items). A cursed or infused piece still counts toward a set.

## For server owners

`gearKnifeBackstabMultiplier` (1.5), `gearDrawCutMultiplier` (1.4), `gearDrawCutSeconds` (3), `gearConductorFactor` (2), `gearSetBonusesEnabled` (true) and one key for each set bonus tune the Arsenal: `gearFieldSetSafeFall` (3), `gearBulwarkSetHealth` (4), `gearAuraWovenSetMaxAura` (0.10), `gearPathfinderSetSneakSpeed` (0.5), `gearTricksterSetVisibilityCut` (0.20), `gearGreenwoodSetDamage` (1), `gearChainbinderSetUpkeepCut` (0.10), `gearStormstepSetAttackSpeed` (0.10) and `gearRegentSetMaxAura` (0.10). See [Server Owners](Server-Owners).
