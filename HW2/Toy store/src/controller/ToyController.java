package controller;

import model.Toy;
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

    public static Toy createToy(int number, int[] strId, int[] strDropoutRate, String[] strName){
        return ToyService.createToy(number, strId, strDropoutRate, strName);
    }

    public static Toy getToy(Toy toy1, Toy toy2, Toy toy3) throws Exception {
        return ToyService.getPrize(toy1, toy2, toy3);
    }
}
