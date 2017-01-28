package org.made.neohabitat.mods;

import org.elkoserver.foundation.json.JSONMethod;
import org.elkoserver.foundation.json.OptInteger;
import org.elkoserver.json.EncodeControl;
import org.elkoserver.json.JSONLiteral;
import org.made.neohabitat.HabitatMod;


/**
 * Habitat Bush Mod (attached to an Elko Item.)
 *
 * @author steve
 */
public class Bush extends HabitatMod {

    public int		HabitatClass 	 () { return CLASS_BUSH; }
    public String	HabitatModName	 () { return "Bush"; }
    public int		capacity 		 () { return 0; }
    public int		pc_state_bytes 	 () { return 0; }
    public boolean	known 			 () { return true; }
    public boolean	opaque_container () { return false; }
    public boolean	filler 			 () { return false; }

    @JSONMethod({ "style", "x", "y", "orientation", "gr_state"})
    public Bush (OptInteger style, OptInteger x, OptInteger y,
                 OptInteger orientation, OptInteger gr_state) {
        super(style, x, y,  orientation, gr_state);
    }

    @Override
    public JSONLiteral encode(EncodeControl control) {
        JSONLiteral result = super.encodeCommon(new JSONLiteral(HabitatModName(), control));
        result.finish();
        return result;
    }

}