package com.twx.test;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import net.sf.json.JSONObject;

import com.twx.po.AccessToken;
import com.twx.util.WeixinUtil;

public class WeixinTest {
	public static void main(String[] args) throws KeyManagementException,
			NoSuchAlgorithmException, NoSuchProviderException {
		try {
			AccessToken token = WeixinUtil.getAccessToken();
			System.out.println("token:" + token.getToken());
			System.out.println("expiresIn:" + token.getExpiresIn());

			String filePath = "E:/develop/myeclipseWorkSpace/weixin/WebRoot/image/tang.jpg";
			String media_id = WeixinUtil.upload(filePath, token.getToken(),
					"thumb");
			System.out.println("media_id:" + media_id);

			String menu = JSONObject.fromObject(WeixinUtil.initMenu())
					.toString();
			int result = WeixinUtil.createMenu(token.getToken(), menu);
			if (result == 0) {
				System.out.println("创建菜单成功");
			} else {
				System.out.println("创建菜单失败");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
