/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.filter.predicate.other;

import mage.cards.Card;
import mage.cards.SplitCard;
import mage.filter.predicate.Predicate;
import mage.game.Game;

/**
 * @author North
 */
public class CardTextPredicate implements Predicate<Card> {

    private final String text;
    private final boolean inNames;
    private final boolean inTypes;
    private final boolean inRules;

    public CardTextPredicate(String text, boolean inNames, boolean inTypes, boolean inRules) {
        this.text = text;
        this.inNames = inNames;
        this.inTypes = inTypes;
        this.inRules = inRules;
    }

    @Override
    public boolean apply(Card input, Game game) {
        if (text.isEmpty()) {
            return true;
        }
        // first check in card name
        if (inNames && input.getName().toLowerCase().contains(text.toLowerCase())) {
            return true;
        }

        //separate by spaces
        String[] tokens = text.toLowerCase().split(" ");
        boolean found = false;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                // then try to find in rules
                if (inRules) {
                    if (input.isSplitCard()) {
                        found = ((SplitCard) input).getLeftHalfCard().getRules(game).stream().anyMatch(rule -> rule.toLowerCase().contains(token.toLowerCase()));
                        found |= ((SplitCard) input).getRightHalfCard().getRules(game).stream().anyMatch(rule -> rule.toLowerCase().contains(token.toLowerCase()));

                    } else {
                        found = input.getRules(game).stream().anyMatch(rule -> rule.toLowerCase().contains(token.toLowerCase()));
                    }
                }
                if (inTypes) {
                    found |= input.getSubtype(game).stream().anyMatch(s -> s.toString().equalsIgnoreCase(token));
                    found |= input.getSuperType().stream().anyMatch(s -> s.toString().equalsIgnoreCase(token));
                }
            }
            if (found) {
                break;
            }

        }

        return found;
    }

    @Override
    public String toString() {
        return "CardText(" + text + ')';
    }
}
