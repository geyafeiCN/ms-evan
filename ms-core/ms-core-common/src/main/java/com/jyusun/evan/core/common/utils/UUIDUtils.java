package com.jyusun.evan.core.common.utils;

import java.util.UUID;
/**
 * 作用描述：
 * - 用于生成处理后的UUID
 *
 * @author JyuSun at 2019/1/3 11:26
 * @version 1.0.0
 */
public class UUIDUtils {


    /**
     * <p>功能描述：</p>
     * <p>  - 返回32位的UUID </p>
     *
     * @return 32位的UUID
     * @author JyuSun at 2019/1/3 17:27
     */
    public static String generateUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    /**
     * <p>功能描述：</p>
     * <p>  - 返回8位计算后的UUID,可能有概率会重复，需要配合其他的数据使用</p>
     *
     * @return a
     * @author JyuSun at 2019/1/3 17:27
     */
    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }

    public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "SnowFlake", "U", "V",
            "W", "X", "Y", "Z" };

}