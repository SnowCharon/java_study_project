package myfilm.run;

import myfilm.bean.Business;
import myfilm.bean.Customer;
import myfilm.bean.Movie;
import myfilm.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author MOYU
 * @File JavaSE_Study-myfilm.run
 * @Date 2022/6/25 20:10
 **/
public class MovieSystem {
    /*
     定义系统的数据容器，用户存储数据
     1.存储很多用户（客户对象，商家对象）
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /**
    2.存储系统全部商家和其排片信息--键值对
     */
    public static Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    /**
     定义一个静态的Map集合存储电影的评分
     */
    public static final Map<String , List<Double>> MOVIES_SCORE = new HashMap<>();

    /*
     3.准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("竹玄羽");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies3); // b2 = []
    }

    public static final Scanner SCANNER = new Scanner(System.in);

    //定义静态的User类型变量，记住当前登陆成功的用户对象
    public static User loginUser;

    //给定时间戳的模板
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

    //日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");

    public static void main(String[] args) {

        showMain();
    }

    /**
     * 首页
     */
    private static void showMain() {
        while (true) {
            System.out.println("==========电影购票APP首页==========");
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家入驻");
            System.out.println("============================");

            System.out.println("请输入命令：");
            String command = SCANNER.nextLine();
            switch (command) {
                case "1":
                    //登录
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("命令有误，请重新输入！");
            }
        }
    }

    /**
     * 登录功能
     */
    private static void login() {
        while (true) {
            System.out.println("请输入登录名称：");
            String loginName = SCANNER.nextLine();
            System.out.println("请输入登录密码：");
            String passWord = SCANNER.nextLine();

            //1.根据登录名查询用户对象
            User user = getUserByLoginName(loginName);
            //2.判断用户对象是否存在
            if (user != null) {
                //3.如果存在检查密码
                if (passWord.equals(user.getPassWord())) {
                    //记住当前登录用户
                    loginUser = user;
                    LOGGER.info(loginUser.getUserName() + "登录系统！");
                    //登陆成功……
                    //判断是用户登录还是商家
                    if (user instanceof Customer) {
                        //当前登录的是用户
                        showCustomerMain();
                    } else {
                        //当前登录的是商家
                        showBusinessMain();
                    }
                    return;
                } else {
                    System.out.println("密码错误！");
                }
            } else {
                System.out.println("登录名称错误，请确认！");
            }
        }
    }

    /**
     * 商家的操作界面
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("============电影商家界面===================");
            LOGGER.info(loginUser.getUserName() + "进入电影商家界面！");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SCANNER.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "请您下次再来");
                    LOGGER.info("商家退出电影商家界面");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 客户的操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            LOGGER.info(loginUser.getUserName() + "进入客户界面！");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SCANNER.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    showMovie();
                    break;
                case "3":
                    // 评分功能
                    scoreMovie();
                    showAllMovies();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    private static void showMovie() {
        System.out.println("============购票界面===================");
        LOGGER.info(loginUser.getUserName() + "界面");
    }

    private static void scoreMovie() {
        // 1、查询当前登录成功的用户历史购买记录，看哪些电影是它可以评分的。
        Customer c = (Customer) loginUser;
        Map<String, Boolean> movies = c.getBuyMovies();
        if(movies.size() == 0 ){
            System.out.println("当前您没有看过电影，不能评价！");
            return;
        }

        // 买过了 ，看哪些电影是它可以评分的。
        movies.forEach((name, flag) -> {
            if(flag){
                System.out.println(name +"此电影已评价");
            }else {
                System.out.println("请您对：" + name +"进行打分（0-10）：");
                double score = Double.valueOf(SCANNER.nextLine());

                // 先根据电影名称拿到评分数据
                List<Double> scores = MOVIES_SCORE.get(name); // MOVIES_SCORE = [ 名称=[10] , ... ]
                if(scores == null){
                    // 说明此电影是第一次评价
                    scores = new ArrayList<>();
                    scores.add(score);
                    MOVIES_SCORE.put(name , scores);
                }else {
                    scores.add(score);
                }

                movies.put(name, true);
            }
        });
    }


    /**
     * 买票功能
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("============购票界面===================");
        LOGGER.info(loginUser.getUserName() + "进入买票界面");
        while (true) {
            System.out.println("请您输入需要买票的门店：");
            String shopName = SCANNER.nextLine();
            // 1、查询是否存在该商家。
            Business business = getBusinessByShopName(shopName);
            if(business == null){
                System.out.println("对不起，没有该店铺！请确认");
            }else {
                // 2、此商家全部的排片
                List<Movie> movies = ALL_MOVIES.get(business);
                // 3、判断是否存在上映的电影
                if(movies.size() > 0) {
                    // 4、开始进行选片购买
                    while (true) {
                        System.out.println("请您输入需要购买电影名称：");
                        String movieName = SCANNER.nextLine();
                        // 去当前商家下，查询该电影对象。
                        Movie movie = getMovieByShopAndName(business, movieName);
                        if(movie != null){
                            // 开始购买
                            while (true) {
                                System.out.println("请您输入要购买的电影票数：");
                                String number = SCANNER.nextLine();
                                int buyNumber = Integer.parseInt(number);
                                // 判断电影是否购票
                                if(movie.getNumber() >= buyNumber){
                                    // 可以购买了
                                    // 当前需要花费的金额
                                    double money = BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(buyNumber))
                                            .doubleValue();
                                    if(loginUser.getMoney() >= money){
                                        // 终于可以买票了
                                        System.out.println("您成功购买了"+ movie.getName() + buyNumber +
                                                "张票！总金额是：" + money);

                                        //记录买票
                                        LOGGER.info(loginUser.getUserName() + "购买了电影《" + movieName + "》的票数共" + buyNumber + "张，花费了" + money + "元！");

                                        // 更新自己的金额 更新商家的金额
                                        loginUser.setMoney(loginUser.getMoney() - money);
                                        business.setMoney(business.getMoney() + money);
                                        movie.setNumber(movie.getNumber() -  buyNumber);

                                        Customer c = (Customer) loginUser;
                                        // 记录购买电影的信息
                                        // 第一个参数是购买的电影，第二个参数是没有评价的标记！
                                        c.getBuyMovies().put(movie.getName(), false);

                                        return;// 结束方法
                                    }else {
                                        // 钱不够！
                                        System.out.println("是否继续~~");
                                        System.out.println("是否继续买票？y/n");
                                        String command = SCANNER.nextLine();
                                        switch (command) {
                                            case "y":
                                                break;
                                            default:
                                                System.out.println("好的！");
                                                return;
                                        }
                                    }
                                }else {
                                    // 票数不够
                                    System.out.println("您当前最多可以购买：" + movie.getNumber());
                                    System.out.println("是否继续买票？y/n");
                                    String command = SCANNER.nextLine();
                                    switch (command) {
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的！");
                                            return;
                                    }
                                }
                            }

                        }else {
                            System.out.println("电影名称有毛病~~");
                        }
                    }

                }else {
                    System.out.println("该电影院关门了~~~");
                    System.out.println("是否继续买票？y/n");
                    String command = SCANNER.nextLine();
                    switch (command) {
                        case "y":
                            break;
                        default:
                            System.out.println("好的！");
                            return;
                    }
                }
            }
        }

    }

    /**
     * 根据商家店铺名称查询商家
     * @param shopName 店铺名称
     */
    public static Business getBusinessByShopName(String shopName){
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)){
                return business;
            }
        }
        return null;
    }


    /**
     * 根据商家和电影名查找
     * @param business 商家
     * @param movieName 电影名
     * @return 返回一个电影
     */
    private static Movie getMovieByShopAndName(Business business, String movieName) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if(movie.getName().contains(movieName)){
                return movie;
            }
        }
        return null;
    }

    /**
     * 向用户展示所有商家的影片
     */
    private static void showAllMovies() {
        LOGGER.info(loginUser.getUserName() + "浏览全部影片！");
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone()
                    + "\t\t地址：" + business.getAddress());
            System.out.println("\t\t\t片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println("\t\t\t" + movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t"
                        + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + simpleDateFormat.format(movie.getStartTime()));
            }
        });
    }


    /**
     * 修改电影数据
     */
    private static void updateMovie() {
        System.out.println("============修改电影信息界面===================");
        LOGGER.info(loginUser.getUserName() + "进入修改电影信息界面！");
        //根据商家对象--即loginUser，获取Map集合的键，提取对应的值--排片信息
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        if (movies.size() == 0) {
            System.out.println("店铺尚未上架任何影片！");
            return;
        }

        while (true) {
            //输入需要修改的电影名称
            System.out.println("请输入要修改的电影名称：");
            String movieName = SCANNER.nextLine();

            //查询影片对象
            Movie movie = getMovieByName(movieName);
            if (movie == null) {
                System.out.println("您的店铺没有此影片！");
                System.out.println("是否重新输入：y/n");
                String ch = SCANNER.nextLine();
                switch (ch) {
                    case "y":
                        break;
                    default:
                        System.out.println("退出修改电影信息界面");
                        return;
                }
            } else {
                //正时修改
                System.out.println("请您输入修改后的片名：");
                String name = SCANNER.nextLine();
                System.out.println("请您输入修改后的主演：");
                String actor = SCANNER.nextLine();
                System.out.println("请您输入修改后的时长：");
                String time = SCANNER.nextLine();
                System.out.println("请您输入修改后的票价：");
                String price = SCANNER.nextLine();
                System.out.println("请您输入修改后的票数：");
                String totalNumber = SCANNER.nextLine(); // 200\n
                while (true) {
                    try {
                        System.out.println("请您输入影片放映时间：");
                        String startTime  = SCANNER.nextLine();
                        // public Movie(String name, String actor, double time, double price, int number, Date startTime)        // 封装成电影对象 ，加入集合movices中去
                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setTime(Double.parseDouble(time));
                        movie.setPrice(Double.parseDouble(price));
                        movie.setNumber(Integer.parseInt(totalNumber));
                        movie.setStartTime(simpleDateFormat.parse(startTime));

                        System.out.println("您已成功修改影片《" + movieName + "》");
                        System.out.println("您当前的店铺信息如下:");
                        showBusinessInfos();
                        LOGGER.info("商家修改影片《" + movieName + "》的信息");
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 下架电影
     */
    private static void deleteMovie() {
        System.out.println("============上架电影界面===================");
        LOGGER.info(loginUser.getUserName() + "进入下架电影界面！");
        //根据商家对象--即loginUser，获取Map集合的键，提取对应的值--排片信息
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        if (movies.size() == 0) {
            System.out.println("店铺尚未上架任何影片！");
            return;
        }

        while (true) {
            //输入需要下架的电影名称
            System.out.println("请输入要下架的电影名称：");
            String movieName = SCANNER.nextLine();

            //查询影片对象
            Movie movie = getMovieByName(movieName);
            if (movie == null) {
                System.out.println("您的店铺没有此影片！");
                System.out.println("是否重新输入：y/n");
                String ch = SCANNER.nextLine();
                switch (ch) {
                    case "y":
                        break;
                    default:
                        System.out.println("退出下架电影界面");
                        return;
                }
            } else {
                movies.remove(movie);
                System.out.println("您已成功下架影片《" + movieName + "》");
                System.out.println("您当前的店铺信息如下:");
                showBusinessInfos();
                LOGGER.info("商家下架影片《" + movieName + "》");
                return;
            }
        }
    }

    /**
     * 查询当前登录商家的店铺
     *
     * @param movieName 电影名
     * @return 返回
     */
    public static Movie getMovieByName(String movieName) {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }


    /**
     * 商家上架电影
     */
    private static void addMovie() {
        System.out.println("============上架电影界面===================");
        LOGGER.info(loginUser.getUserName() + "进入上架电影界面！");
        //根据商家对象--即loginUser，获取Map集合的键，提取对应的值--排片信息
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        System.out.println("请您输入新片名：");
        String name  = SCANNER.nextLine();
        System.out.println("请您输入主演：");
        String actor  = SCANNER.nextLine();
        System.out.println("请您输入时长：");
        String time  = SCANNER.nextLine();
        System.out.println("请您输入票价：");
        String price  = SCANNER.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber  = SCANNER.nextLine(); // 200\n

        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String startTime  = SCANNER.nextLine();
                // public Movie(String name, String actor, double time, double price, int number, Date startTime)        // 封装成电影对象 ，加入集合movices中去
                Movie movie = new Movie(name, actor ,Double.parseDouble(time) , Double.parseDouble(price)
                        , Integer.parseInt(totalNumber) , simpleDateFormat.parse(startTime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                LOGGER.info("商家上架了：《" + movie.getName() + "》");
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出了毛病");
            }
        }
    }

    /**
     * 展示当前商家的店铺信息
     */
    private static void showBusinessInfos() {
        System.out.println("============商家详情界面===================");
        LOGGER.info(loginUser.getUserName() + "进入商家详情界面！");
        //根据商家对象--即loginUser，获取Map集合的键，提取对应的值--排片信息
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone()
        + "\t\t地址：" + business.getAddress());
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() > 0){
            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t"
                        + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + simpleDateFormat.format(movie.getStartTime()));
            }
        }else {
            System.out.println("您的店铺未上架任何影片！");
        }
    }

    public static User getUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
            //判断登录名是否相同
            if (loginName.equals(user.getLoginName())) {
                return user;
            }
        }
        //查无此人
        return null;
    }
}
