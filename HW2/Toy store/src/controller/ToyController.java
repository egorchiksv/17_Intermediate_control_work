package controller;

import service.ToyService;

import java.util.List;

public class ToyController {
    public static int[] createArrayId(String[] str1, String[] str2, String[] str3) throws Exception {
        return ToyService.createArrayId(str1, str2, str3);
    }

    public static int[] createArrayDropoutRate(String[] str1, String[] str2, String[] str3) throws Exception {
        return ToyService.createArrayDropoutRate(str1, str2, str3);
    }

    public static String[] createArrayName(String[] str1, String[] str2, String[] str3) throws Exception {
        return ToyService.createArrayName(str1, str2, str3);
    }
}
