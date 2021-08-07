package com.kevinkda.univ.course.web.job20200512.domain;

/**
 * @author Kevin KDA on 2020/5/12 14:15
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200512.domain
 * @classname Account
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Account {
    String userAcc;
    String sessionId;

    public Account() {
    }

    public Account(String userAcc, String sessionId) {
        this.userAcc = userAcc;
        this.sessionId = sessionId;
    }

    public String getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(String userAcc) {
        this.userAcc = userAcc;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
