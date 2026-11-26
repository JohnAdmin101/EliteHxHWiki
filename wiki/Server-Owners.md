# Server Owners

Everything you need to run Elite HxH on a server: what to install, where the config lives, who can run commands, and which settings to look at before you open the doors to the public. The defaults are chosen to be safe, so a small private server can run on them as they are.

## Installing

You need these on **both** the server and every client:

- Minecraft 26.3 with NeoForge 26.3.0.99 or newer, on Java 25.
- **GeckoLib** 5.5.7 or newer (below version 6). It is a required dependency, and it must be in the mods folder on the server and on the clients. If the game stops at start-up with a message about a missing mod, this is the usual reason.
- **Curios API** 17.0.1 or newer (below version 18) for Minecraft 26.3. It is also required, on the server and on every client: the rings, necklaces, charms and other accessories equip into its slots.
- The Elite Hunter X Hunter jar.

Every client also needs **Player Animation Library** 1.2.8 or newer (below 1.3), which moves the player model with Nen. The server does not need it.

Put the jars in `mods/` and start. The first start writes the config files. There are no extra resource packs or datapacks to install.

Players who have the mod see the whole look: the aura, the effects, the screens and the HUD. Clients need the same mod, GeckoLib and Player Animation Library to join.

## The config files

All three files are in `config/elitehxh/`:

| File | Side | What it holds |
| --- | --- | --- |
| `server.toml` | server, sent to every client | Engine rules and balance: aura, XP, levels, awakening, vows, Hatsu, moderation. |
| `abilities.toml` | server, sent to every client | One section per ability, technique, vow and Hatsu part: turn it off, change its cost, cooldown or unlock level. Addon content appears too. |
| `client.toml` | each player's own game | Only how that player sees Nen: how the aura and effects are drawn, and where the HUD goes and which pop-ups show. See [FAQ and Troubleshooting](FAQ-and-Troubleshooting). |

Edit the files while the server is stopped, or while it runs: it reloads them. A value outside its range is corrected, with a warning in the log. A file with the same name in `<world>/syncedconfig/elitehxh/` overrides the global one for that world, so edit that copy if a world has one.

Every key, its default and its range are in `docs/config-reference.md` in the mod's repository.

Hunter stars and specialties have three keys: `starPoints` (deed points in a specialty for tier 1, 2 and 3; default 100, 300, 800), `specialtySwitchDays` (real days between specialty changes; default 7, 0 means no wait) and `hunterDeedDailyCap` (most points one kind of deed adds per UTC day; default 30). Deeds an addon adds through the API are not capped. See [Hunter Exam](Hunter-Exam).

## Commands and permissions

Every operator command sits under `/nen admin`. The commands outside it are for every player: `/nen me`, `/nen en shape`, `/nen explain`, `/nen geas release` and `/nen tower leave|forfeit` (plus `/nation`). A bare `/nen` does nothing. Each subcommand has its own permission node, `elitehxh.command.<name>`, and it defaults to operator level 2. With a permission mod such as LuckPerms, you can hand a node to moderators without making them operators.

| Node | Command |
| --- | --- |
| `elitehxh.command.info` | `/nen admin info <player>`: type, level, aura, techniques, abilities, slots, memory, vows and Hatsu |
| `elitehxh.command.awaken` | `/nen admin awaken <player> [type]`: wake a player, and pick the type |
| `elitehxh.command.set` | `/nen admin set aura\|level\|type <player> <value>` |
| `elitehxh.command.technique` | `/nen admin technique grant\|revoke\|activate <player> <technique>` |
| `elitehxh.command.ability` | `/nen admin ability grant\|revoke\|use <player> <ability>` |
| `elitehxh.command.vow` | `/nen admin vow add\|remove <player> <vow> [ability]` |
| `elitehxh.command.hatsu` | `/nen admin hatsu info\|rename\|approve\|reset <player>` (rename, approve and reset take an optional `slot <1-3>` before the name; no slot means slot 1, or the slot whose name waits for approve). The same node covers `/nen admin insight <player> show\|grant <amount>\|unlock <part>\|lock <part>\|reset-respec` for Hatsu insight |
| `elitehxh.command.me` | `/nen me`: your own Nen, like `/nen admin info` on yourself. Every player can use `/nen me`, so this node defaults to everyone, not to operators. |
| `elitehxh.command.nation` | `/nation found\|info\|list\|invite\|accept\|leave\|kick\|rank\|crown\|rename\|disband\|color\|claim\|unclaim\|grant\|revoke\|rights\|ally\|neutral\|enemy\|trust\|untrust\|map`: found a nation (or just claim, which makes a personal one), invite and rank members, claim and hand out land, trust friends, set relations, open the claim map. Every player can use it, so this node defaults to everyone, not to operators. |
| `elitehxh.command.nation_admin` | `/nation admin disband\|expire\|setking\|claim\|unclaim\|rename\|bonus\|bypass\|zone`: operator tools that skip the player rules. `/nation admin zone create <name>`, `delete <name>`, `flag <zone> ...` and `list` make, remove, tune and list protected zones (see [Nations](Nations)). `bypass` only works while you are in creative mode and stops the moment you lose this permission. The admin tree sits under `/nation`, so a group denied `elitehxh.command.nation` cannot reach it either: grant `nation` to staff who need `nation_admin`. |
| `elitehxh.command.clear` | `/nen admin clear exhaustion\|lockout\|overuse\|cooldowns <players>`: end Nen Exhaustion, Vow Lockout, Nen Overuse or every ability cooldown early. `/nen admin clear cooldowns <players> <ability>` clears one ability's cooldown. `/nen admin clear examwait\|trialwait <players>` ends the wait after a failed Hunter Exam or Hatsu trial. Nothing running ends. |
| `elitehxh.command.list` | `/nen admin list`: every awakened player online, with type, level, aura and how many abilities and techniques are running |
| `elitehxh.command.restore` | `/nen admin restore <players>`: full aura, and no Nen Exhaustion, Vow Lockout, Nen Overuse or cooldowns. Nothing running ends, and Nen Severed stays. |
| `elitehxh.command.stop` | `/nen admin stop <players>`: end every running ability and turn every technique off, for a stuck use. Nothing is unlearned, and cooldowns stay. |
| `elitehxh.command.xp` | `/nen admin xp add <player> <amount>`: add Nen XP past the per-minute cap, with the usual level-up message |
| `elitehxh.command.proficiency` | `/nen admin proficiency get <player> [type]`, `/nen admin proficiency set <player> <type> <points>`, `/nen admin proficiency add <player> <type> <units>`, `/nen admin proficiency tier <player> <type> <n>`: read or change a player's trained proficiency in a Nen type other than their own. Set and add skip the tier gates and count as having passed every gate the new total reaches; `tier` sets the tier trials passed directly |
| `elitehxh.command.zone` | `/nen admin zone add <name> <from> <to>`, `/nen admin zone remove <name>`, `/nen admin zone list`: Nen-sealed areas where players are held in Zetsu and cannot use Nen |
| `elitehxh.command.pool` | `/nen admin pool roll <players>`: roll a player's type ability pool again. `/nen admin pool set <players> <ability>`: choose their pool ability; it must be a pool ability of their own type |
| `elitehxh.command.license` | `/nen admin license grant <player>`, `/nen admin license revoke <player>`: give a Hunter License (the next number) or take it away. `/nen admin license specialty <player> <specialty>` picks a specialty with no switch wait, `/nen admin license deeds <player> <specialty> <points>` sets that specialty's points (0 removes them) and `/nen admin license stars <player> <0-3>` sets the stored star count. A star count set below what the points earn lasts only until the player's next deed or login raises it again; to lower stars for good, lower the deed points too |
| `elitehxh.command.explain` | `/nen explain [ability]`: explain an ability the player swore the Open Hand Oath on to the target in their crosshair. Defaults to everyone, not to operators. |
| `elitehxh.command.geas` | `/nen geas release`: the caster of a Geas (Binding Word) lets the bound player go. Defaults to everyone, not to operators. |
| `elitehxh.command.jenny` | `/nen admin jenny give\|take\|set <players> <amount>`: change the Jenny in a player's bank account. It works with the economy switched off. `take` never goes below 0 |
| `elitehxh.command.tower` | `/nen admin tower floor <players> <floor>` sets a Tower floor, `endmatch <players>` calls off a match, `record <players> <wins> <losses>` sets a player's Tower wins and losses and `seat <rank> <player>\|clear` fills or empties a Floor Master seat. `/nen tower leave` and `/nen tower forfeit` need no node: every player can use them |
| `elitehxh.command.hunter` | `/nen admin hunter visit [player]` sends a Wandering Hunter to a player (the chance, the interval and the cap are ignored) and `/nen admin hunter forgive <player>` ends a Hunter grudge. The same node covers `/nen admin antique <item> [genuine\|fake\|hidden] [player]`, which gives an antique of a chosen truth (genuine when you name none, and to yourself when you name no player) for testing [Maker's Trace](Makers-Trace) |
| `elitehxh.command.hive` | `/nen admin hive found\|clear\|stage <1-4>\|info`: found, end, stage or inspect a Broodmother hive |
| `elitehxh.command.relic` | `/nen admin relic list\|return <n>\|give <n> [player]`: list, return or hand out numbered Star Tiles |
| `elitehxh.command.seal` | `/nen admin seal list <player>` and `/nen admin seal clear <player>`: list or remove a player's aura seals. A creative player who holds this node also ignores seals |
| `elitehxh.command.reset` | `/nen admin reset <player>`: clear all of a player's Nen |
| `elitehxh.command.debug` | `/nen admin debug aura\|faults\|perf` |
| `elitehxh.command.fx` | `/nen admin fx <kind> [color] [radius] [life]` |

Anyone at operator level 2, the console, command blocks and functions are always allowed. A permission mod can add players, but it cannot take a node away from an operator. A player can read their own Nen from the **N** screen or with `/nen me`, so ordinary players do not need `info`.

## Before you open a public server

The defaults are safe for friends. For strangers, look at these:

| Setting | Default | Suggestion |
| --- | --- | --- |
| `requireNameApproval` | false | Turn it **on**. Players choose the name of their Hatsu, and it shows to everyone in death messages and Aura Read. With this on, a new name shows as "Unnamed Hatsu" until an operator approves it with `/nen admin hatsu approve`. |
| `hatsuNameBlocklist` | empty | Add words you do not want in names. Matching ignores case, spaces and symbols, so list whole words. |
| `allowForcedAwakening` | true | Forcing needs the target's consent and has a cooldown, but a player can ask again and again. Turn it **off** if you do not want that on a big server. |
| `hatsuPvpMultiplier` | 0.6 | Hatsu damage against players, as a share of the damage they do to mobs. Lower it for less lethal PvP, or set it to 0 so Hatsu never touch players. |
| `lethalVows` | false | Keep it off. When it is on, breaking a vow can kill. |
| `allowTypeReset` | false | Keep it off unless you want Nen Reset Tokens to work and re-rolls after a wipe. |
| `keepNenOnDeath` | true | Leave it on so deaths do not erase progress. |
| `nenZonesEnabled` | true | Turn it off to ignore every `/nen admin zone` area at once. |
| `rogueSpawnChance` | 0.3 | How often a natural spawn roll of a Rogue Nen User succeeds. Set 0 for no natural rogues; eggs and `/summon` still work. |
| `rogueManualChance` | 0.1 | Chance a rogue defeated by a player drops a Nen Manual. Lower it if manuals should stay rare. |
| `wildBeastSpawnChance` | 0.1 | How often a natural spawn roll of a wild Nen beast succeeds at night. Set 0 for no natural wild beasts; eggs and `/summon` still work. See [Nen Beasts](Nen-Beasts). |
| `wildBeastManualChance` | 0.1 | Chance a wild Nen beast killed by a player drops a Nen Manual. |
| `nenBeastsEnabled` | true | Turn it off to refuse every Nen beast and end the ones already out. See [Nen Beasts](Nen-Beasts). |
| `maxActiveBeasts` | 1 | How many Nen beasts one player holds at once, from 1 to 4. A player holds one beast for each ability. |
| `beastDeathAuraLoss` | 0.2 | The share of current aura a player loses when their beast is killed. Set 0 to make losing one free. |
| `beastsVisibleToAll` | false | Off: only the summoner, Gyo users and spectators see a beast. On: everyone does. |

Type training is tuned by `proficiencyMaxPoints` and its five companions (see [Nen Types and Affinity](Nen-Types-and-Affinity)); `proficiencyMaxPoints` 0 turns it off.

Cursed items are tuned by the `curse*` keys (bonus and drain amounts, the health a drain never goes below, the beacon radius and pulse), and the stone prices by `cleanseXpLevels` (10) and `settleXpLevels` (15). See [Cursed Items](Cursed-Items).

Post-mortem Nen (the risen body, the Death Grudge, the orphaned beast and rising rogues) is tuned by `postMortemEnabled` (off stops all of it), `postMortemLevel`, `postMortemCooldownSeconds`, `postMortemPairSeconds`, `postMortemGates`, the `remnant*`, `grudge*` and `orphanSeconds` keys, `rogueRiseChance` and one `postMortem<Effect>` key per effect. The grudge effects add `grudgeTrailRadius`, `grudgeTrailSeconds`, `cursedWeaponChance`, `grudgeSealSeconds`, `hauntedSeconds`, `maxHauntedSpots`, `hauntedAuraDrain`, `sealHardenScale`, `lingeringLoanMaxSeconds` and `lingeringLoanPotency`. See [Post-mortem Nen](Post-mortem-Nen).

Infused gear is tuned by `infusionLevel`, `infusionSeconds`, `infusionAuraFloor`, `infusionXpLevels`, `infusionUpkeep`, `maxInfusedPieces`, `infusionStrangerScale` and `infusionGradeLevels`, and each imprint has its own section in `abilities.toml`. See [Infused Gear](Infused-Gear).

### Newer systems

Each system below has its own table in `server.toml`, and most have a switch that turns the whole system off without deleting any data. The tables here list the keys most owners touch; the full list, with ranges, is in the config file and in `docs/config-reference.md`. Keys named `enabled` sit inside their own table, for example `[economy]`.

**Output ceiling** (`[output]`, see [Output Ceiling](Output-Ceiling)). `enabled` is true. `base` is 8 aura per second at level 0 and `perLevel` adds 0.5 per Nen level. `overdrawLimit` (2) is the most a player may draw as a multiple of the ceiling, `trainingDailyCap` (600) is the seconds of Output training that count per game day, and `trainedMaxBonus` (0.25) is the most training adds. Turn `enabled` off and techniques are no longer limited by how fast a player can draw aura.

**Killing intent** (`[killingIntent]`, see [Techniques and the Wheel](Techniques-and-the-Wheel)). `killingIntentMinLevel` (20), `killingIntentRadius` (8), `killingIntentLevelGap` (15), `killingIntentHealthPerLevel` (1.0), `killingIntentFleeTicks` (60), `dreadSeconds` (2) and `dreadCooldownSeconds` (10).

**Aura residue** (`[residue]`). `residueSeconds` (300) is how long a residue stays readable and `residueTrailSeconds` (30) is how long a user keeps leaving it after a Nen use.

**Ability mastery tiers** (`[mastery]`). `masteryPracticedCostScale`, `masteryPracticedCooldownScale`, `masteryMasteredCostScale` and `masteryMasteredCooldownScale` set how much cheaper and faster an ability gets at the Practiced and Mastered tiers.

**Ability looks** (top level, see [Controls](Controls)). `hatsuLooksEnabled` (true) lets players change how their abilities look; `hatsuLookFreeColors` (true) lets them pick any color, and off holds colors to the Nen type color so a look cannot hide a type; `hatsuLookMasteryGates` (false) makes shapes wait for the Practiced tier and ornaments, motion and density for Mastered; `hatsuLookMinBrightness` (0.2) lightens colors that are too dark to see.

**Combat XP** (top level). `combatHitXp` (1) and `combatKillXp` (5) are the Nen XP for a hit and a kill with Ten or Ren on.

**Sleeping with Ten** (top level). `restfulTenXp` (30), `restedTenSeconds` (1200) and `restedTenRegen` (1.2).

**Wrath** (`[wrath]`). `wrathMinLevel` (15), `wrathSeconds` (10), `wrathCooldownSeconds` (600), `wrathAuraBonus` (0.5), `outputBonus` (0.5) and `wrathExhaustionSeconds` (30).

**Seals** (`[seals]`). `sealMinLevel` (10), `sealAuraCost` (50), `sealMaxPerPlayer` (16) and `breachSeconds` (20). Players with the `elitehxh.command.seal` node ignore seals in creative mode.

**Wounds** (`[wounds]`). `woundsEnabled` (true), `woundThreshold` (6), `woundMaxStacks` (3), `woundSeconds` (600) and `woundMaxHealthPerStack` (2). A Nen Wound cuts max health and ordinary healing.

**Geas and Open Hand Oath** (`[geas]`, `[explain]`). `geasEnabled` (true), `geasConsentSeconds` (30), `geasBeatenHealth` (0.3), `geasBeatenSeconds` (600) and `geasUpkeepPerSecond` (0.5); `explainRange` (8), `explainSeconds` (3), `explainBonus` (1.3) and `explainBonusSeconds` (300). See [Vows](Vows).

**Final Pledge** (`[pledge]`). `finalPledgeEnabled` (true), `pledgeSeconds` (60), `pledgePotencyCap` (4), `pledgeAwakenDays` (7) and `pledgeSpentSeconds` (600).

**Combined Hatsu** (`[combined]`). `combinedEnabled` (true), `linkSeconds` (300), `linkRange` (24), `linkConsentSeconds` (30) and `fusionCooldownSeconds` (30).

**Dishes** (`[dishes]`, see [Gourmet](Gourmet)). `dishesEnabled` (true), `cookSeconds` (8), `attunedSeconds` (300), `attunedPotency` (1.05), `rationSeconds` (600) and `calmTeaSeconds` (600).

**Hunter Terminal and bounties** (`[terminal]`, `[bounty]`, see [Hunter Terminal and Bounties](Hunter-Terminal-and-Bounties)). `terminalEnabled` (true), `terminalScanRadius` (512), `terminalWanted` (true), `bountiesEnabled` (true), `bountyOffersPerDay` (3), `bountyPayTier1` to `bountyPayTier3` (300, 700, 1500 Jenny), `bountyContractMinutes` (60), `bountyPlayersEnabled` (true), `bountyMinPost` (100), `bountyPostFeePercent` (10), `bountyPlayerHours` (24) and `bountyKillNoGrudge` (true). Turn `bountyPlayersEnabled` off to stop players posting bounties on each other.

**Jenny economy** (`[economy]`). `enabled` (true), `walletCapacity` (1000000), `jennyPerEmerald` (1000), `transferFee` (0), `interestRate` (0.005 a day), `interestBalanceCap` (1000000), `bankersPerPlayer` (2), `rogueDropMin` (20) and `rogueDropMax` (120). Jenny buys emeralds at an ATM; emeralds cannot be sold for Jenny.

**Tower Arena** (`[tower]`, see [Tower Arena](Tower-Arena)). `enabled` (true), `matchSeconds` (180), `pointsToWin` (10), `npcWaitSeconds` (20), `matchCooldownSeconds` (60), `purseBase` (150), `purseGrowth` (1.6), `maxLiveMatches` (16), `playerMatches` (true), `stakes` (true), `spectators` (true), `floorMasterSeats` (5) and `baptism` (true; it also needs `allowForcedAwakening`). The `fighter*` and `class200*` keys set how strong the NPC fighters are.

**Mobs** (`[mobs.*]`, see [Bestiary](Bestiary)). Aura ticks: `auraTicksEnabled` (true), `auraTickSpawnChance` (0.15). Typed Rogue kits: `rogueKitsEnabled` (true), `rogueKitMinLevel` (10), `adeptSpawnChance` (0.05). Gourmet game: `gourmetGameEnabled` (true), `gourmetGameSpawnChance` (0.04). Wandering Hunters: `wanderingHuntersEnabled` (true), `hunterVisitMinutes` (40), `hunterVisitChance` (0.5), `maxWanderingHunters` (3), `hunterMinLevel` (25), `hunterMaxLevel` (45) and `hunterPriceFactor` (1). Hives: `hivesEnabled` (true), `maxHives` (1), `hiveRespawnDays` (7), `hiveClaimDistance` (256) and `hiveRewardFactor` (1). Each has a switch, so a server can turn any group off alone.

**Hunter's Arsenal** (`[gear]`, see [Hunter's Arsenal](Hunters-Arsenal)). `gearSetBonusesEnabled` (true), `gearKnifeBackstabMultiplier` (1.5), `gearDrawCutMultiplier` (1.4), `gearDrawCutSeconds` (3), `gearConductorFactor` (2), `gearBulwarkSetHealth` (4) and `gearAuraWovenSetMaxAura` (0.1).

**Shu mastery and the Shu kit** (`[shuMastery]`, `[shovel]`, `[card]`, `[coin]`, see [Hunter's Arsenal](Hunters-Arsenal) and [Training Drills](Training-Drills#shu-mastery)). `shuMasteryEnabled` (true) switches mastery and its effects off, `shuMasteryMax` (100), `shuMasteryDailyCap` (4), `shuMasteryUnitsPerBlock` (0.02) and `shuMasteryUnitsPerCardHit` (0.05). Shovel: `shovelShuSpeed` (12, the dig speed is half of it), `shovelDropWindowTicks` (20) and `shovelDropWearFraction` (0.25). `shovelShuSpeed` goes from 2 to 64; 2 is a wooden shovel's own speed (no bonus). Cards: `cardAuraCost` (3), `cardDamage` (4) and `cardCooldownTicks` (8). Coin: `coinRadius` (16) and `coinCooldownTicks` (100). What mastery does to Shu is set by the Shu tunables `masteryUpkeepCut` (0.4) and `masteryWearSkipBonus` (0.3) in `abilities.toml`.

**Alloy Spinner** (`[spinner]`, see [Hunter's Arsenal](Hunters-Arsenal#alloy-spinner)). `spinnerEnabled` (true) switches the item off, `spinnerReach` (6), `spinnerStrikeDamage` (5), `spinnerStrikeCooldownTicks` (25), `spinnerWrapHoldTicks` (12) and `spinnerWrapCooldownTicks` (60). Pulling: `spinnerMaxWrapWidth` (1), `spinnerMaxWrapHeight` (2), `spinnerPullTicks` (40) and `spinnerPullSpeed` (0.35). Players: `spinnerPlayerTug` (2, 0 turns the tug off), `spinnerPlayerSlowTicks` (20) and `spinnerPlayerTugCooldownTicks` (200). Shock: `spinnerShockCost` (5, 0 turns it off) and `spinnerShockSeconds` (1.5).

**Nen growth** (`[greenHand]`, see [Abilities and Nen Manuals](Abilities-and-Nen-Manuals)). `greenHandChunkUsesPerDay` (3, 0 to 100) is how many Nen growth uses one chunk allows per in-game day, shared by Green Hand and the Hatsu Grow effect; 0 turns Nen growth off.

**Lines in the dirt** (`[line]`, see [Nations](Nations#lines-in-the-dirt)). `lineEnabled` (true) switches Lines off, `lineMaxPerPlayer` (4, 0 means none), `lineMinLength` (2) and `lineMaxLength` (16). `lineScanTicks` (5) is how often crossings are checked and `lineViewRange` (24) how far away players see the dust. `lineScanTicks` goes from 1 to 20 (a stored value above 20 resets to 5); the check sees anyone moving up to 1.5 blocks per tick, and a higher value widens the area searched around each line. `lineMarkSeconds` (300), `lineHitBonus` (0.25), `lineAlertThrottleSeconds` (30, 0 means no wait) and `lineOfflineQueue` (10, 0 keeps none) set the mark, the extra damage, how often an owner is alerted and how many crossings wait for an offline owner.

**Scattered Set** (`[relic]`, see [Scattered Set](Scattered-Set)). `relicEnabled` (true) switches new tiles and the glow off, `relicSetSize` (12) is how many numbered Star Tiles exist and is read when the set is first made (raising it later adds numbers, lowering it is ignored), `relicChestChance` (0.004) is the chance a loot chest holds one, `relicAnnounce` (true) tells the server about finds and losses, and `relicGyoRange` (6) is how far a Gyo user sees the glow.

**Accessories** (`[accessories]`, see [Accessories](Accessories)). `keepLicenseOnDeath` (true), `infusedAccessories` (true), `truthPendantCharges` (3) and `conduitRingOutputBonus` (0.1). They need Curios API.

**Lived Properties** (`[lived]`). `enabled` (true), `livedDailyCap` (40), and the tiers `livedFeltUnits` (40), `livedKnownUnits` (200) and `livedSecondNatureUnits` (600). `livedChargeMax` (100) caps the shock charge; 0 turns charge off.

**Maker's Trace** (`[trace]`, see [Maker's Trace](Makers-Trace)). `enabled` (true), `traceStudySeconds` (3), `traceStudyAura` (10), `traceStake` (50), `traceBaseJenny` (40), `traceDailyJenny` (600), `traceChestChance` (0.06), `traceBrushChance` (0.08) and `traceVillagerOffer` (true). Turn `enabled` off for no antiques, no offers, and no study or sale.

If the server is under load, `fxMaxEntitiesPerLevel` (default 256) caps how many effects exist in one level, and `payloadRateLimit` (default 20) caps how many requests a client can send each second.

### Nations

Players can found nations that claim land chunk by chunk; claimed land is protected from outsiders (the commands are in the table above). The `[nations]` table in `server.toml` tunes it, and `nations.enabled = false` switches the whole system off without deleting any data.

| Setting | Default | What it does |
| --- | --- | --- |
| `enabled` | true | Off: nation commands refuse and nothing is protected. Saved nations are kept. |
| `maxDukes`, `maxLords` | 3, 10 | Most Dukes and Lords one nation may have. |
| `inviteMinutes` | 10 | How long an invite stays valid. |
| `blockedDimensions` | empty | Dimensions where nations cannot found or claim, for example `minecraft:the_end`. |
| `allowNewDimensionSeed` | true | A nation's first claim in a dimension may be anywhere. |
| `baseClaims`, `claimsPerMember` | 16, 8 | Claim cap: a base plus a bonus per member. |
| `claimsPerHour`, `playtimeClaimsMax` | 0.0, 64 | Extra claim cap per hour of all members' play time (vanilla play time statistic), and the most this bonus can add. 0.0 turns the bonus off. |
| `forceLoadBase`, `forceLoadPerMember`, `forceLoadMax` | 4, 1, 32 | Chunks a nation may keep force-loaded: base plus per member, at most the maximum. A nation over its cap keeps what it has and can add no more. |
| `forceLoadWhileOffline` | false | Keep force-loaded chunks loaded with no member online. Off: they load only while a member is on the server. |
| `inactiveDays` | 0 | Days of server running time (24 hours each; time the server is off does not count) with no member logging in after which a nation loses all its claims and force-loads (members and ranks stay). 0 turns it off; admin zones never expire. |
| `minDistanceFromOtherNation` | 2 | Chunks of room a new claim must leave to another nation. |
| `explosionsBreakBlocks`, `fireSpread` | false, false | Default for nations that never set it: whether explosions and fire may damage claimed land. |
| `pvpInClaims` | false | Default for nations that never set it: let non-members hurt each other in claims. Allies never hurt each other there, enemies always may. |
| `alliesInteract` | true | Default for nations that never set it: allied nations use doors, buttons and containers in each other's claims, never build. |
| `lockedSettings` | empty | Setting names (`build`, `interact`, `containers`, `entities`, `explosions`, `fire`, `mob_griefing`, `pvp`, `machines`, `offline_loading`) nations cannot change; they use the server default. A locked setting keeps the nation's stored value for when it is unlocked. `forceLoadWhileOffline = false` locks `offline_loading` off. |
| `alliesForNen` | true | Members of one nation, and of allied nations, count as allies for Nen abilities (heals, cleanses). Scoreboard teams count either way. |
| `fakePlayerAllowlist` | empty | Names or UUIDs of other mods' machines (fake players) that may act anywhere, claims included. Prefer UUIDs: the name `[Minecraft]` is shared by every mod that uses the stock fake player. |
| `fakePlayerReach` | 32 | Blocks a machine may reach from where it stands; one that was never positioned or aims farther is treated as an outsider. |
| `mapRadius` | 8 | Chunks the claim map shows each way (1 to 16). |

**Solo claims and trust.** A player with no nation can just run `/nation claim`: it makes a personal nation named after them (a normal nation as soon as they invite someone) under the same caps and distance rules. A Duke or King trusts a friend without making them a member: `/nation trust <player> <interact|containers|build>` (the friend must be online) and `/nation untrust <player>`; a Duke or Lord adds `here` to trust only on the land they hold. Trust never lets anyone hurt a player and never gives a rank.

**Chunk loading, expiry and playtime.** A Duke or the King runs `/nation forceload` in a chunk of their land (or uses the map menu) to keep it loaded; the permission is the nation node every `/nation` command uses. Force-loads use ticking tickets that exist only while a member is online (unless the nation's `offline_loading` setting is on, whose default is `forceLoadWhileOffline`), so a restart never leaves a chunk loaded for an owner who is offline. `/nation info` shows the claim cap with its base, member and playtime parts. With `inactiveDays` above 0 the check runs once per in-game day while the server is running and never at start-up, so downtime, a restored backup or a changed system clock cannot release land; a member with no recorded login (nations made before this feature) starts their clock at the first start after the update, so old saves never expire all at once. `/nation admin expire <nation>` releases one nation's land and loaded chunks at once, exactly as the check would. New chunk tickets are added a few per tick when members log in, and all nation chunks unload while `enabled` is false. Addons can cancel a force-load or an expiry through the API (see [Addons](Addons)).

**Claim bonuses.** `/nation admin bonus <nation> claims|forceload <amount>` (-100000 to 100000) adds to a nation's claim or force-load cap; the claim cap never drops below 0, and the admin force-load bonus may go past `forceLoadMax`. With a permission plugin, the nodes `elitehxh.nation.extra_claims` and `elitehxh.nation.extra_forceloads` (a number each) add to the cap for every member who has them; they are read at login and every 5 minutes. `/nation info` shows each part of the cap.

**Machines from other mods.** A fake player (a quarry, a deployer, a miner) is judged by the claim of the chunk it stands in: it can work inside its own nation's claim and in the wilderness, but never reach into another claim, and a machine in the wilderness cannot reach into a claim. A machine that was never positioned, or that works farther than `fakePlayerReach` from its target, counts as an outsider. A mod that moves its machine's fake player onto the target can defeat any position rule; list the machine instead if you trust it. List a machine's name or UUID in `fakePlayerAllowlist` to let it work anywhere. The block tag `elitehxh:claim_free` (blocks anyone may use) and the entity tag `elitehxh:claim_unprotected` (entities anyone may hurt or use) are empty; a datapack can fill them.

**Protected zones (spawn).** `/nation admin zone create <name>` makes a zone, `/nation admin claim <name>` (stand in the chunk) puts land into it, `/nation admin unclaim` takes it out, `/nation admin zone flag <name> <flag> on|off` changes a rule and `/nation admin zone list` shows them, `/nation admin zone delete <name>` removes it. The flags are `pvp` (off), `mob_spawning` (off: hostile natural, spawner, patrol, raid and reinforcement mobs do not spawn, animals still do), `build` (off), `interact` (on: doors and buttons; containers count as build), `explosions` (off), `fire` (off) and `entry_message` (on). Everyone is an outsider in a zone except an operator with `/nation admin bypass` in creative mode. Zones have no cap, are not listed, cannot be joined and ignore the distance rule.

Players can turn off the action bar line that names the land they enter with the client setting `nationBorderMessage`. `/nation admin` (node `elitehxh.command.nation_admin`) fixes any nation, and `/nation admin bypass` lets an operator in creative mode build in claims. Mods that move blocks or hurt entities should ask the nation API before they act, see [Addons](Addons).

### How Nen treats other players

You do not need a permission plugin to keep fights fair. These rules are built in:

- Nen never hurts a player the attacker could not hurt with a plain hit. If PvP is off, or two players share a team with friendly fire off, no ability touches them: no damage, no root, no pull and no swap. No other setting is needed.
- Hatsu damage against players is also scaled by `hatsuPvpMultiplier`. At 0, a Hatsu leaves players alone completely.
- An ability listed in the `#elitehxh:blocked_in_pvp` tag never hurts players. The tag is empty by default, and a datapack can fill it.
- Forced awakening works by consent. The target gets a popup and nothing happens unless they accept.
- Aura Read only shows information.

### Tuning abilities

`abilities.toml` lets you rebalance anything by its id. You can switch an ability off, change its cost or cooldown, or change a technique's unlock level (set it to -1 to make a technique never unlock). Entries for addons that are removed are dropped on the next start, and the older file is kept as a backup.

## Datapacks

Loot, trades and tags are plain datapack files. For example, you can change how often manuals appear in chests (the files in `data/elitehxh/loot_modifiers`) or add mobs to `#elitehxh:nen_immune` so Nen does not hurt them.

## Performance

`/nen admin debug perf [seconds]` times the Nen engine for a few seconds, so you can see whether it matters. Players who have not awakened cost almost nothing.

## Addons

Other mods can add abilities, vows and effects. They are listed in `abilities.toml` and appear in the game automatically. See [Addons](Addons).
