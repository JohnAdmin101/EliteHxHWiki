# Output Ceiling

Your aura has three numbers. **Max aura** is the size of the tank. **Current aura** is what is left in it. **Output** is the width of the tap: how many aura per second you can have out at once. A big tank means little if the tap is narrow, so a player with a lot of aura who runs everything at once will strain.

Output only matters to awakened players. A server can turn the whole thing off with `enabled` in the `output` section of the config.

## Your ceiling

Your **Output ceiling** is the most aura per second you can draw without strain. It is shown as **Max Output** and starts from your Nen level:

| Nen level | Ceiling (aura per second) |
| --- | --- |
| 4 | 10 |
| 10 | 13 |
| 15 | 15.5 |
| 25 | 20.5 |
| 50 | 33 |

By default it is 8 plus half a point for each Nen level (`base` 8 and `perLevel` 0.5). Three things raise it:

- **Training.** Spend time close to your limit and it grows, up to 25% more at the most. See below.
- **The Conduit Ring.** Worn in a ring slot, it adds 10% to your ceiling. Two rings do not stack. See [Accessories](Accessories).
- **Wrath.** For its 10 seconds, it adds 50% (see below).

## What counts as "out"

Your **load** is the total of everything you have out, in aura per second:

| Source | Load |
| --- | --- |
| A running technique | About its upkeep per second. Ten and Zetsu count 0. Ren counts more as it charges (half as much again at full charge). En grows with its radius. Ko counts a flat 8 while its strike is running. |
| A running toggle or channelled ability | Its upkeep (at least 1 per second). |
| A burst | A quarter of the aura an activation costs, held for one second. Starting any technique or ability is a burst, and a toggle adds its start cost on top of its running load. |
| A tamed beast that is out, and not on hold | 2 per second each (see [Nen Beasts](Nen-Beasts)) |
| A working infused piece | 0.3 per second each (see [Infused Gear](Infused-Gear)) |
| A Geas you hold, or a breach you run | Its upkeep per second (see [Vows](Vows#binding-word-and-the-geas)) |

An addon can add its own sources.

## Going over

Drawing above your ceiling has three stages.

1. **A higher upkeep.** Every upkeep is multiplied by one plus how far you are over. If you are 50% over, everything costs 1.5 times as much.
2. **Strain.** A gauge fills while you are over. At double your ceiling it fills in 10 seconds, and it empties in 30 seconds when you are back within the limit. You get one warning ("Your aura is straining") at 80%. At 100% you get **Nen Overuse**, as if you had held Ren too long, and the gauge resets. The Final Pledge, a trial and a drill pause the strain but not the higher upkeep.
3. **Refusal.** Anything that would take you past **twice your ceiling** is refused: "You cannot put out that much aura at once." This covers a technique, an ability, an activation burst and a setting that raises load. Nothing already running is ever shut off by it. A new breach that would put you over is not started. Ko is never refused when you let it go, so a charged strike always lands.

Aura a technique spends while it runs counts as a burst, like its cost to start: that is how a Ko release is counted.

Strain survives logging out (it fades for the time you are away) and ends when you die, reset your Nen or get Overuse. Nobody else sees your load or your strain.

## Growing it

Draw within 80% of your ceiling or more and you train: 1 second of training for each second, up to 600 seconds per Minecraft day. It does not count while you are Exhausted, in Overuse, Nen Severed or in Zetsu. It takes 12 000 seconds in all (20 full days) to earn the whole bonus of 25%. Overdrawing counts, so it is a trade: it is also how you strain. A line in chat appears each time the bonus grows by another 5%.

## Wrath

At Nen level 15, a hit that leaves you alive at 25% health or less, or the death of a teammate within 16 blocks, starts **Wrath**. For 10 seconds you have 50% more max aura and 50% more Output ceiling. Then you have 30 seconds of Exhaustion, and you cannot Wrath again for 10 minutes. Players only.

## Seeing it

- **The strip.** A thin bar under your aura bar shows load over ceiling. Past the ceiling it turns red, with notches, and pulses (it does not pulse with reduced motion on). A white line along its top edge is your strain. It is hidden when Output is off or you are not awakened, and you can switch it off with the "Show Output Strip" setting (see [Controls](Controls)).
- **The status screen** (**N**) has an Output block: your ceiling, how much is in use, your strain and the trained bonus.
- **Tooltips** of abilities and techniques show "Output: 3/s" for something that runs and "Burst: 20 Output" for an activation.

## For servers

All the numbers are in the `output` section of the config; Wrath's are in `wrath`. Setting `trainingDailyCap` to 0 turns output training off.
