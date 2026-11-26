# Training Drills

Once you are awake, your Meditation Stone is also a training ground. Three short drills let you practise Ten, Ren and Gyo for a little Nen XP, and five more train the Nen types that are not yours. They are skill checks, not a faster way to level: you can only repeat each one every 5 minutes, and the XP counts toward the usual per-minute limit.

## Opening the menu

Right-click the stone without crouching. A dialog opens with:

- **Meditate.** The normal 30-second meditation, worth 15 XP of practice.
- **Ten drill**, **Ren drill** and **Gyo drill.** A button shows only for a technique you have learned. A drill you have just done shows the time left in its label, for example "(ready in 4:12)", and pressing it tells you how long is left.
- **The type drills.** Brimming Glass, Color Shift, Far Mark, Steady Hand and Crystal Pattern, once you qualify (see [Type drills](#type-drills) below).
- **Cleanse the held curse** and **Settle a broken vow.** Not drills: they show only when they apply and cost experience levels (10 and 15 by default). See [Cursed Items](Cursed-Items).
- **Pour your Nen into the held piece** and **Draw Out.** Not drills: a 30-second hold of Ren that infuses a sword, tool or armor piece for good, and the button that takes it back out. See [Infused Gear](Infused-Gear).

Crouching and right-clicking with both hands empty is still the Hatsu trial, once you reach its level. A Blank Nen Manual still inscribes when you use it on the stone. Someone who is not awake yet meditates straight away, with no menu.

## The rules for every drill

- Only one thing runs at a time: a drill, a meditation or a Hatsu trial.
- Stay within 8 blocks of the stone. Walking away, breaking the stone, dying, logging out or changing dimension ends the drill with no XP, and you do not have to wait before trying again.
- Passing or failing starts the wait (5 minutes by default) for that drill. The other drills are not affected.
- While a drill runs, a small readout shows its progress and the time left.

## Ten drill: 20 XP

Keep Ten on for 60 seconds. The drill turns Ten on for you. While it runs your aura does not regenerate and it drains by 1 a second, so watch the bar. You fail if you switch Ten off or your aura falls under a tenth of your maximum. If something else turns Ten off (an admin command, a sealed zone), the drill is cancelled and you can try again at once. If Ten will not turn on (for example you are exhausted), the drill is cancelled and you can try again at once.

## Ren drill: 20 XP

Let go of Ren five times at the right moment. Hold the Ren key (C) and release it when the charge is nearly full: the good window starts at 90% charge and ends half a second after it is full. By default Ren takes 3 seconds to fill, so you release between about 2.7 and 3.5 seconds. After each release a short line tells you "Clean release.", "Too early." or "Too late." Only clean releases count toward the five.

You fail on the fifth miss, if 90 seconds pass, or if you hold Ren so long that you get Nen Overuse. Ren itself costs no aura during this drill, so even a low level player can finish it (Ken, Gyo and other upkeep still cost).

## Gyo drill: 25 XP

Marks made of aura appear in the air around the stone, 3 to 8 of them. Turn Gyo on (the technique wheel, R) and look around the stone for 20 seconds. Only you see them, and only with Gyo on. When the time is up a dialog asks how many you saw. The right count passes. A wrong count fails, and so does not answering within 60 seconds.

If the stone is boxed in and has no room for the marks, the drill is cancelled and you can try again at once. The marks are the same kind you meet in the [Hatsu](Hatsu) trial, so this is good practice for it.

## Type drills

Your own type comes with an affinity of 100%. The other five are weaker, and these drills are how you raise them (see [Nen Types and Affinity](Nen-Types-and-Affinity)). Five drills, one for each type except Specialization, show up when all of this is true:

- You are at least Nen level 10.
- You have learned Ren. Every type drill is built around it, and Ren costs no aura while one runs (Steady Hand does not use Ren at all).
- It is not your own type. A drill for the type you were born with never shows.

Each pass gives 10 XP and 60 training units in the drill's type, and a line in chat tells you what you gained and how many training points you now have. Waiting, range and cancelling work like every other drill. If the stone is boxed in and a drill has no room for its marks, it is cancelled at once and you can try again straight away. Servers can switch type training off, and then these drills do not show. Train beside another awakened player of the drilled type (within `trainingPartnerRadius` blocks, 8 by default) and the units are multiplied by `trainingPartnerMultiplier` (2 by default); the chat line names your partner.

| Drill | Trains | How to pass | How it fails |
|---|---|---|---|
| Brimming Glass | Enhancement | A glass of water rises while you hold Ren and drains when you do not; the readout shows its level and updates several times a second. Anyone near the stone can see the glass, but only you see its level. Keep it between 90% and full for 10 seconds in total within 40 seconds. | More than 1 second above full, or the 40 seconds run out. |
| Color Shift | Transmutation | A chime and a coloured puff come every 2 to 4 seconds. Start Ren within 0.6 seconds after each one. Only a Ren start after the cue counts: holding Ren through a cue does not. Starting Ren at any other time is a false start and costs you the next cue, so tapping the key over and over does not work. Answer 5 of the 7 cues. | Too many cues missed for 5 to be possible. |
| Far Mark | Emission | 6 marks show one at a time, each farther from the stone than the last (4 to 10 blocks, measured from the stone itself, wherever you stand). Look at the current mark with a clear view and hold Ren for 1 second. Looking away or letting go of Ren starts the second again. | The 45 seconds run out. |
| Steady Hand | Manipulation | One mark circles the stone and bobs up and down. Keep your gaze on it for 12 seconds in total within 40 seconds. No Ren needed. If the stone is too boxed in for the mark to be seen most of the way round, the drill is cancelled at the start. | The 40 seconds run out. |
| Crystal Pattern | Conjuration | 4 to 6 crystals light up one after the other in a random order. Repeat the order: look at each crystal and start Ren. A new order every round. Get 2 of the 3 rounds right. | A wrong crystal ends the round, and so does 20 seconds without an answer. Too many wrong rounds fail the drill. |

## Tier trials

Training in a type holds at point 5 and again at point 10 (see [Nen Types and Affinity](Nen-Types-and-Affinity)). When a type is held at a gate, the stone menu shows "<Type> tier trial" in place of that type's drill, because the drill would give nothing. The trial is the same drill with every count multiplied by 1.5 and rounded up; the time limits stay the same. The wait after a trial is the drill's own wait.

| Trial | What changes |
|---|---|
| Brimming Glass | 15 seconds in the band, within the same 40 seconds. |
| Color Shift | Answer 8 of 11 cues. |
| Far Mark | 9 marks, within the same 45 seconds. |
| Steady Hand | 18 seconds on target, within the same 40 seconds. |
| Crystal Pattern | Get 3 of 5 rounds right. |

Passing a trial gives no XP and no training units. It opens the next stretch of training for that type, says so in chat, and earns the **Breaking Through** advancement the first time. Failing is like failing the drill. The server can change the gates with `proficiencyTierPoints` and the difficulty with `tierTrialScale`.

## Training by holding Ren

Holding Ren earns a little Nen XP as it runs, 1 XP per second by default (`renTrainingXpPerSecond`). Two limits keep it from being a way to level while away from the keyboard:

- **A daily cap.** It pays at most 600 XP per Minecraft day (`renTrainingDailyCap`). It counts the XP you really got, after the usual per-minute limit. A line in chat tells you when the day's share is used up.
- **An idle gate.** It pays nothing once you have gone 60 seconds without turning your view by 10 degrees or moving a block (`renTrainingIdleSeconds`). Move or look around and it pays again.

## Lived Properties

What you have endured shapes your Nen. There are four properties: **fire**, **shock**, **frost** and **venom**. Each is a meter of endured units that only grows by suffering the real thing.

**Building it up.** While you are awakened, in survival and have no aura defense up (Ten, Ken and the like), every point of health you lose to one of these counts as one unit:

| Property | What counts |
| --- | --- |
| Fire | Fire, lava and hot floors |
| Shock | Lightning and Nen shock |
| Frost | Freezing and powder snow |
| Venom | Poison (the effect; a harming potion is not venom) |

You can bank at most 40 units a day (`livedDailyCap`), and nothing counts while you are idle (the same gate as Ren above). The action bar tells you how far you are: "You endure the fire: 12 of 40 today". When another player helps you along, with an Element hit or a Shock Edge arc of their ability, you bank 2 units for each application, whatever its damage. Nothing counts inside a [Tower](Tower-Arena) match.

**Tiers.** The tier is read from the units, and the game tells you when you cross one ("fire is now Felt to you").

| Tier | Units | What changes |
| --- | --- | --- |
| Felt | 40 | You may pick that property for an Element effect in the [Hatsu](Hatsu#lived-properties) forge. |
| Known | 200 | Your Element effects of that property last 1.25 times as long. |
| Second Nature | 600 | They last 1.5 times as long, and you take 20% less damage of that kind. |

The status screen (**N**) has a "Lived Properties" block with a line for each property: its tier, units and what is left to the next tier, and today's total.

**Shock charge.** Once shock is Felt, the shock you endure also fills a **charge** pool, which holds 100. Every point of shock damage adds 10, and it fills even when you cannot bank any more units today, but not while you have aura defense up. A shock ability (Shock Edge, Godspeed, or your own Hatsu with the shock Element) then pays half of its aura from the charge and hits 1.15 times as hard while you have some. The charge is spent only after the ability goes off, and is not given back. It does not work in a Tower match. You keep it when you log out and when you die with your Nen kept. The panel HUD shows it as a small bar.

A server can switch the whole feature off with `lived.enabled`.

## Shu mastery

Shu mastery (see [Shu](Techniques-and-the-Wheel#shu)) is trained by working with Shu on, not by a drill. Each block you break with the [Trainer's Shovel](Hunters-Arsenal#trainers-shovel) in survival gives 0.02 units by default (`shuMasteryUnitsPerBlock`), and each [Edge Card](Hunters-Arsenal#edge-cards) hit gives 0.05 (`shuMasteryUnitsPerCardHit`). You can hold at most 100 (`shuMasteryMax`) and gain at most 4 a day (`shuMasteryDailyCap`), so full mastery takes a long time. It pays nothing in creative, while you are idle (the same gate as Ren above: a minute with no step and no turn of your view), or with Shu off. A server can switch it off with `shuMasteryEnabled`. It also pays nothing during a [Tower](Tower-Arena) match, and a block dug by your own Hatsu does not count as a dig.

## Training Dummy

A practice target that shows the damage it takes: each hit, critical hits, the Nen part, and the total and damage per second over a combo. Craft it from 2 hay bales, 2 sticks and a wooden fence: a hay bale on top, then stick, hay bale, stick, then the fence at the bottom. Sneak and punch it with an empty hand to pick it up. Hitting it earns no XP and no training.

## For servers

The wait and the XP are set in the server config: `drillRetrySeconds`, `drillTenXp`, `drillRenXp` and `drillGyoXp`. Setting the XP to 0 keeps the drill as pure practice. See [Server Owners](Server-Owners).

The type drills open at `typeDrillLevel` and give `drillTypeXp` XP and `typeDrillProficiency` training units. Each has its own tuning keys, listed in the config reference (`drillEnhancement...`, `drillTransmutation...`, `drillEmission...`, `drillManipulation...`, `drillConjuration...`). Setting `proficiencyMaxPoints` to 0 turns type training, and with it these drills, off.
