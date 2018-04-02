package com.atlassian.flock.context;
import com.atlassian.jira.plugin.webfragment.contextproviders.AbstractJiraContextProvider;
import com.atlassian.jira.plugin.webfragment.model.JiraHelper;
import com.atlassian.jira.user.ApplicationUser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by imamudinnaseem on 3/27/18.
 */
public class PanelContextProvider extends AbstractJiraContextProvider {

    @Override
    public Map getContextMap(ApplicationUser applicationUser, JiraHelper jiraHelper) {
        Map contextMap = new HashMap();
        contextMap.put("name", applicationUser.getUsername() + applicationUser.getEmailAddress() + applicationUser.getId() + applicationUser.getKey());
        return contextMap;
    }
}
