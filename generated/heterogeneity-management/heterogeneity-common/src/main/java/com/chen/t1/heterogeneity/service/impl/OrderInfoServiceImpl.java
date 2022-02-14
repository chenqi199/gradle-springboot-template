package  com.chen.t1.heterogeneity.service.impl;

import  com.chen.t1.heterogeneity.entity.OrderInfo;
import  com.chen.t1.heterogeneity.mapper.OrderInfoMapper;
import  com.chen.t1.heterogeneity.service.IOrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单基础信息 服务实现类
 * </p>
 *
 * @author chen_q_i@163.com
 * @since 2022-02-11
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {

}
