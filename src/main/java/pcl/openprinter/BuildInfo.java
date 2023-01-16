package pcl.openprinter;

import net.minecraft.launchwrapper.Launch;

/**
 * This file is automatically updated by Jenkins as part of the CI build script
 * in Ant. Don't put any pre-set values here.
 *
 * @author AfterLifeLochie, stolen from LanteaCraft, another fine PC-Logix Minecraft mod.
 */
public class BuildInfo {

    public static final String modName = "OpenPrinter";
    public static final String modID = "openprinter";

    public static final String versionNumber = "GRADLETOKEN_VERSION";
    
    @Deprecated
    public static final String buildNumber = "0";

    private BuildInfo() {}

    @Deprecated
    public static int getBuildNumber() {
        return 0;
    }

    public static boolean isDevelopmentEnvironment() {
        return (boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
    }
}
