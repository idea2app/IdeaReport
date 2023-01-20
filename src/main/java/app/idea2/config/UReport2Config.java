package app.idea2.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.bstek.ureport.definition.datasource.BuildinDatasource;

@ImportResource("classpath:ureport-console-context.xml")
@Configuration
public class UReport2Config implements BuildinDatasource {
	@Resource
	private DataSource dataSource;

	@Override
	public String name() {
		return "system";
	}

	@Override
	public Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			System.err.println("Ureport 数据源 获取连接失败！");
			e.printStackTrace();
		}
		return null;
	}
}
