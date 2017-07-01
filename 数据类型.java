/**
 * Created by town on 2017/7/1.
 */
public class 数据类型 {

    public static void main(String[] args) {
        byte foo = 122;
        System.out.println("你说\"int\"这个变量应该怎么用, 我想在这里换行\n你觉得怎么样");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);  //byte 占一个字节,8位
        System.out.println(Short.SIZE); //short占2个字节,16位
        System.out.println(Integer.SIZE);//int 占4个字节,32位
        System.out.println("==================");
        //类型转化--自动转化, 存储范围由小转大
        byte b = 1;
        int i = b;
        System.out.println("i = " + i);
        //类型转化--强制转化, 存储范围由大转小
        byte c = (byte)i;

        //精度小于int的计算时会自动转化为int来计算
        short s = 1;
        short s2 = 2;
        s = (short)(s+s2);  //两个short类型变量相加,默认会自动转化为int类型相加,所以要进行强转
        System.out.println(s);
        //精度大于int的计算时,int类型的1自动转换long进行计算
        long l = 1;
        l = l +1;
        System.out.println(l);

    }


}
