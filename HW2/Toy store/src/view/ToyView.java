package view;

import controller.ToyController;

import java.util.Arrays;
import java.util.Scanner;

public class ToyView {
    public static void start() throws Exception {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите 3 игрушки, которые будут разыгрываться в формате № вес название.\n(Например:\n" +
                    "1 2 конструктор\n2 2 робот\n3 6 кукла)");
        String[] str1 = scaner.nextLine().trim().split(" ");
        String[] str2 = scaner.nextLine().trim().split(" ");
        String[] str3 = scaner.nextLine().trim().split(" ");
        System.out.println(Arrays.toString(ToyController.createArrayId(str1, str2, str3)));
        System.out.println(Arrays.toString(ToyController.createArrayDropoutRate(str1, str2, str3)));
        System.out.println(Arrays.toString(ToyController.createArrayName(str1, str2, str3)));
    }

}
