package com.atlassian.flock.interfaces;

import com.atlassian.activeobjects.tx.Transactional;

/**
 * Created by imamudinnaseem on 3/29/18.
 */

@Transactional
public interface UserService {
    User add(String userId, String Name);
}
