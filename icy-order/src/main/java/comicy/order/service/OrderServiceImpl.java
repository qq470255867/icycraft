package comicy.order.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.icy.order.dao.JedisClient;
import com.icy.common.pojo.TaotaoResult;
import com.icy.mapper.TbOrderItemMapper;
import com.icy.mapper.TbOrderMapper;
import com.icy.mapper.TbOrderShippingMapper;
import com.icy.pojo.TbOrder;
import com.icy.pojo.TbOrderItem;
import com.icy.pojo.TbOrderShipping;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	TbOrderMapper orderMapper;
	@Autowired
	TbOrderItemMapper orderItemMapper;
	@Autowired
	TbOrderShippingMapper shippingMapper;
	@Autowired
	JedisClient jedis;

	@Value("${ORDER_GEN_KEY}")
	String ORDER_GEN_KEY;

	@Value("${ORDER_INIT_ID}")
	String ORDER_INIT_ID;

	@Value("${ORDER_DETAIL_GEN_KEY}")
	String ORDER_DETAIL_GEN_KEY;

	@Override
	public TaotaoResult createOrder(TbOrder order, List<TbOrderItem> list, TbOrderShipping shipping) {

		// 插入订单表
		String string = jedis.get(ORDER_GEN_KEY);

		if (StringUtils.isBlank(string)) {

			jedis.set(ORDER_GEN_KEY, ORDER_INIT_ID);

		}
		long orderId = jedis.incr(ORDER_GEN_KEY);

		order.setOrderId(orderId + "");
		order.setStatus(1);
		order.setCreateTime(new Date());
		order.setUpdateTime(new Date());
		// 是否评价
		order.setBuyerRate(0);

		orderMapper.insert(order);
		// 插入订单明细表
		for (TbOrderItem tbOrderItem : list) {
			long orderDetailId = jedis.incr(ORDER_DETAIL_GEN_KEY);

			tbOrderItem.setId(orderDetailId + "");
			tbOrderItem.setOrderId(orderId+"");

			orderItemMapper.insert(tbOrderItem);

		}
		// 插入物流表
		shipping.setCreated(new Date());
		shipping.setUpdated(new Date());
		shipping.setOrderId(orderId + "");

		shippingMapper.insert(shipping);
		return TaotaoResult.ok(orderId);
	}

}
