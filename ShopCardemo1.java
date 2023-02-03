package com.itheima.demo;

import java.util.Scanner;

/**
 * 需求：模拟一个购物车
 */
public class ShopCardemo1 {
    public static void main(String[] args) {

        Goods[] shopCar = new Goods[100];

        while (true) {
            System.out.println("===============操作选项================");
            System.out.println("添加商品：add");
            System.out.println("查询商品信息：query");
            System.out.println("修改商品信息：update");
            System.out.println("结算商品：pay");

            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入要进行的操作：");
            String command = sc.next();
            switch (command) {
                //添加商品到购物车
                case "add":
                    addGoods(shopCar, sc);
                    break;
                //查询购物车的商品的信息
                case "query":
                    queryGoods(shopCar);
                    break;
                //修改购物车的商品信息
                case "update":
                    updateGoods(shopCar,sc);
                    break;
                //结算中心
                case "pay":
                    pay(shopCar);
                    break;
                //输入错误
                default:
                    System.out.println("您输入错误，请重新输入：");
                    break;
            }
        }
    }

    private static void pay(Goods[] shopCar) {
        queryGoods(shopCar);
        double money=0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if(g!=null){
                money+=(g.price*g.buyNumber);
            }else {
                break;
            }
        }
        System.out.println("商品的总金额是："+money);
    }

    private static void updateGoods(Goods[] shopCar,Scanner sc) {
        //获取商品的id
        while (true) {
            System.out.println("请输入商品的id：");
            int id=sc.nextInt();
            Goods g=getGoodsById(shopCar,id);
                if(g==null){
                    System.out.println("对不起，该商品不存在~");
                }else {
                    System.out.println("请输入修改商品名称：");
                    String name=sc.next();
                    g.name=name;
                    System.out.println("请输入修改商品"+g.name+"的价格：");
                    double price=sc.nextDouble();
                    g.price=price;
                    System.out.println("请输入修改商品"+g.name+"的数量：");
                    int buyNumber=sc.nextInt();
                    g.buyNumber=buyNumber;
                    System.out.println("商品价格已经修改完成~~");
                    queryGoods(shopCar);
                    break;
                }
        }
    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                if (g.id == id) {
                    return g;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    private static void queryGoods(Goods[] shopCar) {
        System.out.println("=================查询商品的信息================");
        System.out.println("id\t\t名称\t\t\t价格\t\t\t\t\t数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println(g.id + "\t\t" + g.name + "\t\t\t" + g.price + "\t\t\t\t\t" + g.buyNumber);
            } else {
                break;
            }
        }
    }

    private static void addGoods(Goods[] shopCar, Scanner sc) {
        //1.输入商品的信息
        System.out.println("请您输入商品的id：");
        int id = sc.nextInt();
        System.out.println("请您输入商品的名称：");
        String name = sc.next();
        System.out.println("请您输入商品的价格：");
        double price = sc.nextDouble();
        System.out.println("请您输入需要购买的商品数量：");
        int buyNumber = sc.nextInt();

        //2.录入商品的信息到购物车中
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        //3.添加到购物车
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;//购物车为空可以添加商品信息,不需要再找位置
            }
        }
        System.out.println("您的商品" + g.name + "已经添加到购物车~");
    }
}
