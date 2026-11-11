# Hunter Exam

The Hunter Exam is a three-part test at an Exam Board. Pass it and you become a licensed Hunter: you get a Hunter License card, an advancement, a line on your status screen and a better deal from librarians. The license is a small reward for proving yourself. It does not make you stronger in a fight.

## Before you start

- Craft an **Exam Board** (a notice board). Put planks on the top corners and the middle left and right, paper at the top middle, an emerald in the centre, sticks at the bottom corners and an iron ingot at the bottom middle. Place it on open, flat ground with plenty of free room around it. You can break it with an axe.
- You must be awake and at Nen level 10 or higher (servers can change the level).
- You cannot sit the exam on Peaceful difficulty, because it needs monsters.
- Only one person can take the exam at a board at a time.
- You cannot be in the middle of a drill, a meditation or a Hatsu trial.

Right-click the board. A dialog explains the three trials. Press **Begin** while you are near the board (within 8 blocks). If something is wrong, a message tells you what.

## The three trials

They follow one after another with no break.

1. **Endurance.** Sprint for 60 seconds in total. You have one and a half times as long (90 seconds with the default). Walking and standing still do not count, so keep running.
2. **The hunt.** Five monsters appear 12 to 24 blocks from the board: zombies, skeletons, spiders, husks or strays. They hunt you. Bring all five down yourself within 3 minutes. They do not burn in the sun. Other people's kills do not count, and the monsters ignore everyone but you.
3. **The duel.** A Rogue Nen User appears 8 blocks from the board, as strong as your own Nen level (never below level 5 or above level 15). Beat him within 3 minutes. He is a real Nen user: use Ten, Ken and your abilities. See [Rogue Nen User](Rogue-Nen-User). If someone else kills him, you fail.

The exam monsters drop nothing, give no experience and give no Nen XP, and they vanish when the exam ends. A small readout shows which trial you are in, your progress and the time left.

## Failing

- You fail if time runs out in a trial, if you die, if you go more than 48 blocks from the board, or if you change dimension, or if you break the board yourself. Switching the game to Peaceful ends the exam with no wait. If you die with Nen kept on death turned off, you lose the license like a Nen reset, but the wait stays. After a failure you must wait 20 minutes (by default) before you can sit the exam again. The wait carries on while you are logged out and survives a restart.
- Logging out, the board being broken by someone or something else, or having no open ground for the monsters ends the exam with no wait.

## The Hunter License

Passing gives you a **Hunter License** card showing your name and a license number (the first license on a server is No. 1). You also get the advancement **Licensed Hunter**, in the Nen tab after level 10.

What the license gives you:

- A line "Hunter License: No. n" on your status screen (N), under your level.
- One extra trade with Expert and Master librarians: a Nen Manual for 16 emeralds (12 from one star) and a book, up to 4 times between restocks. Only you, as a licensed player, see it. The manual on offer stays the same until the villager restocks.
- On servers that turn it on, the right to take the Hatsu trial. See [Hatsu](Hatsu).

The license belongs to you, not to the card. Losing the card costs you nothing: use the Exam Board again and you get a free replacement. Someone who picks your card up gets nothing from it.

If you reset your Nen, you lose the license too. Your old card turns void (its tooltip says so, in red) and you must pass the exam again for a new number. Your advancement stays. A failed-exam wait is not cleared by a reset.

## Specialties and stars

Once you are licensed, use the Exam Board again to open the Hunter dialog and pick a **specialty**. Your first pick is free. A later change waits a true 7 days (7 times 24 hours on the server clock, from the moment you picked, so sleeping through the night does not help). Points stay with each specialty, but only deeds toward your current one count.

| Specialty | How you earn points | First perk | Second perk |
|---|---|---|---|
| Beast | Kill a wild Nen beast (10); breed or tame a vanilla animal (1) | Wild beasts drop their Nen Manual more often (x1.5) | +10% Nen damage to wild beasts |
| Blacklist | Kill a Rogue Nen User (10); win a raid (30) | En reaches 25% further for Rogues (not those hiding in Zetsu) | +10% Nen damage to Rogues |
| Treasure | Cleanse a curse or settle a vow penalty at the Meditation Stone, or exorcise a curse (15); open a generated loot chest for the first time (2) | Curses show in the tooltip without Gyo | The Stone's Cleanse costs half the levels |
| Gourmet | Eat a food for the first time (5); eat a smelted or cooked food (1) | Eating restores aura, twice the food's nutrition | +25% saturation from food |
| Archaeology | Finish brushing a suspicious block (5); open a trial vault (5) | A 5% chance of a bonus loot roll when brushing | Aura residue can be read from 50% further |

Only deeds you do yourself count (a Nen beast you summoned does not kill for you), and only in the real world: exam monsters, animals from spawn eggs or spawners, risen mobs, other players and fake players earn nothing. Bred animals count when both parents are natural. Frog and sniffer breeding earns nothing; Ocelot and fox trust counts as taming. Each kind of deed adds at most 30 points per day (a UTC day). A player lying still after a Second Beat earns nothing. Your status screen (N) shows your specialty, your points, how many are left to the next tier, your stars and your sponsor.

Stars come from your points in your specialty (100, 300 and 800 by default):

| Stars | You need | Everyone gets |
|---|---|---|
| 1 | Tier 1 in your specialty | The librarian trade costs 12 emeralds, not 16; +0.05 license training bonus |
| 2 | Tier 2, and either a mentee who earned a first star or tier 1 in a second specialty | Another +0.05 training bonus; one more infused piece at a time |
| 3 | Tier 3, and tier 1 in two other specialties | A gold card and a title on your status screen |

Stars are never lost except by a Nen reset. The two specialty perks work only for your current specialty and only up to the tier you have reached in it. Your card shows your stars (silver, gold trim, gold) and your specialty; you also get the advancements One Star, Two Star and Three Star.

**Mentoring.** A licensed hunter with no sponsor can name one at the Exam Board: pick a hunter with at least one star within 16 blocks, and they confirm in their own dialog. You have one sponsor for life. When you first earn a star, your sponsor counts as having mentored a hunter, even if they are offline (they get the credit when they next log in). Naming a sponsor never counts by itself.

## For servers

Admins can give or take a license with `/nen admin license grant <player>` and `/nen admin license revoke <player>`. `/nen admin license specialty <player> <specialty>` sets a specialty with no wait, `/nen admin license deeds <player> <specialty> <points>` sets a specialty's points and `/nen admin license stars <player> <0-3>` sets the stored stars. Stars set this way last only until the player's points raise them again, at their next deed or login; to lower them for good, lower the deed points as well. The stars keys are `starPoints`, `specialtySwitchDays` and `hunterDeedDailyCap`. The level, the wait, the sprint time, the number of monsters and the Hatsu requirement are set in the server config: `hunterExamLevel`, `hunterExamRetrySeconds`, `examSprintSeconds`, `examHuntCount` and `hatsuTrialNeedsLicense`. Pack makers can change which monsters appear by editing the entity type tag `elitehxh:exam_quarry`. See [Server Owners](Server-Owners). Addon makers can add specialties: see [Addons](Addons).
