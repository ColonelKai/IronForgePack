package colonelkai.ironforgepack.LightManager;

import colonelkai.ironforgepack.IronForgePack;
import colonelkai.ironforgepack.plugin.modules.Module;
import colonelkai.ironforgepack.plugin.modules.ModuleID;
import org.bukkit.event.Listener;

import java.util.List;

public class LightManagerModule implements Module {
    ModuleID moduleID = ModuleID.LIGHTMANAGER;

    @Override
    public void enable(IronForgePack ironforgepack) {
        Module.super.enable(ironforgepack);
    }

    @Override
    public void disable(IronForgePack ironforgepack) {

    }

    @Override
    public List<? extends Listener> getListeners() {
        return List.of(
                new LightManagerListener()
        );
    }
}