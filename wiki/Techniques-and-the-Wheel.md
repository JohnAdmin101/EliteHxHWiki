# Techniques and the Wheel

Techniques are the basic skills every awakened player can learn. They are not abilities: you do not learn them from manuals. They unlock by Nen level, and you switch them on and off. Open the **technique wheel** with **R** to use them.

## The ten techniques

| Technique | Level | Mode | What it does |
| --- | --- | --- | --- |
| Ten | 0 | Toggle | Holds your aura around you. Free to keep on, takes 10% less damage, and your aura regenerates at full speed. On from the moment you awaken. |
| Zetsu | 2 | Toggle | Seals your aura. It regenerates twice as fast and mobs notice you half as well, but Nen hits on you do double damage. Your aura vanishes from view. |
| Ren | 4 | Hold | Flares your aura while you hold the key. See below. |
| Gyo | 8 | Toggle | Gathers aura in your eyes so you can see what is normally hidden. |
| Ken | 10 | Toggle | A heavy, steady guard. |
| En | 12 | Toggle | Spreads your aura into a field that senses the living around you. |
| Shu | 15 | Toggle | Wraps the item in your hand in aura: harder hits, faster mining, less wear. |
| In | 20 | Toggle | Hides the things your aura makes from Gyo, and your own aura from anyone who is not looking for it. |
| Ryu | 25 | Toggle | Shifts your aura between attack and defense on a slider. |
| Ko | 30 | Charge | Puts half your aura into one strike and leaves you open. |

The Level column is the Nen level that unlocks the technique. A server owner can change these levels.

### Ten

Ten is your resting state. With no technique on at all, your aura leaks: it regenerates at half speed, and Nen hits on you do 1.5 times damage. Keep Ten on and you avoid both. You also need Ten on to use abilities.

### Zetsu

Zetsu hides you. Other players cannot see your aura and the aura tier is hidden, and mobs have a harder time noticing you. The price is a heavy one: while sealed, Nen hits do double damage to you, and Zetsu cannot run with Ten, Ren, Gyo, Ken, En, Shu, In, Ryu or Ko. Turning Zetsu on switches off the toggles among them (Ten, Gyo, Ken, En, Shu, In and Ryu; Ko needs Ten or Ren, so it cannot start under Zetsu), but it will not turn on while you are holding Ren or charging Ko: let go first. Turning on Ten, Gyo, Ken, En, Shu or In, or starting Ren, switches Zetsu off. You cannot use abilities while it is on, because they need Ten. A player with Gyo can still spot you.

### Ren

Hold the Ren key (**C** by default). It costs 10 aura to start and 4 aura per second while held, and it takes 3 seconds to reach full strength. At full charge you take 20% less damage and your abilities are 1.5 times as strong. While you hold it, aura regenerates at a quarter of the usual speed, so it burns through your pool. Release the key to stop. Ren also earns a slow trickle of XP while it runs. Ren does not need Ten.

Ren is not on the wheel. It is a hold, so it has its own key.

### Gyo

Gyo costs 5 aura to start and 2 per second. While it is on you see:

- Players who are using Zetsu, if they are in front of you, in line of sight and within 24 blocks.
- Things made of aura that others cannot see, such as the conjured blades and shields, aura bolts and other effects of Nen users. Not the work of someone using In, unless you also have Ren on (see In below).
- Players who are using In, under the same rules as Zetsu users. Without Gyo you see their aura as nothing.
- The hidden marks of the Hatsu trial. See [Hatsu](Hatsu).

Your eyes glow while it is on, and Ten gives you a little less protection (5% instead of 10%) because some of your aura is in your eyes.

### Ken

Ken costs 15 aura to start and 5 per second. It cuts incoming damage by 30% and slows you by 15%. Nen hits do only 60% damage to you. It can run alongside Ren. Turning Zetsu on switches Ken off.

### En

En costs 10 aura to start and 3 per second at first. It outlines every living creature within its radius, even through walls, so only you see them. The radius starts at 8 blocks when you unlock it and grows by 1 block per Nen level, up to 32 blocks. A bigger field costs more per second. Players hidden by Zetsu are not outlined. Turning Zetsu on switches En off.

### Shu

Shu costs 5 aura to start and 1.5 aura per second, and it only costs anything while you hold an item (with an empty hand it stays on, costs nothing and does nothing). While you hold something:

- Your plain melee hits do 30% more damage, scaled by your aura potency.
- You mine 1.5 times as fast.
- Each point of wear on the held item is skipped half the time. Armor, the off hand and creative mode are not affected.

Conjured items get the damage and the mining bonus. Arrows and thrown items are not covered, only what is in your main hand. Other players see a soft glow in your type color around the item, and in first person you see it as a soft glow near your main hand.

### In

In costs 5 aura to start and 2 aura per second. It changes no damage and no defense. While it is on:

- The things your aura makes (conjured items in your hands or armor, aura constructs, bolts and effect visuals) are hidden from everyone but you and spectators. Plain Gyo no longer shows them. A viewer needs **Gyo and Ren both on** to see them, and Ren costs aura.
- Your own aura (the shell, steam and the Shu glow) is not drawn for other players, unless they have you in their Gyo reveal list, the same cone, range and line of sight that reveal Zetsu users.
- En still senses you. Only Zetsu hides you from En.

### Ryu

Ryu costs 10 aura to start and 1.5 aura per second. It needs Ten or Ren on to start, it replaces Ken (turning one on switches the other off), and Zetsu blocks it. It splits your aura between attack and defense with a slider from 0 to 100% offense in steps of 10%. It starts at 50% every time you turn it on, and 50% changes nothing.

Hold the Ryu key and use the mouse wheel to move the slider, or tap the key to toggle Ryu. At 100% offense your abilities are 30% stronger and your plain melee hits do 20% more damage, but your aura defense drops by up to 15 points (as far as it goes: with only Ten on you have 10 points to lose) and Nen hits on you do 1.3 times damage. At 0% it is the opposite: abilities 30% weaker, melee 20% weaker, 15 more points of defense and Nen hits on you do 0.7 times damage. Everything in between scales evenly. Ryu pauses while Ko is active and comes back with the same split.

### Ko

Ko is a charged strike. Hold the Ko key for 1 second to charge it at no cost. Starting it costs nothing, but you are open from the first moment of the charge. When you let go:

- If the charge is under 20% or you have less than 20 aura to spend, it fizzles: nothing is spent and there is no cooldown.
- Otherwise it spends 50% of your current aura and arms for 3 seconds. Your next plain melee hit in that time also deals Nen damage of 0.2 per aura spent, scaled by the charge and your aura potency, up to 60. Against players that is halved. Any plain hit uses Ko up, whether or not the Nen damage lands. Abilities do not.
- Ko needs Ten or Ren on to start, and Zetsu blocks it.

A thin bar under your aura bar shows Ko: the charge filling, then the armed window counting down (pulsing) and a red tail after the strike. While Ryu runs, the same bar shows your offense and defense split. Your hand glows while Ko gathers and while it is armed. Opening a screen (chat, inventory) mid-charge counts as letting go.

From the start of the charge until 1 second after the strike (or after the 3 seconds run out unused), your aura defense is zero and Nen hits on you do 2 times damage. Then Ko ends and has an 8 second cooldown that survives logging out.

## When your aura runs out

If upkeep drains your aura to zero, everything shuts off at once: running abilities end, then your techniques turn off, and **Nen Exhaustion** hits you for 10 seconds. Exhaustion slows you by 20% and stops you switching on any technique until it ends. Watch your aura bar when you keep several techniques on.

## The technique wheel (R)

Press **R** and a ring of eight slots opens. From the top, clockwise: Ten, Ken, Ryu, Shu, Gyo, In, En and Zetsu. Ko is not on the wheel: it is a hold, so it has its own key, like Ren. Shu is on the wheel and also has its own key, for switching it mid-fight.

- Hover a slot to read what the technique does. A slot you cannot use yet shows the level it needs ("Lv 25" for Ryu), or "Locked" if it never unlocks by level on this server.
- A running technique's slot glows in its color.
- Click a slot to switch that technique on, or off if it is running. The wheel closes at once. The server decides: if it refuses (not enough aura, or you are exhausted), the message tells you why and the slot stays as it was.
- Click the middle or outside the ring, or press Escape or **R** again, to close it with no change.

The wheel does not pause the game, so you can open it in a fight.

Before you awaken, **R** shows a hint in the action bar instead of opening.

### Keys for each technique

Only Ren has a default key (**C**, hold). The keys for Ten, Zetsu, Gyo, Ken, En, Shu, In, Ryu and Ko are unbound, because the wheel is the main way and extra defaults would clash with other mods. If you want one, bind it in Options, Controls, in the **Nen** category. Those keys toggle once per press; Ko is a hold, and Ryu's key also moves the slider with the mouse wheel. If you hold Ren while you open the wheel, Ren keeps running.

See [Controls](Controls) for every key, and [Nen Types and Affinity](Nen-Types-and-Affinity) for what comes next.
