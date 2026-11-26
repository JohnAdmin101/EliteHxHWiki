# Accessories

You wear accessories in extra slots next to your armor. The slots come from the **Curios API** mod, which Elite HxH requires: if it is missing the game will not start. Nothing about accessories needs to be set up; the slots show on your inventory screen.

## The six slots

| Slot | What goes there |
| --- | --- |
| Hunter License | Your Hunter License (this slot is the mod's own) |
| Ring | Rings, such as the Conduit Ring |
| Necklace | Necklaces, such as the Truth Pendant |
| Charm | Charms |
| Bracelet | Bracelets |
| Belt | Belts |

The Hunter License slot takes only a license. The other five take any item that another mod or a data pack puts in that slot's tag.

## Wearing your Hunter License

A license in its own slot counts as holding it: a valid card worn there counts as carrying the card for the Exam Board (see [Hunter Exam](Hunter-Exam)). It is also **kept when you die**, by default, so you do not lose your card to a fall into lava. It shows as a small card on the upper left of your chest, for everyone to see. It sits just in front of a chestplate, and it is hidden when you turn the slot's display off or turn invisible. It is not a Nen object: Zetsu does not hide it and Gyo does not reveal it.

## Conduit Ring

Worn in a ring slot by an awakened player, the Conduit Ring raises your Output ceiling by 10% of its base (by default). Two rings count once. See [Output Ceiling](Output-Ceiling). Craft it from gold nuggets, an amethyst shard and Hunter Alloy.

## Truth Pendant

Worn in a necklace slot, the Truth Pendant shows a hidden curse for you.

- When you **pick up** or **put on** a cursed item that is not already shown to you by the free reveal at wear time, the curse is revealed and the pendant spends one charge. It never spends a charge twice on the same stack, and it does nothing at zero charges.
- Being handed an item (a trade, `/give`, moving it between chests) does not count.
- It holds 3 charges by default. Each meditation you complete gives one back, up to the limit. The tooltip shows the charges.
- It also helps with antiques: studying one while wearing it spends a charge for an exact reading. See [Maker's Trace](Makers-Trace).

For curses, see [Cursed Items](Cursed-Items). Craft the pendant from iron nuggets, an amethyst shard and an eye of ender.

## Infused accessories

A ring, necklace, charm, bracelet or belt can take the [infusion ritual](Infused-Gear) and then works as an infused piece while you wear it, in every slot but the license. By default this is on.

- It counts toward the limit of working pieces, together with your main hand and armor. When you are over the limit, your **main hand and armor win** and the accessories go dormant first.
- It pays upkeep, adds Output load and wears like armor, and its imprint reacts when you are struck, as armor does.
- It does not get the on-hit effect of a weapon, and it never hardens when its maker dies.
- Swapping an infused accessory for another of the same item (a ring for a plain ring, say) takes effect at once: the old piece stops working the moment it is out of the slot.

## For server owners

`keepLicenseOnDeath` (true), `infusedAccessories` (true), `truthPendantCharges` (3) and `conduitRingOutputBonus` (0.1, 0 turns the ring off) are in the `[accessories]` table. See [Server Owners](Server-Owners).
