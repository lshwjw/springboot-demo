package com.example.demo;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.demo.model.User;

public class FastJsonTest {
	
	private static Log logger = LogFactory.getLog(FastJsonTest.class);

	@Test
	public void testFastJson() {
		User user = new User();
		user.setAge(0);
		String jsonString = JSONObject.toJSONString(user, SerializerFeature.WriteMapNullValue);
		logger.info(jsonString);
		Map<String, Object> map = JSON.parseObject(jsonString, new TypeReference<Map<String, Object>>(){});
		JSONObject jsonObject = (JSONObject) JSONObject.toJSON(map);
		logger.info(jsonObject);
	}
}
