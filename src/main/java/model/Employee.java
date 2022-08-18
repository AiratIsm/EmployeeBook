package model;

import util.Util;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Locale;

public class Employee {
    private long id;

    private String name;

    private String count;

    /*private LocalDateTime localDateTime;*/

    public Employee() {
    }

    public Employee(String name, String count) {
        long uniqueId = Util.uniqueId();
        System.out.println(String.format("Employee created with id - %s", uniqueId));
        this.id = uniqueId;
        this.name = name;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
