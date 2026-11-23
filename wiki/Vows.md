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

## Open Hand Oath

Nen level 15. A vow with no power in battle, no rule to break and no penalty: you tell an opponent exactly how one of your abilities works, and it hits them harder. It takes one of the vow slots of the ability you swear it on, and you can revoke it like most oaths.

To explain, look at a player or another creature with aura within 8 blocks and press the **Explain** key (unbound by default, see [Controls](Controls)), or use `/nen explain`. Stand still and keep talking for 3 seconds. You cannot use abilities while you do, your pace is held to a walk, and you hold an open hand. It is lost if you are hurt, attack, use a bow or similar, the target walks out of reach or dies, or you hide your aura (Zetsu or In). You cannot explain while meditating, in a drill, a trial, an exam or lying still after Second Beat.

When it works:

- The target **knows** that ability from then on (for 60 minutes of game time), so you cannot explain it to them again in that time. A player is told which ability, with its description.
- That ability hits that target 1.3 times as hard, from you only, for 5 minutes. A creature that bears aura, such as a Nen beast, takes half of the extra. A server restart ends it early, and so does either of you dying or logging out.
- The extra applies to that ability only. Techniques, infused gear and mob attacks never get it.

A Hatsu term called Told asks for this explanation: see [Laid Terms](Hatsu#laid-terms).

## Binding Word and the Geas

**Binding Word** is an ability of Specialists, given at Nen level 25. It costs half of your maximum aura, has a 10 minute cooldown and reaches 6 blocks. It offers another awakened player a **Geas**: a term the world enforces on them for a while. You pay a little aura each second to keep it (0.5 by default).

How it goes:

1. Look at the player, use Binding Word, pick a **term**, then how long it should last: 10, 30 or 60 minutes.
2. They get a dialog and have 30 seconds to accept or decline.
3. If you have just beaten them (they are under 30% health, and you hurt them in the last 10 seconds), they cannot decline, and the Geas lasts 10 minutes.

You cannot bind someone in a Nen-sealed zone or an exam, or when either of you is already bound. A refused or timed-out offer does not give the aura back.

| Term | The bound player may not |
| --- | --- |
| No Hatsu | Use abilities (techniques stay allowed). |
| No Harm | Hurt you or your allies, including with arrows and tridents. Thorns and a pet defending its owner do not count. |
| Stay Out | Set foot on the land of your nation. You are only offered this term if you have land. They are warned, then pushed out. |

**Breaking it.** The first attempt is refused with a warning. The second strikes: the Geas ends, they lose 30% of their aura and get 2 minutes of Vow Lockout. They always see the term, the time left and who laid it in the status screen.

A Geas also ends when its time is up, when you cannot pay the upkeep, when either of you dies, when you have been offline for 10 minutes, if you lose Specialization, or when you release it with `/nen geas release`. The bound player can be freed by an Exorcism or a Meditation Stone cleanse (see [Cursed Items](Cursed-Items)), with no penalty. It survives a server restart.

## Final Pledge

Nen level 40. The Final Pledge is one minute of enormous power, paid for with your whole build. You swear it in two steps, on purpose, and no command or other route can swear it for you.

1. Choose it in the vows screen. A warning page lists every cost with the server's numbers. Press **I understand**.
2. A button appears. **Hold** it (or Space) for 3 seconds. Letting go early does nothing.

It takes a player-wide vow slot, so by default you must first revoke a training or last oath you hold. You cannot swear it while meditating, in a drill, trial or exam, or lying still.

**For 60 seconds:**

- Your maximum aura and its regeneration are tripled, and your tank is filled.
- Your abilities are twice as strong (the cap on potency rises to 4 if it is lower) and recover in half the time.
- Nothing can Exhaust you: running out of aura still ends your abilities and techniques, but with no Exhaustion, no Overuse and no Vow Lockout. Nen Severed from an enemy still works.
- Your aura looks brighter and fiercer to everyone who can see it. Wrath and Second Beat do not work while it lasts.

**Then it ends, and you pay:**

- Your Nen is wiped as on a death that loses Nen. You keep your Nen type and your signature Hatsu (dormant until you awaken again), and lose your level, your abilities, your techniques, your other vows and your Hunter License.
- You are left at 1 health, and **Spent** (slower and weaker, like Slowness I and Weakness I) for 10 minutes by default.
- You cannot awaken again for 7 real days.

If you die during the pledge it is still counted as a wipe death, once. Logging out ends the pledge on the spot. You earn the **Everything I Had** advancement when you swear it. A server can turn it off with `finalPledgeEnabled`.

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
