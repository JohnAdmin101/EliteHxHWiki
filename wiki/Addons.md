# Addons

Elite HxH is built as a platform. Other mods, called addons, can add new Nen abilities, vows, Hatsu parts and visual effects, and they use the same screens, bars and rules as the built-in content.

## For players

- An addon's abilities show up in the game like the built-in ones: in manuals (if the author put them in a type), on your ability bar and in the binding screen.
- Addon techniques are not on the technique wheel. The wheel lists only Ten, Ken, Gyo, En and Zetsu. An addon technique has a key of its own, so look for it in Options, Controls.
- The server owner can rebalance or turn off any addon ability in `abilities.toml`, the same way as the built-in ones.
- If an addon crashes while you play, the mod switches that one ability off and the game carries on. See [FAQ and Troubleshooting](FAQ-and-Troubleshooting).
- Install the addons on the server and on every client that joins.

## For authors

The public API lives in `com.johnadmin.elitehxh.api`. It is documented, and it is the only part of the mod an addon may use. It is **experimental until Elite HxH 1.0.0**: a minor version can break it, so pin the exact version you built against and read the changelog before you update.

Everything you need is in the mod's repository:

- `docs/addon-guide.md` is the step-by-step guide. It covers setting up the dependency, writing an ability, writing a vow, client visuals, events, tests and the rules that keep an addon working.
- `addon-template/` is a complete example addon with its own Gradle build. Copy the folder and start from it.
- `docs/api-changelog.md` lists every addition, change and removal in the API.
- `docs/config-reference.md` describes the per-ability sections that server owners use to rebalance your content.

A few things worth knowing before you start:

- An addon compiles against the `elitehxh-api` jar only, and runs with the full mod.
- Elite HxH requires GeckoLib, and so does a mod that depends on it.
- Your addon's advancements can sit in the mod's **Nen** tab by using `elitehxh:nen` as their parent.
- Nations are readable from addons (who owns a chunk, ranks, relations, trusted players with `Nations.trustAt`, personal and zone nations, and `Nations.mayAct`, the same claim answer the mod uses) and fire events you can listen to or cancel. Code that changes blocks should ask `mayAct` first. Code that hurts an entity asks `mayAct` with `ClaimAction.HURT_ENTITY`, and code that hurts a player asks `Nations.mayHurt(attacker, victim)`, which follows the nation, relation and PvP rules.
- An addon can add Nen beasts (see [Nen Beasts](Nen-Beasts)): extend `BeastAbility`, and give the beast a body made of a GeckoLib model, five animations and a texture named after its id. The guide's tenth section walks through it.
- An addon can add a Hunter specialty (see [Hunter Exam](Hunter-Exam)): register a `HunterSpecialty` in the `NEN_HUNTER_SPECIALTY` registry, give it a name key, and credit it with `INenUser.addHunterDeed` or by listening to `HunterDeedEvent` and `HunterStarEvent`. It has no perks of its own and cannot grant a license. The guide's twelfth section walks through it.
- Do not ship official Hunter x Hunter art, audio or text. Use original assets and translation keys.

## Using the API

The API license lets you use it to build and run addons. Your addon must not include the API or the mod. See the license file that ships in the API jar, because the license text is still a draft.

For the list of pages, go back to [Home](Home).
