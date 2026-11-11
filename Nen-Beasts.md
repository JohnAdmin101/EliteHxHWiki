# Nen Beasts

A Nen beast is a creature made of your own aura. It follows you, fights beside you and costs you aura while it lasts. It is not a pet: it lives only as long as the ability that made it, it is never saved, and it is gone the moment you lose your focus.

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
- **Order.** Crouch and press the key while the beast is out. If you are looking at a creature within 16 blocks, the beast goes for it. If you are looking at nothing, it drops its target and comes back to you. Your own beast and pets do not block the line. A creature you may not hurt, or one you cannot see, is not accepted.
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

## For server owners

Four keys in `server.toml`: `nenBeastsEnabled` (true) turns beasts on and off, and turning them off ends the ones already out; `maxActiveBeasts` (1, up to 4) is how many beasts one player holds, one for each ability; `beastDeathAuraLoss` (0.2) is the share of aura lost when a beast is killed; `beastsVisibleToAll` (false) shows beasts to every player. Per-beast numbers (`health`, `hit`, `speed`, `maxBeastScale`) are in `abilities.toml`. Wild beasts have two more keys: `wildBeastSpawnChance` (0.1; 0 means none spawn naturally) and `wildBeastManualChance` (0.1).

Authors can add their own beasts and bodies. See [Addons](Addons).
