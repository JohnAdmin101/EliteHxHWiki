# Bestiary

Three creatures of the wild that are not Nen beasts and not rogues: a parasite that feeds on your aura, a neutral Hunter who walks the land and trades, and a hive that grows until its queen has to be killed. For the creatures built on Nen users, see [Rogue Nen User](Rogue-Nen-User) and [Nen Beasts](Nen-Beasts). For the animals you hunt for food, see [Gourmet](Gourmet).

## Aura Tick

An Aura Tick is a small pale parasite, about the size of your hand, that rides on your back and drinks your aura. It is not a Nen beast: it has no owner and saves like any mob.

**Where.** Dark caves below y 40, and swamps, jungles and dark forests at night. It is a monster, so it spawns by the usual rules and with a 15% chance by default on each roll. It never spawns in a Nen-sealed zone or in the Tower.

**What it senses.** It senses aura, not bodies. The more you give off, the further away it notices you:

| You are in | It notices you from |
| --- | --- |
| Zetsu | Never |
| No technique up | 4 blocks |
| Ten | 8 blocks |
| Ren, Ken, En or using an ability | 16 blocks |

It only goes for awakened survival players. An unawakened player is never hunted, drained or shown it.

**What it does.** It creeps up, leaps at 2.5 blocks and latches onto your back. Each tick drains 1.5 aura a second, and no more than 3 can ride one player. It never drains you below 10% of your maximum, so it cannot cause Exhaustion or end an ability. When it holds 60 aura it is full: it drops off, crawls away and burrows. The first time one latches in a session, a line on the action bar says "Something is feeding on your aura." After that the only sign is your aura bar, so watch it.

**Seeing it.** You do not see it unless you have Gyo on. Spectators and creative players see it, and every awakened player sees one that has just been starved off. A tick drawn full is a little bigger and brighter. Your own tick shows on your back only in third person.

**Getting rid of it**

- **Zetsu.** Hold Zetsu for 3 seconds and every tick on you drops off, stunned, for 5 seconds. Everyone awakened can see and kill a stunned tick.
- **Ren.** Turning Ren on bursts every tick riding you. A tick that was already on when Ren came on is not burst. Ken and a released Ko count as Ren.
- **A hit.** Anyone who can see one kills it in one hit. You can hit one on your own back only with Gyo up.
- **Wait.** It will leave full in the end. An ignored tick costs a bounded amount, once.

A tick lets go by itself when you log out, die, change dimension, enter a Nen-sealed zone or a Tower match, reset your Nen, or are teleported away.

**Loot.** A tick that is killed or burst with at least half its capacity stored drops an **Aura Sac** holding half of what it took. Using the sac gives that aura back to an awakened player, so a tick is always a net loss for the one who drained you. An unawakened player who uses it feels nothing. A tick gives no Nen experience. The advancement Uninvited Guest is for the first tick you remove with Zetsu, Ren or a friend's hit, rather than one that left full.

**For server owners.** The `mobs.auraTick` table of `server.toml`: `auraTicksEnabled` (true; off stops spawns and makes loaded ones burrow), `auraTickSpawnChance` (0.15), `auraTickDrainPerSecond` (1.5), `auraTickCapacity` (60), `auraTickFloor` (0.10), `auraTickMaxPerHost` (3), `auraTickZetsuSeconds` (3) and `auraTickSacReturn` (0.5). A spawn egg is in the Nen creative tab.

## The Wandering Hunter

A Wandering Hunter is a neutral Hunter who comes to visit. He hunts rogues and wild Nen beasts, sells a few wares and spars once a day. He is a person, not a monster, so he stays even on Peaceful.

**Who he is.** Each has a name, a Nen type, a level from 25 to 45 by default, one of the five Hunter specialties (see [Hunter Exam](Hunter-Exam)) and one of four looks. He has 60 health and 6 armor, holds Ten while awake and never Zetsu, and fights with his type's rogue move at any level (see [Rogue Nen User](Rogue-Nen-User#fighting-by-type)). Against a player who has not awakened he hits plainly.

**Visits.** He never spawns by himself in the world. Every 40 minutes of overworld time the game rolls, and with a 50% chance by default it picks a player in the overworld and sends a Hunter to walk up from 24 to 48 blocks away. It will not send one inside a claim or a Nen-sealed zone, and not when 3 Hunters are already around. He wanders near where he arrived for 20 minutes, then walks off. A spawn egg Hunter is not a visit and does not leave.

**What he hunts.** Wild rogues, Rogue Adepts and wild Nen beasts within 24 blocks, and any monster that hurt him. He never goes for a named rogue or beast, a creature in the Tower or an exam, gourmet game animals or a tamed beast, unless it hurt him. What he kills drops nothing for you.

### Neutrality

He never starts a fight with a player. Hurt him, or have your tamed beast hurt him, and he is provoked against you and your beasts for 30 seconds after the last hit, and every Hunter within 32 blocks joins in. Creative and spectator players provoke nothing. The Hunter attacks with Nen only against awakened players.

### Wares

Right click him to trade. He shows six rows, with an icon, a price in Jenny and how many you can still buy. Four come from his specialty and two are common. Stock is yours alone: 1 of each single item or service and 4 of each bulk ware (bones, leads, lapis, kelp and the like), per visit.

| Specialty | He sells |
| --- | --- |
| Beast | A beast lead, an Aura Sac, bones, leads |
| Blacklist | A Nen Manual from the pool, a blank manual, a rogue lead, a golden apple |
| Treasure | A buried-treasure map, a spyglass, lapis, amethyst |
| Gourmet | An Aura Pot, honey, kelp, sugar, and Ridgehorn marrow, Glimmerfin roe and Duskwing egg (900 Jenny each) |
| Archaeology | A brush, two pottery sherds, a trial-chamber lead |
| Common | Aura-Woven Cloth, a Hunter's Ration, golden carrots and, with Maker's Trace on, an Unexamined Lot (120 Jenny) |

Prices are fixed and the same for everyone, by default. Jenny comes from the wallets you carry first, then from your bank. He never pays out Jenny for what you sell him: he does not buy from you, with one exception, an antique you appraise (see [Maker's Trace](Makers-Trace)). Without a Hunter License you see the specialty rows as "Hunter License needed" and can buy only the common ones. Gourmet ingredients bought from him do not count toward the Patient Hands advancement. If the economy is off, every row is closed.

A **lead** is a line in chat that points you toward the nearest wild beast, rogue or trial chamber within 256 blocks: a compass direction and a distance rounded to 32 blocks, never coordinates. If nothing is found, it costs you nothing. A buried-treasure map is a real map, drawn only after you pay.

Buying from three different Hunters earns the advancement Fellow Traveller.

### The price of a kill

You can kill him. It has a price:

- He drops a purse of 30 to 90 Jenny and nothing else.
- Every Hunter refuses to trade with you, and attacks on sight within 16 blocks, for 3 game days. This is a grudge. A second kill does not extend it.
- You lose 30 deed points from your current Hunter specialty (never below zero, and never a star you have already earned).
- You are on the Wanted list of the Hunter Terminal, where other players can put Jenny into a bounty on you (see [Hunter Terminal and Bounties](Hunter-Terminal-and-Bounties)).

The grudge survives death, relogging and a Nen reset. The price applies to whoever gets the kill, including your tamed beast's owner. A creative or spectator killer pays nothing. A Hunter who dies to something else costs nobody anything.

### The spar

Ask him to spar from his screen. You must be awakened, licensed and free of any grudge, out of combat for 5 seconds and above a quarter of your health. You may spar once a game day.

He is healed to full, and the bout lasts 60 seconds or until either of you is at a quarter of your health. Neither of you can be knocked below 1 health in it. He does not take aura from you, a spar never makes him hostile and never leaves a grudge. A finished bout gives 20 Nen experience, and a win gives double. If a third party interrupts, you walk away, die or log out, it ends with no reward and the day is not spent.

**For server owners.** The `mobs.hunter` table: `wanderingHuntersEnabled` (true), `hunterVisitMinutes` (40), `hunterVisitChance` (0.5), `hunterStayMinutes` (20), `maxWanderingHunters` (3), `hunterMinLevel` (25), `hunterMaxLevel` (45), `hunterPriceFactor` (1.0), `hunterGrudgeDays` (3), `hunterKillDeedLoss` (30), `hunterDropMin` (30), `hunterDropMax` (90) and `hunterSparXp` (20). Admins can send a Hunter at once with `/nen admin hunter visit` and end a grudge with `/nen admin hunter forgive <player>`.

## The Broodmother and her hive

Somewhere in the Overworld an insect hive founds itself. It grows on what its brood kills, until it has a queen. You can ignore it for a while, but a grown hive is a boss fight that pays well.

**Founding.** Once a game day, if fewer than 1 hive stands (by default) and 7 days have passed since the last one ended, a hive is founded on the surface 96 to 160 blocks from a random player. It is never within 256 blocks of a claim, a Nen-sealed zone or the world spawn. The mound is about 7 blocks wide with a raised room for the queen, built of brood comb. You can break comb by hand, but it drops nothing and you cannot collect it.

**Stages.** The hive grows by biomass, which its brood gain by killing wild animals and monsters near the mound: 1 for a cow, 2 for a zombie. Players are never prey, and neither are villagers, golems, pets, tamed beasts, named or leashed mobs, aura users and anything inside a claim.

| Stage | Biomass | Hunting radius | Brood cap | New at this stage |
| --- | --- | --- | --- | --- |
| 1 | 0 | 24 | 6 | Drones |
| 2 | 40 | 40 | 10 | Warriors |
| 3 | 120 | 56 | 14 | Guards |
| 4 | 300 | 72 | 18 | The Broodmother wakes |

While a player is within 96 blocks the hive makes a new brood every 20 seconds, up to its cap. A hive that nobody is near still grows by 10 biomass a game day, but never past stage 3: the last stage has to be earned where you can see it.

**The brood**

| Mob | Health | Notes |
| --- | --- | --- |
| Brood Drone | 8 | Fast. Hunts prey and swarms players. |
| Brood Warrior | 30 (armor 8) | A bigger Drone. Crouches for under a second, then lunges from 3 to 6 blocks. |
| Brood Guard | 60 | Holds Ten and strikes with Ren after a one second wind-up. Stays within 16 blocks of the mound. |

The brood attack any survival player who comes within the hunting radius, awakened or not. A Nen hit from the brood never lands on an unawakened player: it is a plain hit instead. They never enter a claim and deal no damage in one. A brood mob that goes far from the hive for 30 seconds burrows. Brood never come from eggs or from natural spawning, and without a live hive one dies within a minute.

**Finding it.** From stage 3, a licensed player sees "Hive sighted" on the Hunter Terminal's sightings page, with a rounded distance and a compass direction, never coordinates (see [Hunter Terminal and Bounties](Hunter-Terminal-and-Bounties)). From stage 4 the mound sends up a column of aura that you can see from far away with Gyo on. With `hiveAnnounce` on, every online player gets one chat line when a hive reaches stage 4, with no coordinates.

**The Broodmother.** She is rooted in the mound: she turns but never walks. Her health is 80, 160, 280 or 400 by the stage the hive reached, raised by half again for each extra player within 32 blocks, up to three times. Her moves:

- A bite in front of her (6, 8, 10 or 12 damage by stage).
- From stage 3, a bolt of aura spat from 5 to 24 blocks. She never spits at an unawakened player.
- At stage 4, a Ren shockwave every 20 seconds after a 2 second tell, with knockback and 10 damage within 8 blocks.
- Below 30% health she calls every living brood mob to her, once.

If nobody is within 64 blocks for 60 seconds she forgets the fight and heals to full. In a claim her attacks do nothing: claiming the ground over the mound makes her harmless, and the hive still pays out.

**Rewards.** Everyone who took part is paid: you dealt at least 5% of her health, or stayed within 32 blocks for half the fight and dealt some damage. What you get depends on the stage the hive reached:

| Stage | Royal Jelly | Jenny | Manual |
| --- | --- | --- | --- |
| 1 | 1 | 200 | none |
| 2 | 2 | 500 | none |
| 3 | 3 | 1200 | 1 |
| 4 | 5 | 3000 | 1 |

Jenny goes straight to your bank. Anything that does not fit in your inventory drops at your feet. Clearing a hive also counts as a beast deed for your Hunter License, which falls under the daily deed cap. Royal Jelly restores 40 aura when eaten and is the base of a thirteenth dish, the Queen's Portion, cooked in the Aura Pot by a tier 1 cook (see [Gourmet](Gourmet)); it gives a bonus of +25% to maximum aura. The advancements are Root and Branch for taking part and Before It Hatched for clearing a stage 1 hive alone.

When the queen dies, the comb crumbles over 30 seconds and the rest of the brood die within a minute. A new hive can found after the wait.

**For server owners.** The `mobs.hive` table: `hivesEnabled` (true; off ends standing hives without reward), `maxHives` (1, up to 4), `hiveRespawnDays` (7), `hiveClaimDistance` (256), `hiveIdleGrowthPerDay` (10), `hiveSpawnSeconds` (20), `hiveAnnounce` (true), `hiveRewardFactor` (1.0) and `hiveQueenHealthFactor` (1.0). Admins can use `/nen admin hive found`, `clear`, `stage <n>` and `info`. See [Server Owners](Server-Owners).
