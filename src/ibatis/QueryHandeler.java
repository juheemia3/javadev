package ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.common.resources.Resources;
import java.io.Reader;
import java.io.IOException;
import java.util.List;
import java.sql.SQLException;

public class QueryHandeler {

	private static SqlMapClient sqlMapper;

	public static SqlMapClient getInstance() {
		return sqlMapper;
	}

	static {
		try {
			Reader reader = Resources.getResourceAsReader("ibatis/SqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
		}
	}

	public static List selectAllAccounts() throws SQLException {
		return sqlMapper.queryForList("selectAllAccounts");
	}

	public static AccountVO selectAccountById(int id) throws SQLException {
		return (AccountVO) sqlMapper.queryForObject("selectAccountById", id);
	}

	public static void insertAccount(AccountVO account) throws SQLException {
		sqlMapper.insert("insertAccount", account);
	}

	public static void updateAccount(AccountVO account) throws SQLException {
		sqlMapper.update("updateAccount", account);
	}

	public static void deleteAccount(int id) throws SQLException {
		sqlMapper.delete("deleteAccount", id);
	}

}
