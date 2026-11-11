# Controls

All of the mod's keys are in one place: Options, Controls, in the **Nen** category. You can rebind every one. Only four have a default key. The rest are left unbound on purpose, because the technique wheel is the main way to use techniques and extra default keys would clash with vanilla and with other mods.

## Keys

| Action | Default | In the controls list | What it does |
| --- | --- | --- | --- |
| Status hub | N | Nen status screen | Opens the status hub. Works before you awaken too, and then it says how to awaken. |
| Technique wheel | R | Technique wheel | Opens the wheel to switch Ten, Ken, Ryu, Gyo, In, En and Zetsu. Works once you are awakened. |
| Ren (hold) | C | Ren (hold) | Hold to flare your aura with Ren. Release to stop. |
| Binding screen | K | Ability slots | Opens the screen where you bind abilities to slots, forget abilities and rename your Hatsu. |
| Vows screen | none | Vows | Opens the vows screen. The Vows buttons in the hub and the binding screen do the same. |
| Nation map | none | Nation Map | Opens the nation claim map, centred on you. `/nation map` does the same. Works before you awaken. |
| Add waypoint | none | Add waypoint | Adds a private map waypoint where you stand, in the next colour. Works before you awaken and only while nations are on. See [Nations](Nations#waypoints-and-the-map). |
| Nation screen | none | Nation screen | Opens the Nation screen: members, requests, trust, relations and settings with buttons. The Nation buttons in the hub and on the map do the same. Works before you awaken. |
| Ten | none | Ten (toggle) | Switches Ten on or off. |
| Zetsu | none | Zetsu (toggle) | Switches Zetsu on or off. |
| Gyo | none | Gyo (toggle) | Switches Gyo on or off. |
| Ken | none | Ken (toggle) | Switches Ken on or off. |
| En | none | En (toggle) | Switches En on or off. |
| Shu | none | Shu (toggle) | Switches Shu on or off. Works from level 15. |
| In | none | In (toggle) | Switches In on or off. Works from level 20. |
| Ryu | none | Ryu (tap to toggle, hold and scroll to split) | A tap switches Ryu on or off. Hold the key and turn the mouse wheel to move the split 10% per notch. Works from level 25. |
| Ko | none | Ko (hold to charge) | Hold to charge, release to arm the strike. Works from level 30. |
| Ability slots 1 to 6 | none | Ability slot 1 to 6 | Uses the ability bound to that slot. |

The toggle keys act once per press, however long you hold them. Ryu is the exception: it acts when you let go of the key, and only if you did not turn the wheel while holding it (a hold that scrolled moves the split and leaves Ryu as it was). While the Ryu key is held and Ryu is on, the wheel moves the split and the hotbar does not scroll. Ko works like Ren: hold it to charge, let go to arm it. A slot key also acts once per press. For charge and channel abilities (Aura Bolt, Aura Tether), hold the key and release it.

In creative mode, vanilla's save-hotbar key is also **C**. Rebind either one if they get in each other's way.

## The status hub (N)

The hub is a tabbed screen: **Status**, **Types**, **Techniques**, **Abilities**, **Vows** and **Hatsu**. On the left is your own model, wearing your aura and following your mouse. On the right is the selected tab.

- **Status** shows whether you are awakened, your type, level, an XP bar, an aura bar in your type's color and the techniques that are running.
- **Techniques** lists all six, with what you have learned and what is on.
- **Abilities** lists what you know, with mastery as a percentage of your cap, the slots, and your memory.
- **Vows** lists the vows you hold, with warnings, breaks and waits.
- **Hatsu** shows your signature, and explains how to forge one. Forging is done at a Meditation Stone, not here.

The hub only shows you things. It has buttons that open the binding screen, the vows screen and (on the Hatsu tab) the rename screen. Click a tab or press Ctrl+Tab and Ctrl+Shift+Tab to move between tabs. Scroll the rows with the mouse wheel when a list is long. It does not pause the game.

Before you awaken, the hub has the Status tab only, with a hint about how to awaken.

## The technique wheel (R)

The wheel has eight slots, clockwise from the top: Ten, Ken, Ryu, Shu, Gyo, In, En and Zetsu. A slot you have not unlocked shows "Lv N". Ren and Ko are not on the wheel; they have their own keys. Shu is on the wheel and also has its own key, handy mid-fight. See [Techniques and the Wheel](Techniques-and-the-Wheel) for the full story. The short version: hover a slot to read about it, click to toggle, click outside the ring or press Escape or **R** to close.

## The binding screen (K)

Click an ability in the list, then click a slot to bind it. Right-click a slot to clear it. The Forget button (two clicks) forgets an ability you selected. When your Hatsu is selected, that button is Rename. The Status and Vows buttons open the hub and the vows screen. See [Abilities and Nen Manuals](Abilities-and-Nen-Manuals).

## The HUD

- By default the HUD is a **status panel** in the top left. It shows your own model, wearing the techniques you have running, with a small icon for each (Ren has its own icon). The frame is in your type's color, and grey before you awaken. Beside it are your health (with absorption, and a different color for poison, wither, freezing and hardcore), your aura, a row with your Nen level, armor and XP level, your hunger with the saturation you have left, your air under water, the health of a mount you ride and your Nen XP. Vanilla's hearts, armor, food, air and mount hearts are hidden while the panel is on. In creative your health, hunger, air and armor are left out, and a spectator gets no panel. The panel shrinks to fit a small window, and stays clear of boss bars, effect icons and chat.
- The **aura bar** is in your type's color, and shows only when you are awakened. It smooths between updates.
- A thin **strip under the aura bar** shows Ryu and Ko. While Ryu is on it shows your split, offense on the left and defense on the right, with a marker at the split. While Ko charges it fills with the charge, then pulses while the strike is armed and counts the 3 second window down; Ko takes the strip over from Ryu until it ends.
- The **ability bar** shows your bound slots, with the cooldown sweeping across each, a glow while an ability runs, a red tint when it costs more aura than you have and a small bar along the bottom when you are charging. It hides when you press F1.
- The **Nen XP** bar fills as you earn Nen XP. When your aura runs low the aura bar pulses, and the Exhausted and Lockout timers show under the panel while they last.
- In first person, a faint wisp of aura frames the edges of the screen while Ren or Ken is on.

### HUD settings

The nation minimap (see [Nations](Nations)) has three client settings: `nationMinimap` (off by default), `nationMinimapSize` (48 to 128 pixels, default 64) and `nationMinimapCorner` (TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT or BOTTOM_RIGHT, default TOP_RIGHT). It moves clear of the hotbar, the ability bar and the effect icons. A fourth setting, `nationWaypointsInWorld` (on by default), shows the names and distances of your waypoints and last death in the world, through blocks; nearby ones (within 2 blocks) and those in other dimensions are not labelled.

You can change how the Nen HUD looks and where it sits. Open the Mods menu, pick Elite Hunter X Hunter and press Config, or edit `config/elitehxh/client.toml`. `hudStyle` is PANEL (the status panel, the default) or CLASSIC (the older HUD, an aura bar by the hotbar with vanilla's hearts and food back). With CLASSIC, `hudPosition` puts the HUD above the hotbar (HOTBAR) or in a top corner (TOP_LEFT, TOP_RIGHT); it does nothing with PANEL. In both styles the ability slots stay above the hotbar. With PANEL the ability info panel starts under the status panel. `hudScale` and `hudOpacity` size it and fade it. `showAuraBar`, `showAbilityBar`, `showAbilityPanel` and `showXpStrip` (the Nen XP bar in the panel, or the thin strip in CLASSIC) hide a part, `unlockToasts` turns the pop-ups off and `lowAuraWarning` sets when the aura bar pulses. The defaults are in [FAQ and Troubleshooting](FAQ-and-Troubleshooting). The nation map draws the ground you have seen under the claims, like a vanilla map, with unexplored chunks as dark fog. `nationMapTerrain` turns the ground off (flat cells as before) and `nationMapCache` keeps what you have seen between sessions in `elitehxh/terrain` in your game folder; delete that folder to forget it.

## Chat commands

Players have one `/nen` command: `/nen me` prints your own Nen. The rest are for operators. See [Server Owners](Server-Owners).
