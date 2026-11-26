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

## Alloy Spinner

Craft 4 Hunter Alloy and 2 string (two columns of alloy with the string beside them). It is a heavy yo-yo with 500 uses, repaired with Hunter Alloy. Anyone can use it, awake or not. A plain left click is an ordinary melee hit. Use it instead and hold:

- **Tap to strike.** Let go before 12 ticks (`spinnerWrapHoldTicks`, 12 by default) and the yo-yo flies out up to 6 blocks (`spinnerReach`, 6) along your look, hits the first living thing in sight for 5 damage (`spinnerStrikeDamage`, 5) and snaps back. It is a physical hit, not a Nen hit: it leaves no Nen wounds, and bonuses such as the Field Knife backstab do not apply. Claims, PvP rules and Nen zones still stop it. After a strike, hit or miss, it needs 25 ticks (`spinnerStrikeCooldownTicks`, 25) before the next one. It costs 1 use.
- **Hold, then release, to wrap.** Hold for at least 12 ticks and the string wraps the target instead, with a 60 tick pause (`spinnerWrapCooldownTicks`, 60) and 2 uses. A small mob, up to 1 block wide (`spinnerMaxWrapWidth`, 1) and 2 high (`spinnerMaxWrapHeight`, 2), is pulled toward you for up to 40 ticks (`spinnerPullTicks`, 40) at 0.35 blocks a tick (`spinnerPullSpeed`, 0.35). The pull stops 1.5 blocks away, or if you swap items, get hurt or lose sight. Big mobs and bosses get a plain strike instead. Riders, mounts, leashed mobs and mobs with no AI are not pulled.
- **Wrap a player.** A player is not dragged. They get one short tug of 2 blocks (`spinnerPlayerTug`, 2) toward you and Slowness I for 20 ticks (`spinnerPlayerSlowTicks`, 20), and no damage. It works only where PvP is allowed, never on an ally, and you cannot tug the same player again for 200 ticks (`spinnerPlayerTugCooldownTicks`, 200).
- **Shock.** If you hold stored shock from [Lived Properties](Training-Drills), a strike that hits spends 5 of it (`spinnerShockCost`, 5) and the target is slowed hard for 1.5 seconds (`spinnerShockSeconds`, 1.5). The tooltip says "Carries your stored shock" while you have enough. With none stored it is a plain hit, and a wrap never shocks. The string flashes yellow when shock is spent.

Everyone who can see you sees the string, your throw and wrap arm animations, and hears a whirr on a strike or a snap on a wrap or tug. Nothing about a spinner is saved: a pull ends if you log out, die or change dimension. Server owners can set the keys above in the `[spinner]` table, turn the item off with `spinnerEnabled`, or set the shock cost or the player tug to 0.

## The Shu kit

Three small tools for training [Shu](Techniques-and-the-Wheel#shu). All work without Nen, but only a Shu user gets their edge, and they earn Shu mastery.

### Trainer's Shovel

Craft one Hunter Alloy over two sticks. It is a wooden-tier shovel with 250 uses, repaired with Hunter Alloy, and it still makes paths. With Shu on it digs shovel blocks 6 times as fast as it otherwise would (`shovelShuSpeed` is 12 by default, and the speed is half of it); the usual Shu mining bonus is not added on top. Every block you break this way in survival earns Shu mastery. If you drop Shu within 1 second of a dig (`shovelDropWindowTicks`, 20) with the shovel still in your main hand, the shovel loses a quarter of its durability (`shovelDropWearFraction`, 0.25) and may break. `shovelShuSpeed` can be set from 2 to 64: at 2 the shovel digs like a plain wooden one, with no bonus.

### Edge Cards

Craft 3 paper and 1 iron nugget (shapeless) into 8 cards. They stack to 16. Use one to throw it, with a 0.4 second pause between throws (`cardCooldownTicks`, 8). How it flies is decided at the throw:

- **Sharp.** If Shu is on and working, you are not in a Nen zone and you can pay 3 aura (`cardAuraCost`), the card flies straight and fast and does 4 damage (`cardDamage`) scaled by your aura potency. It is a Nen hit, so claims, PvP rules and Nen zones stop it like any other ability. A sharp hit earns Shu mastery, unless the target is you, an armor stand, an ally or your pet.
- **Bare.** Otherwise nothing is spent. The card flutters, falls short, hurts nothing and drops.

Cards drop where they land, or stick in a block, and anyone can pick them up. A card is sharp for its first flight only: if the block it stuck in is broken and it falls, it is a plain card and hurts nothing. In creative a throw uses no card. Dispensers drop cards.

### Dispute Coin

Craft a gold ingot and a Hunter Alloy (shapeless). Use it to flip: everyone within 16 blocks of you in the same dimension (`coinRadius`) sees a chat line with the face, and the flip plays an arm animation and sound. You can flip again after 5 seconds (`coinCooldownTicks`, 100). Sneak and use it to cycle your **call**: nothing, Crown or Blade. With a call, the line also says whether you won or lost. You cannot change the call for 5 seconds after a flip; change it once the coin has settled. The coin costs no aura and works for anyone, awake or not, in Zetsu or in a Nen zone.

## With Nen

Any piece or weapon can take the [infusion ritual](Infused-Gear) and be cursed or [exorcised](Cursed-Items). A cursed or infused piece still counts toward a set.

## For server owners

`gearKnifeBackstabMultiplier` (1.5), `gearDrawCutMultiplier` (1.4), `gearDrawCutSeconds` (3), `gearConductorFactor` (2), `gearSetBonusesEnabled` (true) and one key for each set bonus tune the Arsenal: `gearFieldSetSafeFall` (3), `gearBulwarkSetHealth` (4), `gearAuraWovenSetMaxAura` (0.10), `gearPathfinderSetSneakSpeed` (0.5), `gearTricksterSetVisibilityCut` (0.20), `gearGreenwoodSetDamage` (1), `gearChainbinderSetUpkeepCut` (0.10), `gearStormstepSetAttackSpeed` (0.10) and `gearRegentSetMaxAura` (0.10). The Shu kit has its own tables, `[shovel]`, `[card]` and `[coin]`. The Alloy Spinner has its own table, `[spinner]`. See [Server Owners](Server-Owners).
