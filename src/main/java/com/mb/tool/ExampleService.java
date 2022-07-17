package com.mb.tool;

import com.mb.tool.model.annotation.Confidential;
import com.mb.tool.model.annotation.Log;
import com.mb.tool.model.constant.LogConstants;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @Log(suffix = "ExampleService")
    public void doSomeStuff(String plainData,
                            @Confidential String hiddenData,
                            @Confidential(level = LogConstants.CONFIDENTIAL_REMARK) String remarkedData) {
        System.out.println("plainData: " + plainData);
        System.out.println("hiddenData: " + hiddenData);
        System.out.println("remarkedData: " + remarkedData);
    }
}
