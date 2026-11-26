# Scattered Set

Somewhere in the world lies a fixed set of numbered **Star Tiles**. Each one is a small tile marked "Star Tile No. N", and each number exists exactly once on the server. Nobody has the whole set at the start. The first to find a number earns a deed, and the player who holds every number is announced to everyone.

The Scattered Set is on by default. If a server owner turns it off, no new tiles appear and nothing glows, but tiles already out stay valid.

## The tiles

The set has 12 numbers by default, so there are 12 tiles in all. A tile does nothing on its own: it has no power, it is only worth finding and keeping. Its name shows its number.

There are four looks, chosen by number: Nos. 1, 5 and 9 share one, Nos. 2, 6 and 10 another, and so on around.

## Finding one

Tiles turn up in old loot chests: dungeons, abandoned mineshafts, desert pyramids, jungle temples, shipwreck treasure, buried treasure and ocean ruins. Each such chest has a chance (0.4% by default) to hold one. Because each number exists once, a number that is already out is not dropped again, and a copy that somehow turns up (a duplicated stack, for example) crumbles in your hand.

## Losing one

A tile that is lost goes back to the pool, and its number can be found again by anyone:

- It despawns while lying on the ground.
- It is destroyed by something that harms items, such as a cactus. Fire, lava and explosions do not hurt it.
- It falls into the void.
- It is removed by a command such as `/kill @e[type=item]`, `/clear` or `/item replace`, or a mob, item frame or armor stand holding it vanishes without dropping it.
- It is left in a [Tower Arena](Tower-Arena) ring when the match ends. A tile tossed or dropped there is not handed back, and a tile cannot be staked in a duel.

A tile will not go into an ender chest, a shulker box or a bundle. One that is somehow already in your ender chest is thrown out at your feet when you open it or log in ("It will not go in.").

If you **log out**, every tile you carry drops at your feet. Take them back when you return, but someone else may get there first.

## Seeing them with Gyo

With [Gyo](Techniques-and-the-Wheel#gyo) on, you see pale gold motes on any chest, item frame or dropped tile that holds a tile, within 6 blocks by default. Players carrying one show nothing.

## The record

The Record tab of your [Hunter Terminal](Hunter-Terminal-and-Bounties) shows "Star Tiles out: X of Y", and below it the numbers you were the first to find.

## Deeds and announcements

- The first player ever to hold a number is its first finder. If your Hunter License is in the Treasure specialty, that earns a deed worth 15 points; without one, the number still counts as yours on the Terminal but pays nothing, and it is never paid again, however many times the tile changes hands.
- Holding the whole set at once is announced to the whole server with your name, once per player, and with a Treasure license earns a deed worth 50 points.
- Finds and returns are announced to the server too (by default), but only as "X of Y are out": no name and no place. See [Hunter Exam](Hunter-Exam) for what deeds do.

## For server owners

The `[relic]` table has `relicEnabled` (true), `relicSetSize` (12), `relicChestChance` (0.004), `relicAnnounce` (true) and `relicGyoRange` (6). Admins can list the tiles, give one and return one to the pool. See [Server Owners](Server-Owners).
