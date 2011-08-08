package com.sailthru.client.params;

import java.lang.reflect.Type;
import com.sailthru.client.ApiAction;

/**
 *
 * @author Prajwal Tuladhar
 */
public interface ApiParams {
    public Type getType();

    public ApiAction getApiCall();
}
