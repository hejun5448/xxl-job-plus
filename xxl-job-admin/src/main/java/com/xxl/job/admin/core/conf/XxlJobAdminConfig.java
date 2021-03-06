package com.xxl.job.admin.core.conf;

import com.xxl.job.admin.core.model.XxlJobTriggerReport;
import com.xxl.job.admin.dao.*;
import com.xxl.job.core.biz.AdminBiz;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * xxl-job config
 *
 * @author xuxueli 2017-04-28
 */
@Configuration
public class XxlJobAdminConfig implements InitializingBean{
    private static XxlJobAdminConfig adminConfig = null;
    public static XxlJobAdminConfig getAdminConfig() {
        return adminConfig;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        adminConfig = this;
    }

    // conf

    @Value("${xxl.job.mail.host}")
    private String mailHost;

    @Value("${xxl.job.mail.port}")
    private String mailPort;

    @Value("${xxl.job.mail.ssl}")
    private boolean mailSSL;

    @Value("${xxl.job.mail.username}")
    private String mailUsername;

    @Value("${xxl.job.mail.password}")
    private String mailPassword;

    @Value("${xxl.job.mail.sendNick}")
    private String mailSendNick;

    @Value("${xxl.job.i18n}")
    private String i18n;

    @Value("${xxl.job.accessToken}")
    private String accessToken;

    @Value("${xxl.job.maxErrorCountAlarm}")
    private int maxErrorCountAlarm;

    @Value("${xxl.job.trigger.log.retention.days}")
    private int triggerLogRetentionDays;
    // dao, service

    @Resource
    public XxlJobLogDao xxlJobLogDao;
    @Resource
    public XxlJobInfoDao xxlJobInfoDao;
    @Resource
    public XxlJobRegistryDao xxlJobRegistryDao;
    @Resource
    public XxlJobGroupDao xxlJobGroupDao;
    @Resource
    public XxlJobTriggerReportDao xxlJobTriggerReportDao;
    @Resource
    public AdminBiz adminBiz;


    public String getMailHost() {
        return mailHost;
    }

    public String getMailPort() {
        return mailPort;
    }

    public boolean isMailSSL() {
        return mailSSL;
    }

    public String getMailUsername() {
        return mailUsername;
    }

    public String getMailPassword() {
        return mailPassword;
    }

    public String getMailSendNick() {
        return mailSendNick;
    }

    public String getI18n() {
        return i18n;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public int getMaxErrorCountAlarm() {
        return maxErrorCountAlarm;
    }

    public XxlJobLogDao getXxlJobLogDao() {
        return xxlJobLogDao;
    }

    public XxlJobInfoDao getXxlJobInfoDao() {
        return xxlJobInfoDao;
    }

    public XxlJobRegistryDao getXxlJobRegistryDao() {
        return xxlJobRegistryDao;
    }

    public XxlJobGroupDao getXxlJobGroupDao() {
        return xxlJobGroupDao;
    }

    public XxlJobTriggerReportDao getXxlJobTriggerReportDao() {
        return xxlJobTriggerReportDao;
    }

    public AdminBiz getAdminBiz() {
        return adminBiz;
    }

    public int getTriggerLogRetentionDays() {
        return triggerLogRetentionDays;
    }
}
