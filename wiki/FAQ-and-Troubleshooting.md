# FAQ and Troubleshooting

## Getting started

**My Ten key (or Zetsu, Gyo, Ken, En) does nothing.**
Those keys are unbound until you choose one, so there is nothing to press. Use the technique wheel (**R**) to switch them, or bind keys in Options, Controls, in the **Nen** category.

**I press R and nothing opens.**
You have not awakened yet. The action bar says so. Craft a Meditation Stone and meditate on it. See [Awakening](Awakening). The status hub (**N**) works before you awaken and tells you how.

**I do not know what to do next.**
Open your advancements (L) and pick the **Nen** tab. Every entry says how to earn it. The tab lists the main milestones, such as awakening, your first techniques, your first ability and vow, and the Hatsu trial. It does not cover every screen, so use [Getting Started](Getting-Started) for the rest.

**The Meditation Stone is not in my recipe book.**
The recipe appears when you pick up an amethyst shard. The recipe is five stone bricks and one amethyst shard, in the pattern on [Getting Started](Getting-Started). You can also find the stone in the **Nen** creative tab.

**My meditation keeps breaking.**
It breaks if you move away from where you started, crouch, take damage or break the stone. Stand still next to the stone and do not crouch.

## Techniques and abilities

**My ability will not fire.**
The action bar says why. The usual reasons are:

- Ten is off. Abilities need it, so they do not work while Zetsu is on.
- You do not have enough aura, or the ability is still on cooldown.
- You are under Nen Exhaustion (your aura hit zero) or Vow Lockout (you broke a vow). Both wear off with time.
- It is not bound. Press **K**, click the ability, then click a slot, and make sure the slot has a key (they are unbound at first).
- The slot is locked. [Abilities and Nen Manuals](Abilities-and-Nen-Manuals) lists the level that unlocks each slot.

**I read a manual and it did nothing.**
The message in the action bar tells you why. The common answers are: you have already learned that ability, you do not have enough memory, or you have not awakened yet. See [Abilities and Nen Manuals](Abilities-and-Nen-Manuals).

**Ren, Gyo, Ken or En are locked.**
Each unlocks at a Nen level. The wheel and the hub show the level, and the table on [Techniques and the Wheel](Techniques-and-the-Wheel) lists them all.

**Everything shut off at once.**
Your aura ran out, so your techniques and abilities ended and you got Nen Exhaustion for 10 seconds. Keep an eye on the aura bar. Ren, Ken and a wide En drain it the fastest (En costs more the bigger its field grows).

**I died and lost my Nen.**
By default you keep your Nen when you die. If your server changed that, you have to awaken again, and you keep your type.

**An ability "stopped working".**
The mod switches off an ability if its code fails, so the rest of the game keeps running. Ask an admin to restart it. Reloading the server's configs brings it back.

**The Hatsu trial keeps failing.**
Start with a full aura bar, begin Ren within 10 seconds of the dialog and hold it all the way. Turn Gyo on from the wheel when the marks appear. Stay within 8 blocks of the stone. You can try again after 10 minutes. The full list of ways to fail is on [Hatsu](Hatsu).

## Seeing things

**I cannot see other players' auras.**
Check each of these:

- The other player may be using Zetsu, which hides the aura. Gyo shows them.
- By default only 16 other players are drawn at once, within 48 blocks, nearest first. See the options below.
- Your `auraShell` or `auraSteam` option may be on SELF, OFF or REDUCED.
- The server may hide auras from players who have not awakened, so awaken to see them.
- You never see steam on your own body in first person: you see a faint wisp at the screen's edges instead. Switch to third person to see the full steam.

**I cannot see aura blades, bolts or other Nen effects made by other players.**
Aura-made things are hidden from everyone but their owner and players using Gyo. Switch Gyo on. Spectators see them too.

**My hearts and food bars are gone.**
The status panel in the top left replaces vanilla's hearts, armor, food, air and mount hearts. Your health and hunger are in the panel. To get the vanilla rows back, set `hudStyle = CLASSIC` in `config/elitehxh/client.toml` or in the Mods menu, Elite Hunter X Hunter, Config.

**En shows nothing.**
En outlines living creatures within its radius, but not players who use Zetsu. Check that it is actually on in the hub, and that you have the aura for it.

## Performance and visuals

The effects and the aura are drawn by your own game, and you can scale them down. The settings are in `config/elitehxh/client.toml` in your game folder. Edit the file with the game closed, or while it runs: it reloads.

| Option | Default | What to try if the game is slow |
| --- | --- | --- |
| `fxLevel` | FULL | REDUCED uses a third of the effect budget; OFF draws no effects. |
| `fxBudget` | 24 | Lower it (0 to 256). Effects that do not fit in the budget are skipped. |
| `auraShell` | ALL | SELF draws only your own aura; OFF draws none. |
| `auraShellMaxCount` | 16 | Fewer other players drawn at once (0 to 64). |
| `auraShellMaxDistance` | 48 | Draw only closer players (8 to 128 blocks). |
| `auraSteam` | FULL | REDUCED halves the steam; OFF removes it and keeps a faint glow. |
| `auraFirstPerson` | true | Set to false to remove the wisp at the screen edges in first person. |
| `hudStyle` | PANEL | PANEL is the status panel in the top left. CLASSIC brings back the aura bar by the hotbar and vanilla's hearts and food. |
| `hudPosition` | HOTBAR | CLASSIC only: where the aura bar, XP strip and ability slots go: HOTBAR, TOP_LEFT or TOP_RIGHT. |
| `hudScale` | 1 | Size of the status panel in PANEL, or of the aura bar, XP strip and ability slots in CLASSIC (0.5 to 2). |
| `hudOpacity` | 1 | How solid the Nen HUD is (0.2 to 1). |
| `showAuraBar` | true | Set to false to hide the aura bar. |
| `showAbilityBar` | true | Set to false to hide the ability slots. |
| `showAbilityPanel` | true | Set to false to hide the ability info panel. |
| `showXpStrip` | true | Set to false to hide the Nen XP bar in the panel, or the thin strip in CLASSIC. |
| `unlockToasts` | true | Set to false to stop the pop-ups for level-ups, new slots and vow warnings. |
| `jennyPickupLine` | true | Set to false to hide the +250 Jenny line that shows beside the crosshair when Jenny goes into your wallet. |
| `matchStrip` | true | Set to false to hide the names, points and clock at the top of the screen during a Tower match. |
| `lowAuraWarning` | 0.2 | The aura fraction below which the aura bar pulses (0 to 0.5). 0 turns it off. |
| `panelTextScale` | 1 | Size of the text in the status panel and the ability info panel (1 to 1.5). The panel shrinks to fit if it grows too big. |
| `typeGlyphs` | false | Set to true to draw a small icon of your Nen type beside the aura bar, on a running ability slot and in the hub. |
| `reducedMotion` | false | Set to true to open the technique wheel in place, hold the low aura warning still and stop the first person wisp breathing. |

The vanilla particle setting does not change any of these, because the effects do not use particles. The abilities work the same with the effects turned off.

## Servers

**The game stops at start-up and mentions a missing mod.**
Elite HxH needs GeckoLib on the server and on every client, and Player Animation Library on every client. See [Server Owners](Server-Owners).

**I cannot use a /nen command.**
`/nen me` is for every player. The rest are for operators. See [Server Owners](Server-Owners).

**The Nen Reset Token does nothing.**
Re-rolling a type is switched off by default. The server owner has to allow it.

**Another player is trying to awaken me.**
Forced awakening shows you a popup, and nothing happens unless you accept. Escape declines it. The player has to be Nen level 10 or higher, with Ren on.

## Still stuck?

Ask on the mod's page. Say what you did, what you expected and what you saw, and attach `logs/latest.log` if the game crashed.
