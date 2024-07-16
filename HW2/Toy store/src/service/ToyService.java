package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToyService {
    public static int[] createArrayId(String[] str1, String[] str2, String[] str3) throws Exception{
        int[] strId = new int[3];
        try {
        strId[0] = Integer.parseInt(str1[0]);
        strId[1] = Integer.parseInt(str2[0]);
        strId[2] = Integer.parseInt(str3[0]);
        } catch (Exception e) {
            System.out.println("Введен не верный формат данных игрушки");
        }
        return strId;
    }
    public static int[] createArrayDropoutRate(String[] str1, String[] str2, String[] str3) throws Exception{
        int[] strDropoutRate = new int[3];
        try {
            strDropoutRate[0] = Integer.parseInt(str1[1]);
            strDropoutRate[1] = Integer.parseInt(str2[1]);
            strDropoutRate[2] = Integer.parseInt(str3[1]);
        } catch (Exception e) {
            System.out.println("Введен не верный формат данных игрушки");
        }

        return strDropoutRate;
    }

    public static String[] createArrayName(String[] str1, String[] str2, String[] str3) throws Exception{
        String[] strName = new String[3];
        try {
        strName[0] = str1[2];
        strName[1] = str2[2];
        strName[2] = str3[2];
        } catch (Exception e) {
            System.out.println("Введен не верный формат данных игрушки");
        }
        return strName;
    }
}
