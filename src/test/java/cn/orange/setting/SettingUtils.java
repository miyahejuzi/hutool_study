package cn.orange.setting;

import cn.hutool.setting.Setting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kz
 * @date 2019/11/27
 */
public class SettingUtils {

    @Test
    public void whenLoadSetting() {
        String path = "classpath:db.setting";
        Setting setting = new Setting(path, true);

        assertEquals("jdbc:mysql:///test?serverTimezone=GMT%2B8", setting.get("url"));
        assertEquals("com.mysql.cj.jdbc.Driver", setting.get("driverClassName"));
        assertEquals("root", setting.get("username"));
        assertEquals("123456", setting.get("password"));
    }


}
