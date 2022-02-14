package  @packageName@.service.impl;

import  @packageName@.entity.OrderBase;
import  @packageName@.mapper.OrderBaseMapper;
import  @packageName@.service.IOrderBaseService;
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
public class OrderBaseServiceImpl extends ServiceImpl<OrderBaseMapper, OrderBase> implements IOrderBaseService {

}
