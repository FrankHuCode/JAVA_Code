package com.itheima.string;

/**
 * 目标：学会使用其他String的API
 */
public class StringOtherDemo3 {
    public static void main(String[] args) {
        //1.public int length():获取字符串的长度
        String name="我爱你中国love";
        System.out.println(name.length());

        //2.public char charAt(int index):获取某个索引为止处的字符
        char c=name.charAt(1);
        System.out.println(c);

        System.out.println("-----------遍历数组的元素------------");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.print(ch+", ");

        }
        //3.public char[] toCharArray():把字符串转换成字符数组
        System.out.println();
        char[] chars = name.toCharArray();//"我爱你中国love"=>'我','爱',...,'e'
        for (int i = 0; i < chars.length; i++) {
            char c1 = chars[i];
            System.out.println(c1+", ");

        }
        //4.public String substring(int beginIndex,int endIndex):截取内容，包前不包后
        String name2="Java是最厉害的编程语言";
        String sub = name2.substring(0, 9);
        System.out.println(sub);//Java是最厉害的
        String sub1=name2.substring(4,9);
        System.out.println(sub1);//是最厉害的

        //5.public String substring(int beginIndex):从当前索引一直截取到末尾
        String sub2 = name2.substring(4);
        System.out.println(sub2);//是最厉害的编程语言

        //6.Public String replace(charSequence target,CharSequence replace);
        //  将target的内容替换成replacement的内容
        String name3="金三胖是最厉害的80后，金三胖棒棒的！我好爱金三胖";
        String replace = name3.replace("金三胖", "***");
        System.out.println(replace);

        //7.public boolean contains(CharSequence s)
        //包含，文档中是否包含关键字
        boolean contains = name3.contains("金三胖");//true
        boolean contains1 = name3.contains("金二胖");//false
        System.out.println(contains);
        System.out.println(contains1);

        //8.public boolean startsWiths(String prefix)
        //判断某字符串是否为开头
        System.out.println(name3.startsWith("金三胖"));//true
        System.out.println(name3.startsWith("金二胖"));//false

        //9.public String[] split(String s):按照某个内容把字符串分割成字符串数组
        String name4="王宝强,贾乃亮,陈羽凡";
        String[] regex = name4.split(",");
        for (int i = 0; i < regex.length; i++) {
            System.out.println("选择了"+regex[i]);


        }
    }
}
