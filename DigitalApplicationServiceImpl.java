package com.sai.lendperfect.service.application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sai.lendperfect.util.Helper;
import ch.qos.logback.classic.Logger;

@Transactional
@Service("DigitalApplicationService")
@Component
public class DigitalApplicationServiceImpl implements DigitalApplicationService {
	@Override
	public Map<String, Object> getData(Map<String, Object> requestParams, HttpSession session) {
		Map<String,Object> responseMap=new HashMap<String,Object>();
		try
		{
			List<String> hight = Arrays.asList("36\"\"","48","60","72","84","96","108","120","132","144");
			List<String> width = Arrays.asList("24\"\"","30","36","48","60","72","84","96","108","120","132","144","156","168","174");			
			List<String> firstIndex = Arrays.asList("36\"\"","$239","269","307","377","450","517","594","664","735","810","877","946","1017","1121","1143");		
			List<String> secondIndex = Arrays.asList("48","272","312","357","447","536","621","711","868","883","1055","1060","1230","1236","1365","1393");			
			List<String> thirdIndex = Arrays.asList("60","310", "359","415","514","621","732","840","1030","1055","1260","1266","1471","1478","1632","1666");
			List<String> forthIndex = Arrays.asList("72","344","406","467","584","701","846","967","1184","1216","1451","1461","1695","1703","1886","1923");
			List<String> fifthdIndex = Arrays.asList("84","381","450","516","662","795","954","1095","1347","1388","1660","1669","1948","1956","2169","2212");
			List<String> sixthIndex = Arrays.asList("96","418","496","577","735","892","1064","1227","1513","1553","1867","1888","2197","2211","2449","2449");
			List<String> seventhIndex = Arrays.asList("108","455","542","626","809","987","1163","1344","1658","1704","2049","2070","2413","2428","2694","2748");
			List<String> eiegthIndex = Arrays.asList("120","492","586","683","887","1083","1276","1484","1830","1876","2277","2288","2673","2683","2981","3041");
			List<String> ninethIndex = Arrays.asList("132","530","674","794","1035","1268","1509","1745","1997","2210","2486","2692","2963","3167","3504","3521");
			List<String> tenthIndex = Arrays.asList("144","562","675","795","1038","1272","1513","1750","2162","2218","2686","2701","3161","3177","3520","3526");

			responseMap.put("width", width);
			responseMap.put("hight", hight);
			responseMap.put("firstIndex", firstIndex);
			responseMap.put("secondIndex", secondIndex);
			responseMap.put("thirdIndex", thirdIndex);
			responseMap.put("forthIndex", forthIndex);
			responseMap.put("fifthdIndex", fifthdIndex);
			responseMap.put("sixthIndex", sixthIndex);
			responseMap.put("seventhIndex", seventhIndex);
			responseMap.put("eiegthIndex", eiegthIndex);
			responseMap.put("ninethIndex", ninethIndex);
			responseMap.put("tenthIndex", tenthIndex);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return responseMap;

	}}
