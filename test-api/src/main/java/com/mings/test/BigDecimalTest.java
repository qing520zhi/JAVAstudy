package com.mings.test;


import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: BigDecimalTest
 * @author: mings
 * @description: TODO
 * @date: 2025/3/4 20:26
 * @version: 1.0
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.05");
        BigDecimal bd2 = new BigDecimal("0.06");
        // 加
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        // 减
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        // 乘
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        // 除法要注意：无限不循环小数会报错，需要再加两个参数，指定小数位数和取数模式
        BigDecimal bd6 = bd1.divide(bd2,5, RoundingMode.HALF_UP);
        BigDecimal bd7 = bd1.divide(bd2,5, RoundingMode.FLOOR);
        System.out.println(bd6);
        System.out.println(bd7);

    }
}
