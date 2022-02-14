package @packageName@.controller;

import  @packageName@.entity.OrderBase;
import  @packageName@.service.IOrderBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 订单基础信息 前端控制器
 * </p>
 *
 * @author chen_q_i@163.com
 * @since 2022-02-11
 */
@RestController
@RequestMapping("/@projectName@/orderBase")
public class OrderBaseController {

	private static final Logger logger = LoggerFactory.getLogger(OrderBaseController.class);

	@Autowired
	IOrderBaseService orderBaseService;

	/**
	 * test
	 *
	 * @param
	 * @return
	 */
	@GetMapping("/list")
	public List<OrderBase> getList() {
		List<OrderBase> list = orderBaseService.list();
		logger.info("this is test");
		return list;
	}

}

