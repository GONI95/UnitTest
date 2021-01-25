package com.example.unittest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Example calculator;

    // 테스트 시작 전 사전에 진행되야할 정의에 해당
    @Before
    public void setUp() {
        calculator = new Example();
    }

    // 비포 완료 시 실제 코드 테스트를 진행
    @Test
    public void addTest() {
        int result = calculator.add(15,10);
        assertEquals(25, result);
    }

    // 테스트 수행시간 지정
    @Test(timeout = 1000)
    public void subtractTest() {
        int result = calculator.subtract(15,10);
        assertEquals(53, result);
    }
}
