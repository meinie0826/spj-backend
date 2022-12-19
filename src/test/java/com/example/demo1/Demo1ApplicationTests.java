package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



@SpringBootTest
class Demo1ApplicationTests {
    @Test
    void test() throws IOException {
        Process p;

        String cmds = "python C:\\Users\\mzy\\Desktop\\spb\\demo1\\src\\test.py";

        try {
            //执行命令
            p = Runtime.getRuntime().exec(cmds);
            //获取输出流，并包装到BufferedReader中
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            while ((line = br.readLine()) != null) System.out.println(line);

            int exitValue = p.waitFor();
            System.out.println("进程返回值：" + exitValue);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
