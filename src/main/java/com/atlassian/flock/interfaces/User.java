package com.atlassian.flock.interfaces;
import net.java.ao.Entity;
import net.java.ao.Preload;

/**
 * Created by imamudinnaseem on 3/29/18.
 */


@Preload
public interface User extends Entity {
    String getUserId();
}
