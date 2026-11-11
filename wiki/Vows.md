# Vows

A vow is a promise you make to your own Nen. In return for a rule you must follow, you get more power. If you break the rule, you pay.

## Swearing a vow

You need at least one ability learned first, because a vow is sworn on an ability.

1. Open the vows screen: click **Vows** in the status hub (**N**) or in the binding screen (**K**). You can also bind the vow screen to a key in the controls.
2. Pick a vow. The screen shows the bonus and the penalty before you commit.
3. Pick the ability to swear it on.
4. Confirm. The game always asks first, and for a locked vow it makes you wait two seconds before the button works.

Every built-in ability has room for two vows. Aura Read has room for one. Your own signature Hatsu has room for eight (see [Hatsu](Hatsu)).

## The eight oaths

| Oath | The rule | What you get | If you break it |
| --- | --- | --- | --- |
| Offering Oath | Each use gives up an amethyst shard. | Power 1.25 times, cost 0.8 times | You lose 30% of your aura, and the ability is sealed for 1 minute. |
| Moonlit Oath | The ability works only at night. | Power 1.3 times, cooldown 0.8 times | You lose 25% of your aura, and the ability is sealed for 2 minutes. |
| Grave Oath | The ability may only strike the undead. | Power 1.5 times, cost 0.75 times | You lose half your aura and get 5 minutes of Vow Lockout. |
| Blood Oath | Each use costs a heart, and you need at least four hearts to use it. | Power 1.6 times, cooldown 0.7 times | You lose half your aura and get 5 minutes of Vow Lockout. |
| Unarmored Oath | You wear no armor when you use the ability. | Power 1.25 times, cost 0.9 times | You lose 25% of your aura, and the ability is sealed for 2 minutes. |
| Lone Oath | No other player is within 16 blocks when you use the ability. Spectators do not count. | Power 1.25 times, cooldown 0.9 times | You lose 25% of your aura, and the ability is sealed for 2 minutes. |
| Whole Oath | You are at full health when you use the ability. | Power 1.4 times | You lose 25% of your aura, and the ability is sealed for 2 minutes. |
| Silent Oath | After each use of the ability you fall into Zetsu. Leaving Zetsu within 10 seconds breaks the oath. | Power 1.35 times, cost 0.8 times | You lose 30% of your aura and get 1 minute of Vow Lockout. |

Blood Oath needs Nen level 5. It is also **locked**: once sworn, you cannot drop it for one in-game day (about 20 minutes). The other seven can be revoked at any time.

"Night" means the same time the game calls night, from dusk until dawn, in every dimension.

## Two training oaths

These two cover every ability at once, and need Nen level 10. By default you can hold one player-wide oath at a time, and these two cannot be held together anyway.

| Oath | The rule | What you get | If you break it |
| --- | --- | --- | --- |
| Devotion Oath | Use only abilities of your own type; your signature Hatsu counts as your own type. | Power 1.3 times | Other abilities are simply refused ("A vow forbids this ability"): nothing is spent and nothing counts as a break. |
| Breadth Oath | None. | Type training units 2 times (every source but admin commands), but the power of your own-type abilities is 0.9 times | Nothing to break. |

See [Nen Types and Affinity](Nen-Types-and-Affinity) for training.

## Two last oaths

These two cover you as a whole, like the training oaths, and take a player-wide slot. They have no rule to break and no bonus: they change what happens when you are about to die. By default you hold one player-wide oath at a time, so each of them takes the place of a training oath. They are about [Post-mortem Nen](Post-mortem-Nen).

| Oath | What it does |
| --- | --- |
| Second Beat (Nen level 30) | Once an hour, a blow that would kill you does not. You lie still at 1 health for 5 seconds and look dead to everyone, then wake with 2 hearts, no aura and a minute of Nen Exhaustion. It does not work against the void or `/kill`, inside a Nen-sealed zone, or while you are in Zetsu or Nen Severed. |
| Last Will Oath (Nen level 25) | Any living thing that kills you makes your death count, and your risen body and orphaned beast hit up to twice as hard instead of one and a half times. At Nen level 40 your signature Hatsu is left behind as a Nen Will, and the oath is used up. It cannot be sworn again for 7 real days. |

While you lie still after a Second Beat you can do nothing: no attacks, no abilities or techniques, no using items. A blow from a creature or player kills you for real; fire and lava do too. Only someone using Gyo can tell you are there.

## Breaking a vow

The first slip is only a warning, called a strike. The second break applies the penalty, and the vow stays broken, so you cannot swear it again on that ability until the lockout or seal ends.

- **Sealed** means the ability you swore the vow on is on cooldown for the stated time.
- **Vow Lockout** is stricter. For its length you cannot use any ability or technique. Drinking milk, a totem or clearing effects with commands will not remove it. Dying does.
- Servers can turn on lethal vows, where breaking a vow kills you. That is **off by default**. On the default setting a lethal vow cannot be sworn.

Creative and spectator players skip the penalties.

## Revoking a vow

A vow that is not locked can be revoked from the vows screen. After you revoke one, you cannot swear the same vow on the same ability again for one in-game day. The screen tells you before you confirm. A vow that stopped working because its ability or mod is gone can always be dropped, with no wait.

## Limits

- All vows on one ability together add at most +100% power by default. Cost and cooldown cuts stop at half.
- The bonuses apply when you start using the ability. Cost cuts do not cut the upkeep of an ability that keeps running.
- Forgetting an ability counts as revoking the vows on it, so the same wait applies. An ability with a locked vow on it cannot be forgotten.

Sworn your first vow? You have earned the **Binding Word** advancement. Break one (a second violation after the warning) and you earn **Broken Word**. Next, [Hatsu](Hatsu) is where vows can be built right into your own ability.
