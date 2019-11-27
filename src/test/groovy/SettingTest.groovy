import cn.hutool.setting.Setting
import spock.lang.Specification

/**
 * Spock主要提供了如下基本构造块：
 *
 * where: 以表格的形式提供测试数据集合
 * when: 触发行为，比如调用指定方法或函数
 * then: 做出断言表达式
 * expect: 期望的行为，when-then的精简版
 * given: mock单测中指定mock数据
 * thrown: 如果在when方法中抛出了异常，则在这个子句中会捕获到异常并返回
 * def setup() {} ：每个测试运行前的启动方法
 * def cleanup() {} : 每个测试运行后的清理方法
 * def setupSpec() {} : 第一个测试运行前的启动方法
 * def cleanupSpec() {} : 最后一个测试运行后的清理方法
 *
 * @author kz* @date 2019/11/27
 */
class SettingTest extends Specification {

    def "when load db setting"() {
        given:
        def setting = new Setting("classpath:db.setting", true)
        expect:
        setting.get("url") == "jdbc:mysql:///test?serverTimezone=GMT%2B8"
        setting.get("driverClassName") == "com.mysql.cj.jdbc.Driver"
        setting.get("username") == "root"
        setting.get("password") == "123456"
    }

}
