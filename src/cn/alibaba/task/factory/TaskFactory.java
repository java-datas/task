package cn.alibaba.task.factory;

import cn.alibaba.task.bo.Student;

/**
 * @author zhangkun
 * @create 2020-08-25 11:13 AM
 * @desc
 **/

public interface TaskFactory {

    /**
     * 执行任务
     */
    Boolean executeTask(Student student);

}
