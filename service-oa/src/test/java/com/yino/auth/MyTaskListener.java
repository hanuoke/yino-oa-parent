package com.yino.auth;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * ClassName: MyTaskListener
 * Package: com.yino.auth
 * Description:
 */
public class MyTaskListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        if(delegateTask.getName().equals("经理")){
            //这里指定任务负责人
            delegateTask.setAssignee("zhangsan");
        } else if(delegateTask.getName().equals("人事")){
            //这里指定任务负责人
            delegateTask.setAssignee("lisi");
        }
    }
}