/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action.admin;

/**
 *
 * @author Dell India
 */
public class Test {

    public static void main(String[] args) {
        I1 a = b -> b % 2 == 0;
        System.out.println(a.checkMagic(5));
        System.out.println(a.checkMagic(5f));
    }
    

}

@FunctionalInterface
interface I1 {

    boolean checkMagic(int a);

    default boolean checkMagic(float a) {
        return true;
    }
}
