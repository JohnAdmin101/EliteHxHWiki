# Gourmet

Hunters cook. At an **Aura Pot** you turn ordinary food into dishes that tune your Nen for a while. Three rare animals give the ingredients for the finest dishes, and hunting them tests how well you hide your aura.

## The Aura Pot

Craft an Aura Pot from an amethyst shard, a cauldron and a campfire. Right-click it to open a small screen with four input slots and one output slot. Hoppers can feed it and empty it, and a claim treats it like a chest.

To cook, put the ingredients in and press **Cook**. The screen closes. Then turn on **Ren** within 10 seconds and hold it for 8 seconds by default, within 2 blocks of the pot. See [Controls](Controls). A readout shows your progress. Leaving the range, dropping Ren, dying, logging out or changing dimension cancels the cook, but the ingredients stay in the pot. You must be awakened to cook. You do not need a license.

A dish stacks to 16 and shows who cooked it. Eat it like any food.

## Your cook tier

Your **Gourmet** specialty tier decides how well you cook (see [Hunter Exam](Hunter-Exam#specialties-and-stars)):

| Cook tier | Effect on the dish |
|---|---|
| 0 (no tier) | Lasts half as long. Cannot cook the gated dishes. |
| 1 | Lasts the normal time. |
| 2 and up | Lasts one and a half times as long. |

## The dishes

| Dish | Ingredients | Effect |
|---|---|---|
| Ember Stew, Quicksilver Broth, Comet Chowder, Puppeteer's Curry, Potter's Pie, Oddity Soup | A bowl, any cooked meat, and one item: blaze powder, slime ball, glowstone dust, redstone, clay ball or chorus fruit | **Attuned** to one Nen type, for 5 minutes by default: abilities of that type are 5% stronger and train 25% faster. A new Attuned replaces the old one. |
| Hunter's Ration | Bread, a cooked meat, sweet berries | **Hearty**: aura regenerates 25% faster for 10 minutes by default. |
| Calm Tea (tier 1 needed) | Any leaves, a honey bottle, a water bottle | **Calm**: you can hold Ren 15 seconds longer before overuse, for 10 minutes by default. |
| Mender's Soup (tier 1 needed) | A golden carrot, a mushroom, a glistering melon slice | Closes one Nen Wound at once. Always edible. |
| Queen's Portion (tier 1 needed) | Royal Jelly, a honey bottle, glow berries | Raises your max aura by a quarter. Raises your max aura by a quarter for 5 minutes by default. Royal Jelly comes from clearing a Nen hive. |

Milk clears dish effects. Dishes already made keep working if a server turns cooking off.

## Gourmet game

Three rare animals live in the wild. They are plain, visible animals with no aura, but they sense you from a distance that depends on how you carry your aura.

| Your state | They notice you from |
|---|---|
| Zetsu | 3 blocks |
| Unawakened, or no technique up | 10 blocks |
| Ten | 14 blocks |
| Ren, Ken, En or using an ability | 28 blocks |

Sneaking cuts that range, and sprinting adds to it. The best hunters go quiet, in Zetsu, and approach slowly. Hunting them is about patience, not Nen damage. They spawn rarely, at most one of each kind within 96 blocks by default, never in a Nen zone, and they despawn when you leave. They cannot be bred, tamed, leashed or ridden.

### Ridgehorn

A strong horned animal that grazes alone on grass in mountain, hill, meadow and windswept-hills biomes. It flees faster than you can sprint. If cornered, or hurt below half health, it lowers its head and charges for 9 damage by default, then stands winded for 3 seconds. Kill it for **Ridgehorn Marrow**. You get 2 if you kill it while it is winded.

### Glimmerfin

A fish that lives deep in rivers by day and leaps near the surface at dawn and dusk. It darts away from anything. But if you stand still in Zetsu in the water, it circles in close. A close kill by hand in the water, while it is not leaping, gives **Glimmerfin Roe**.

### Duskwing

A flyer that roosts head-down on cave and overhang ceilings by day and glides at night. Walk up to a roosting one without being noticed and right-click it with an empty hand. It gives one **Duskwing Egg** a day by default and flies off. It drops only **Duskwing Feathers** when killed.

Each of these gives you a Gourmet deed when you take it from a naturally spawned animal. Taking all three earns an advancement.

### Game dishes

All three need cook tier 1 and last 8 minutes by default for a tier 1 cook.

| Dish | Ingredients | Effect |
|---|---|---|
| Ridgehorn Roast | Ridgehorn Marrow, a cooked meat, a golden carrot | **Stalwart**: 2 more hearts and some knockback resistance. |
| Glimmerfin Platter | Glimmerfin Roe, kelp, a water bottle | **Clear Current**: aura regenerates faster, and it stacks with Hearty. |
| Duskwing Custard | Duskwing Egg, a honey bottle, sugar | **Soft Step**: animals notice you less, your aura is fainter and you see in the dark. |

## For servers

Cooking keys are in the `dishes` section, and the animals are in `mobs.game` (for example `gourmetGameEnabled`, `gourmetGameSpawnChance` and the notice ranges). See [Server Owners](Server-Owners). Addons can read how far an animal notices a player: see [Addons](Addons).
