package com.example;


import com.sun.prism.impl.Disposer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author renfurui
 * @create -09-28-14:25
 */
public class Str {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
       System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }
    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT INTO ").append(table).append(" ").append(Arrays.toString(fields).replace("[","(")
                .replace("]",")")).append(" VALUES (?, ?, ?)");
        return sb.toString();
    }

    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        String prefix = "SELECT ";
        String suffix = " FROM " + table;
        StringJoiner sql = new StringJoiner(", ", prefix, suffix);
        for (String field : fields) {
            sql.add(field);
        }
        return sql.toString();
    }
}


