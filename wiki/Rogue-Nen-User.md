# Rogue Nen User

A Rogue Nen User is a hostile stranger who learned Nen on his own. He wears a hood and a cloak, and he is the first thing in the mod that you can read, sense and drain with your own Nen.

## Meeting one

Rogues walk the Overworld surface at night, alone. They do not appear in caves, and they do not burn in the sun. You can also place one with the Rogue Nen User spawn egg in the Nen creative tab, and an egg works at any time of day.

A rogue has 40 health and 4 armor, and he is a little faster than a zombie. Each one has a Nen level from 5 to 15 and a Nen type. The type shows in the colour of his aura and in what Aura Read tells you.

## What he does

He is always in one of three states:

- **Zetsu.** He stands quiet and hidden. You see no aura and no outline. He rests here when nobody is near, when he is far from his target, when he has run out of aura, and inside a Nen-sealed zone. Hurt him and he drops out of it at once.
- **Ten.** His aura rises around him like steam. He takes less damage in this state, the same as you do when you hold Ten. He holds it when you are within 12 blocks, or after you hurt him.
- **Ren.** When you are within 3 blocks and he has aura to spare, he stops and gathers his aura for about a second. Then he strikes once for roughly double his normal hit. The strike is Nen damage, so your own Ten, Ren and Ken make it hurt less, and Zetsu makes it hurt more. He needs about five seconds to do it again.

His aura comes back slowly when he is not in Ren. If he runs dry he falls back to Zetsu and stays there until he has recovered a little.

## Using your Nen on him

- **Gyo** shows a hidden (Zetsu) rogue as an outline, as long as you face him and can see him.
- **En** lists a rogue who is in Ten or Ren. A rogue in Zetsu is hidden from En, just as a player in Zetsu is.
- **Aura Read** tells you his type, how much aura he has and what he has active. It will not read a rogue in Zetsu.
- **Drain** takes real aura from him and gives it to you. Drain him dry and he drops into Zetsu.
- **Borrow** finds nothing to take, because a rogue knows no abilities.

## Fighting by type

A rogue of Nen level 10 or higher fights with one move of his Nen type, on top of the three states above. A move needs him in Ten with a target and aura to spare, and it is never used inside a Nen-sealed zone. Every move winds up for at least a little over half a second and shows in his pose, so you can read it and answer. A rogue who is out of aura, or whose Nen is cut by Aura Severance, uses none. Against a player who has not awakened he only hits plainly.

| Type | Move | What it does | What to do |
| --- | --- | --- | --- |
| Enhancement | Iron Hide | He takes half damage while he winds up his Ren strike, and heals about 1 health a second once he has been alone in Ten for 3 seconds. | Do not trade blows while he gathers. Do not leave him alone to rest. |
| Emission | Aura Shot | He keeps 6 to 12 blocks away and fires aura bolts after he swings an arm out. He fights in melee only when cornered. | Close the gap, or break the line of sight. |
| Transmutation | Sticky Reach | A line of aura 6 blocks long that pulls you 3 blocks toward him and slows you for 2 seconds. | Ken shrugs the slow off. |
| Conjuration | Conjured Edge | A pale blade for 8 seconds. He reaches further, and each hit leaves a Nen wound. | Stay out of reach until it fades. |
| Manipulation | Needle Order | Up to two ordinary monsters within 12 blocks hunt you, 20% faster, until he dies, 15 seconds pass or you get away. He never takes neutral mobs, animals, players, beasts, bosses or named mobs. | Kill him first, or lose the mobs. |
| Specialization | Borrowed Breath | His Ren strike steals aura from you, never below the point of Exhaustion, and heals him. Every 10 seconds he steps behind you after a lean. | Keep your back guarded and your aura up. |

Specialization rogues are about a fifth as common as each other type. A move that cannot be used (no room to step, no monster to take) costs him nothing. Below level 10, and for every rogue made by an exam or in the Tower, no kit is used.

## The Rogue Adept

Now and then a natural rogue is a **Rogue Adept**: about one in twenty by default. He is a darker, tougher rogue of Nen level 30 to 45 with 100 health and 8 armor, and he uses his type's move too. Eggs and commands make plain ones only; the Adept appears only by natural spawn, never in a Nen-sealed zone.

An Adept fights in stances, and a careful player can read them from his pose and from his aura, which burns brighter or dimmer:

| Stance | When | His hits | Hits on him |
| --- | --- | --- | --- |
| Guard | You are charging (Ko, a fresh Ren or a charge ability). | 0.6 times | 0.5 times |
| Even | Otherwise. | 1.0 times | 1.0 times |
| Strike | Your aura is below 30%, you are in Zetsu, or you just missed. | 1.5 times | 1.3 times |

A stance holds for about a second and a half, and he bites a half second after it shows. The aura is brighter in Strike and dimmer in Guard.

His **Ko** is a fist drawn back for 1.5 seconds, then one hit at triple his attack if you are still within 3 blocks and in sight. He never starts one from Guard or in the middle of a move, and he waits 12 seconds after each, hit or miss. While he winds it up, and for a second after, he takes double damage. One hit of 15% of his health during the wind-up cancels it and staggers him; this earns the advancement Read the Flow. Cut by Aura Severance, or in a Nen-sealed zone, he starts no Ko and stays in Even.

**Rewards.** 30 experience points, 200 to 600 Jenny, and a Nen Manual about half the time. His kill counts toward the Blacklist Hunter deed (see [Hunter Exam](Hunter-Exam)). An Adept who rises again after a defeat (see [Post-mortem Nen](Post-mortem-Nen)) rises as an Adept and drops nothing.

## Rewards

A rogue gives 10 vanilla experience points, and fighting him in Ten or Ren earns Nen experience like any other mob. When a player defeats him he sometimes drops a Nen Manual (about one time in ten). The kill also counts toward your Nen Kills statistic when it was made with Nen damage.

## After you defeat him

A rogue you defeat sometimes gets up again, once. See [Post-mortem Nen](Post-mortem-Nen).

## For servers

Two settings in the server config control rogues: how often a natural spawn succeeds (set it to 0 to turn natural spawns off) and how often a defeated rogue drops a manual. Spawn eggs and commands ignore only the spawn chance; a rogue made by an egg still drops manuals at the drop chance. See [Server Owners](Server-Owners).

The `mobs.rogue` table of `server.toml` tunes the kits and the Adept. `rogueKitsEnabled` (true) turns kits off so every rogue fights plain, and `rogueKitMinLevel` (10) is the lowest level that uses one. `rogueSpecialistWeight` (0.2) is how likely a Specialization rogue is next to the other types. Each move has its own aura cost, cooldown and strength keys, for example `rogueShotCost` (8), `rogueShotCooldownTicks` (40), `rogueEdgeSeconds` (8) and `rogueNeedleMobs` (2). For the Adept, `adeptSpawnChance` (0.05) is the share of natural rogue spawns that become one, `adeptMinLevel` (30) and `adeptMaxLevel` (45) set his level, `adeptKoMultiplier` (3.0) his Ko, `adeptDropMin` (200) and `adeptDropMax` (600) his Jenny, and `adeptManualChance` (0.5) his manual. Other creatures, such as the [Wandering Hunter](Bestiary#the-wandering-hunter), hunt rogues too.
