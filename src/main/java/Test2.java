import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.entitys.Product;
import com.entitys.Size;
import com.entitys.Store;
import com.mapper.ProductMapper;
import com.mapper.StoreMapper;

public class Test2 {
	public static void main(String[] args) throws IOException {
		SqlSession session = ((new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("config.xml"))).openSession());
		StoreMapper mapper = session.getMapper(StoreMapper.class);
		ProductMapper pm = session.getMapper(ProductMapper.class);
		Product p = pm.selectOne(4);
		List<Size> sizes = p.getSizes();
		for(Size size : sizes){
			if(size.getId()==4){
				Store bean = new Store();
				bean.setProduct(p);
				bean.setSize(size);
				bean.setQuantity(100);
				mapper.instore(bean);
				break;
			}
		}
		
//		List<Size> sizes = p.getSizes();
//		if(sizes!=null){
//			for(Size size : sizes){
//				if(size!=null && size.getSname().equals("256G")){
//					Store bean = new Store();
//					bean.setProduct(p);
//					bean.setSize(size);
//					bean.setQuantity(900);
//					mapper.insert(bean);
//					break;
//				}
//			}
//		}
		
		session.commit();
		session.close();
		
	}
}
