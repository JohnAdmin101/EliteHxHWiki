# Nen Types and Affinity

Every awakened player has one of six Nen types. You are given it when you awaken (see [Awakening](Awakening)), and it does not change unless an admin or a Nen Reset Token changes it. Your type does not lock you out of anything. It decides how good you are at each ability.

## The six types

| Type | The idea | A built-in ability |
| --- | --- | --- |
| Enhancement | Strengthen the body and what it holds | Hardened Strike: your next melee hit deals extra Nen damage. Pool: Triad Fist, Ground Breaker, Iron Body, Vital Surge |
| Transmutation | Change what the aura is like | Shock Edge: your melee hits arc to nearby enemies. Pool: Elastic Grip, Thunder Palm, Godspeed, Mending Thread |
| Emission | Send aura away from the body | Aura Bolt: charge and release an orb that bursts on impact. Pool: Waypoint Gate, Remote Fist, Barrage, Ricochet |
| Manipulation | Control things and creatures | Aura Tether: hold or pull a target. Pool: Puppet Needle, Calming Touch, Debt Collector, Marionette Self |
| Conjuration | Turn aura into a real object | Aura Construct: conjure a blade, or a shield while crouching. Pool: Binding Chain, Mending Chain, Lucky Slots, Dowsing Chain |
| Specialization | Unique abilities that fit nowhere else | Aura Read, Thief's Ledger, Crimson Sovereign or Aura Severance, whichever you roll |

Specialization is the odd one out. Its abilities cannot be learned from manuals. Each Specialist gets one ability from the Specialization **pool** when they awaken, at random, and keeps it (see below), so a Specialist has nothing to inscribe on a Blank Nen Manual. Specialists still use every other type's abilities, from manuals found in the world, and they get a special choice at the Hatsu stone (see [Hatsu](Hatsu)).

## Your type's pool

Each type can have a pool of birthright abilities, and awakening gives you one of your type's pool at random. No manual teaches it, you cannot forget it and nobody can borrow it from you. Every type has a pool, four abilities each. Players who awakened before a type's pool existed do not get a pick; only a new awakening (or an admin) gives one.

**Enhancement**

- **Triad Fist** is a charged strike. Released standing, it is Rock, a heavy blow to one target in reach. Released while crouching, it is Scissors, a sweep in front of you that hits everything in a 90 degree arc. A fuller charge hits harder.
- **Ground Breaker** slams the ground, hurting everything near you and pushing it away.
- **Iron Body** is a toggle that makes you tougher and harder to knock back, at the price of some speed.
- **Vital Surge** heals a teammate in sight, or you if nobody is, for a few seconds.

**Transmutation**

- **Elastic Grip** pulls the target in sight toward you. Crouch to pull yourself to the target instead; the grip lets go when you arrive.
- **Thunder Palm** is a burst around you that hurts and briefly stuns everything it hits.
- **Godspeed** is a toggle that makes you faster and dodges one melee hit every few seconds. It does not dodge arrows, explosions or Nen.
- **Mending Thread** gives you Regeneration. Crouch to lay a tripwire at your feet that slows enemies who touch it, for 20 seconds.

**Specialization**

- **Aura Read** shows a player's type, aura and techniques.
- **Thief's Ledger** copies a random ability of a player you strike for three minutes. The copy takes the ledger's slot and works at full affinity.
- **Crimson Sovereign** is a toggle that makes every ability count as your own type and adds power, at the price of your health.
- **Aura Severance** clears a teammate's Nen ailments, or cuts an enemy off from their aura for a few seconds.

**Conjuration**

- **Binding Chain** roots the target in sight for 3 seconds (1.5 for a player).
- **Mending Chain** heals you a little and gives Regeneration I.
- **Lucky Slots** conjures one of four weapons at random for 30 seconds: an aura blade, a scythe, a bow that needs no arrows or a staff that fires short bolts. Like every conjured item they vanish when dropped, stored or given away, and the bow and staff work only for you.
- **Dowsing Chain** points the way. Standing, to the nearest player; crouching, to the nearest hostile mob; crouching and looking down, to the nearest ore.

**Manipulation**

- **Puppet Needle** makes the next mob you hit hunt the nearest hostile creature for 8 seconds, and never turn on you.
- **Calming Touch** makes the next mob you hit ignore you for 15 seconds.
- **Debt Collector** puts the next creature you hit in debt for 10 seconds. A Nen user loses aura each second and is cut off from it for 3 seconds once enough has been taken; other creatures are weakened.
- **Marionette Self** is a toggle that makes you immune to knockback and slowness and your hits stronger.

**Emission**

- **Waypoint Gate** marks your spot, and the next use teleports you back to it.
- **Remote Fist** hits the target in sight from a distance.
- **Barrage** is a 3 second channel that fires a stream of small bolts.
- **Ricochet** is a spark that hits the target in sight and jumps to nearby creatures.

Your pick stays when you die. It is rolled again only when your Nen type changes (a Nen Reset Token or an admin) or your Nen is reset. A server can set `auraReadMode` to `extra`, so that every Specialist also always has Aura Read.

## The ring

The types sit on a ring: Enhancement, Transmutation, Conjuration, Specialization, Manipulation, Emission, and then back to Enhancement. How close an ability's type is to yours on the ring is its **affinity** for you. The **Types** tab of the status hub (**N**) draws the ring as a hexagon with your affinity for each type; point at a type for what that means.

| Distance on the ring | Example for an Enhancer | Affinity | Effect |
| --- | --- | --- | --- |
| 0 | Enhancement | 100% | Full power, the fastest mastery |
| 1 | Transmutation or Emission | 80% | 0.8 times the power, mastery takes 1.25 times the uses |
| 2 | Conjuration or Manipulation | 60% | 0.6 times the power, mastery takes 1.67 times the uses |
| 3 (opposite) | Specialization | 40% | 0.4 times the power, mastery takes 2.5 times the uses |

In plain words: affinity is your efficiency. The same aura buys less power in a type far from yours, so power is the base power times affinity while the aura cost stays the same. Control effects weaken the same way: an off-type tether pulls more weakly, and an off-type signature's binds, marks and commands are shorter and its pushes softer. Off-type abilities also use more of your memory. Each type has one opposite, always three steps around the ring: Enhancement and Specialization, Transmutation and Manipulation, Conjuration and Emission.

Affinity also sets a cap on mastery. You can learn an ability of any type, but you can never train it past your affinity for it, so an opposite-type ability tops out at 40% of its full power. Mastery of your own type's abilities can reach 100%. See [Abilities and Nen Manuals](Abilities-and-Nen-Manuals).

## Training other types

Your type is fixed, but you can train the other five. Every type you train earns **proficiency points** (up to 10 per type by default), and each point adds 1 percentage point to your affinity for that type. A point at Transmutation for an Enhancer takes 80% to 81%, and a full set of 10 points takes it to 90%.

- **How to train.** Finish an ability of that type (2 units a use, and repeats on the same target give less), or do the matching drill at a Meditation Stone: Brimming Glass for Enhancement, Color Shift for Transmutation, Crystal Pattern for Conjuration, Steady Hand for Manipulation and Far Mark for Emission. Specialization has no drill; only using Specialization abilities trains it. Type drills show in the stone menu from Nen level 10, once you have learned Ren, and never for your own type. See [Training Drills](Training-Drills).
- **Training partner.** When you pass a type drill with another awakened player of that drilled type within 8 blocks, the pass gives double units, and the chat line names your partner. Your partner gains nothing from it.
- **Hunter License.** A license holder gains 25% more training units from every source except admin commands, 30% with one Hunter star and 35% with two or three. See [Hunter Exam](Hunter-Exam).
- **Type Primers.** A Type Primer is an item for one type, found in dungeon, mineshaft, stronghold library and ancient city chests. Reading one adds 150 units of that type. It is kept if it is your own type, the type is complete, the type is held at a tier gate, or you are not awakened.
- **Tier gates.** Training in a type holds at point 5 and point 10 by default: units stop just short of the gate, and every source stops there, partner and license bonuses and primers included, until you pass that type's **tier trial** at a Meditation Stone. The stone menu then shows "<Type> tier trial" in place of that type's drill, and pointing at the type in the Types tab tells you the trial is needed. A trial is the type's drill made harder (see [Training Drills](Training-Drills)); passing it opens the next stretch of training and gives the **Breaking Through** advancement. Specialization has no gates. Training every other type but Specialization to the full earns **Six Sides**.
- **Daily water practice.** Craft a **Practice Glass** (a glass bottle, a water bucket, which you get back empty, and any leaves). Hold Ren and right-click it once each game day: your own type gains 0.25 percentage points of **purity**, up to 5, and your own-type abilities, and your signature Hatsu, are that much more potent. Purity is kept per type, so after a type change your new type starts from its own purity. Nothing is used up.
- **The price of a point.** The first point takes 100 units and point n takes n times that, so all 10 points take 5,500 units together.
- **The ceiling.** Training never lifts an affinity above 95% of your own-type affinity, so a trained type stays a little behind your own.
- **What it changes.** The trained affinity is the one that sets the power, the learning speed and the mastery cap of that type's abilities. A point also carries your mastery up with the cap, so a Mastered ability stays Mastered. Your own type never gains points, and training never lowers an affinity.

The **Types** tab shows it: the percent under a type is the trained one, with the bonus beside it in the type's colour (64% (+4)), a row of pips under it shows your points, and pointing at the type tells you how it is trained. Earning a point shows a toast.

A server can tune training with these settings (see [Server Owners](Server-Owners)):

| Setting | Default | What it does |
| --- | --- | --- |
| `proficiencyMaxPoints` | 10 | Most points per other type. Set 0 to turn training off: affinity is the plain ring value. |
| `proficiencyPointValue` | 0.01 | Affinity each point adds. |
| `proficiencyPointCost` | 100 | Units for the first point; point n costs n times this. |
| `proficiencyCeiling` | 0.95 | Share of your own-type affinity that training never passes. |
| `proficiencyUseGain` | 2 | Units from each completed use of another type's ability. |
| `proficiencyPerMinuteCap` | 20 | Most units from ability use per minute. Drills are not capped. |
| `trainingPartnerMultiplier` | 2 | Multiplier on a type drill when a partner of the drilled type is near. 1 turns it off. |
| `trainingPartnerRadius` | 8 | Blocks within which a partner counts. |
| `licenseProficiencyBonus` | 0.25 | Extra share of units for a Hunter License holder. |
| `primerUnits` | 150 | Units one Type Primer adds. |
| `proficiencyTierPoints` | 5, 10 | Points at which training holds until the tier trial is passed. Empty turns tier gates off. |
| `tierTrialScale` | 1.5 | How much harder a tier trial is than the drill. Time limits stay. |
| `purityPerPractice` | 0.0025 | Own-type purity one day's practice adds. |
| `purityMax` | 0.05 | Most own-type purity practice can build. 0 turns it off. |
| `breadthOathGain` | 2 | Multiplier on training units while the Breadth Oath is sworn. |
| `breadthOathPotency` | 0.9 | Multiplier on own-type potency while the Breadth Oath is sworn. |

## What it means for you

- Own-type abilities are cheapest to use and to remember, and are the only ones that count for the **Mastery** advancement.
- Abilities from a neighbor type are a good second choice.
- An opposite-type ability is a luxury: it costs the most aura, takes the most memory and is the weakest, but it still works.
- When you build a signature Hatsu, parts of your own type are cheapest too. See [Hatsu](Hatsu).

## Defending against Nen

Your state decides how hard Nen damage hits you, as well as your type:

| Your state | Nen damage you take |
| --- | --- |
| Not awakened | 1.5 times |
| Awakened with no technique on | 1.5 times |
| Zetsu | 2 times |
| Ten | normal |
| Full Ren | 0.85 times |
| Ken | 0.6 times |

Mobs take normal damage from Nen. Players who the attacker could not hurt with a plain hit, because PvP is off or because they share a team, are never hurt by Nen either.
