# Addons

Elite HxH is built as a platform. Other mods, called addons, can add new Nen abilities, vows, Hatsu parts and visual effects, and they use the same screens, bars and rules as the built-in content.

## For players

- An addon's abilities show up in the game like the built-in ones: in manuals (if the author put them in a type), on your ability bar and in the binding screen.
- Addon techniques are not on the technique wheel. The wheel lists only Ten, Ken, Ryu, Shu, Gyo, In, En and Zetsu. An addon technique has a key of its own, so look for it in Options, Controls.
- The server owner can rebalance or turn off any addon ability in `abilities.toml`, the same way as the built-in ones.
- If an addon crashes while you play, the mod switches that one ability off and the game carries on. See [FAQ and Troubleshooting](FAQ-and-Troubleshooting).
- Install the addons on the server and on every client that joins.

## For authors

The public API lives in `com.johnadmin.elitehxh.api`. It is documented, and it is the only part of the mod an addon may use. It is **experimental until Elite HxH 1.0.0**: a minor version can break it, so pin the exact version you built against and read the changelog before you update.

The mod's source code is not public, and there is no separate API download. You build an addon against the released mod jar:

- Download the mod jar for the version you target from the mod's page, and add it to your NeoForge build as a compile-time dependency and for your run configurations.
- Use only the classes in `com.johnadmin.elitehxh.api`. The jar holds the rest of the mod too, but everything outside the API is internal and changes without notice.
- The `addon-template/` folder of this wiki's repository is a complete example addon with its own Gradle build (abilities, a vow, a beast, client visuals and a game test). Copy it and start from it; its README says how to point it at the mod jar.
- Each version's changelog on the mod's page has a section for addon authors.

A few things worth knowing before you start:

- Elite HxH requires GeckoLib and Curios API (and Player Animation Library on clients), and so does a mod that depends on it.
- Your addon's advancements can sit in the mod's **Nen** tab by using `elitehxh:nen` as their parent.
- Nations are readable from addons (who owns a chunk, ranks, relations, trusted players with `Nations.trustAt`, personal and zone nations, and `Nations.mayAct`, the same claim answer the mod uses) and fire events you can listen to or cancel. Code that changes blocks should ask `mayAct` first. Code that hurts an entity asks `mayAct` with `ClaimAction.HURT_ENTITY`, and code that hurts a player asks `Nations.mayHurt(attacker, victim)`, which follows the nation, relation and PvP rules.
- An addon can add Nen beasts (see [Nen Beasts](Nen-Beasts)): extend `BeastAbility`, and give the beast a body made of a GeckoLib model, five animations and a texture named after its id.
- An addon can add a Hunter specialty (see [Hunter Exam](Hunter-Exam)): register a `HunterSpecialty` in the `NEN_HUNTER_SPECIALTY` registry, give it a name key, and credit it with `INenUser.addHunterDeed` or by listening to `HunterDeedEvent` and `HunterStarEvent`. It has no perks of its own and cannot grant a license.
- The API also covers mobs that carry aura, imprints for [Infused Gear](Infused-Gear), Geas terms, Hatsu modifiers, paying and charging Jenny (`NenApi.bank`) and Tower Arena events.
- Do not ship official Hunter x Hunter art, audio or text. Use original assets and translation keys.

## Using the API

The API license, `LICENSE-API` inside the mod jar, lets you compile against and run with an unmodified mod jar from an official download, to build and run addons. Your addon must not include the API or the mod, and the license gives no access to the mod's source. Read the file itself, because the license text is still a draft.

For the list of pages, go back to [Home](Home).
