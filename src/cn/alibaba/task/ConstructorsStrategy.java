package cn.alibaba.task;

import cn.alibaba.task.bo.Student;
import cn.alibaba.task.factory.TaskFactory;

/**
 * @author zhangkun
 * @create 2020-08-25 11:54 AM
 * @desc 构造者策略
 **/

public class ConstructorsStrategy {


    private Student student;//学生

    private TaskFactory taskFactory; //任务工厂

    public ConstructorsStrategy(Student student, TaskFactory taskFactory) {
        this.student = student;
        this.taskFactory = taskFactory;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



    /**
     * 完成任务
     */
    public Boolean completeTask() {
        return taskFactory.executeTask(student);
    }

}
