package com.sai.lendperfect.service.application;

import java.util.Map;

import javax.servlet.http.HttpSession;

public interface DigitalApplicationService {
	Map<String, Object> getData(Map<String, Object> requestParams, HttpSession session);
}
