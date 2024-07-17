package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:${os}.properties"
})
public interface DataConfig extends Config {
    @Key("userName")
    String userName();
    @Key("accessKey")
    String accessKey();

    @Key("device")
    String device();

    @Key("version")
    String version();
}
