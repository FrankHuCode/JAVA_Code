package com.itheima.atmsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * ATM系统入口类
 */
public class ATMDemo {
    public static void main(String[] args) {
        //1.定义账户类
        //2.定义一个集合容器，负责以后存储全部的账户对象，进行相关的业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        //3.展示系统的首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=================黑马ATM系统=====================");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");

            System.out.println("请您选择操作：");
            int command = sc.nextInt();

            switch ((command)) {
                case 1:
                    //用户登录操作
                    login(accounts, sc);
                    break;
                case 2:
                    //账户开户操作(Alt+Enter)
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作命令错误~~");
                    break;
            }
        }
    }

    /**
     * 登录功能
     *
     * @param accounts 全部账户的集合
     * @param sc       扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===============系统登录操作================");
        //1.先判断账户集合中是否存在账户，不存在需要先注册账户
        if (accounts.size() == 0) {
            System.out.println("对不起，系统还没有账户，请先注册账户再登录~~");
            return;//卫语言风格，解决执行返回
        }

        //2.正式登录操作
        while (true) {
            System.out.println("请输入您的登录卡号：");
            String cardId = sc.next();
            //3.判断卡号是否存在，存在进行输入密码
            Account acc = getAccountByCarId(accounts, cardId);
            if (acc != null) {//卡号存在
                //4.用户输入密码，进行判断
                while (true) {
                    System.out.println("请您输入账户密码：");
                    String password = sc.next();
                    //判断系统存储的密码与用户输入密码是否一致
                    if (acc.getPassword().equals(password)) {//登录成功
                        System.out.println("登录成功！尊敬的" + acc.getUserName() + "先生/女士，您的账户卡号是：" + acc.getCardId());
                        //登录页面
                        showUserOperating(acc, sc, accounts);
                        return;//退出当前的方法执行，返回系统首页
                    } else {//输入密码有误
                        System.out.println("对不起！您输入的密码错误，请重新输入：");
                    }
                }
            } else {//卡号不存在账户集合中
                System.out.println("对不起！该账户卡号不存在，请您重新输入卡号~~");
            }
        }

    }

    private static void showUserOperating(Account acc, Scanner sc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("==============用户操作页面===================");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转帐");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账号");
            System.out.println("请输入您的选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询账户
                    queryAccount(acc);
                    break;
                case 2:
                    //存款
                    depositAccount(acc, sc);
                    break;
                case 3:
                    //取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    //转账
                    transferMoney(acc, accounts, sc);
                    break;
                case 5:
                    //修改密码
                    updatePassword(acc, sc);
                    return;
                case 6:
                    //退出
                    System.out.println("退出成功，欢迎下次光临！");
                    return;//退出当前方法的执行，返回系统登录操作页面

                case 7:
                    //注销账户
                    if (deleteAccount(acc, sc, accounts)) {
                        return;
                    } else {
                        break;
                    }
                default:
                    System.out.println("您的输入错误，请重新选择：");
                    break;
            }
        }
    }

    /**
     * 账户注销功能
     *
     * @param acc      当前账户对象
     * @param sc       扫描器
     * @param accounts 账户对象集合
     * @return true | false
     */
    private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("================用户注销账户================");
        System.out.println("您确认注销账户吗？Y/N");
        String result = sc.next();
        switch (result) {
            case "Y":
            case "y":
                System.out.println("请输入账户密码：");
                String password = sc.next();
                if (password.equals(acc.getPassword())) {
                    System.out.println("账户："+acc.getUserName()+"\n卡号："+acc.getCardId()+"\n已注销，正在返回登录首页...");
                    accounts.remove(acc);
                    return true;
                } else {
                    System.out.println("您输入密码不正确，无法注销账户~~");
                    break;
                }
            default:
                System.out.println("好的，当前账户保留~~");
                break;
        }
        return false;
    }

    /**
     * 账户修改密码功能
     *
     * @param acc 当前登录账户对象
     * @param sc  扫描器
     */
    private static void updatePassword(Account acc, Scanner sc) {
        System.out.println("================用户密码修改================");
        while (true) {
            System.out.println("请您输入当前密码：");
            String password = sc.next();
            if (password.equals(acc.getPassword())) {
                //可以输入修改的密码
                while (true) {
                    System.out.println("请您输入密码：");
                    String password1 = sc.next();

                    System.out.println("请您确认输入密码：");
                    String password2 = sc.next();
                    if ((password1.equals(password2))) {
                        acc.setPassword(password2);
                        System.out.println("修改密码成功，请用新密码登录~~");
                        return;
                    } else {
                        System.out.println("您输入的两个密码不一致，请重新修改密码：");
                    }
                }
            } else {
                System.out.println("对不起！您输入的密码不正确，请重新输入：");
            }
        }

    }

    /**
     * 转账功能
     *
     * @param acc      当前账户对象
     * @param accounts 全部账户对象的集合
     * @param sc       扫描器
     */
    private static void transferMoney(Account acc, ArrayList<Account> accounts, Scanner sc) {
        System.out.println("================用户转账操作================");
        if (accounts.size() < 2) {
            System.out.println("对不起，当前账户系统不足2个账户，请先去开户~~");
            return;
        }
        if (acc.getMoney() < 10) {
            System.out.println("对不起，您的账户没有钱，请先存款再进行操作~~");
            return;
        }
        //开始转账
        while (true) {
            System.out.println("请您输入对方账户卡号：");
            String cardId = sc.next();
            Account account = getAccountByCarId(accounts, cardId);//得到对方账户对象

            if (cardId.equals(acc.getCardId())) {
                System.out.println("不好意思，您不能给自己账户转账~~");
                continue;
            }

            if (account != null) {
                //对方卡号存在账户集合中
                while (true) {
                    System.out.println("请您输入转账金额：");
                    double money = sc.nextDouble();
                    if (money > acc.getMoney()) {
                        System.out.println("对不起，您输入金额超出余额，您当前余额：￥" + acc.getMoney() + "元。");
                    } else {
                        //可以进行转账
                        //验证姓氏
                        while (true) {
                            String tip = "*" + (account.getUserName()).substring(1);
                            System.out.println("对方账户身份信息：[" + tip + "]");
                            System.out.println("请输入对方账户的姓氏：");
                            String preName = sc.next();
                            //判断对方姓氏
                            if (account.getUserName().startsWith(preName)) {
                                acc.setMoney(acc.getMoney() - money);
                                account.setMoney(account.getMoney() + money);
                                System.out.println("转账成功，请注意查收信息！");
                                queryAccount(acc);
                                return;
                            } else {
                                System.out.println("对不起，您输入的验证身份信息错误，请重新输入~~");
                            }
                        }
                    }
                }
            } else {
                System.out.println("对不起，您输入的对方账户卡号不存在，请重新输入~~");
            }
        }
    }

    /**
     * 用户取款功能
     *
     * @param acc 当前账户对象
     * @param sc  扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("================用户取款操作================");

        //判断卡内余额
        if (acc.getMoney() < 100) {
            System.out.println("对不起，您的余额不足￥100元！");
            return;
        }
        //判断取款与余额大小
        while (true) {
            //提示用户输入取款金额
            System.out.println("请输入您的取款金额：");
            double money = sc.nextDouble();
            //取款金额大于余额
            if (money > acc.getMoney()) {
                System.out.println("对不起！余额不足，您的余额是：￥" + acc.getMoney() + "元。");
            } else {
                //取款金额大于每日取款额度
                if (money > acc.getQuotaMoney()) {
                    System.out.println("您的取款金额超出每次额度：￥" + acc.getQuotaMoney() + "元。");
                } else {
                    //取款成功，账户余额减少，打印账户信息，并返回上一页
                    acc.setMoney(acc.getMoney() - money);
                    System.out.println("恭喜您！取款成功，本次取款金额：￥" + money + "元。");
                    queryAccount(acc);
                    return;//退出当前方法，返回用户操作页面
                }
            }
        }
    }

    /**
     * 用户存款功能，成功并展示信息
     *
     * @param acc 当前账户对象
     * @param sc  扫描器
     */
    private static void depositAccount(Account acc, Scanner sc) {
        System.out.println("===============用户存款操作=================");
        System.out.println("请输入您的存款金额：￥");
        double money = sc.nextDouble();
        acc.setMoney(acc.getMoney() + money);
        System.out.println("恭喜您！存款成功，请您确认！");
        queryAccount(acc);
    }

    /**
     * 展示当前账户的信息
     *
     * @param acc 账户对象
     */
    private static void queryAccount(Account acc) {
        System.out.println("==================账户信息==================");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("用户名：" + acc.getUserName());
        System.out.println("余额：￥" + acc.getMoney());
        System.out.println("每次额度：￥" + acc.getQuotaMoney());

    }

    /**
     * 用户开户功能的实现
     *
     * @param accounts 全部账户的集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=============系统开户操作==============");
        //1.创建一个账户对象，用于后期封装账户信息
        Account account = new Account();
        //2.录入当前这个账户的信息，注入到账户对象中取
        //用户名
        System.out.println("请您输入账户用户名：");
        String userName = sc.next();
        account.setUserName(userName);
        //密码
        while (true) {
            System.out.println("请您输入账户密码：");
            String password1 = sc.next();
            System.out.println("请您再次输入账户密码：");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                //密码认证通过，可以注入给账户对象
                account.setPassword(password2);
                break;//密码已经录入成功，不需要再循环
            } else {
                System.out.println("对不起，您输入的两次密码不一致，请重新输入~~");
            }
        }
        //确定每日取现额度
        System.out.println("请您输入账户每次额度：￥");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        //卡号
        //为账户随机1个8位且与其他账户卡号不重复的号码（独立功能，创建方法实现）
        String carId = getRandomCarId(accounts);
        account.setCardId(carId);

        //3.把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println("恭喜您！" + userName + "先生/女士，您已经成功注册账户：" + carId + "~~请妥善保管您的卡号。");
    }

    /**
     * 为账户生成8位唯一性的卡号
     *
     * @return 返回的卡号
     */
    private static String getRandomCarId(ArrayList<Account> accounts) {
        //1.先生成8位数字
        Random r = new Random();
        while (true) {
            String cardId = "";
            //随机生成8个数字
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);//把数字加到cardId字符串中
            }
            //2.判断这个8位的卡号是否与其他账号的卡号相同
            Account acc = getAccountByCarId(accounts, cardId);
            if (acc == null) {
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询出一个账户对象出来
     *
     * @param accounts 全部账户的集合
     * @param cardId   卡号
     * @return 账户对象 | null
     */
    private static Account getAccountByCarId(ArrayList<Account> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;//返回已经注册的卡号，不能当作新卡号，但可以作为登录使用
            }
        }
        return null;//查无此卡号，可以作为新卡号使用
    }
}

