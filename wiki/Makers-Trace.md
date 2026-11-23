# Maker's Trace

Old things remember the hands that made them. An **antique** carries a hidden truth: it may be genuine, a fake, or something that hides a second aura inside. With Gyo you can study one and get a reading of it, and a Wandering Hunter will buy it if you name its truth. A right call pays, a wrong one costs you.

Maker's Trace is on by default. If a server owner turns it off, antiques stop appearing and studying and selling are refused.

## The twelve antiques

Clay Figurine, Bone Comb, Bronze Mirror, Lacquer Box, Jade Seal, Ink Stone, Brass Bell, Carved Mask, Iron Key, Glass Bead String, Silver Spoon and Stone Lamp. They do not stack, and they do nothing on their own. Each one you find is its own piece: two of the same antique are not the same truth.

Where they come from:

- **Loot chests.** Some chests have a chance (6% by default) to hold an antique.
- **Archaeology.** Brushing suspicious blocks has a chance (8% by default) to give one.
- **Cartographer.** A Cartographer of level 2 or higher sells an unexamined antique for 6 emeralds, but only to a licensed Hunter.
- **Wandering Hunter.** He sometimes sells an **Unexamined Lot** as a common ware, for 120 Jenny to start with. See [the Wandering Hunter](Bestiary#the-wandering-hunter).

An antique does not tell you what it is until you read it.

## Studying an antique

To study one you need Gyo on and the antique in your **main hand**. Use it and stand still for 3 seconds (by default). When it finishes you pay 10 aura and get a reading that only you can see.

- Moving, being hit, swapping the item, turning Gyo off, entering a Nen-sealed zone, dying, changing dimension or logging out cancels the study, and a canceled study costs you nothing.
- The reading shows on the antique's tooltip for the rest of your session. It is gone when you log out, so study it again.

A reading may tell you the piece's **depth** (how deep its trace runs, 1 to 5) and its **age** (1 to 4). Your **skill** decides how much you read. A better reader gets each figure exactly more often, and a figure that is not exact is off by one. Your skill grows with your Nen level (up to level 30) and with your Treasure deeds as a Hunter. Past a skill of 0.6 (by default) you can also see a **second aura** hidden in a piece that has one, which is the sign of a hidden piece. A piece without it shows nothing there.

The same reader with the same skill gets the same reading every time, so studying twice does not help. Level up or earn a Treasure tier and the reading is drawn again.

### Truth Pendant

If you wear a [Truth Pendant](Accessories#truth-pendant) while you study, it spends one charge and gives you the **exact** depth and age. Nothing else changes: it does not tell you the truth itself.

## Selling to a Wandering Hunter

Use an antique on a visiting Wandering Hunter. He opens a dialog and asks what it is. You have three calls:

- **Genuine**
- **A fake**
- **Something hides inside**

When you press one, you stake 50 Jenny (by default), taken from your wallets first and then your bank. If you cannot pay the stake, nothing happens.

| Result | You get |
| --- | --- |
| Right call, genuine | Your stake back and 40 Jenny for each grade of the piece |
| Right call, a fake | Your stake back and 30 Jenny for exposing it |
| Right call, hidden | Your stake back and the genuine pay, times 3 |
| Called genuine, but it hides something | Your stake back and 40 Jenny for each point of its depth |
| Wrong call | You lose the stake and get 5 Jenny for the piece |

If the buyer is a Hunter with the Treasure specialty, a right call pays 1.25 times as much. A right call also earns the Treasure deeds `Trace called` (10) and `Trace hidden` (25) toward your Hunter License; see [Hunter Exam](Hunter-Exam).

A piece can be sold only once. Once sold it is on the record, and no Hunter will take it again. The dialog tells you nothing about the truth, so what you read is all you have.

### The daily cap

You can win at most 600 Jenny per real day from appraisals, above the stake you get back (by default; 0 removes the cap). The dialog shows how much you can still win today, and a Hunter who has bought enough from you says so. Your stake always comes back on a right call.

If the economy is off on the server, there is no stake and no Jenny, but the deeds are still paid.

## For server owners

The `[trace]` table has `enabled` (true), `traceStudySeconds` (3), `traceStudyAura` (10), `traceHiddenSkill` (0.6), `traceStake` (50), `traceBaseJenny` (40), `traceFakeFee` (30), `traceHiddenFactor` (3), `traceScrapJenny` (5), `traceTreasureBuyer` (1.25), `traceDailyJenny` (600), `traceChestChance` (0.06), `traceBrushChance` (0.08), `traceVillagerOffer` (true) and `traceVillagerEmeralds` (6). Admins can use `/nen admin antique <item> [genuine|fake|hidden] [player]` to give an antique of a chosen truth. See [Server Owners](Server-Owners).
