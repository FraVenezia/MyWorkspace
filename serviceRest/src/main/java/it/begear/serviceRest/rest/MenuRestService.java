package it.begear.serviceRest.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.begear.serviceRest.model.Menu;

@Path(value = "/rest")
public class MenuRestService {

	@GET
	@Path("/get")
	public String prova() {
		return "OK";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/post")
	public String insertUser(Menu menu) {
		ObjectMapper objMenu = new ObjectMapper();
		String stringMenu = null;
		try {
			stringMenu = objMenu.writeValueAsString(menu);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		Configuration config = HBaseConfiguration.create();
		config.set("hbase.zookeeper.quorum", "127.0.0.1");
		config.set("hbase.zookeeper.property.clientPort", "2181");
		String tableName = "Menu";
		Connection connection = null;
		Table table = null;
		try {
			connection = ConnectionFactory.createConnection(config);
			table = connection.getTable(TableName.valueOf(tableName));
			Put putMenu = new Put(Bytes.toBytes("row1"));
			putMenu.addColumn( Bytes.toBytes("json"), Bytes.toBytes("Menu:1"), Bytes.toBytes(stringMenu));
			table.put(putMenu);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (table != null) {
					table.close();
				}

				if (connection != null && !connection.isClosed()) {
					connection.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println(menu);
		return "ok";
	}

}