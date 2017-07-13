import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.entitys.Product;
import com.entitys.Size;
import com.entitys.Store;
import com.mapper.ProductMapper;

public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession session = (new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("config.xml"))).openSession();
		ProductMapper mapper = session.getMapper(ProductMapper.class);
		Product p = mapper.selectOne(4);
		String pname = p.getName();
		System.out.println(pname);
		System.out.println("-------------------------------------");
		List<Size> sizes = p.getSizes();
		if(sizes!=null){
			for (Size size : sizes) {
				Store store = size.getStore();
				int q = 0;
				if(store!=null){
					q = store.getQuantity();
				}
				System.out.println(size.getSname()+"\t"+q);
			}
		}
		session.close();
	}
}
