package org.camundapratice.simplebusinessprocess.delegates.activity;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("processingVariableDelegate")
public class ProcessingVariableDelegate implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.info(String.format("Processed variable = %s", delegateExecution.getVariable("user_var")));
    }
}
