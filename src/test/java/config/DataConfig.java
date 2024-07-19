package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:properties/data.properties"
})
public interface DataConfig extends Config {
    @Key("userName")
    String userName();
    @Key("accessKey")
    String accessKey();
    @Key("url")
    String url();
}
