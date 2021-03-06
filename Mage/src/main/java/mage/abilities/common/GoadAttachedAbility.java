package mage.abilities.common;

import mage.abilities.Ability;
import mage.abilities.StaticAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.RestrictionEffect;
import mage.abilities.effects.common.combat.AttacksIfAbleAttachedEffect;
import mage.constants.AttachmentType;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.permanent.Permanent;

import java.util.UUID;

/**
 * @author TheElk801
 */
public class GoadAttachedAbility extends StaticAbility {

    public GoadAttachedAbility(Effect... effects) {
        super(Zone.BATTLEFIELD, null);
        for (Effect effect : effects) {
            this.addEffect(effect);
        }
        this.addEffect(new AttacksIfAbleAttachedEffect(
                Duration.WhileOnBattlefield, AttachmentType.AURA
        ).setText("and"));
    }

    private GoadAttachedAbility(final GoadAttachedAbility ability) {
        super(ability);
    }

    @Override
    public GoadAttachedAbility copy() {
        return new GoadAttachedAbility(this);
    }
}

class GoadAttackEffect extends RestrictionEffect {

    GoadAttackEffect() {
        super(Duration.WhileOnBattlefield);
        staticText = "is goaded. <i>(It attacks each combat if able and attacks a player other than you if able.)</i>";
    }

    private GoadAttackEffect(final GoadAttackEffect effect) {
        super(effect);
    }

    @Override
    public GoadAttackEffect copy() {
        return new GoadAttackEffect(this);
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        Permanent attachment = game.getPermanent(source.getSourceId());
        return attachment != null && attachment.getAttachedTo() != null
                && permanent.getId().equals(attachment.getAttachedTo());
    }

    @Override
    public boolean canAttack(Permanent attacker, UUID defenderId, Ability source, Game game, boolean canUseChooseDialogs) {
        if (defenderId == null) {
            return true;
        }
        return !defenderId.equals(source.getControllerId());
    }
}
