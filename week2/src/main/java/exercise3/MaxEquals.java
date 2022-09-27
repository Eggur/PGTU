package exercise3;

import java.util.Arrays;

public class MaxEquals {
    public static void main(String[] args) {

        int[] arr = {2,5,8,555,654,321,654};
        findMaxEquals(arr);
    }
    private static void findMaxEquals(int[] arr){
        int maxValue = arr[0];
        int equalsValue = arr[0];
        /*
          т.к. в массиве должен быть как минимум один элемент
          значение equalsAmount должно быть равно 1
        */
        int equalsAmount = 1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
            for (int x = i + 1; x < arr.length; x++){
                if (arr[i] == arr[x]){
                    arr[x] = equalsAmount;
                    equalsAmount++;
                }
            }
        }
        System.out.println(maxValue + " " + equalsAmount);
        /*
           описание другого варианта с небольшими поправками:
           значение equalsAmount остается 0 и при выводе в консоль будет другой текст
           sout(maxValue + " количество найденных элементов равных maxValue: " + equalsAmount);
         */
    }

    }
