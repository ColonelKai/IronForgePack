package colonelkai.ironforgepack.localdeathmessage;

import colonelkai.ironforgepack.IronForgePack;
import colonelkai.ironforgepack.plugin.modules.Module;
import colonelkai.ironforgepack.plugin.modules.ModuleID;
import org.bukkit.event.Listener;
import org.mose.command.ArgumentCommand;

import java.util.List;

public class LocalDeathMessageModule implements Module {
    ModuleID moduleID = ModuleID.LOCALDEATHMESSAGE;

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
                new LocalDeathMessageListener()
        );
    }

    @Override
    public List<? extends ArgumentCommand> getCommands() {
        return null;
    }
}
