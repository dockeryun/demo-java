package com.wanshifu

import com.wanshifu.framework.test.GroovySpockBaseTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2018/6/4.
 * Version v1.0
 */
@ContextConfiguration(classes = [DemoJavaApplication])
@SpringBootTest(classes = [DemoJavaApplication])
@ActiveProfiles("test-case")
class DemoJavaAppTest extends GroovySpockBaseTest {

}