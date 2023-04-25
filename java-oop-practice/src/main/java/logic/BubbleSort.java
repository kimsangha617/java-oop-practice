package logic;

import java.util.ArrayList;
import java.util.List;

/*
 여러가지 자료형을 정렬했으면 좋겠다
 정렬할 수 있는 타입은 서료 비교가 가능하면 좋겠다
 무엇이 가벼운지 무거운지 비교하기 위해
 타입은 Generic 을 사용

 두 타입이 어느쪽이 크고작은가 비교하기 위해서 준비되어있는 class
 Comparable  있다
  */
public class BubbleSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<>(list);

        for(int i = output.size() - 1; i > 0 ; i--){
            for (int j = 0; j < i ; j++){
                if( output.get(j).compareTo(output.get(j+1)) > 0){
                    T temp = output.get(j);
                    output.set(j, output.get(j+1));
                    output.set(j + 1, temp);
                }
            }

        }
        return output;
    }


}
