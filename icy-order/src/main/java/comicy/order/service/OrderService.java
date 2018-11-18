package comicy.order.service;

import java.util.List;

import com.icy.common.pojo.TaotaoResult;
import com.icy.pojo.TbOrder;
import com.icy.pojo.TbOrderItem;
import com.icy.pojo.TbOrderShipping;

public interface OrderService {

	TaotaoResult createOrder(TbOrder order, List<TbOrderItem> list, TbOrderShipping shipping);

}
