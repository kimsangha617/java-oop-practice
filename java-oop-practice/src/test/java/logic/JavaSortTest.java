package logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("자바소트 - 리스트 넣으면 정렬된 결과를 보여준다")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {

        //given
        JavaSort<Integer> javaSort = new JavaSort<>();
        //when
        List<Integer> actual = javaSort.sort(List.of(3,7,2,1,8,4,5));

        //then
        assertEquals(List.of(1,2,3,4,5,7,8),actual);

        System.out.println(actual);
    }

}