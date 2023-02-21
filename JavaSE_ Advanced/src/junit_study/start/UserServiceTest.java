package junit_study.start;


import org.junit.*;

/**
 * @author MOYU
 * @File JavaSE_Study-junit_study.start
 * @Date 2022/6/26 16:44
 **/
public class UserServiceTest {
    //修饰实例方法
    @Before
    public void before() {
        System.out.println("====before执行了====");
    }

    @After
    public void after() {
        System.out.println("====after执行了====");
    }


    //修饰静态方法
    @BeforeClass
    public static void beforeClass() {
        System.out.println("====beforeClass执行了====");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("====afterClass执行了====");
    }


    /**
     * 单元测试类注意：
     * 1.公开的，无参数，无返回值的方法
     * 2.用@Test注解标注
     */
    @Test
    public void testLoginName() {
        UserService userService = new UserService();
        String rs = userService.loginName("admin", "123456");

        //进行预期结果的正确性测试：断言。
        Assert.assertEquals("您的程序登录功能可能出现BUG", "登录成功", rs);

    }

    @Test
    public void testSelectNames() {
        UserService userService = new UserService();
        userService.selectNames();
    }
}
