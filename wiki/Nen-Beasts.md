# Nen Beasts

A Nen beast is a creature made of your own aura. It follows you, fights beside you and costs you aura while it lasts. A summoned beast is not a pet: it lives only as long as the ability that made it, it is never saved, and it is gone the moment you lose your focus. If you want a beast that stays, you can win one over from the wild (see [Taming a wild beast](#taming-a-wild-beast)).

## The three beasts

Each is an ability you learn from a Nen Manual, as for any other (see [Abilities and Nen Manuals](Abilities-and-Nen-Manuals)). They are not pool abilities, so any Nen type can learn them; one of another type than yours costs more memory and is weaker (see [Nen Types and Affinity](Nen-Types-and-Affinity)).

| Beast | Type | Aura | Cooldown | Health | Hit | Memory | What sets it apart |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Bound Familiar | Conjuration | 40, plus 3.5 per second | 30 s | 40 | 4 | 5 | Sturdy. Strikes what you strike and what hurts you, and hostile mobs go for it instead of you. |
| Aura Hound | Emission | 35 | 60 s | 16 | 4 | 4 | The fastest. Keeps no upkeep, lasts 30 seconds and then ends itself, and strays twice as far from you as the others. |
| Strung Beast | Manipulation | 30, plus 3 per second | 30 s | 24 | 7 | 4 | Hits hardest, but only attacks what you hit or send it at, never anything on its own. |

Health and Hit are in half hearts and before your power, armor and the target's defenses. A beast hits for its Hit times your power, and the power counts as it was when you summoned it, up to 1.5 times. Summoning with Ren on gives a stronger beast; turning Ren on afterwards does nothing for it. Server owners can change every number.

## Bodies

A beast can wear one of four bodies. A body is only how it looks; it never changes what the beast does.

| Body | Looks like | Worn by default |
| --- | --- | --- |
| Hound | Four-legged and fast | Aura Hound |
| Brute | A stooped, broad guardian with a rune on its chest | Bound Familiar |
| Serpent | Low and long with a coil, a raised neck and fins | none |
| Stalker | Thin, on four long legs, with strings rising from it | Strung Beast |

To pick one, open the Look screen (the Look button in the status hub's Abilities and Hatsu tabs, or in the binding screen) and choose the ability. A beast ability has a Body row under the ornament row; pick a body, or Default for the ability's own. A beast of that body appears in the world while you choose, then goes away when you press Done or Escape, or after a few seconds. Your colours apply to the body. A server can make the Body row open only at Practiced mastery, or turn looks off so everyone gets the default body.

Other players see your chosen body only if they have "show other players' looks" on in their own client options (`showOtherPlayersLooks`, on by default); otherwise they see the ability's default body in your type's colour. See [Hatsu](Hatsu) for looks in general.

## The Beast form

Once you have learned Bound Familiar, a Conjuration user can forge the Beast form in the Hatsu builder. It is a toggle that costs 40 aura and then 3.5 a second, with a 30 second cooldown, and it makes a beast in the role of its option: Guardian (sturdy, 40 health, hit 4), Hound (fast, 16 health, hit 4, lasts 30 seconds) or Strung (24 health, hit 7, only strikes what you hit or send it at). It cannot be given the On-hit trigger. The beast's first 8 strikes of each use carry the other things you built (damage, a mark, a slow, and so on); after that it hits plainly. Those strikes scale with your power up to the same 1.5 times as a plain hit, and an Echo in the build repeats them like any hit. A press of the key ends it; crouch and press to send it at what you look at or call it back, as for any beast. The Look screen's Body row works for the forged ability too. Like any beast it never hurts players if the server sets Hatsu damage against players to zero.

## Using a beast

- **Summon.** Press the ability's key. The beast appears next to you. You can have one beast out by default, one for each ability.
- **Dismiss.** Press the key again. The beast dissolves and the ability's cooldown starts.
- **Order.** Crouch and press the key while the beast is out. If you are looking at a creature within 16 blocks, the beast goes for it. If you are looking at nothing, it drops its target and comes back to you. Your own beast and pets do not block the line. A creature you may not hurt, or one you cannot see, is not accepted. For more orders, use the [beast command wheel](#the-beast-command-wheel).
- **No Ten needed.** The beast stays if you stop holding Ten.

The upkeep is more than Ten gives back (2 aura a second), so you cannot hold a Bound Familiar or a Strung Beast forever by standing still.

## What ends a beast

The beast and the ability end together:

- You press the key again, or the Hound's 30 seconds run out. This counts as a finished use and raises the ability's mastery.
- Your aura runs out, you die, log out, forget the ability or have your Nen reset.
- You turn Zetsu on. You also cannot summon one while Zetsu is on, and nothing is spent when it is refused.
- It strays too far: more than 24 blocks and it is teleported back to you (48 for the Hound); more than 64 blocks (128 for the Hound) and it is lost. It is also lost if it ends up in another dimension, or inside a Nen-sealed zone.
- Aura Severance cuts it from you.
- **It is killed.** You lose 20% of the aura you have at that moment, and the use earns no mastery. The cooldown still starts.

A beast never stays behind: it is gone when you log out or restart the server. There is one exception: if you are killed in a fight that counts for [Post-mortem Nen](Post-mortem-Nen), a beast you had out keeps fighting for 15 seconds, against your killer only.

## Who it fights

A beast's hits are your Nen hits, so everything that limits you limits it. It never hurts a player you may not hurt (PvP off, your team, a claim that protects them), never hurts you or your pets, and it counts as yours for nations and claims. A beast never attacks an unawakened player, unless that player hurt you in the last 5 seconds.

Mobs and the world hurt a beast normally. A player can hurt your beast only if they could hurt you, and you cannot hurt it. Nothing a beast kills gives Nen XP, but the loot and the vanilla experience go to you.

## Seeing a beast

A beast is made of aura, so it works like your other aura-made things: you see it, players with Gyo on see it, and spectators see it. Players without Gyo do not see it at all. If you use In, only a viewer with Gyo and Ren on sees it. Aura Read on a beast reads you, and Drain on one takes your aura, not its own. A server can show beasts to everyone (see [Server Owners](Server-Owners)).

## Wild Nen beasts

Not every beast is yours. On some nights a **wild Nen beast** walks the Overworld surface, a creature of raw aura with 30 health and its own Nen type, level and body (Hound, Brute, Serpent or Stalker), drawn in the colour of its type. It is about a third as common as the Rogue Nen User.

- **Only the awakened see it, and only they are hunted.** An awakened player or a spectator sees it. A player who has not awakened sees nothing, is never attacked and walks through it. The moment you awaken, it appears; if your Nen is reset, it vanishes and forgets you.
- **It fights with Nen.** A plain bite, and about every 5 seconds a heavier strike of Nen damage, so Ten and Ken matter. Aura Severance stops its strikes for a while.
- **Never near a sealed zone.** It does not spawn inside a Nen-blocked zone.
- **Reward.** Experience, and a small chance (10% by default) that a beast you kill drops a Nen Manual. Aura Read on it shows its type and level.
- **Eggs and commands.** A Wild Nen Beast Spawn Egg is in the Nen creative tab.

## Taming a wild beast

A wild Nen beast does not have to be killed. If you know **Beast Bond**, a Manipulation ability you learn from a Nen Manual (see [Abilities and Nen Manuals](Abilities-and-Nen-Manuals)), you can win an aura contest against it and keep it. A tamed beast is not like a summoned one: it follows you, survives logging out, dying, restarts and changing dimension, and it is yours until the bond ends.

| Beast Bond | |
| --- | --- |
| Type | Manipulation (a toggle) |
| Aura | 30, plus 6 per second while the contest runs |
| Cooldown | 60 s |
| Memory | 4 |
| Lowest level | 10 |

**How the contest goes**

1. Look at a wild beast within 8 blocks and press the key. The beast must be weakened to half its health or less, and it cannot be above your Nen level.
2. Stay close and in sight. A bar on your action bar shows the progress, and a tether of aura links you to the beast. The beast keeps fighting you, and every hit you take sets the contest back.
3. A Manipulator wins in about 3 to 6 seconds. Another type needs up to two and a half times as long.
4. If you win, the beast is yours. You are given the advancement Kindred Aura for your first.

It is refused, and costs nothing, if there is no wild beast in sight, if it is too healthy or too high a level, if your roster is full, if the beast is already bonded once or is resisting you, if another player is binding it, or if you are in Zetsu. It is also refused when taming is off on the server.

**If the contest fails.** Giving up (press the key again), being driven out of range or sight for a second, turning on Zetsu, or the beast dying all end it. The aura stays spent and the cooldown still runs, you earn no mastery, and the beast resists you for a minute. A beast that has been bonded once can never be bonded again.

**The cost.** Each bond holds back 10% of your maximum aura for as long as it lasts, whether the beast is out or not. You can hold one bond by default. All bonds together never hold back more than 80%.

**Living with a tamed beast**

- It keeps its type, level, body and colour. It heals slowly when it is not fighting.
- It fights for you the same way a summoned beast does. Every limit on you applies to it, and it never attacks an unawakened player unless that player hurt you in the last 5 seconds.
- It is unseen unless you are awakened, and only awakened players and spectators see it. The server's "show to everyone" setting does not apply to it.
- Nobody can hurt it if they could not hurt you. You never can.
- It waits, unseen, while you are logged out, in a Nen-sealed zone or in the Tower. It holds still while you are dead, in Zetsu, or under an effect that stops your abilities (Exhaustion, a Vow Lockout, Aura Severance or Silence).
- **If it dies,** the bond ends for good and you lose 20% of the aura you have at that moment. If you forget Beast Bond or your Nen is reset, the bond breaks and the beast turns wild where it stands.
- With a tamed beast out and no wild beast in sight, crouch and press the Beast Bond key to switch it between Follow and Stay. A plain press shows its status.

## The beast command wheel

Both tamed and summoned beasts take orders from one key, **Beast orders** (see [Controls](Controls)).

1. Press it. A picker opens with **All** at the top and your own beasts around it: the nearest 7 within 48 blocks by default. Each shows its body, its name ("(summoned)" for a summoned one) and a health bar. The beast under your crosshair is highlighted. With none near, All is dimmed and says "No beasts nearby".
2. Pick All or one beast. The order wheel opens for that choice.
3. Pick an order.

| Order | What it does |
| --- | --- |
| Follow | Comes with you. |
| Stay | Holds where it is. It will not wander more than a couple of blocks, and it sits down when it stands still. |
| Attack | Goes for the creature you look at, up to 16 blocks away. |
| Recall | Calls every tamed beast to you and puts it on Passive. Tamed only. |
| Passive | Never attacks, not even to defend itself. |
| Defend | Fights what hurt you or it. This is the usual state. |
| Hunt | Looks for hostile mobs within 12 blocks and attacks them. Never goes for a player. |
| Release | Ends the bond and lets the beast go. Tamed only, and you must be crouching. |

With one beast chosen, the wheel marks its current order and stance. A summoned beast cannot be recalled or released: it answers "Summoned beasts cannot do that". A summoned beast's order and stance last only as long as that use. Recall has a 10 second cooldown. You can only command your own beasts in the same dimension, and a beast further than the command range does not hear you. A beast on Stay still ends its use if it strays too far (see What ends a beast).

## For server owners

Four keys in `server.toml`: `nenBeastsEnabled` (true) turns beasts on and off, and turning them off ends the ones already out; `maxActiveBeasts` (1, up to 4) is how many beasts one player holds, one for each ability; `beastDeathAuraLoss` (0.2) is the share of aura lost when a beast is killed; `beastsVisibleToAll` (false) shows beasts to every player. Per-beast numbers (`health`, `hit`, `speed`, `maxBeastScale`) are in `abilities.toml`. Wild beasts have two more keys: `wildBeastSpawnChance` (0.1; 0 means none spawn naturally) and `wildBeastManualChance` (0.1). Taming has three more: `beastTamingEnabled` (true; off means no new bonds, and tamed beasts wait unseen), `maxTamedBeasts` (1, up to 4) and `tamedBeastAuraReserve` (0.1, the share of maximum aura each bond holds back). `commandRange` (48, 8 to 128) is how far from you a beast still hears an order.

Authors can add their own beasts and bodies. See [Addons](Addons).
