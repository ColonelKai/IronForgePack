package colonelkai.ironforgepack;

import colonelkai.ironforgepack.plugin.modules.Modules;
import org.bukkit.plugin.java.JavaPlugin;


public final class IronForgePack extends JavaPlugin {
    static IronForgePack self = null;
    public static java.util.logging.Logger logger;

    @Override
    public void onEnable() {
        IronForgePack.logger = this.getLogger();
        IronForgePack.self = this;
        enableModules();
    }

    private void enableModules() {
        Modules.set
                .forEach(module -> {
                    module.enable(this);
                    logger.info("Enabled Module: " + module.toString());
                        }
                    );
    }

    public static IronForgePack getSelf() {
        return self;
    }

}
