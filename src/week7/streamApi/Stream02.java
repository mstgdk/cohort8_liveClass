package week7.streamApi;

import java.util.ArrayList;

public class Stream02 {
    //map
    //TASK-3: StreamAPI ile list elemanlarinin  cift olanlarının KARELERİNİ aynı satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers7(ArrayList<Integer> list){
        list
                .stream()
                .filter(StreamUtils::ciftBul)
                .map(t->t*t)
                .forEach(StreamUtils::yazdir);
    }
    //TASK-4: StreamAPI ile list elemanlarinin  tek elemanlarının  küplerinin bir fazlasinı aynı satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers8(ArrayList<Integer> list){
        list
                .stream()
                .filter(t->t%2!=0)
                .map(t->(t*t*t)+1)
                .forEach(StreamUtils::yazdir);
    }

}
