package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:properties/android.properties"
})
public interface DeviceConfig extends Config {
    @Key("platformName")
    String platformName();
    @Key("device")
    String device();
    @Key("version")
    String version();
   @Key("browserstackApp")
    String app();
}
