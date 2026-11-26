# Example Nen Addon

A starting point for an Elite Hunter X Hunter addon: three abilities (Spark Fist, Spark Burst and the beast Spark Hound, which wears its own wisp body), one vow (Spark Offering), their client visuals (an icon, a sound, cast, hit and running effects) and a game test. It is a complete Gradle build: copy this folder and it builds on its own. The wiki's Addons page has the overview.

## Get the API

Elite HxH's source is not public, and there is no separate API jar: an addon compiles against the released mod jar. This build reads it from a local Maven repository through the Gradle property `elitehxhRepo` (default `../repo`), at `com/johnadmin/elitehxh/elitehxh/<version>/elitehxh-<version>.jar`. Pass `-PelitehxhRepo=/path/to/repo` or put `elitehxhRepo=/path/to/repo` in `~/.gradle/gradle.properties`.

## Build and run

- `./gradlew build`: compile against the API and build the jar.
- `./gradlew runClient`, `./gradlew runServer`: the game with Elite HxH and this addon loaded. In a creative world: `/nen admin awaken Dev elitehxh:enhancement`, `/nen admin ability grant Dev examplenenaddon:spark_fist`, then bind it in the binding screen.
- `./gradlew runGameTestServer`: run the game tests in `src/gametest`. Every test passed when `run-gametest/logs/latest.log` says "All N required tests passed".

## Make it yours

1. Pick a mod id and a package. Change `mod_id`, `mod_name` and `mod_group_id` in `gradle.properties`, `rootProject.name` in `settings.gradle`, `ExampleIds.MODID`, the package of every class, the `assets/examplenenaddon` folder, and the keys in its `lang/en_us.json`.
2. Replace Spark Fist and Spark Offering with your own abilities and vows. Put each ability in its type's tag (`data/elitehxh/tags/elitehxh/nen_ability/<type>.json`) so manuals can teach it.
3. Ship your own icon as `assets/<mod_id>/textures/ability/<ability path>.png`, or set it in the client extension.

## Rules

- Use `com.johnadmin.elitehxh.api` only. The mod jar holds everything else too, but nothing outside the API is supported, and it changes without notice.
- The API is licensed under `LICENSE-API`, inside the mod jar: you may use it to build and run addons, and you may not ship the API or the mod with your addon.
- The Gradle files derive from NeoForge's MDK, under `TEMPLATE_LICENSE.txt`. The example code currently carries no license grant. Whether to grant one is the author's open decision.
