package com.cts.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public void saveProduct(Product prod) {
		String q1 = "insert into product values(?,?,?)";
		jt.update(q1, prod.getId(), prod.getName(), prod.getPrice());
		System.out.println("Dao: " + prod.getName() + " saved to DB");
	}

	@Override
	public List<Product> findAll() {
		String q2 = "select * from product";
		return jt.queryForObject(q2, new ListAllProduct());
	}

}

// ----------

class ListAllProduct implements RowMapper<List<Product>> {

	@Override
	public List<Product> mapRow(ResultSet rs, int rowNum) throws SQLException {

		List<Product> prods = new ArrayList<>();
		do {
			Product prod = new Product();
			prod.setId(rs.getString("id"));
			prod.setName(rs.getString("name"));
			prod.setPrice(rs.getDouble("price"));

			prods.add(prod);
		} while (rs.next());

		return prods;
	}

}
