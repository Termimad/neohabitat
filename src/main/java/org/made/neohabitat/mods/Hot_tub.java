package org.made.neohabitat.mods;

import org.elkoserver.foundation.json.JSONMethod;
import org.elkoserver.foundation.json.OptInteger;
import org.elkoserver.json.EncodeControl;
import org.elkoserver.json.JSONLiteral;
import org.made.neohabitat.HabitatMod;

/**
 * Habitat Hot_tub Mod
 *
 * Hot_tubs don't have many behaviors, but yhey respond to HELP messages.
 * The are made of two parts, a forground one and a background one. You walk between them to get in.
 * Since this has no GO/WALK behavior, it is the client that routes the WALK message to the region.
 *
 * @author randy
 *
 */
public class Hot_tub extends HabitatMod {

    public int HabitatClass() {
        return CLASS_HOT_TUB;
    }

    public String HabitatModName() {
        return "Hot_tub";
    }

    public int capacity() {
        return 0;
    }

    public int pc_state_bytes() {
        return 0;
    };

    public boolean known() {
        return true;
    }

    public boolean opaque_container() {
        return false;
    }

    public boolean filler() {
        return false;
    }

    @JSONMethod({ "style", "x", "y", "orientation", "gr_state" })
    public Hot_tub(OptInteger style, OptInteger x, OptInteger y, OptInteger orientation, OptInteger gr_state) {
        super(style, x, y, orientation, gr_state);
    }

    @Override
    public JSONLiteral encode(EncodeControl control) {
        JSONLiteral result = super.encodeCommon(new JSONLiteral(HabitatModName(), control));
        result.finish();
        return result;
    }

}