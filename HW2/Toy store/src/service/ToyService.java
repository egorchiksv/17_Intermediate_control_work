package service;

import model.Toy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ToyService {
    private static PriorityQueue<Toy> prizeQueue = new PriorityQueue<>(Comparator.comparing(toy -> toy.getDropoutRateToy()));

    public static int[] createArrayId(String[] str1, String[] str2, String[] str3){
        int[] strId = new int[3];
        strId[0] = Integer.parseInt(str1[0]);
        strId[1] = Integer.parseInt(str2[0]);
        strId[2] = Integer.parseInt(str3[0]);
        return strId;
    }
    public static int[] createArrayDropoutRate(String[] str1, String[] str2, String[] str3){
        int[] strDropoutRate = new int[3];
        strDropoutRate[0] = Integer.parseInt(str1[1]);
        strDropoutRate[1] = Integer.parseInt(str2[1]);
        strDropoutRate[2] = Integer.parseInt(str3[1]);
        return strDropoutRate;
    }

    public static String[] createArrayName(String[] str1, String[] str2, String[] str3){
        String[] strName = new String[3];
        strName[0] = str1[2];
        strName[1] = str2[2];
        strName[2] = str3[2];
        return strName;
    }

    public static Toy createToy(int number, int[] strId, int[] strDropoutRate, String[] strName){
        Toy toy = new Toy(strId[number], strDropoutRate[number], strName[number]);
        return toy;
    }

    public static Toy getPrize(Toy toy1, Toy toy2, Toy toy3){
        prizeQueue.offer(toy1);
        prizeQueue.offer(toy2);
        prizeQueue.offer(toy3);
        try (PrintWriter printToy = new PrintWriter(new File("prizes.txt"))) {
            for (int i = 1; i <= 10; i++) {
                printToy.println("Попытка №" + i + ", выпал приз: " + getToy(toy1, toy2, toy3));
                System.out.println("Попытка №" + i + ", выпал приз: " + getToy(toy1, toy2, toy3));
            }
        }  catch (FileNotFoundException e) { e.printStackTrace(); }
        return null;
    }

    public static Toy getToy(Toy toy1, Toy toy2, Toy toy3){
        Random random = new Random();
        int totalDropoutRateToy = prizeQueue.stream().mapToInt(toy -> toy.getDropoutRateToy()).sum();
        int randomValue = random.nextInt(totalDropoutRateToy);
        int count = 0;
        for (Toy toy : prizeQueue) {
            count = toy.getDropoutRateToy();
            if (randomValue < count) {
                return toy;
            }
        }
        return null;
    }
}
