package com.example;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * @author renfurui
 * @create -09-27-22:10
 */
public class test {
    public static void main(String[] args) {
//        int[] scores = new int[] { 88, 77, 51, 66 };
//        Score s = new Score(scores);
//        s.printScores();
//        scores[2] = 99;
//        s.printScores();
//        SecureRandom sr = null;
//        try {
//            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
//        } catch (NoSuchAlgorithmException e) {
//            sr = new SecureRandom(); // 获取普通的安全随机数生成器
//        }finally {
//            System.out.println("okkkk");
//        }
//        byte[] buffer = new byte[16];
//        sr.nextBytes(buffer); // 用安全随机数填充buffer
//        System.out.println(Arrays.toString(buffer));
//    }
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void process2() {
        throw new NullPointerException();
    }
}


 class Score {
    private int[] scores;

    public Score(int[] scores) {
        this.scores = scores.clone();
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
