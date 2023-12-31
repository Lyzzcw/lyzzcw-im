package lyzzcw.work.im.platform.common.domain.constant;


/**
 * implatform 常量
 *
 * @author lzy
 * @date 2023/12/29
 */
public class IMPlatformConstants {

    /**
     * 缓存数据默认10分钟过期
     */
    public static final Long DEFAULT_REDIS_CACHE_EXPIRE_TIME = 10L;

    /**
     * 大后端平台的用户key
     */
    public static final String PLATFORM_REDIS_USER_KEY = "platform:user:";

    /**
     * Session数据
     */
    public static final String SESSION = "session";

    /**
     * 风控前缀
     */
    public static final String RISK_CONTROL_KEY_PREFIX = "risk:control:";

    /**
     * AccessToken
     */
    public static final String ACCESS_TOKEN = "accessToken";

    public static String getKey(String prefix, String key){
        return prefix.concat(key);
    }
}
