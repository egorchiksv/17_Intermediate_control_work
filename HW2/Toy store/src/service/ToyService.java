package service;

import model.Toy;
import java.util.*;

public class ToyService {
    private static ArrayList<Toy> toys = new ArrayList<>();
    private static PriorityQueue<Toy> prize = new PriorityQueue<>(Comparator.comparing(toy -> toy.getDropoutRateToy()));

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

    public static Toy createToy(int number, int[] strId, int[] strDropoutRate, String[] strName){
        Toy toy = new Toy(strId[number], strDropoutRate[number], strName[number]);
        return toy;
    }

    public static Toy getPrize(Toy toy1, Toy toy2, Toy toy3) throws Exception {
//        for(int i = 0; i < 10; ++i) {
//            System.out.println(getToy(toy1, toy2, toy3));
//        }
        return null;
    }

    public static Toy getToy(Toy toy1, Toy toy2, Toy toy3) throws Exception {
        Random random = new Random();
        prize.offer(toy1);
        prize.offer(toy2);
        prize.offer(toy3);
        System.out.println(prize);
        int totalDropoutRateToy = prize.stream().mapToInt(toy -> toy.getDropoutRateToy()).sum();
        System.out.println(totalDropoutRateToy);
        int randomValue = random.nextInt(totalDropoutRateToy);
        int count = 0;
        for (Toy toy : prize) {
            count = toy.getDropoutRateToy();
            if (randomValue < count) {
                return toy;
            }
        }
        return null;
    }
}
