# Infused Gear

A Nen user can pour their own Nen into a sword, an axe, a tool or a piece of armor, and it stays there for good. The piece looks the same, but it now carries an imprint that follows your Nen type. It grows as you repeat the ritual, it works best for the one who made it, and only an awakened player gets anything from it.

## What you need

- Be awake, at Nen level 15 or higher, and know Shu and Ren.
- Hold the piece in your main hand at the Meditation Stone. The menu shows **Pour your Nen into the held piece** when the piece can take it.
- Have 10 experience levels (creative players pay none). The stone checks this when you start, so you do not spend 30 seconds of Ren and find out at the end.

A piece can take the ritual if it is a single item that is a sword, an axe, a tool (anything in the common `tools` tag, which also covers bows, shields and tridents) or a helmet, chestplate, leggings or boots. Conjured items cannot, and neither can cursed ones: lift the curse first (see [Cursed Items](Cursed-Items)). Animal armor is not infusable.

## The ritual

Hold Ren next to the stone for 30 seconds. You have 10 seconds to turn Ren on, and your aura has to stay at or above a quarter of its maximum the whole time. Keep the piece in your main hand: swapping it, stopping Ren or letting your aura fall below the floor ends the ritual, and a ritual that ends early costs you nothing and has no waiting time before you try again.

When it passes you pay the 10 levels and **all the aura you have**. Because Ren is on, that leaves you with an empty tank, and normal Nen Exhaustion follows. You earn the advancement **Part of Me** the first time.

## The imprint

Your Nen type decides the imprint. Specialists choose any of the five in a dialog. Each number below is per grade (1 to 5), and the server owner can change them.

| Your type | Imprint | Weapon or tool | Armor |
| --- | --- | --- | --- |
| Enhancement | Tempered | +2% attack damage, and a 10% chance to skip a point of wear | +1 armor toughness |
| Transmutation | Charged | A melee hit adds a small Nen hit of 0.5, at most once a second | A melee attacker takes a Nen hit of 0.5, at most once every 2 seconds |
| Emission | Far | +0.1 attack and block reach | +0.1 knockback resistance |
| Conjuration | Mending | Repairs 1 durability every 4 seconds divided by the grade, paid from your aura | Same |
| Manipulation | Bound | +1% attack damage; stays with you, see below | Same, and +1% movement speed |

Mending works faster with each grade (every 4 seconds at grade 1, about every 1.5 seconds at grade 3) and costs 1 aura for every point it repairs; with no aura it stops. Charged hits are real Nen hits: they obey teams, claims, Nen-sealed zones and vows, and two Charged players trading blows do not set each other off in a chain. Only direct melee strikes count, not arrows, thrown things, beams or sonic booms. Swapping a piece out of your hand and back does not reset these waits.

## Making a piece stronger

Do the ritual again on a piece you made and its grade goes up by one, as far as your Nen level allows. By default grades 1 to 5 need Nen levels 15, 20, 25, 30 and 40. At the ceiling the stone tells you your Nen cannot take the piece any further yet. Only the maker can raise a grade; anyone else who is awake and high enough can only infuse a blank piece, and then it is theirs.

## While it works

Infused gear works only while you are awake, holding or wearing it in the right place (tools in the main hand, armor on its own slot), and not in Zetsu, Nen Severed, under a Vow Lockout or inside a Nen-sealed zone. A tool in your off hand does nothing.

- **Upkeep.** Each working piece costs you 0.2 aura per second. With no aura left, the effects stop and come back with your aura.
- **Limit.** Up to 3 pieces work at once: your main-hand piece first, then helmet to boots. The rest sleep and cost nothing.
- **Shu.** With Shu on, a weapon or tool you wield counts as one grade higher.
- **Strangers.** If you hold or wear a piece someone else made, it gives you half of its numbers, and Bound does not bind to you.
- **Your Nen.** If your Nen is reset or you lose it, the imprint stays in the piece.

## Bound

A Bound piece will not leave its maker. If you die while it works (not in Zetsu, with aura left) the piece is kept aside and returned when you respawn. If you drop or throw it, it returns to your inventory after 5 seconds, or 2 seconds from grade 3, as long as you are online in the same dimension and have a free slot. If you are away or your inventory is full, it stays where it fell, and a server restart forgets a return that was waiting. It never duplicates.

## Hardened gear

When a strong Nen user dies in a fight, the pieces they made and had in their hands or on their body are **hardened**: they count as one grade higher, past the level limit, and at the second step they are **grudge-bound**, so a stranger pays double upkeep and the piece pays its upkeep even when you did not choose it to work (in your hands or armor; the off hand never works, so it never pays). Hardening never goes past two steps. The tooltip shows a hardened line, and a dark red grudge-bound line at the second step. Exorcism and the stone's Cleanse lower it to nothing and leave the imprint. See [Post-mortem Nen](Post-mortem-Nen).

## Seeing infused gear

Awakened players see the maker, the imprint and the grade in the tooltip. Everyone else only reads "Something clings to this." With Gyo on, an infused item lying on the ground shimmers. A working piece gives off a faint glow in your type's color, which Gyo and In decide who sees.

## Taking it out

At the stone, **Draw Out** takes the Nen back out of the held piece. It is free for the one who made it and costs 10 levels for anyone else. Exorcism does not remove a plain infusion, since it is no curse. The anvil and the grindstone keep it, and repair and enchanting work as usual.

## For server owners

`infusionLevel` (15), `infusionSeconds` (30), `infusionAuraFloor` (0.25), `infusionXpLevels` (10), `infusionUpkeep` (0.2), `maxInfusedPieces` (3), `infusionStrangerScale` (0.5) and `infusionGradeLevels` (15, 20, 25, 30, 40) tune the ritual and the limits; an empty `infusionGradeLevels` turns infusion off. Each imprint has a section in `abilities.toml` (`[imprints.<namespace>.<path>]`) with its own numbers, and `enabled = false` makes its gear dormant without deleting it. See [Server Owners](Server-Owners).
