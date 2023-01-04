package org.camundapratice.simplebusinessprocess.services;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.springframework.stereotype.Service;

@Service("inputtingVariablesActivityService")
public class InputtingVariableTaskService {

    public void processOnCreateEvent(DelegateTask delegateTask) {
        delegateTask.setAssignee("admin");
    }

    public void processOnCompleteEvent(DelegateTask delegateTask) {
        delegateTask.setVariable("user_var", delegateTask.getVariable("input-variable-text-area"));
    }
}
