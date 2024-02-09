package com.dydko.basic.old1;

import javax.mail.MessagingException;

public class TestMail {
    public static void main(String[] args) throws MessagingException {
        MonitoringMail monitoringMail=new MonitoringMail();
        monitoringMail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to,TestConfig.subject,TestConfig.messageBody,
        TestConfig.attachmentPath,TestConfig.attachmentName);
    }
}
