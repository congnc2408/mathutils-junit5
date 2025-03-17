/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.congncTest.mathutil.core;

import static com.congnctest.mathutils.core.MathUtil.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author congnc
 */
public class MathUtilTest {
    
//    @Test
//    public void testGetFactorialGivenRightArgReturnWell(){
//        assertEquals(120, getFactorial(5));
//    }
    //chuan bi data
    public static Object[][] initData(){
        return new Integer[][]{
            {1,1},
            {2,2},
            {5,120},
            {6,720},
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData") // ten ham cung cap data, ngam dinh thu tu
    // cua cac phan tu mang, map vao tham so ham
    
    public void testGetFactorialGivenRightArgReturnWell(int input, long expected){
        assertEquals(expected, getFactorial(input));
    }
    
    @Test
    public void testGetFactorialGivenRightArgThrowException(){
        
        //Functional interface tên là Excutetable - có một hàm duy nhất không có code
        //tên là Executable
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                    getFactorial(-5);
//            }
//        };
      
//        Executable exObject = () ->{
//            getFactorial(-5);
//        };
         //assertThrows(IllegalArgumentException.class, exObject);
        assertThrows(IllegalArgumentException.class, () ->{
            getFactorial(-5);
        });
    }
}
