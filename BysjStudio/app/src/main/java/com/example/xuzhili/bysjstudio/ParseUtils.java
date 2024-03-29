package com.example.xuzhili.bysjstudio;

import com.example.xuzhili.bysjstudio.util.LogUtil;
import com.google.gson.Gson;

import java.lang.reflect.Type;

public class ParseUtils {
	private static Gson gson = new Gson();

	public static Object Gson2Object(String json, Type tp) {
		try {
			return gson.fromJson(json, tp);
		} catch (Exception e) {
			e.printStackTrace();
			LogUtil.e(ParseUtils.class, "ParseUtils 解析失败", 15);
			return null;
		}
	}

	public static String Object2Json(Object json) {
		try {
			return gson.toJson(json);
		} catch (Exception e) {
			e.printStackTrace();
			LogUtil.e(ParseUtils.class, "ParseUtils 转化失败", 27);
			return null;
		}
	}
}
