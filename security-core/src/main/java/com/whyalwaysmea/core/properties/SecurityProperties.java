package com.whyalwaysmea.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/18 15:20
 * @Description:
 */
@ConfigurationProperties(prefix = "my.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }


}
