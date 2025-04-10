package com.sai.lendperfect.controller.digital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sai.lendperfect.service.application.DigitalApplicationService;
import com.sai.lendperfect.service.application.DigitalCpService;
import com.sai.lendperfect.service.application.UsersService;
import com.sai.lendperfect.util.Helper;
import com.sai.lendperfect.util.StpConstants;

@RestController
@RequestMapping(value = "/digitalapplication")
@CrossOrigin
public class DigitalApplicationRestController {

@Autowired
DigitalApplicationService digitalApplicationService;

@Autowired
DigitalCpRestController digitalCpRestController;

@Autowired
DigitalCpService digitalCpService;

boolean idorFlagGlobal;
@Autowired
UsersService usersService;	
@RequestMapping(value="/getData",method=RequestMethod.POST)
public ResponseEntity<Map<String,Object>> getData(@RequestBody Map<String, Object> requestParams,HttpSession session){
			Map<String, Object> responseMap = digitalApplicationService.getData(requestParams, session);
			return new ResponseEntity<Map<String, Object>>(responseMap, HttpStatus.OK);
}
}



