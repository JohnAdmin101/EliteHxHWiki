# Tower Arena

The Tower Arena is a ladder of refereed fights in a pocket world. You climb floors, win prize money in Jenny and, at the top, face the Floor Masters. Nobody dies in the ring, and you go home with everything you brought.

## Getting in

Craft a **Tower Registrar** from iron, an emerald, a lectern and smooth stone. Place it and right-click it. The screen shows your floor, your best floor, the purse the next win pays and any cooldown.

Press **Fight** to join the queue. You cannot queue if you are in a match already, on cooldown, Nen Exhausted, riding, sleeping, in the Tower, under a Final Pledge, or dead. You leave the queue by pressing **Leave queue**, dying, logging out, changing dimension or walking more than 8 blocks from the Registrar.

If you are the only player online, your match starts at once. Otherwise you wait 20 seconds by default for an NPC fighter, and another waiting player on your floor or one step away may be paired with you instead.

## The match

You are taken to a ring in the Tower dimension, and your return point is saved. You are healed, fed and cleared of effects. After a 3-second countdown the fight starts. A strip at the top of your screen shows the points and the clock.

A match lasts 3 minutes by default. Hits score by how much of the victim's health they take:

| Hit | Share of max health | Points |
|---|---|---|
| Clean hit | at least 8% | 1 |
| Critical | at least 20% | 2 |
| Down | at least 35% | 3 (the victim cannot be hit for 1 second) |

Smaller hits score nothing. The first side to 10 points wins at once. A hit that would kill leaves the victim on 1 health and ends the match, so you cannot die. At the end of time the higher score wins, then the higher health share, then it is a draw.

Rules in the ring:

- You cannot eat, drink, use potions, eat chorus fruit or throw ender pearls.
- Totems and Second Beat do not trigger.
- Shu mastery and Output training earn nothing in a match.
- Weapons and armour are allowed on every floor.
- Giving up with `/nen tower forfeit` is a loss. Walking out of the ring, or logging out for more than 15 seconds, is a forfeit too.

Coming home, you get back your position, health, food and effects. Toggle techniques such as Ken, En, Gyo, Shu and In that were on before the match come back on, and they do not add an Output spike. Items you tossed in the ring are returned. Vows you broke in the ring stay broken, and any XP you earned is kept.

## The ladder

Floors are 1, 10, 20 and on up to 190, then Class 200. A win moves you up one step. Below floor 50, a knockout, or a win that gave up 2 points or fewer, moves you up two. A loss moves you down one step, never below floor 1. After a match you wait 60 seconds by default before you can queue again. A draw changes nothing.

You can climb to floor 190 without Nen. Class 200 is for Nen users: if you have not awakened, you stay on 190 unless a baptism is possible (see below).

### Purses

A win pays Jenny into your bank account. By default floor 1 pays 157 Jenny, floor 30 pays 614 and floor 100 pays 16,493. A floor pays in full the first time you clear it. After that it pays a tenth of the purse. Draws, and a bank account that cannot take the money, pay nothing.

### Fighters

NPC fighters get stronger every ten floors and fight in three styles: a steady Brawler, a tough Guard that halves frontal hits, and a fast, fragile Striker. They use no Nen below floor 100. From floor 100 they use Ten, and from floor 150 Ren as well.

## Class 200

Floor 200 is for Nen users only. The fighters here have Nen too:

- **Enhancer**: hits hard and charges Ren.
- **Emitter**: keeps its range and fires aura bolts.
- **Trickster**: hides in Zetsu and strikes from the dark. Gyo shows it.

A win on floor 200 does not move you up, but it counts. Win 10 times by default and you earn a **Floor Master challenge**. Lose 4 times and you drop back to floor 100.

**Floor Masters** hold five ranked seats by default. A challenger on floor 200 with the challenge fights the lowest seat. A win takes the seat. A seat holder can challenge the seat above once per game day. Rank 1 is the top. If the seat holder is a player who is online, they are asked whether to defend in person or to send the NPC stand-in. They have 60 seconds by default to answer.

**Baptism.** An un-awakened player who presses Fight on floor 200 is warned first. If they accept, the first Nen hit they take awakens them, but it costs half their health, Nen Exhaustion and a Nen Wound, and the match counts as lost. This only works when forced awakening is allowed on the server.

## Players against players

- **Queue pairs.** Two waiting players on the same floor, or one step apart, may be paired into a ranked match instead of waiting for an NPC. Each is moved on their own floor. A pair earns a purse and a Class 200 record change once a day. Further matches between the same two still move floors.
- **Challenges.** The Registrar screen's **A player** button challenges a named online player to an unranked duel. The target has 30 seconds by default to answer. A duel gives no floor, purse or record. You can turn **Challenges** off on the Registrar screen.
- **Stakes.** Each side can stake one amount of Jenny from the bank and the item in the main hand. The target can accept, match the Jenny, stake an item, or decline. If anything is staked, the challenger sees the whole pot and confirms it. The winner takes the pot. A draw gives every stake back. Conjured items, and pieces bound to their maker, cannot be staked.
- **Watching.** Press **Watch** on the Registrar screen to pick a live match and stand on the gallery behind the barrier, up to 12 watchers per ring. Only Gyo and En work while watching, and nobody can hurt you. Go home by sneaking for 2 seconds, with `/nen tower leave`, or when the match ends.

## For servers

The Tower is one per server: floors, records and seats are shared. Keys are in the `tower` section, such as `enabled`, `matchSeconds`, `purseBase`, `playerMatches`, `stakes` and `spectators`. Admins can use `/nen admin tower floor`, `endmatch`, `record` and `seat`. See [Server Owners](Server-Owners). Nations cannot claim land in the Tower. Addons can listen to match and floor events: see [Addons](Addons). Jenny is explained in [Hunter Terminal and Bounties](Hunter-Terminal-and-Bounties).
