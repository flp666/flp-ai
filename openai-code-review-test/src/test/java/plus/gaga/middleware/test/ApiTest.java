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

        int sum = sum(10, 19);
        int mix = mix(10, 19);
        System.out.println(sum);
        System.out.println(mix);

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int mix(int a,int b){
        return a+b;
    }

}
