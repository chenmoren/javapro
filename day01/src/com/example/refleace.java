package com.example;

import com.sun.corba.se.impl.protocol.giopmsgheaders.CancelRequestMessage_1_0;

public class refleace {
  static  int num = 10;

    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            Class cl = sb.getClass();

            // It returns an array of interfaces represented
            // by the class StringBuilder
            Class[] interfaces = cl.getInterfaces();
            String[] menthodnames= {"abc","bcd"};

            for (int i = 0; i < interfaces.length; ++i) {
                System.out.print("StringBuilder Interfaces: ");
                System.out.println(interfaces[i].toString());
            }
            System.out.println("string length"+menthodnames.length);
            System.out.println("num = "+ num);

        }

       public void show(){

        }



    }



