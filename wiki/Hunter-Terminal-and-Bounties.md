# Hunter Terminal and Bounties

The Hunter life has three parts that fit together: the **Hunter Terminal**, where licensed Hunters read the news; **Jenny**, the money you earn and bank; and **bounties**, paid work that sends you after dangerous Rogues or marked players. You need a Hunter License for the terminal and for bounties. See [Hunter Exam](Hunter-Exam).

## The Hunter Terminal

A Hunter Terminal is a block with a screen that leans back like a desk console. Craft it from iron ingots, a glass pane, redstone and a map. Right-click it to open the screen. Anyone who has not passed the exam sees only a locked panel. You can break it with a pickaxe, and it follows the same claim rules as the Exam Board.

The screen has tabs. Click one, or press Ctrl+Tab to cycle. No tab ever shows another player's position.

| Tab | What it shows |
|---|---|
| Rankings | Every licensed Hunter, by stars, then points in their specialty. One button cycles through Overall and each specialty. Your own place shows under the list if you are not in the top 20. |
| Blacklist | Rogue Nen Users near the terminal: a compass direction and a distance rounded to the nearest 32 blocks. Rogues from the Hunter Exam are left out. From stage 3, Broodmother hives are listed here too. |
| Wanted | Online players who carry a Death Grudge, and players with a bounty on them. Hiding in Zetsu or In does not hide a name. |
| Record | Your specialty, points, stars, how many points to the next star, today's deed totals, and any Geas or Nen Wound you carry. |
| Tower | The top Tower floors, the Class 200 records and the Floor Masters. See [Tower Arena](Tower-Arena). |
| Bounties | Your daily contracts. See below. |

Press **Refresh** to update the screen. It is greyed for 2 seconds after each press, so spamming it does nothing.

By default a terminal scans 512 blocks around itself for Rogues. A Hunter with the Blacklist specialty at its second tier sees distances rounded to 8 blocks instead of 32.

## Jenny

Jenny is the money of this mod. It comes as items and as a bank balance.

| Item | Worth |
|---|---|
| Jenny Coin | 1 |
| Jenny Note | 100 |
| Jenny Bundle | 10,000 |

All three stack to 64 and have no other use.

### The Wallet

Craft a **Wallet** from 4 leather and a gold nugget. It holds Jenny as a number, not as items, up to 1,000,000 by default. With a wallet anywhere in your inventory, Jenny you touch on the ground goes straight into it, and a line beside the crosshair shows each pickup. Without a wallet you pick Jenny up as items.

- Use the wallet in your hand to take an amount out as items.
- Sneak and use it to sweep every loose Jenny item in your inventory into it.
- The money travels with the wallet. If you die, the wallet drops like any item. Cash is at risk. The bank is safe.

### The bank

Every player has one bank account. Death, a Nen reset and the Final Pledge never touch it. Offline players keep their account and can still receive transfers.

- **ATM.** Craft it from seven iron ingots, a gold ingot and a block of redstone. Use it with a wallet in hand to deposit the whole wallet, or with a stack of Jenny to deposit that stack. Use it with anything else in hand to open the bank screen.
- The bank screen has an **Account** tab (balance, recent entries, deposit and withdraw), **Send** (pay a player by name) and **Exchange** (buy 1 to 64 emeralds at 1,000 Jenny each by default). Emeralds cannot be sold back for Jenny.
- **Banker.** Craft a Banker's Contract from paper, a gold ingot, an emerald and an ink sac, then use it to hire a Banker where you stand. You can hire 2 at once by default. A Banker has the same screen as an ATM plus an **Interest** tab. Sneak-use a Banker with an empty hand to dismiss it and get the contract back. Only the owner can do this.

Interest: each day an account earns 0.5% by default, on at most the first 1,000,000 Jenny of the balance. It waits beside your account, up to 7 days' worth by default, until you press **Collect** at a Banker. With the defaults the most you can earn is 5,000 Jenny a day.

Transfers have no fee by default.

### Where Jenny comes from

- Killing a Rogue Nen User drops 20 to 120 Jenny by default. A Rogue Adept drops 200 to 600 (see [Rogue Nen User](Rogue-Nen-User)).
- Killing a Wandering Hunter drops 30 to 90 Jenny (see [Bestiary](Bestiary#the-wandering-hunter)).
- Clearing a Broodmother hive pays 200 to 3,000 Jenny, by stage (see [Bestiary](Bestiary)).
- Antique appraisals (see [Maker's Trace](Makers-Trace)).
- Banker interest.
- [Tower Arena](Tower-Arena) purses, paid straight into your account.
- Bounty contracts and player bounties.
- Admins, with commands.

There is no mob farm and no emerald sale.

## Bounty contracts

Open the **Bounties** tab of a Hunter Terminal. Each game day you are offered up to 3 contracts. The offers are the same if you leave and come back, and they do not change when you abandon or fail one.

| Tier | Mark's Nen level | Pay |
|---|---|---|
| 1 | 18 | 300 Jenny |
| 2 | 26 | 700 Jenny |
| 3 | 35 | 1,500 Jenny |

A Hunter with no stars is offered three tier 1 contracts. With 2 stars you are offered tiers 1, 2 and 3.

How a contract works:

1. **Accept** one. You can hold one contract at a time, and it lasts 60 minutes by default. The clock does not run while you are logged out.
2. The terminal shows a compass direction and a distance to your target. It is 300 to 600 blocks away by default.
3. Get within 128 blocks and Gyo shows a cold aura trail. Get within 96 blocks and the mark appears: a named elite Rogue Nen User of the tier's level.
4. Kill it yourself, or have a teammate do it. The pay goes into your bank account.

The mark drops no Jenny and no manual. Killing it counts toward your Blacklist deeds (20 points). If you leave the dimension or log out, the mark vanishes and comes back at full health when you return.

**Abandon** needs two clicks within 3 seconds, and then you wait 10 minutes by default before you can accept another contract. Your contract is wiped, with no pay, if you reset your Nen, die without keeping Nen on death, or lose your license.

## Player bounties

You can put a price on a player who carries a Death Grudge. Open the **Wanted** tab, pick the player, type an amount and post it.

- The least you can post is 100 Jenny. A fee of 10% is destroyed by default and the rest goes into the pot.
- The target is told a price is on them, but never who posted it.
- Up to 16 players can add to one pot.
- The pot lasts 24 hours of the target's online time by default, renewed by each new post, and ends after at most 14 real days. When it ends, everyone who posted is refunded.
- A licensed Hunter who kills the target by the normal PvP rules collects the whole pot. You cannot collect on yourself, on a player you posted on, or on an ally. The collecting kill does not give the killer a Death Grudge by default.
- A pot does not let anyone hit the target where PvP is not allowed.

## For servers

The terminal keys are `terminalEnabled`, `terminalScanRadius` and `terminalWanted`. Bounty keys start with `bounty` (for example `bountiesEnabled` and `bountyPlayersEnabled`), and Jenny keys are in the `economy` section. Admins can use `/nen admin jenny give|take|set <players> <amount>`. See [Server Owners](Server-Owners). Addons can add mark types and listen to Jenny and bounty events: see [Addons](Addons).
