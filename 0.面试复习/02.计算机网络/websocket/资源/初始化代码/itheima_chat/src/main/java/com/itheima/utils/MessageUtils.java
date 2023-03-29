package com.itheima.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.pojo.ResultMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * @version v1.0
 * @ClassName: MessageUtils
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class MessageUtils {

    public static String getMessage(boolean isSystemMessage,String fromName, Object message) {
        try {
            ResultMessage result = new ResultMessage();
            result.setIsSystem(isSystemMessage);
            result.setMessage(message);
            if(fromName != null) {
                result.setFromName(fromName);
            }
            ObjectMapper mapper = new ObjectMapper();

            return mapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
