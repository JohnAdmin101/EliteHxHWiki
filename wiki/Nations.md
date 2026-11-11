# Nations

A nation is a group of players that owns land, one chunk at a time. Land a nation has claimed is protected from outsiders: they cannot break or place blocks, open containers, use doors or hurt animals there. You do not need Nen for any of this.

## Claiming on your own

You do not have to found a nation first. Stand in unclaimed land and run `/nation claim` (or press **Claim** on the map, `/nation map`). The game makes a personal nation named after you, like `Steve Land`, makes you its King and claims the chunk. Your next claims must touch your land. If the claim is refused (the chunk is taken, another nation is too close, or claiming is blocked in this dimension) nothing is created.

A personal nation is a normal nation in every other way: it has the same claim limit and you can rename it. The moment you invite someone it stops being personal.

## Selecting many chunks on the map

On the map (`/nation map`) a click on one chunk opens its menu, as before. Press and drag to select a rectangle of chunks instead: an outline shows the selection and, when you let go, a menu offers **Claim all**, **Unclaim all** or **Force-load all** (only what at least one selected chunk allows). A selection sends at most 64 chunks, the nearest to the map centre if you drew more. The server checks every chunk the same way as a single claim, so some may be refused; a line says how many were done ("N of M done"). **Force-load all** never switches a loaded chunk off.

## The minimap

The minimap is a small map of the ground and claims around you in a corner of the screen. It is off by default: turn it on with `nationMinimap` in the client config (Mods menu, Elite Hunter X Hunter, Config). See [Controls](Controls) for its size and corner. It hides with F1 and while a screen is open, and it needs nations to be enabled on the server.

## Waypoints and the map

Waypoints are your own private marks. They live on your computer, one list per world or server, and nobody else sees them.

- **Add one:** right-click a cell on the map (`/nation map`) and choose **Add waypoint here**, or press the **Add waypoint** key (unbound by default; set it in Options, Controls, Nen) to mark where you stand. Right-click a waypoint on the map and choose **Edit waypoint** to rename it, change its colour or delete it. A left click still opens the claim menu.
- **Where they show:** on the map, on the minimap and in the world as a label with the name and the distance. A waypoint outside the view is pinned to the edge with an arrow pointing at it. The labels hide with F1 and can be turned off with `nationWaypointsInWorld` in the client config.
- **Death marker:** after you die, a marker shows where, one per dimension. It disappears when you come within 4 blocks of it or when you die again in that dimension.
- **Members:** the map and minimap show the members of your own nation near you. Members of an allied nation show only when that nation has `share_positions` on. Spectators and people in another dimension never show.
- **Other dimensions:** when you have been somewhere else (a waypoint there, or ground you have seen), a switcher on the map steps between dimensions. The other dimension shows claims only: no members, no claim menu and no new waypoints, and a dimension the server blocks for nations is not offered.

## How much land you can claim

Your nation's claim limit is a base number plus a bonus per member. If the server turned it on, the limit also grows with the hours your members have played, up to a maximum. `/nation info` shows the limit and where it comes from (base, members, playtime). If the limit ever drops, you keep the land you have but cannot claim more until you are under it.

## Keeping chunks loaded

A Duke or the King can keep a chunk of your land loaded so a farm or machine keeps running while nobody stands near it. Stand in the chunk and run `/nation forceload` (run it again to stop), or use **Force-load** in the map's menu; loaded chunks show a gold corner on your map. Each nation may load a limited number of chunks (a base plus a bonus per member); stopping is always allowed. Chunks stay loaded only while at least one member is online, unless the server owner allows loading while everyone is offline. Losing a chunk (unclaiming it, or the land being released) also stops its loading.

## Abandoned land

If the server owner turned it on, a nation whose members have all stayed away for the set number of days of server running time loses its claims (time the server is off does not count). The nation, its members and ranks stay, and a member who comes back is told how long the land had been unattended when it was released. Every login restarts the countdown for the whole nation.

## Trusting friends

You can let a friend use your land without making them a member. A Duke or the King runs:

- `/nation trust <player> <level>` where the level is `interact`, `containers` or `build`. The friend must be online.
- `/nation untrust <player>` (works for a friend who is offline too).

Each level includes the ones before it: **interact** is doors, buttons and levers; **containers** adds chests and other storage; **build** adds placing and breaking blocks. A Duke or Lord can add `here` (`/nation trust <player> <level> here`) to trust someone only on the land they hold. The King and a holder's liege can change that list too, when standing on that land. Nation-wide trust works on crown land and on land any member may build on; land that only its holder (or lords) may build on needs the holder's own trust.

`/nation info` lists who is trusted and how far. Trust never lets anyone hurt other players and never gives a rank. A trusted friend who joins your nation becomes a normal member and the trust ends.

## Nation settings

The King and Dukes decide the rules of your land with `/nation setting <name> <value>`. `/nation info` lists the current values; a setting marked "(server)" is fixed by the server and cannot be changed.

- `build`, `interact`, `containers`, `entities` (who may place and break blocks, use doors and buttons, open chests, hurt or lead animals and villagers): `members`, `allies` or `everyone`.
- `explosions`, `fire`, `mob_griefing`, `pvp`, `machines` (other mods' machines may work from outside), `offline_loading` (force-loaded chunks stay loaded with nobody online), `share_positions` (allied nations see where your members are on their map; your own members always do): `on` or `off`. `share_positions` is on by default.

Setting `build` to `everyone` asks for confirmation: run the same command again within 10 seconds. A member's rank always decides for members; the settings are for everyone else. On land held as `holder_only` or `holder_and_lords`, `build` never opens anything and `containers` opens chests to allies only, never to strangers, and trusted friends still get what their trust gives. Members of your nation, and of nations allied with it, also count as allies for Nen abilities such as healing.

## The Nation screen

Press the **Nation screen** key (unbound by default; set it in Options, Controls, Nen), or use the **Nation** button in the status hub or on the map. The screen does what the commands do, with buttons, and it updates by itself when someone changes your nation. Buttons your rank cannot use are greyed out.

- **Overview:** your nation's name, description, your rank, its land limit and where the limit comes from, and its relations. You can leave, and the King can rename it, change its colour and description, and open or close it.
- **Members:** promote, demote, kick and invite; the King can crown another member (it asks you to confirm first).
- **Requests** (Lords and above): players asking to join, with Accept and Deny.
- **Trust:** friends trusted on the whole nation, and on land you hold yourself.
- **Relations:** ally, enemy or neutral toward other nations.
- **Settings:** the rules from [Nation settings](#nation-settings). Setting `build` to `everyone` asks you to confirm.

If you are in no nation, the screen shows **Join** (nations you can join or ask, and invites you have) and **Create**. Disbanding a nation is only done with the command. The **Map** button goes to the claim map and back.

## Joining a nation

The King can describe the nation with `/nation describe <text>` (up to 120 characters) and open it with `/nation open on` (`off` closes it). `/nation list` shows each nation, whether it is open, and the description when you hover it.

- To join an open nation, run `/nation join <nation>` (or use the Join tab). You become a Citizen.
- For a closed nation, run `/nation request <nation>`. Lords and above of that nation see your request with clickable **[Accept]** and **[Deny]**; `/nation requests` lists them with the minutes each has left, and `/nation requests accept <player>` or `deny <player>` answers one. A request runs out after the same time as an invite (10 minutes by default), and joining any nation cancels your other requests.
- Invites work as before: `/nation invite <player>` and `/nation accept <nation>`.

## Nation chat

`/nc <message>` sends a message to your nation only, and `/nac <message>` to your nation and its allies. Run `/nc` or `/nac` alone to switch it on: an action-bar line tells you, and everything you type in normal chat then goes to that channel until you run the same command again. The switch ends when you log out. Players whose chat is Hidden or set to Commands Only do not receive these messages. The server log records them.

## Spawn and protected zones

Server staff can mark areas, such as the spawn, as protected zones. A zone is not a nation: nobody can join it, it shows no claim limit and it is not in `/nation list`. Walking into one shows its name. By default nobody but staff can build there, players cannot fight, hostile mobs do not spawn and explosions and fire do nothing, but you can still use doors and buttons. Staff can change each rule per zone.

## Machines from other mods

Machines added by other mods (quarries, deployers) work inside their own nation's land and in the wilderness, but cannot reach into another nation's claim. If one does not work next to a claim edge, ask the server owner to allow it.

More commands and the server settings are in [Server Owners](Server-Owners).
