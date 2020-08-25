package cn.alibaba.task.bo;

/**
 * @author zhangkun
 * @create 2020-08-25 11:56 AM
 * @desc 抽象学生
 **/

public abstract class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
