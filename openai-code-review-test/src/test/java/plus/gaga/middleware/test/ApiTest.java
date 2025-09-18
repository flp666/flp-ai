package plus.gaga.middleware.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Test
    public void test() {
        System.out.println(Integer.parseInt("111"));

        int[] arr = {8,0,7,2,9};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[0]){
                arr[0] = arr[i];
            }
        }
        System.out.println(arr[0]);
    }

}
